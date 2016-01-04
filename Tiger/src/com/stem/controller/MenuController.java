package com.stem.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.stem.core.AppContext;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.WxImageReply;
import com.stem.entity.WxImageReplyExample;
import com.stem.entity.WxImageResource;
import com.stem.entity.WxImageResourceExample;
import com.stem.entity.WxMenu;
import com.stem.entity.WxMenuExample;
import com.stem.entity.WxNewsInfo;
import com.stem.entity.WxNewsInfoExample;
import com.stem.entity.WxNewsItem;
import com.stem.entity.WxNewsResource;
import com.stem.entity.WxNewsResourceExample;
import com.stem.entity.WxReplyResource;
import com.stem.entity.WxReplyResourceExample;
import com.stem.entity.WxTextReply;
import com.stem.entity.WxTextReplyExample;
import com.stem.service.TigerAccessTokenService;
import com.stem.service.WxImageReplyService;
import com.stem.service.WxImageResourceService;
import com.stem.service.WxMenuService;
import com.stem.service.WxNewsInfoService;
import com.stem.service.WxNewsItemService;
import com.stem.service.WxNewsResourceService;
import com.stem.service.WxReplyResourceService;
import com.stem.service.WxTextReplyService;
import com.stem.util.JsonUtil;
import com.stem.vo.WxMenuVO;
import com.stem.wechat.TigerUtils;
import com.stem.wechat.oauth.Menu;

