<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='修改密码'>
    <title>${pageTitle}</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "frame/taglib.ftl">
    <#include "frame/header-ie.ftl">
    <!--[if lt IE 9]>
        <script src="${basepath}/assets/base/js/html5shiv.min.js"></script>
    <![endif]-->
    <style rel="stylesheet">
    	th,td{
    		vertical-align:middle!important;
    		text-align:center!important;
    	}
    </style>
  </head>
  <body>
	<#include "frame/top-nav.ftl">
	<#assign menu_name="menu_sysfunction">
	<div class="container-fluid lxui-docs-container">
	 	<div class="row show-grid">
	 		<#-- 菜单 -->
	 		<div class="span-col2">
	 			<#include "frame/left-nav.ftl">
	 		</div>
	 		<#-- 主体内容 -->
	 		<div class="span-col10 border-left-1 show-grid">
	 			<#include "frame/route.ftl">
	 			<div class="row">
	 				<div class="container-fluid">
			 			<div class="panel panel-default">
		  					<div class="panel-body">
		  					<#-- start -->
		  					<#if error?exists>
		  					<div class="alert alert-danger" role="alert">
		  						<button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
  								<strong>错误!</strong> ${error}
		  					</div>
		  					</#if>
		  					<form class="form-horizontal" role="form" action="${basepath}/user/repwd.htm" method="post">
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">原密码</label>
							    <div class="span8">
							      <input type="password" class="form-control" id="input_old_pwd" name="oldPassword" placeholder="请输入原密码" maxlength="16">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">新密码</label>
							    <div class="span8">
							      <input type="password" class="form-control" id="input_new_pwd" name="pwd" placeholder="请输入新密码" maxlength="16">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">确认新密码</label>
							    <div class="span8">
							      <input type="password" class="form-control" id="input_new_pwd_re" placeholder="请输入新密码" maxlength="16">
							    </div>
							  </div>
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <button type="button" class="btn btn-theme2 btn-primary pull-right" id="btn_save">保存</button>
							    </div>
							  </div>
							</form>
		  					<#-- end -->
		  					</div>
						</div>	
					</div>	
				</div>
			</div>
		</div>
	</div>
	<#include "frame/footer.ftl">
	<#include "frame/js-ie.ftl">
	<script type="text/javascript" src="${basepath}/assets/layer/layer.js"></script>
	<script type="text/javascript" src="${basepath}/assets/layer/alert.js"></script>
	<script type="text/javascript" src="${basepath}/assets/js/user/include_resestpwd.js.js"></script>
  </body>
</html>