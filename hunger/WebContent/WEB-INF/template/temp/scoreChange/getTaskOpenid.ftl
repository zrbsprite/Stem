<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width,user-scalable=no">
<title>我的任务</title>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/jquery.js"></script>
</head>
<body>

<form id="payform" name="payform" method="post" action="https://open.weixin.qq.com/connect/oauth2/authorize">
	<input type="hidden" id="appid" name="appid" value="<#if appid?exists>${(appid)!''}</#if>"/>
	<input type="hidden" id="redirect_uri" name="redirect_uri" value="<#if redirect_uri?exists>${redirect_uri}</#if>"/>
	<input type="hidden" id="response_type" name="response_type" value="code"/>
	<input type="hidden" id="scope" name="scope" value="snsapi_base"/>
	<input type="hidden" id="state" name="state" value="<#if state?exists>${(state)!''}</#if>"/>
	<input type="hidden" id="#wechat_redirect" name="#wechat_redirect" value="#wechat_redirect"/>
</form>
<script type="text/javascript">
$(function(){
	var url_hostname=location.hostname;
	var appid = $("#appid").val();
	var redirect_uri = $("#redirect_uri").val();
	var state = $("#state").val();
	if(appid!=null&&appid!=''&&redirect_uri!=null&&redirect_uri!=''&&state!=null&&state!=''){
		window.location.href = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + appid + "&redirect_uri=" + redirect_uri + "&response_type=code&scope=snsapi_base&state=" + state + "_" + url_hostname + "#wechat_redirect" ;
	}
}); 
</script>
</body>
</html>