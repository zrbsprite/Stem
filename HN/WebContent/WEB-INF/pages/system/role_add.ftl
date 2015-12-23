<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='系统管理-新增角色'>
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
		  					<form class="form-horizontal" role="form" action="${basepath}/role/persist.htm" method="post">
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">角色名称</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_role_name" name="rolename" value="${entity.rolename}" placeholder="请输入角色名称" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">角色描述</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_role_desc" name="roledesc" value="${entity.roledesc}" placeholder="请输入角色描述" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">角色权限</label>
							    <div class="span8">
							      <select class="form-control" name="powerlevel">
							      	<#list authList as bean>
							      	<option value="${bean.code}" <#if bean.code==entity.powerlevel>selected</#if>>${bean.description}</option>
							      	</#list>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <input type="hidden" name="roleid" value="${entity.roleid}">
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
	<script type="text/javascript" src="${basepath}/assets/js/include_roleadd.js"></script>
  </body>
</html>