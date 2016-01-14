<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='机构管理-新增或修改'>
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
	<#assign menu_name="menu_dept_institution">
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
		  					<form class="form-horizontal" role="form" action="${basepath}/dept/persist.htm" method="post">
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构名称</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_role_desc" name="roledesc" value="${entity.roledesc}" placeholder="请输入角色描述" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">机构描述</label>
							    <div class="span8">
									<textarea class="form-control noresize" row="3"  name="description"></textarea>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构类型</label>
							    <div class="span8">
							      <select class="form-control" name="powerlevel">
							      	<#list deptList as bean>
							      	<option value="${bean.depbm}" <#if bean.depbm==entity.pptr>selected</#if>>${bean.depname}</option>
							      	</#list>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构标识</label>
							    <div class="span8">
							       <select class="form-control" name="depflag">
							      	<option value="0">机构</option>
							      	<option value="1">科室</option>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构状态</label>
							    <div class="span8">
							       <select class="form-control" name="states">
							      	<option value="1">启用</option>
							      	<option value="0">停用</option>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构LOGO</label>
							    <div class="span8">
							    	<div class="input-group">
								      <input type="text" class="form-control" name="logo" value="${entity.logo}" id="input_logo">
								      <span class="input-group-btn">
								        <button class="btn btn-primary btn-theme1" type="button" onclick="chooseImage();">选择</button>
								      </span>
								    </div>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构联系人</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="linkman" value="${entity.linkman}" placeholder="请填写机构联系人" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">联系人电话</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="linkmantel" value="${entity.linkmantel}" placeholder="请填写联系人电话" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构电话</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="institutiontel" value="${entity.institutiontel}" placeholder="请填写机构电话" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">机构地址</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="address" value="${entity.address}" placeholder="请填写机构地址" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">所属区域</label>
							    <div class="span8">
							      <select class="form-control" name="powerlevel">
							      	<#list areaList as bean>
							      	<option value="${bean.code}" <#if bean.code==entity.area>selected</#if>>${bean.description}</option>
							      	</#list>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">显示顺序</label>
							    <div class="span8">
							      <input type="number" class="form-control" id="" name="zorder" value="${entity.zorder}" placeholder="请填写显示顺序" maxlength="50">
							    </div>
							  </div>
							  
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <input type="hidden" name="depbm" value="${entity.depbm}">
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
	<script type="text/javascript" src="${basepath}/assets/js/department/include_deptadd.js"></script>
  </body>
</html>