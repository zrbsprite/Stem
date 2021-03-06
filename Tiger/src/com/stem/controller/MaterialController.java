package com.stem.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.WxImageResource;
import com.stem.entity.WxNewsInfo;
import com.stem.entity.WxNewsInfoExample;
import com.stem.entity.WxNewsItem;
import com.stem.entity.WxNewsItemExample;
import com.stem.service.TigerAccessTokenService;
import com.stem.service.WxImageResourceService;
import com.stem.service.WxNewsInfoService;
import com.stem.service.WxNewsItemService;
import com.stem.util.HttpUtils;
import com.stem.util.JsonUtil;
import com.stem.wechat.TigerUtils;

/**
 * 描述：素材管理Controller<br/>
 * 作者：stem zhang <br/>
 * 修改日期：2015年9月28日 - 上午11:16:10<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
@SuppressWarnings("unchecked")
@Controller
@RequestMapping("wechat")
public class MaterialController extends AjaxConroller {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerAccessTokenService tigerAccessTokenService;
	
	@Resource
	private WxNewsInfoService wxNewsInfoService;
	
	@Resource
	private WxNewsItemService wxNewsItemService;
	
	@Resource
	private WxImageResourceService wxImageResourceService;

	/**
	 * <b>作者:</b> Bob<br/>
	 * <b>修改时间：</b>2015年12月29日 - 上午10:43:56<br/>
	 * <b>功能说明：</b>图文消息资源列表	，暂时未做实现<br/>
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("mtlist")
	public String index(Integer currentPage, Model model){
		return "";
	}
	
	/**
	 * 方法名称: clearNews<br/>
	 * 描述：清空表<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月1日-下午5:50:14<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("clearNews")
	public String clearNews(Model model){
		this.wxNewsItemService.delete(new WxNewsItemExample());
		this.wxNewsInfoService.delete(new WxNewsInfoExample());
		return "redirect:/wechat/synnws.htm";
	}
	
	/**
	 * <b>作者:</b> Bob<br/>
	 * <b>修改时间：</b>2015年12月29日 - 上午10:45:17<br/>
	 * <b>功能说明：</b>同步图文素材资源	<br/>
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("synnws")
	public String synNews(Model model) throws Exception{
		String uri = PropertiesUtils.getConfigByKey("material_batchget_url");
		TigerAccessToken accessToken = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
		String token = accessToken.getAccesstoken();
		uri = String.format(uri, token);
		int offset = 0;
		int itemCount=20;
		while(itemCount>0){
			String json = "{\"type\":\"news\",\"offset\":"+offset+",\"count\":20}";
			String responseStr = HttpUtils.postHttpByJsonData(uri,json);
			Map<String, Object> map = (Map<String, Object>) JsonUtil.str2map(responseStr, new TypeReference<Map<String, Object>>(){});
			itemCount = (int) map.get("item_count");
			offset += itemCount;
			List<Object> itemList = (List<Object>) map.get("item");
			for(Object obj : itemList){
				Map<String, Object> item = (Map<String, Object>)obj;
				long updateTime = (int) item.get("update_time");
				WxNewsInfo info = new WxNewsInfo();
				info.setUpdateTime(new Date(updateTime*1000));
				info.setMediaId((String) item.get("media_id"));
				Map<String, Object> content = (Map<String, Object>)item.get("content");
				List<Object> newsItemList = (List<Object>) content.get("news_item");
				List<Integer> ids = new ArrayList<>();
				for(Object news : newsItemList){
					Map<String, Object> one = (Map<String, Object>) news;
					WxNewsItem wxNewsItem = new WxNewsItem();
					wxNewsItem.setTitle((String) one.get("title"));
					wxNewsItem.setThumbMediaId((String) one.get("thumb_media_id"));
					wxNewsItem.setShowCoverPic((Integer) one.get("show_cover_pic"));
					String digest = (String) one.get("digest");
					wxNewsItem.setDigest(digest);
					wxNewsItem.setUrl((String) one.get("url"));
					//会有存unicode码的问题，暂时不需要content 所以不存了
					wxNewsItem.setContent(null);
					wxNewsItem.setContentSourceUrl((String) one.get("content_source_url"));
					this.wxNewsItemService.add(wxNewsItem);
					ids.add(wxNewsItem.getId());
				}
				int size = newsItemList.size();
				if(size==1){
					info.setType(1);
				}else if(size>1){
					info.setType(2);
				}
				info.setItemIds(StringUtils.collectionToDelimitedString(ids,","));
				this.wxNewsInfoService.add(info);
			}
			System.gc();
		}
		model.addAttribute("msg","操作成功！");
		return "fore/ok";
	}
	
	/**
	 * 方法名称: clearTable<br/>
	 * 描述：清空表<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月1日-下午5:35:57<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("clear")
	public String clearTable(Model model){
		this.wxImageResourceService.doClearTable();
		return "redirect:/wechat/getImages.htm";
	}
	
	/**
	 * 方法名称: clearTempTable<br/>
	 * 描述：清空临时表<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月1日-下午5:35:57<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("clearTemp")
	public String clearTempTable(Model model){
		this.wxImageResourceService.doClearTempTable();
		return "redirect:/wechat/clear.htm";
	}
	
	@RequestMapping("getImages")
	public String getPic(Model model) throws Exception{
		//查出所有的图片资源信息，并且同步数据库
		String batchGetUrl = PropertiesUtils.getConfigByKey("material_batchget_url");
		TigerAccessToken token = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
		String accessToken = token.getAccesstoken();
		batchGetUrl = String.format(batchGetUrl, accessToken);
		Map<String, Object> jsonMap = new HashMap<>();
		jsonMap.put("type", "image");
		jsonMap.put("count", 20);
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
		return "redirect:/wechat/synimages.htm";
	}
	
	/**
	 * 方法名称: synPic<br/>
	 * 描述：同步表<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月1日-下午5:39:38<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("synimages")
	public String synPic(Model model){
		this.wxImageResourceService.doSynTable();
		model.addAttribute("msg","同步表成功！");
		return "fore/ok";
	}
	
	
	/**
	 * <b>作者:</b> Bob<br/>
	 * <b>修改时间：</b>2015年12月29日 - 上午10:46:21<br/>
	 * <b>功能说明：</b>上传永久素材	<br/>
	 * @return
	 */
	@RequestMapping("mtadd")
	public String uploadImage(HttpServletRequest request){
		String root = getContentRealPath(request);
		File dic = new File(root + "/static/product");
		File[] files = dic.listFiles();
		for(File file : files){
			try{
				FileInputStream fis = new FileInputStream(file);
				uploadImageMaterial(fis, file.getName());
			} catch (FileNotFoundException e){
				e.printStackTrace();
			}
		}
		return "fore/success";
	}
	
	//执行上传图片素材操作
	private void uploadImageMaterial(InputStream is, String fileName){
		doUpload(is, fileName, "iamge");
	}
	
	//执行上传操作
	private void doUpload(InputStream is, String fileName, String type){
		String uri = PropertiesUtils.getConfigByKey("material_add_upload");
		HttpClient client = new HttpClient();
		HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
		params.setConnectionTimeout(5000);
		params.setSoTimeout(5000);
		client.getHttpConnectionManager().setParams(params);
		PostMethod post = new PostMethod(uri);
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
					return;
				}
				String mediaId = map.get("media_id");
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
		}
	}
}
