<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
    <title>登录</title>
    <#include "commons/tiglib.ftl" />
    <link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/wxNaturalManPage.css"/>
	<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/wxNaturalManStyle.css"/>
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/js/art/ui-dialog.css"/>
</head>

<div class="loginBanner">
    <img src="${basepath}/assets/group/fore/images/login_top_580x405.jpg" alt="loading"/>
</div>
<!-- banner -->
<article class="loginBox">
    <form id="loginFrom" method="post" action="${basepath}/welcome.htm">
        <ul>
            <li class="loginTxtBg">
                <input type="text" class="inpuTxt" name="userName" id="userName" placeholder="帐号" value=""/>
            </li>
            <li class="loginTxtBg">
                <input type="password" class="inpuTxt"  name="password" placeholder="密码" id="password"/>
            </li>
        </ul>
        <p><input type="button" class="loginBtn" id="login_btn" value="登录"/></p>
    </form>
</article>
<aside class="bottomBar"> 
    <p class="txtl"><a href="javascript:findPass();">忘记密码？</a></p><p class="txtr"><a href="javascript:register();">我要注册</a></p>
</aside>

<#include "commons/commonJS.ftl"/>
<script type="text/javascript" src="${basepath}/assets/js/include/include_home.js"></script>
</body>
</html>