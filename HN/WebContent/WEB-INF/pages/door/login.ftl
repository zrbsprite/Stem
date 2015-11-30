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
  <#--  
   <nav class="navbar navbar-default navbar-fixed-top navbar-color-primary" role="navigation">
  <div class="container">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" >Logo</a>
    </div>
  </div>
  </div>
</nav>
-->
  <div id="login-container">
	<div id="login-content">
		<div class="clearfix">
			<form method="post" action="${basepath}/welcome.htm" id="mainForm">
			  <div class="form-group">
			    <label for="input_username">用户名</label>
			    <input type="email" class="form-control" id="input_username" placeholder="请输入用户名" maxlength="20">
			  </div>
			  <div class="form-group">
			    <label for="input_password">密码</label>
			    <input type="password" class="form-control" id="input_password" placeholder="请输入密码" maxlength="20">
			  </div>
			  <div class="form-group">
			  	<div id="remember-me" class="pull-left input-ie">
					<input type="checkbox" name="remember" id="remember"> &nbsp;记住登录状态
				</div>
			   <div class="pull-right margin-right-2">
					<button type="button" class="btn btn-warning" id="btn_login">登录</button>
				</div>
			  </div>
			</form>
		</div>
	</div>
  </div>
<#include "frame/js-ie.ftl">
<script type="text/javascript" src="${basepath}/assets/layer/layer.js"></script>
<script type="text/javascript" src="${basepath}/assets/js/include_login.js"></script>
</body>
</html>