<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no" />
<meta name="viewport" content="initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,width=device-width" />
<title>大虎交易</title>
<#include "include/taglib.ftl">
<link rel="stylesheet" href="${basepath}/assets/css/login.css"/>
</head>
<body>
    <!--公用部分头部导航:begin-->
    <div class="topnav">
        <div class="title">登&nbsp;&nbsp;&nbsp;录</div>
    </div>
<!--公用部分头部导航:end-->        
<div class='content flex h100'>
    <div class="login">
    <form class="form" method="post" id="loginForm" action="${basePath}/wechat/bind.htm">
        <section>
            <label for="tel">手机号&nbsp;&nbsp;</label>
            <input type="number" value="" name="phone" placeholder="请输入您的手机号" id="phone" class="input-text" maxlength="11" autocomplete="off">
        </section>
        <section>
            <label for="pass">身份证号</label>
            <input type="text"  value="" name="idcard" placeholder=" 请输入您的身份证号码" id="idcard" class="input-text" maxlength="18" autocomplete="off">
        </section>
        <section>
            <label for="pass">真实姓名</label>
            <input type="text"  value="" name="realName" placeholder=" 请输入您的真实姓名" id="realName" class="input-text" maxlength="10" autocomplete="off">
        </section>
        <section class="marTop">
            <a onClick="checkForm();" class="input_btn">绑定微信</a>
        </section>
        </form>
        <div class="bottom"><#-- <img src=""/> --></div>
    </div>
</div>
</body>
<script type="text/javascript" src="${basepath}/assets/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${basepath}/assets/js/stem/stem.m.js"></script>
<script type="text/javascript" src="${basepath}/assets/js/stem/alert.js"></script>
<script type="text/javascript">
function checkForm(){
	var phone = document.getElementById("phone").value;
	var idcard = document.getElementById("idcard").value;
	var realName = document.getElementById("realName").value;
	if(!phone || phone==""){
		tip.alert("手机号码不能为空");
		return;
	}
	if(!idcard || phone==""){
		tip.alert("身份证号不能为空");
		return;
	}
	if(!realName || realName==""){
		tip.alert("真实姓名不能为空");
		return;
	}
	document.getElementById("loginForm").submit();
}
</script>
</html>