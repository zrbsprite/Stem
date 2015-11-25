package com.stem.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.WxImageResource;
import com.stem.entity.WxImageResourceExample;
import com.stem.entity.WxMenu;
import com.stem.entity.WxMenuExample;
import com.stem.entity.WxNewsResource;
import com.stem.entity.WxNewsResourceExample;
import com.stem.service.TigerAccessTokenService;
import com.stem.service.WxImageResourceService;
import com.stem.service.WxMenuService;
import com.stem.service.WxNewsResourceService;
import com.stem.util.HttpUtils;
import com.stem.util.JsonUtil;
import com.stem.vo.WxMenuVO;
import com.stem.wechat.TigerUtils;
import com.stem.wechat.oauth.Menu;

@Controller
@RequestMapping("admin")
public class MenuController extends AjaxConroller {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerAccessTokenService tigerAccessTokenService;
	
	@Resource
	private WxMenuService wxMenuService;
	
	@Resource
	private WxImageResourceService wxImageResourceService;
	
	@Resource
	private WxNewsResourceService wxNewsResourceService;
	
	@RequestMapping("menu")
	public String menu(){
		logger.info("重新生成菜单开始");
		try{
			String path = getClass().getClassLoader().getResource("/").getPath();
			String realPath = path + "configuration/menu.json";
			FileInputStream fis = new FileInputStream(realPath);
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuffer json = new StringBuffer();
			String line;
			while(null!=(line=br.readLine())){
				line = line.trim();
				line = line.replace("${APPID}", PropertiesUtils.getConfigByKey("AppId"));
				line = line.replace("${AppSecret}", PropertiesUtils.getConfigByKey("AppSecret"));
				line = line.replace("${serverPath}", getServerLocalePath());
				json.append(line);
			}
			Menu menu = new Menu();
			
			TigerAccessToken accessTokenBean = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
			String accessToken = accessTokenBean.getAccesstoken(); 
			boolean isSuccess = menu.createMenu(accessToken, json.toString());
			if(!isSuccess){
				logger.error("创建微信菜单失败！");
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e){
			e.printStackTrace();
			logger.error("菜单创建异常\n" + e.getMessage());
		}
		logger.info("重新生成菜单结束！");
		return "fore/ok";
	}
	
	@RequestMapping("menulistonly")
	public String menuListOnly(Model model){
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andResponseTypeEqualTo("image");
		List<WxMenu> list = this.wxMenuService.list(example);
		model.addAttribute("data", list);
		return "fore/menu";
	}
	
	@RequestMapping("menulist")
	public String menuList(Model model){
		WxMenuExample example = new WxMenuExample();
		example.setOrderByClause(" menu_order asc ");
		List<WxMenu> menuList = this.wxMenuService.list(example);
		Map<Integer, List<WxMenu>> map = new HashMap<Integer, List<WxMenu>>();
		List<WxMenu> list = new ArrayList<>();
		for(WxMenu menu : menuList){
			if(menu.getIsParent().equals("1")){
				list.add(menu);
				List<WxMenu> son = map.get(menu.getId());
				if(son!=null){
					continue;
				}
				son = new ArrayList<>();
				map.put(menu.getId(), son);
			}else{
				List<WxMenu> son = map.get(menu.getParentId());
				if(son!=null){
					son.add(menu);
				}else{
					son = new ArrayList<>();
					son.add(menu);
					map.put(menu.getParentId(), son);
				}
			}
		}
		List<WxMenuVO> voList = new ArrayList<WxMenuVO>();
		for(WxMenu menu : list){
			WxMenuVO vo = new WxMenuVO();
			vo.setWxMenu(menu);
			vo.setList(map.get(menu.getId()));
			voList.add(vo);
		}
		model.addAttribute("data", voList);
		return "fore/menu";
	}
	
	
	@RequestMapping("makemenu")
	public String makeMenuInf(Model model, PrintWriter writer) throws Exception{
		//查出所有的图片资源信息，并且同步数据库
		String batchGetUrl = PropertiesUtils.getConfigByKey("material_batchget_url");
		TigerAccessToken token = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
		String accessToken = token.getAccesstoken();
		batchGetUrl = String.format(batchGetUrl, accessToken);
		Map<String, Object> jsonMap = new HashMap<>();
		jsonMap.put("type", "image");
		jsonMap.put("count", 20);
		
		this.wxImageResourceService.doClearTempTable();
		boolean stopGoOn = false;
		int start = 0;
		while(!stopGoOn){
			jsonMap.put("offset", start);
			String json = JsonUtil.Object2Json(jsonMap);
			String result = HttpUtils.postHttpByJsonData(batchGetUrl,json);
			Map<String, Object> map = (Map<String, Object>) JsonUtil.str2map(result, new TypeReference<Map<String, Object>>(){});
			Integer itemCount = (Integer) map.get("item_count");
			if(itemCount>0){
				List<Object> items = (List<Object>) map.get("item");
				if(items.size()>0){
					List<WxImageResource> wir = new ArrayList<>();
					for(Object obj : items){
						Map<String, Object> m = (Map<String, Object>) obj;
						String mid = m.get("media_id").toString();
						String name = m.get("name").toString();
						String updateTime = m.get("update_time").toString();
						Object urlObj = m.get("url");
						String url = "";
						if(null!=urlObj){
							url = urlObj.toString().replace("\\","");
						}
						WxImageResource resource = new WxImageResource();
						resource.setMediaId(mid);
						resource.setName(name);
						resource.setUpdateTime(updateTime);
						resource.setUrl(url);
						wir.add(resource);
					}
					this.wxImageResourceService.doBatchAdd(wir);
				}else{
					continue;
				}
				if(itemCount<20){
					stopGoOn = true;
				}
			}else{
				stopGoOn = true;
			}
			start += 20;
		}
		this.wxImageResourceService.doClearTable();
		this.wxImageResourceService.doSynTable();
		
		//更新所有的图文列表
		String newsGetOneUrl = PropertiesUtils.getConfigByKey("material_get_url");
		newsGetOneUrl = String.format(newsGetOneUrl, accessToken);
		List<WxNewsResource> wnrList = this.wxNewsResourceService.list(new WxNewsResourceExample());
		for(WxNewsResource one : wnrList){
			//获取当前的图文消息
			String newsMId = one.getMediaId();
			String newsGetOneJson = "{\"media_id\":\""+newsMId+"\"}";
			String newsGetOneResult = HttpUtils.postHttpByJsonData(newsGetOneUrl, newsGetOneJson);
			Map<String, Object> newsGetOneMap = (Map<String, Object>) JsonUtil.str2map(newsGetOneResult, new TypeReference<Map<String, Object>>(){});
			List<Object> newsGetOneList = (List<Object>) newsGetOneMap.get("news_item");
			//目前只是单图文，不考虑多图文，大虎的目前也只是单图文
			if(newsGetOneList.size()>0){
				Map<String, String> newsGetOneItem = (Map<String, String>) newsGetOneList.get(0);
				String thumbId = newsGetOneItem.get("thumb_media_id");
				WxImageResourceExample we = new WxImageResourceExample();
				we.createCriteria().andMediaIdEqualTo(thumbId);
				List<WxImageResource> wrList = this.wxImageResourceService.list(we);
				if(wrList.size()>0){
					String imageUrl = wrList.get(0).getUrl();
					WxNewsResourceExample wre = new WxNewsResourceExample();
					wre.createCriteria().andMediaIdEqualTo(newsMId);
					WxNewsResource wr = new WxNewsResource();
					wr.setMediaId(newsMId);
					wr.setPicUrl(imageUrl);
					this.wxNewsResourceService.update(wr,wre);
				}
			}
		}
		this.writeJson("{\"state\":200}");
		return null;
	}
	
	@RequestMapping("uploadpic")
	public String upload(Integer id, MultipartFile picture, Model model){
		String type = picture.getContentType();
		logger.debug("文件上传类型是：" + type);
		String basepath = getContentRealPath();
		if(!basepath.endsWith(File.separator)){
			basepath += File.separator;
		}
		basepath += "static" + File.separator + "product" + File.separator;
		String realName = picture.getOriginalFilename();
		String ext = StringUtils.getFilenameExtension(realName);
		String targetName = basepath + System.currentTimeMillis()+"."+ext;
		File targetFile = new File(targetName);
		try{
			FileUtils.copyInputStreamToFile(picture.getInputStream(), targetFile);
		} catch (IOException e){
			e.printStackTrace();
			logger.error("文件["+realName+"]上传异常："+e.getMessage());
			//上传异常
			model.addAttribute("msg","文件上传异常，请重试！");
			return "fore/error";
		}
		//上传图片到微信
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(targetFile);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			logger.error("微信上传图片素材异常：文件路径错误");
			model.addAttribute("msg","文件路径错误！");
			return "fore/error";
		}
		String mediaId = doUpload(fis, realName, "image");
		//更新数据库
		if(null!=id){
			WxMenu menu = new WxMenu();
			menu.setId(id);
			menu.setResourceId(mediaId);
			this.wxMenuService.updateByPK(menu);
		}else{
			model.addAttribute("msg","非法参数！");
			return "fore/error";
		}
		model.addAttribute("msg","操作成功！");
		return "fore/ok";
	}
	
