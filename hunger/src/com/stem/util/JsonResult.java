package com.stem.util;

import java.util.ArrayList;
import java.util.List;

public class JsonResult {

	public static void main(String[] args) {

	}

	public static JsonObject pageJson(List<?> list, int total) {

		JsonListObject jsonObject = new JsonListObject();
		jsonObject.setData(list);
		jsonObject.setTotal(total);
		jsonObject.setSuccess(true);
		jsonObject.setErrorMsg("");
		return jsonObject;
	}

	public static JsonObject objectJson(Object object) {

		JsonOneObject jsonObject = new JsonOneObject();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(object);
		jsonObject.setData(list);
		jsonObject.setSuccess(true);
		jsonObject.setErrorMsg("");
		return jsonObject;
	}

	public static JsonObject login_objectJson(Object object, String jsessionid) {

		JsonloginObject jsonObject = new JsonloginObject();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(object);
		jsonObject.setData(list);
		jsonObject.setJsessionid(jsessionid);
		jsonObject.setSuccess(true);
		jsonObject.setErrorMsg("");
		return jsonObject;
	}

	public static JsonObject messageJson(Boolean bool, String msg) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.setSuccess(bool);
		jsonObject.setErrorMsg(msg);
		return jsonObject;
	}

	public static class JsonOneObject extends JsonObject {
		public ArrayList<?> data;

		public ArrayList<?> getData() {
			return data;
		}

		public void setData(ArrayList<?> data) {
			this.data = data;
		}
	}

	public static class JsonloginObject extends JsonObject {
		public String jsessionid;

		public ArrayList<?> data;

		public String getJsessionid() {
			return jsessionid;
		}

		public void setJsessionid(String jsessionid) {
			this.jsessionid = jsessionid;
		}

		public ArrayList<?> getData() {
			return data;
		}

		public void setData(ArrayList<?> data) {
			this.data = data;
		}
	}

	public static class JsonListObject extends JsonObject {
		public int total;
		public List<?> data;

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public List<?> getData() {
			return data;
		}

		public void setData(List<?> data) {
			this.data = data;
		}
	}

	public static class JsonObject {

		public String errorMsg;
		public boolean success;

		public String getErrorMsg() {
			return errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

	}
}
