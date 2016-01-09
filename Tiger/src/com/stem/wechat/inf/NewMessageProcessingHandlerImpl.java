package com.stem.wechat.inf;

import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.stem.core.AppContext;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.Statement;
import com.stem.entity.StatementExample;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerNamingExample;
import com.stem.entity.WxImageReply;
import com.stem.entity.WxNewsResource;
import com.stem.entity.WxReplyResource;
import com.stem.entity.WxTextReply;
import com.stem.service.StatementService;
import com.stem.service.TigerNamingService;
import com.stem.service.WxMenuService;
import com.stem.service.WxReplyResourceService;
import com.stem.util.JsonUtil;
import com.stem.wechat.bean.Articles;
import com.stem.wechat.bean.Image;
import com.stem.wechat.bean.ImageOutMessage;
import com.stem.wechat.bean.InMessage;
import com.stem.wechat.bean.NewsOutMessage;
import com.stem.wechat.bean.OutMessage;
import com.stem.wechat.bean.TextOutMessage;

/**
 * <b>描述：</b>	需要考虑多图文的关键词回复<br/>
 * <b>作者：</b>Bob <br/>
 * <b>修改日期：</b>2016年1月4日 - 上午9:27:07<br/>
 * <b>E-mail:</b> sireezhang@163.com<br/>
 *
 */
@SuppressWarnings({"unchecked","unused"})
public class NewMessageProcessingHandlerImpl implements MessageProcessingHandler{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private OutMessage outMessage;
	
	@Resource
	private TigerNamingService tigerNamingService;
	
	@Resource
	private StatementService statementService;
	
	@Resource
	private WxMenuService wxMenuService;
	
	@Resource
	private WxReplyResourceService wxReplyResourceService;
	
	@Override
	public void allType(InMessage msg){
		responseMenuInfo(msg);
	}
	