@SuppressWarnings("unchecked")
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
	
	@Resource
	private WxReplyResourceService wxReplyResourceService;
	
	@Resource
	private WxNewsInfoService wxNewsInfoService;
	
	@Resource
	private WxNewsItemService wxNewsItemService;
	
	@Resource
	private WxTextReplyService wxTextReplyService;
	
	@Resource
	private WxImageReplyService wxImageReplyService;
	
	/**
	 * 
	 * 方法名称: menu<br/>
	 * 描述：菜单生成<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月2日-上午9:12:21<br/>
	 * @return
	 */
	@RequestMapping("menu")
	public String menu(HttpServletRequest request){
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
				line = line.replace("${serverPath}", getServerLocalePath(request));
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
	
	/**
	 * 
	 * 方法名称: menuListOnly<br/>
	 * 描述：后台菜单页面<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月2日-上午9:12:47<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("menulistonly")
	public String menuListOnly(Model model){
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andResponseTypeEqualTo("image");
		List<WxMenu> list = this.wxMenuService.list(example);
		model.addAttribute("data", list);
		return "fore/menu";
	}
	
	
	/**
	 * <b>作者:</b> Bob<br/>
	 * <b>修改时间：</b>2015年12月29日 - 上午9:21:55<br/>
	 * <b>功能说明：</b>同步菜单回复的图文的内容	<br/>
	 * @param model
	 * @param writer
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("synmenu")
	public String makeMenuInf(Model model, HttpServletResponse response) throws Exception{
		/*
		TigerAccessToken token = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
		String accessToken = token.getAccesstoken();
		//更新所有的图文列表
		String newsGetOneUrl = PropertiesUtils.getConfigByKey("material_get_url");
		newsGetOneUrl = String.format(newsGetOneUrl, accessToken);
		*/
		List<WxNewsResource> wnrList = this.wxNewsResourceService.list(new WxNewsResourceExample());
		for(WxNewsResource one : wnrList){
			//获取当前的图文消息
			String newsMId = one.getMediaId();
			WxNewsInfoExample infoExample = new WxNewsInfoExample();
			infoExample.createCriteria().andMediaIdEqualTo(newsMId).andTypeEqualTo(1);
			List<WxNewsInfo> infoList = this.wxNewsInfoService.list(infoExample);
			if(infoList.size()>0){
				WxNewsInfo wxNewsInfo = infoList.get(0);
				String ids = wxNewsInfo.getItemIds();
				Integer itemId = Integer.valueOf(ids);
				WxNewsItem wxNewsItem = this.wxNewsItemService.getByPK(itemId);
				String title = wxNewsItem.getTitle();
				one.setNewsTitle(title);
				one.setNewsDes(wxNewsItem.getDigest());
				one.setNewsUrl(wxNewsItem.getUrl());
				String imageThumbId = wxNewsItem.getThumbMediaId();
				WxImageResourceExample wxImageResourceExample = new WxImageResourceExample();
				wxImageResourceExample.createCriteria().andMediaIdEqualTo(imageThumbId);
				List<WxImageResource> wxImageList = this.wxImageResourceService.list(wxImageResourceExample);
				if(wxImageList.size()>0){
					WxImageResource wxImageResource = wxImageList.get(0);
					one.setPicUrl(wxImageResource.getUrl());
				}
				this.wxNewsResourceService.updateByPK(one);
			}
			
			/*
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
			*/
		}
		
		List<WxReplyResource> wrrList = this.wxReplyResourceService.list(new WxReplyResourceExample());
		for(WxReplyResource one : wrrList){
			//获取当前的图文消息
			String newsMId = one.getMediaId();
			WxNewsInfoExample infoExample = new WxNewsInfoExample();
			infoExample.createCriteria().andMediaIdEqualTo(newsMId).andTypeEqualTo(1);
			List<WxNewsInfo> infoList = this.wxNewsInfoService.list(infoExample);
			if(infoList.size()>0){
				WxNewsInfo wxNewsInfo = infoList.get(0);
				String ids = wxNewsInfo.getItemIds();
				Integer itemId = Integer.valueOf(ids);
				WxNewsItem wxNewsItem = this.wxNewsItemService.getByPK(itemId);
				String title = wxNewsItem.getTitle();
				one.setNewsTitle(title);
				one.setNewsDes(wxNewsItem.getDigest());
				one.setNewsUrl(wxNewsItem.getUrl());
				String imageThumbId = wxNewsItem.getThumbMediaId();
				WxImageResourceExample wxImageResourceExample = new WxImageResourceExample();
				wxImageResourceExample.createCriteria().andMediaIdEqualTo(imageThumbId);
				List<WxImageResource> wxImageList = this.wxImageResourceService.list(wxImageResourceExample);
				if(wxImageList.size()>0){
					WxImageResource wxImageResource = wxImageList.get(0);
					one.setPicUrl(wxImageResource.getUrl());
				}
				this.wxReplyResourceService.updateByPK(one);
			}
		}
		
		wnrList = this.wxNewsResourceService.list(new WxNewsResourceExample());
		for(WxNewsResource one : wnrList){
			AppContext.getContext().setSyncValue(one.getMenuKey(),one);
		}
		wrrList = this.wxReplyResourceService.list(new WxReplyResourceExample());
		AppContext.getContext().setSyncValue("wrr_list", wrrList);
		
		this.writeJson(response, "{\"state\":200}");
		return null;
	}

	/**
	 * 
	 * 方法名称: synCache<br/>
	 * 描述：同步缓存<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月3日-下午9:04:09<br/>
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("synCache")
	public String synCache(Model model) throws Exception{
		
		logger.info("System is starting to cache menu data...");
		List<WxNewsResource> wnrList  = this.wxNewsResourceService.list(new WxNewsResourceExample());
		for(WxNewsResource one : wnrList){
			AppContext.getContext().setSyncValue(one.getMenuKey(),one);
		}
		List<WxReplyResource> wrrList =  this.wxReplyResourceService.list(new WxReplyResourceExample());
		AppContext.getContext().setSyncValue("wrr_list", wrrList);
		
		WxTextReplyExample textExample = new WxTextReplyExample();
		textExample.createCriteria().andTextStatusEqualTo(1);
		List<WxTextReply> textList = this.wxTextReplyService.list(textExample);
		AppContext.getContext().setSyncValue("text_list", textList);
		WxImageReplyExample imageExample = new WxImageReplyExample();
		imageExample.createCriteria().andImageStatusEqualTo(1);
		List<WxImageReply> imageList = this.wxImageReplyService.list(imageExample);
		AppContext.getContext().setSyncValue("image_list", imageList);
		
		logger.info("System cache menu data over...");
		
		model.addAttribute("msg","同步缓存成功！");
		return "fore/ok";
	}
	
	/**
	 * 
	 * 方法名称: menuList<br/>
	 * 描述：菜单列表<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月2日-上午9:13:17<br/>
	 * @param model
	 * @return
	 */
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
	
	/**
	 * 
	 * 方法名称: upload<br/>
	 * 描述：上传图片<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月2日-上午9:13:32<br/>
	 * @param id
	 * @param picture
	 * @param model
	 * @return
	 */
	@RequestMapping("uploadpic")
	public String upload(Integer id, MultipartFile picture, Model model, HttpServletRequest request){
		String type = picture.getContentType();
		logger.debug("文件上传类型是：" + type);
		String basepath = getContentRealPath(request);
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
