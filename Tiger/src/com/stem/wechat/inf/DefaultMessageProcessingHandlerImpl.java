package com.stem.wechat.inf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.util.StringUtils;

import com.stem.core.commons.SpringContextUtil;
import com.stem.entity.Statement;
import com.stem.entity.StatementExample;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerNamingExample;
import com.stem.service.StatementService;
import com.stem.service.TigerNamingService;
import com.stem.wechat.bean.InMessage;
import com.stem.wechat.bean.OutMessage;
import com.stem.wechat.bean.TextOutMessage;

public class DefaultMessageProcessingHandlerImpl implements MessageProcessingHandler{

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
		String eventKey = msg.getEventKey();
		if(StringUtils.isEmpty(eventKey)){
			return;
		}
		//如果是获取收益数据
		if(eventKey.equals("V1001_FETCH_DATA")){
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
		}else{
			return;
		}
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
