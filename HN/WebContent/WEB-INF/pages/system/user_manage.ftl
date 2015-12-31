<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='系统管理-用户管理'>
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
								<div class="row">
								  <form role="form" id="mainForm" action="${basepath}/um/index.htm" method="post">
							  		<div class="span3">
								  		<div class="input-group clearfix input-ie">
										  <span class="input-group-addon">用户名:</span>
										  <input type="text" class="form-control" placeholder="填写用户名" name="userName" value="${userName}" id="input_username">
										</div>
							  		</div>
							  		<div class="span3">
								  		<div class="input-group clearfix input-ie">
										  <span class="input-group-addon">姓名:</span>
										  <input type="text" class="form-control" placeholder="填写姓名" name="name" value="${name}" id="input_name">
										</div>
							  		</div>
							  		<div class="span1">
								  		<div class="input-group clearfix input-ie">
										 <span class="input-group-btn">
									        <button class="btn btn-default btn-theme2" type="button" id="btn_query">查询</button>
									      </span>
										</div>
							  		</div>
								  </form>
							  	</div>
								<#-- end -->
							</div>
							<#-- table start -->
							<table class="table table-hover table-striped">
			 				  	<thead>
			 					<tr>
			                      <th colspan="10"><button class="btn btn-theme2 btn-primary pull-left" type="button" id="btn_add">新增</button></th>
			                    </tr>
			 					<tr>
			                      <th>用户名</th>
			                      <th>姓名</th>
			                      <th>邮箱</th>
			                      <th>手机号码</th>
			                      <th>证件号码</th>
			                      <th>部门</th>
			                      <th>用户类型</th>
			                      <th>用户角色</th>
			                      <th>生成时间</th>
			                      <th>操作</th>
			                    </tr>
		                    	</thead>
			                    <tbody>
			 					<#if page?exists && page.list?size gt 0>
			 					<#list page.list as bean>
			 					<tr>
			 						<td>${bean.username}</td>
			 						<td>${bean.fullname}</td>
			 						<td>${bean.email}</td>
			 						<td>${bean.mobile}</td>
			 						<td>${bean.idnumber}</td>
			 						<td>${bean.depbm}</td>
			 						<td>${bean.usertype}</td>
			 						<td>${bean.roleid}</td>
			 						<td>${bean.createdate?datetime}</td>
			 						<td>
			 							<div class="btn-group btn-group-xs">
				 							<button class="btn btn-primary" type="button" onclick="editItem('${bean.username}',this);">修改</button>
				 							<button class="btn btn-primary" type="button" onclick="delItem('${bean.username}',this);">删除</button>
				 							<#-- <button class="btn btn-primary" type="button" onclick="authItem('${bean.username}',this);">授予角色</button> -->
			 							</div>
			 						</td>
			 					</tr>
			 					</#list>
			 					</#if>
			 					</tbody>
							</table>
							<#include "frame/pagination.ftl">
							<#-- table end -->
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
	<script type="text/javascript" src="${basepath}/assets/js/include_userm.js"></script>
  </body>
</html>