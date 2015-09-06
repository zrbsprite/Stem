package com.stem.wechat.inf;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.stem.core.commons.SpringContextUtil;
import com.stem.entity.Statement;
import com.stem.entity.StatementExample;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerNamingExample;
import com.stem.service.StatementService;
import com.stem.service.TigerNamingService;
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
	
	@Override
	public void allType(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		out.setContent("您的消息已经收到！");
		setOutMessage(out);
	}
	
	@Override
	public void textTypeMsg(InMessage msg) {
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
	public void eventTypeMsg(InMessage msg) {
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
						responseMenuMine(msg);
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
					default:
						break;
				}
				break;
			case "view":
				logger.info("用户点击菜单跳转："+msg.getEventKey());
				break;
			default:
				break;
		}
		
	}
	
	private void responseMenuCor(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		sb.append("欢迎来到大虎交易TIGERTrade。如有任何问题欢迎与万能客服虎小妹联系（微信号：13241862849），虎小妹定能第一时间为您答忧解惑！~/得意");
		out.setContent(sb.toString());
		setOutMessage(out);
	}

	private void responseMenuJOIN(InMessage msg){
		setOutMessage(createNews("", "", "", ""));
	}

	private void responseMenuBUY(InMessage msg){
		ImageOutMessage image = new ImageOutMessage();
		// TODO 设置mediaid
		Image img = new Image();
		img.setMediaId("");
		image.setImage(img);
		setOutMessage(image);
	}
	
	private void responseMenuJZ(InMessage msg){
		setOutMessage(createNews("", "", "", ""));
	}
	
	private void responseMenuDT(InMessage msg){
		setOutMessage(createNews("", "", "", ""));
	}
	
	/*
	 * 设置多图文
	 * */
	private NewsOutMessage createNews(String des, String picUrl, String title, String url){
		//可以从多图文获取
		Articles articles = new Articles();
		articles.setDescription("");
		articles.setPicUrl("");
		articles.setTitle("");
		articles.setUrl("");
		List<Articles> list = new ArrayList<Articles>();
		list.add(articles);
		
		NewsOutMessage out = new NewsOutMessage();
		out.setArticles(list);
		return out;
	}

	//发送图片
	private void responseMenuZZ(InMessage msg){
		ImageOutMessage image = new ImageOutMessage();
		// TODO 设置mediaid
		Image img = new Image();
		img.setMediaId("");
		image.setImage(img);
		setOutMessage(image);
	}

	private void responseMenuInfo(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		StringBuffer sb = new StringBuffer();
		sb.append("【大虎交易简介】");
		sb.append("\\n");
		sb.append("大虎交易（TIGER trade）是北京金大虎资本管理有限公司旗下专注于二级市场的多元化自营型交易团队品牌。公司成立于2011年，由拥有多年金融行业实战经验的投资精英共同发起成立，");
		sb.append("同事融合了一批学识广博、严谨务实的专业人才，致力于追求投资收益的稳定增长。公司通过建立专业化、科学化的投资收益评估体系，为市场发掘优秀的投资管理人才，为广大投资者和产业资金");
		sb.append("提供个性化、专业化的优秀投资管理、投资咨询服务。");
		sb.append("\\n");
		sb.append("团队已取得私募基金资质，是国内一支年轻的私募基金运作团队。");
		out.setContent(sb.toString());
		setOutMessage(out);
	}

	private void responseMenuMine(InMessage msg){
		TextOutMessage out = new TextOutMessage();
		//make data
		String openid = msg.getFromUserName();
		//获取用户id card no
		TigerNamingService namingService = SpringContextUtil.getBean("tigerNamingService");
		TigerNamingExample namingExample = new TigerNamingExample();
		namingExample.createCriteria().andOpenidEqualTo(openid);
		List<TigerNaming> namings = namingService.list(namingExample);
		if(namings.size()==0){
			return;
		}
		TigerNaming naming = namings.get(0);
		StatementService service = SpringContextUtil.getBean("statementService");
		StatementExample example = new StatementExample();
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.M");
		example.createCriteria().andMonthEqualTo(sf.format(date)).andIdEqualTo(naming.getUserid());
		List<Statement> list = service.list(example);
		StringBuffer sb = new StringBuffer("您本月的相关资金信息如下：\n\n");
		for(Statement statement : list){
			sb.append("产品《"+statement.getFundname()+"》");
			sb.append("\n");
			sb.append("开放日净值："+statement.getNetvalueofbuyday());
			sb.append("\n");
		}
		out.setContent(sb.toString());
		setOutMessage(out);
	}
	
	@Override
	public void setOutMessage(OutMessage outMessage) {
		this.outMessage = outMessage;
	}
	
	@Override
	public void afterProcess(InMessage inMessage,OutMessage outMessage) {
	}
	
	@Override
	public OutMessage getOutMessage() {
		return outMessage;
	}
}
