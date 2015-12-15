package com.penzias.vo;

import com.penzias.entity.OtherHistory;

/**
 * 描述：其他病史vo<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月15日 - 下午1:35:28<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class OtherHistoryVO {

	private OtherHistory[] others;

	public OtherHistory[] getOthers(){

		return others;
	}

	public void setOthers(OtherHistory[] others){

		this.others = others;
	}

}
