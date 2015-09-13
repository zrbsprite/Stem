package com.stem.wechat.bean;

public class WeChatBuyPost {

	private String return_code;

	private String return_msg;

	private String appid;

	private String mch_id;

	private String nonce_str;

	private String result_code;

	private String err_code;

	private String err_code_des;

	private String openid;

	private String is_subscribe;

	private String out_trade_no;

	private String transaction_id;

	private String time_end;

	private String attach;

	private String total_fee;

	public String getReturn_code(){

		return return_code;
	}

	public void setReturn_code(String return_code){

		this.return_code = return_code;
	}

	public String getReturn_msg(){

		return return_msg;
	}

	public void setReturn_msg(String return_msg){

		this.return_msg = return_msg;
	}

	public String getAppid(){

		return appid;
	}

	public void setAppid(String appid){

		this.appid = appid;
	}

	public String getMch_id(){

		return mch_id;
	}

	public void setMch_id(String mch_id){

		this.mch_id = mch_id;
	}

	public String getNonce_str(){

		return nonce_str;
	}

	public void setNonce_str(String nonce_str){

		this.nonce_str = nonce_str;
	}

	public String getResult_code(){

		return result_code;
	}

	public void setResult_code(String result_code){

		this.result_code = result_code;
	}

	public String getOpenid(){

		return openid;
	}

	public void setOpenid(String openid){

		this.openid = openid;
	}

	public String getIs_subscribe(){

		return is_subscribe;
	}

	public void setIs_subscribe(String is_subscribe){

		this.is_subscribe = is_subscribe;
	}

	public String getOut_trade_no(){

		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no){

		this.out_trade_no = out_trade_no;
	}

	public String getTransaction_id(){

		return transaction_id;
	}

	public void setTransaction_id(String transaction_id){

		this.transaction_id = transaction_id;
	}

	public String getTime_end(){

		return time_end;
	}

	public void setTime_end(String time_end){

		this.time_end = time_end;
	}

	public String getErr_code(){

		return err_code;
	}

	public void setErr_code(String err_code){

		this.err_code = err_code;
	}

	public String getErr_code_des(){

		return err_code_des;
	}

	public void setErr_code_des(String err_code_des){

		this.err_code_des = err_code_des;
	}

	public String getAttach(){

		return attach;
	}

	public void setAttach(String attach){

		this.attach = attach;
	}

	public String getTotal_fee(){

		return total_fee;
	}

	public void setTotal_fee(String total_fee){

		this.total_fee = total_fee;
	}
}