	//执行上传操作
	private String doUpload(InputStream is, String fileName, String type){
		String uri = PropertiesUtils.getConfigByKey("material_add_upload");
		HttpClient client = new HttpClient();
		HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
		params.setConnectionTimeout(5000);
		params.setSoTimeout(5000);
		client.getHttpConnectionManager().setParams(params);
		PostMethod post = new PostMethod(uri);
		String mediaId = null;
		try {
			byte[] array = IOUtils.toByteArray(is);
			ByteArrayPartSource ps = new ByteArrayPartSource(fileName, array);
			//获取AccessToken
			TigerAccessToken accessToken = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
			String token = accessToken.getAccesstoken();
			Part[] parts = {new FilePart("media", ps), new StringPart("access_token", token), new StringPart("type", type)};
			MultipartRequestEntity multipartEntity = new MultipartRequestEntity(parts, post.getParams());
			post.setRequestEntity(multipartEntity);
			int code = client.executeMethod(post);
			logger.info("微信上传素材请求状态码是：" + code);
			if(code==HttpStatus.SC_OK){
				String postResponse = post.getResponseBodyAsString();
				logger.info("微信上传素材信息是：" + postResponse);
				Map<String, String> map = (Map<String, String>) JsonUtil.str2map(postResponse, new TypeReference<Map<String, String>>(){});
				String errcode = map.get("errcode"); 
				if(!StringUtils.isEmpty(errcode)){
					logger.warn("微信素材上传异常，errcode is -->" + errcode);
					return null;
				}
				mediaId = map.get("media_id");
				logger.info("media_id是:" + mediaId);
			}else{
				logger.warn("微信素材上传异常，返回响应码是【"+code+"】");
			}
		} catch (HttpException e) {
			logger.error("微信Http上传素材请求失败"+e.getMessage());
		} catch (IOException e) {
			logger.error("微信Http上传素材请求IO失败"+e.getMessage());
		} catch (Exception e){
			e.printStackTrace();
			logger.error("微信Http上传素材请求失败"+e.getMessage());
		}finally{
			try{
				if(null!=is)
					is.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return mediaId;
	}
}
