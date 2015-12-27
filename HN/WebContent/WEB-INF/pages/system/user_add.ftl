<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='系统管理-新增用户'>
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
	<#assign menu_name="menu_sysuser">
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
		  					<form class="form-horizontal" role="form" action="${basepath}/um/persist.htm" method="post" id="mainForm">
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">用户名</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_user_username" name="username" value="${entity.username}" placeholder="请输入用户名" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_desc" class="span3 control-label">姓名</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_user_desc" name="fullname" value="${entity.fullname}" placeholder="请输入姓名" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_desc" class="span3 control-label">手机号码</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_user_desc" name="mobile" value="${entity.mobile}" placeholder="请输入手机号码" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_desc" class="span3 control-label">身份证号码</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_user_desc" name="idnumber" value="${entity.idnumber}" placeholder="请输入身份证号码" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_desc" class="span3 control-label">邮箱</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_user_desc" name="email" value="${entity.email}" placeholder="请输入邮箱" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_auth" class="span3 control-label">用户状态</label>
							    <div class="span8">
							      <select class="form-control" name="states">
							      	<option value="1">有效</option>
							      	<option value="0">无效</option>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_auth" class="span3 control-label">用户类型</label>
							    <div class="span8">
							      <select class="form-control" name="usertype">
							      	<#list typeList as bean>
							      	<option value="${bean.code}" <#if bean.code==entity.usertype>selected</#if>>${bean.description}</option>
							      	</#list>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_user_auth" class="span3 control-label">部门</label>
							    <div class="span8">
							      <select class="form-control" name="depbm">
							      	<#list deptList as bean>
							      	<option value="${bean.depbm}" <#if bean.depbm==entity.depbm>selected</#if>>${bean.depname}</option>
							      	</#list>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <input type="hidden" name="userid" value="${entity.userid}">
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
	<script type="text/javascript" src="${basepath}/assets/js/include_useradd.js"></script>
  </body>
</html>