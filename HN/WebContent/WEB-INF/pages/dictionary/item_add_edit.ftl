<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='数据字典-新增或修改'>
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
	<#assign menu_name="menu_dicinfo">
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
		  					<form class="form-horizontal" role="form" action="${basepath}/sys/dic/item/s.htm" method="post">
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">类型编码</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_item_codeid" name="codeid" value="${bean.codeid}" <#if bean.codeid?exists>readonly</#if> placeholder="请输入类型编码" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">字典编码</label>
							    <div class="span8">
									<input type="text" class="form-control" id="input_item_code" name="code" value="${bean.code}" placeholder="请输入字典编码" maxlength="50"  <#if bean.code?exists>readonly</#if>>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">字典详情</label>
							    <div class="span8">
									<textarea class="form-control noresize" row="3"  name="description">${bean.description}</textarea>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">父编码</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_role_desc" name="cptr" value="${bean.cptr}" placeholder="请输入父编码" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">是否有子编码</label>
							    <div class="span8">
							      <select class="form-control" name="pptr">
							      	<option value="0" >否</option>
							      	<option value="1" <#if 1==bean.pptr>selected</#if>>是</option>
							      	</select>
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">全拼</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_item_spell" name="spell" value="${bean.spell}" placeholder="请输入全拼" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">备注</label>
							    <div class="span8">
									<textarea class="form-control noresize" row="3"  name="remarks">${bean.remarks}</textarea>
							    </div>
							  </div>
							  
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							   	  <input type='hidden' name='t' value='${t}' />
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
	<script type="text/javascript" src="${basepath}/assets/js/dic/include_itemadd.js"></script>
  </body>
</html>