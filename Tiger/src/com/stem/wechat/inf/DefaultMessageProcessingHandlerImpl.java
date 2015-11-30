package com.stem.wechat.inf;

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
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.Statement;
import com.stem.entity.StatementExample;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerNamingExample;
import com.stem.entity.WxMenu;
import com.stem.entity.WxMenuExample;
import com.stem.service.StatementService;
import com.stem.service.TigerNamingService;
import com.stem.service.WxMenuService;
import com.stem.util.JsonUtil;
import com.stem.wechat.bean.Articles;
import com.stem.wechat.bean.Image;
import com.stem.wechat.bean.ImageOutMessage;
import com.stem.wechat.bean.InMessage;
import com.stem.wechat.bean.NewsOutMessage;
import com.stem.wechat.bean.OutMessage;
import com.stem.wechat.bean.TextOutMessage;

public class DefaultMessageProcessingHandlerImpl implements MessageProcessingHandler{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private OutMessage outMessage;
	
	@Resource
	private TigerNamingService tigerNamingService;
	
	@Resource
	private StatementService statementService;
	
	@Resource
	private WxMenuService wxMenuService;
	
	@Override
	public void allType(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		out.setContent("您的消息已经收到！");
		setOutMessage(out);
	}
	
	@Override
	public void textTypeMsg(InMessage msg, String serverPath) {
		String content = msg.getContent().trim();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date tar = null;
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
		TextOutMessage out = new TextOutMessage();
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
			return;
		}
		SimpleDateFormat another = new SimpleDateFormat("yyyy-MM-dd");
		if(null!=tar){
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
					sb.append("总收益率：" + statement.getTotalrate().toString());
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
			out.setContent("	输入日期格式如：" + another.format(new Date())+"\\n可以查询制定日期的账单信息！");
		}
		setOutMessage(out);
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
					case "M2_PRO_MINE":
						responseMenuMine(msg, serverPath);
						break;
					case "M1_TEAM_INFO":
						responseMenuInfo(msg);
						break;
					case "M1_TEAM_ZZ":
						responseMenuZZ(msg);
						break;
					case "M1_TEAM_DT":
						responseMenuDT(msg);
						break;
					case "M2_PRO_JZ":
						responseMenuJZ(msg);
						break;
					case "M2_PRO_BUY":
						responseMenuBUY(msg);
						break;
					case "M3_COR_JOIN":
						responseMenuJOIN(msg);
						break;
					case "M3_COR_COR":
						responseMenuCor(msg);
						break;
					case "M3_COR_ABOUT":
						responseMenuAbout(msg);
						break;
					case "M2_PRO_LIST":
						responseMenuList(msg);
						break;
					default:
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
	
	//产品列表
	private void responseMenuList(InMessage msg){
		setOutMessage(createNews("大虎交易基金产品列表", "http://mmbiz.qpic.cn/mmbiz/CupWaH0t22rem5j2ibY0H8gibPh6ibCiaohOpBVdhcSE9muQg5V9oxMZTxP3XvpPjbMOGVibEqpQicI4u9412jNDpO6Q/0?wx_fmt=jpeg",
				"【产品列表】大虎交易基金产品列表", "http://mp.weixin.qq.com/s?__biz=MjM5NTI4MDk4OA==&mid=210456651&idx=1&sn=41d62058de1044f321f5e43208731e22&scene=18#rd"));
	}

	private void responseMenuAbout(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
//		sb.append("欢迎来到大虎交易TIGERTrade。如有任何问题欢迎与万能客服虎小妹联系（微信号：13241862849），虎小妹定能第一时间为您答忧解惑！~/得意 [得意] /:8-)");
		sb.append("欢迎来到大虎交易TIGERTrade。如有任何问题欢迎与万能客服虎小妹联系（微信号：13241862849），虎小妹定能第一时间为您答忧解惑！~/得意");
		out.setContent(sb.toString());
		setOutMessage(out);
		
	}

	private void responseSubscribe(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		//sb.append("欢迎关注大虎交易TIGERTrade！在这里，你将与中国最具潜力的私募生力军一起，感受交易为你带来的最新财经资讯、最炫产品信息和最靠谱的专业团队。大虎交易祝你一切顺利！www.tigertrade.com.cn。任何问题或投研需求，可直接加万能客服虎小妹微信：13241862849，虎小妹定会第一时间与你联系！~/得意 [得意] /:8-)");
		sb.append("欢迎关注大虎交易TIGERTrade！在这里，你将与中国最具潜力的私募生力军一起，感受交易为你带来的最新财经资讯、最炫产品信息和最靠谱的专业团队。大虎交易祝你一切顺利！www.tigertrade.com.cn。任何问题或投研需求，可直接加万能客服虎小妹微信：13241862849，虎小妹定会第一时间与你联系！~/得意");
		out.setContent(sb.toString());
		setOutMessage(out);
	}
	
	private void responseMenuCor(InMessage msg){
		setOutMessage(createNews("大虎资本基金经理百人计划【发起方】北京金大虎资本管理有限公司【计划目的】为市场中的成长型交易员、投顾提供无成","http://mmbiz.qpic.cn/mmbiz/CupWaH0t22rMcacdNGu6sOATa5IJYIy6zA2079OJ5RCyyFnRFsyruRLeuEWqOh6YFJ48jgwk2Af8VvPLbodicQA/0?wx_fmt=jpeg",
				"【发展合作】大虎资本基金经理百人计划","http://mp.weixin.qq.com/s?__biz=MjM5NTI4MDk4OA==&mid=206513046&idx=1&sn=6017d5a22878c2f3f5cf1d214660f877&scene=18#rd"));
	}