	@Override
	public void textTypeMsg(InMessage msg, String serverPath) {
		TextOutMessage out = new TextOutMessage();
		String content = msg.getContent().trim();
		SimpleDateFormat another = new SimpleDateFormat("yyyy-MM-dd");
		if(StringUtils.isEmpty(content)){
			List<TigerNaming> namings = isNaming(msg,serverPath,out);
			if(namings.size()<=0){
				return;
			}
			out.setContent("输入日期格式如：" + another.format(new Date())+"\n可以查询指定日期的账单信息！");
			setOutMessage(out);
			return;
		}
		
		//设置其他关键词回复
		List<WxReplyResource> replyList = (List<WxReplyResource>) AppContext.getContext().getValue("wrr_list");
		for(WxReplyResource reply:replyList){
			String keyword = reply.getNewsKeyword();
			if(content.equals(keyword)){
				setOutMessage(createNews(reply.getNewsDes(), reply.getPicUrl(), reply.getNewsTitle(), reply.getNewsUrl()));
				return;
			}
		}
		
		List<WxTextReply> textList = (List<WxTextReply>) AppContext.getContext().getValue("text_list");
		for(WxTextReply one : textList){
			if(StringUtils.isEmpty(one.getTextKeyword())){
				continue;
			}
			if(content.equals(one.getTextKeyword())){
				out.setContent(one.getTextContent());
				setOutMessage(out);
				return;
			}
		}
		
		List<WxImageReply> imageList = (List<WxImageReply>) AppContext.getContext().getValue("image_list");
		for(WxImageReply one : imageList){
			if(StringUtils.isEmpty(one.getImageKeyword())){
				continue;
			}
			if(content.equals(one.getImageKeyword())){
				ImageOutMessage imageMessage = new ImageOutMessage();
				Image img = new Image();
				img.setMediaId(one.getMediaId());
				imageMessage.setImage(img);
				setOutMessage(imageMessage);
				return;
			}
		}
		
		if("账单".equals(content)||"我的账单".equals(content)||"账单查询".equals(content)||"今日账单".equals(content)||"最近账单".equals(content)){
			responseMenuMine(msg, serverPath);
			return;
		}
		Date tar = null;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			tar = sf.parse(content);
		} catch(Exception e){
			sf = new SimpleDateFormat("yyyy/MM/dd");
			try{
				tar = sf.parse(content);
			} catch(Exception e1){
				sf = new SimpleDateFormat("yyyy年MM月dd日");
				try{
					tar = sf.parse(content);
				} catch(Exception e2){
					tar = null;
				}
			}
		}
		if(null!=tar){
			List<TigerNaming> namings = isNaming(msg,serverPath,out);
			if(namings.size()<=0){
				return;
			}
			TigerNaming naming = namings.get(0);
			StatementExample example = new StatementExample();
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(tar);
			calendar.add(Calendar.DATE,1);
			example.createCriteria().andIdcardEqualTo(naming.getUserid()).andCheckdateGreaterThanOrEqualTo(tar).andCheckdateLessThan(calendar.getTime());
			List<Statement> list = statementService.list(example);
			if(list.size()>0){
				StringBuffer sb = new StringBuffer("您的账单信息如下：\n\n");
				int size = list.size();
				for(int i=0;i<size; i++){
					Statement statement = list.get(i);
					sb.append("产品名称《"+statement.getFundname()+"》");
					sb.append("\n");
					sb.append("对账日期："+ sf.format(statement.getCheckdate()));
					sb.append("\n");
					sb.append("当前净值："+statement.getNetvalue().toString());
					sb.append("\n");
					sb.append("总购买金额：" + statement.getTotalpurchaseamount().toString());
					sb.append("\n");
					sb.append("总赎回金额：" + statement.getTotalredemptionamount().toString());
					sb.append("\n");
					sb.append("总份额：" + statement.getTotalshares().toString());
					sb.append("\n");
					sb.append("总金额：" + statement.getTotalamount().toString());
					sb.append("\n");
					sb.append("总余额：" + statement.getTotalbalance().toString());
					sb.append("\n");
					sb.append("总收益："+statement.getTotalreturn().toString());
					sb.append("\n");
					sb.append("总收益率：" + statement.getTotalrate().setScale(2,RoundingMode.DOWN).toString() + "%");
					if(i<size-1){
						sb.append("\n\n");
					}
				}
				String result = sb.toString();
				if(result.length()>600){
					result = result.substring(0, 600);
				}
				out.setContent(result);
			}else{
				out.setContent("暂时没有您的账单信息！");
			}
		}else{
			out.setContent("输入日期格式如：" + another.format(new Date())+"\n可以查询指定日期的账单信息！");
		}
		setOutMessage(out);
	}

	private List<TigerNaming> isNaming(InMessage msg,String serverPath,TextOutMessage out){

		//make data
		String openid = msg.getFromUserName();
		//获取用户id card no
		TigerNamingExample namingExample = new TigerNamingExample();
		namingExample.createCriteria().andOpenidEqualTo(openid);
		List<TigerNaming> namings = tigerNamingService.list(namingExample);
		//如果用户未绑定，给出提示的消息并提供绑定的连接
		if(namings.size()==0){
			StringBuffer sb = new StringBuffer();
			sb.append("由于您未绑定微信号，我们暂时不能提供相关服务！您可以先绑定微信：");
			String bindUrl = PropertiesUtils.getConfigByKey("auth_code_url");
			String appid = PropertiesUtils.getConfigByKey("AppId");
			String reUrl = serverPath + "/" +PropertiesUtils.getConfigByKey("wechat_bind_url");
			bindUrl = String.format(bindUrl, appid, reUrl, 10);
			sb.append("<a href='"+bindUrl+"'> 绑定微信 </a>");
			out.setContent(sb.toString());
			setOutMessage(out);
		}
		return namings;
	}

	@Override
	public void locationTypeMsg(InMessage msg) {
	}

	@Override
	public void imageTypeMsg(InMessage msg) {
	}
	
	@Override
	public void videoTypeMsg(InMessage msg) {
	}
	
	@Override
	public void voiceTypeMsg(InMessage msg) {
	}

	@Override
	public void linkTypeMsg(InMessage msg) {
	}
	
	@Override
	public void verifyTypeMsg(InMessage msg) {}

	/**
	 * @author：stem zhang
	 * 修改时间：2015年8月20日 - 下午5:06:12<br/>
	 * 功能说明： 处理事件<br/>
	 * @see com.stem.wechat.inf.MessageProcessingHandler#eventTypeMsg(com.stem.wechat.bean.InMessage)
	 * @param msg
	 */
	@Override
	public void eventTypeMsg(InMessage msg, String serverPath) {
		String event = msg.getEvent().toLowerCase();
		switch (event) {
			case "click":
				String eventKey = msg.getEventKey();
				if(StringUtils.isEmpty(eventKey)){
					return;
				}
				//如果是获取收益数据
				switch (eventKey) {
					case "M2_PRO_MINE"://
						responseMenuMine(msg, serverPath);
						break;
						
					case "M1_TEAM_INFO"://
						responseMenuInfo(msg);
						break;
					case "M3_COR_ABOUT"://
						responseMenuAbout(msg);
						break;
						
					default:
						responseMneuNews(msg);
						break;
				}
				break;
			case "view":
				logger.info("用户点击菜单跳转："+msg.getEventKey());
				break;
			case "subscribe":
				responseSubscribe(msg);
				break;
			default:
				break;
		}
		
	}
	
	private void responseMneuNews(InMessage msg){
		String eventKey = msg.getEventKey();
		WxNewsResource res = (WxNewsResource) AppContext.getContext().getValue(eventKey);
		setOutMessage(createNews(res.getNewsDes(), res.getPicUrl(), res.getNewsTitle(), res.getNewsUrl()));
	}
	
	private void responseMenueLike(InMessage msg){
		WxNewsResource res = (WxNewsResource) AppContext.getContext().getValue("M1_TEAM_YFJX");
		setOutMessage(createNews(res.getNewsDes(), res.getPicUrl(), res.getNewsTitle(), res.getNewsUrl()));
	}

	//产品列表
	private void responseMenuList(InMessage msg){
		WxNewsResource res = (WxNewsResource) AppContext.getContext().getValue("M2_PRO_LIST");
		setOutMessage(createNews(res.getNewsDes(), res.getPicUrl(), res.getNewsTitle(), res.getNewsUrl()));
	}

	private void responseMenuAbout(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		sb.append("		欢迎来到大虎交易TIGERTrade。请直接留言或欢迎与万能客服虎小妹联系(微信号：kefuhuxiaomei),虎小妹坚持第一时间答疑解惑。");
		out.setContent(sb.toString());
		setOutMessage(out);
		
	}

	private void responseSubscribe(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		sb.append("		欢迎关注大虎交易TIGERTrade！在这里，你将与中国最具潜力的私募生力军一起，感受交易为你带来的最新财经资讯、最炫产品信息和最靠谱的专业团队。大虎交易祝你一切顺利！www.tigertrade.com.cn。任何问题或投研需求，可直接加万能客服虎小妹微信：13241862849，虎小妹定会第一时间与你联系！~/得意");
		out.setContent(sb.toString());
		setOutMessage(out);
	}
	
	private void responseMenuJOIN(InMessage msg){
		WxNewsResource res = (WxNewsResource) AppContext.getContext().getValue("M3_COR_JOIN");
		setOutMessage(createNews(res.getNewsDes(), res.getPicUrl(), res.getNewsTitle(), res.getNewsUrl()));
	}

	
	/*
	 * 设置单图文
	 * */
	private NewsOutMessage createNews(String des, String picUrl, String title, String url){
		//可以从多图文获取
		Articles articles = new Articles();
		articles.setDescription(des);
		articles.setPicUrl(picUrl);
		articles.setTitle(title);
		articles.setUrl(url);
		
		List<Articles> list = new ArrayList<Articles>();
		list.add(articles);
		
		NewsOutMessage out = new NewsOutMessage();
		out.setArticles(list);
		return out;
	}

	private void responseMenuInfo(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		sb.append("	     大虎交易（TIGERTrade）是北京金大虎资本管理有限公司旗下专注于二级市场的多元化交易团队。");
		sb.append("公司于2014年11月登记备案为私募基金管理人（P1005467）。");
		sb.append("目前团队共27人，核心成员由毕业于海内外各高校和长期担任国内金融投资领域的一众精英组成；");
		sb.append("目前涉及的专业投资领域涵盖国内证券、期货和美国股票及量化研究。");
		sb.append("公司成立至今，管理账户实现加权平均年化31.7%的收益率。");
		out.setContent(sb.toString());
		setOutMessage(out);
	}

	private void responseMenuMine(InMessage msg, String serverPath){
		TextOutMessage out = new TextOutMessage();
		List<TigerNaming> namings = isNaming(msg,serverPath,out);
		if(namings.size()<=0){
			return;
		}
		TigerNaming naming = namings.get(0);
		StatementExample example = new StatementExample();
		example.createCriteria().andIdcardEqualTo(naming.getUserid());
		example.setOrderByClause(" CheckDate desc ");
		PageHelper.startPage(1, 1);
		List<Statement> list = statementService.list(example);
		if(list.size()>0){
			Statement statementOne = list.get(0);
			Date latestDay = statementOne.getCheckdate();
			example.clear();
			example.createCriteria().andIdcardEqualTo(naming.getUserid()).andCheckdateEqualTo(latestDay);
			list = this.statementService.list(example);
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			if(list.size()>0){
				StringBuffer sb = new StringBuffer("您最近的账单信息如下：\n\n");
				int size = list.size();
				for(int i=0;i<size; i++){
					Statement statement = list.get(i);
					sb.append("产品名称《"+statement.getFundname()+"》");
					sb.append("\n");
					sb.append("对账日期："+ sf.format(statement.getCheckdate()));
					sb.append("\n");
					sb.append("当前净值："+statement.getNetvalue().toString());
					sb.append("\n");
					sb.append("总购买金额：" + statement.getTotalpurchaseamount().toString());
					sb.append("\n");
					sb.append("总赎回金额：" + statement.getTotalredemptionamount().toString());
					sb.append("\n");
					sb.append("总份额：" + statement.getTotalshares().toString());
					sb.append("\n");
					sb.append("总金额：" + statement.getTotalamount().toString());
					sb.append("\n");
					sb.append("总余额：" + statement.getTotalbalance().toString());
					sb.append("\n");
					sb.append("总收益："+statement.getTotalreturn().toString());
					sb.append("\n");
					sb.append("总收益率：" + statement.getTotalrate().setScale(2,RoundingMode.DOWN).toString()+"%");
					if(i<size-1){
						sb.append("\n\n");
					}
				}
				String result = sb.toString();
				if(result.length()>600){
					result = result.substring(0, 600);
				}
				out.setContent(result);
			}else{
				out.setContent("暂时没有您的账单信息！");
			}
		}else{
			out.setContent("暂时没有您的账单信息！");
		}
		setOutMessage(out);
	}
	
	@Override
	public void setOutMessage(OutMessage outMessage) {
		this.outMessage = outMessage;
	}
	
	@Override
	public void afterProcess(InMessage inMessage,OutMessage outMessage) {
		logger.info("传来的消息：< " + JsonUtil.Object2Json(inMessage) +" >");
		logger.info("回写消息是：< "+ JsonUtil.Object2Json(outMessage) +" >");
	}
	
	@Override
	public OutMessage getOutMessage() {
		return outMessage;
	}
}
