<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='系统管理-新增模块'>
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
		  					<form class="form-horizontal" role="form" action="${basepath}/modular/persist.htm" method="post">
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">模块名称</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_m_name" name="modularName" value="${bean.modularName}" placeholder="请输入模块名称" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">上级模块</label>
							    <div class="span8">
							      <select class="form-control" name="powerlevel">
							      	<option value="0">顶级菜单</option>
							      	<#list parentList as pm>
							      	<option value="${pm.id}" <#if pm.id==bean.id>selected</#if>>${pm.modularName}</option>
							      	</#list>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">模块描述</label>
							    <div class="span8">
							      <textarea class="form-control noresize" row="3"  name="modularDesc">${bean.modularDesc}</textarea>
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">模块链接</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="modularUrl" value="${bean.modularUrl}" placeholder="请输入模块链接" maxlength="100">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">模块排序</label>
							    <div class="span8">
							      <input type="number" class="form-control" id="" name="modularOrder" value="${bean.modularOrder}" placeholder="请输入排序数值" maxlength="4">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">是否显示</label>
							    <div class="span8">
							      <select class="form-control" name="modularShow">
							      	<option value="1">是</option>
							      	<option value="0" <#if bean.modularShow==0>selected</#if>>否</option>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">图标样式</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="modularStyle" value="${bean.modularStyle}" placeholder="请输入图标样式" maxlength="100">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">模块标识</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="modularFlag" value="${bean.modularFlag}" placeholder="请输入模块标识" maxlength="100">
							    </div>
							  </div>
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <input type="hidden" name="id" value="${bean.id}">
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
	<script type="text/javascript" src="${basepath}/assets/js/include_funadd.js"></script>
  </body>
</html>