	private void responseMenuJOIN(InMessage msg){
		setOutMessage(createNews("大虎交易精英招募", "http://mmbiz.qpic.cn/mmbiz/CupWaH0t22rem5j2ibY0H8gibPh6ibCiaohOpBVdhcSE9muQg5V9oxMZTxP3XvpPjbMOGVibEqpQicI4u9412jNDpO6Q/0?wx_fmt=jpeg",
				"【加入我们】大虎交易精英招募", "http://mp.weixin.qq.com/s?__biz=MjM5NTI4MDk4OA==&mid=210458020&idx=1&sn=9144440a030cd2c59dc078cddac4831a&scene=18#rd"));
	}

	private void responseMenuBUY(InMessage msg){
		ImageOutMessage image = new ImageOutMessage();
		Image img = new Image();
//		img.setMediaId("9amgL4twFMc61L07pGHPa3pRRA94OXPohGg_EW1VvGClzm0Ix3nMpEy-tlOwOYDp");
//		img.setMediaId("Coj-6cHiiFlkfvtx8730FZwUtbHrs73GfjR3g521dec");
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andMenuKeyEqualTo("M2_PRO_BUY").andResponseTypeEqualTo("image");
		List<WxMenu> list = this.wxMenuService.list(example);
		if(list.size()>0){
			img.setMediaId(list.get(0).getResourceId());
		}
		image.setImage(img);
		setOutMessage(image);
	}
	
	private void responseMenuJZ(InMessage msg){
		setOutMessage(createNews("大虎交易基金产品净值表现", "http://mmbiz.qpic.cn/mmbiz/CupWaH0t22rem5j2ibY0H8gibPh6ibCiaohOpBVdhcSE9muQg5V9oxMZTxP3XvpPjbMOGVibEqpQicI4u9412jNDpO6Q/0?wx_fmt=jpeg",
				"【产品净值】大虎交易基金产品净值表现", "http://mp.weixin.qq.com/s?__biz=MjM5NTI4MDk4OA==&mid=206134857&idx=1&sn=210ae8718bc62adf86bbab5bcbc6335b&scene=18#rd"));
	}
	
	private void responseMenuDT(InMessage msg){
		setOutMessage(createNews("本次体验为大虎为合格投资者提供除基金产品以外的原创研究型内容体验。", "http://mmbiz.qpic.cn/mmbiz/CupWaH0t22peEqoHnohFWmDaiaHlqp4lIgcEbc1vibrv8E4aAQB0t5E3lFuAvwUebJFzElcsEyQMiagvyicBXGxZ6w/0?wx_fmt=jpeg",
				"【限时1元体验】大虎私募投研报告", "http://mp.weixin.qq.com/s?__biz=MjM5NTI4MDk4OA==&mid=209184917&idx=1&sn=073a205b7a3a633e98f2ee41e8dd8b94&scene=18#rd"));
	}
	
	/*
	 * 设置多图文
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

	//发送图片
	private void responseMenuZZ(InMessage msg){
		ImageOutMessage image = new ImageOutMessage();
		Image img = new Image();
//		img.setMediaId("pVmOsRuKiVg0KwVnvJqn6WocUCoWzgsiTZ7fXUzvX5g9Jtkp2U83gtinQdcz2EZs");
		//获取图片
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andMenuKeyEqualTo("M1_TEAM_ZZ").andResponseTypeEqualTo("image");
		List<WxMenu> list = this.wxMenuService.list(example);
		if(list.size()>0){
			img.setMediaId(list.get(0).getResourceId());
		}
		image.setImage(img);
		setOutMessage(image);
	}

	private void responseMenuInfo(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		sb.append("【大虎交易简介】");
		sb.append("\n");
		sb.append("		大虎交易（TIGER trade）是北京金大虎资本管理有限公司旗下专注于二级市场的多元化自营型交易团队品牌。公司成立于2011年，由拥有多年金融行业实战经验的投资精英共同发起成立，");
		sb.append("同事融合了一批学识广博、严谨务实的专业人才，致力于追求投资收益的稳定增长。公司通过建立专业化、科学化的投资收益评估体系，为市场发掘优秀的投资管理人才，为广大投资者和产业资金");
		sb.append("提供个性化、专业化的优秀投资管理、投资咨询服务。");
		sb.append("\n");
		sb.append("		团队已取得私募基金资质，是国内一支年轻的私募基金运作团队。");
		out.setContent(sb.toString());
		setOutMessage(out);
	}

	private void responseMenuMine(InMessage msg, String serverPath){
		TextOutMessage out = new TextOutMessage();
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
			return;
		}
		TigerNaming naming = namings.get(0);
		StatementExample example = new StatementExample();
		/*Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR,0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Criteria criteria = example.createCriteria().andIdcardEqualTo(naming.getUserid()).andCheckdateGreaterThanOrEqualTo(calendar.getTime());
		calendar.add(Calendar.MONTH,1);
		criteria.andCheckdateLessThan(calendar.getTime());*/
		example.createCriteria().andIdcardEqualTo(naming.getUserid());
		example.setOrderByClause(" CheckDate desc ");
		PageHelper.startPage(1, 1);
		List<Statement> list = statementService.list(example);
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
				sb.append("总收益率：" + statement.getTotalrate().toString());
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
