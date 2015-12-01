<!DOCTYPE html>
<html lang="en">
  <head>
    <title>demo</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "frame/taglib.ftl">
    <#include "frame/header-ie.ftl">
    <link rel="stylesheet" href="${basepath}/assets/css/login.css">
    <!--[if lt IE 9]>
        <script src="${basepath}/assets/base/js/html5shiv.min.js"></script>
    <![endif]-->
  </head>
  <body>
  <div id="login-container">
  	<form id="mainForm" method="post" action="">
  	<div id="div_username">
  		<input type="text" name="username" placeholder="请输入用户名" />
  	</div>
  	<div id="div_password">
  		<input type="password" name="password" placeholder="请输入密码" />
  	</div>
  	<div id="div_btn">
  		<input type="button" value="" />
  	</div>
  	</form>
  </div>
<#include "frame/js-ie.ftl">
<script type="text/javascript" src="${basepath}/assets/layer/layer.js"></script>
<script type="text/javascript" src="${basepath}/assets/js/include_login.js"></script>
</body>
</html>