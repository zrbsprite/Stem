<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='机构管理'>
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
								<div class="row">
								  <form role="form" id="mainForm" action="${basepath}/dept/index.htm" method="post">
							  		<div class="span3">
								  		<div class="input-group clearfix input-ie">
										  <span class="input-group-addon">机构名称:</span>
										  <input type="text" class="form-control" placeholder="填写机构名称" name="deptName" value="${deptName}" id="input_deptName">
										</div>
							  		</div>
							  		<div class="span3">
								  		<div class="input-group clearfix input-ie">
										  <span class="input-group-addon">机构联系人:</span>
										  <input type="text" class="form-control" placeholder="填写机构联系人" name="linkMan" value="${linkMan}" id="input_linkMan">
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
			                      <th>机构名称</th>
			                      <th>说明</th>
			                      <th>机构类型</th>
			                      <th>机构联系人</th>
			                      <th>联系人电话</th>
			                      <th>机构电话</th>
			                      <th>机构地址</th>
			                      <th>所属区域</th>
			                      <th>创建人</th>
			                      <th>创建时间</th>
			                      <th>是否启用</th>
			                      <th>操作</th>
			                    </tr>
		                    	</thead>
			                    <tbody>
			 					<#if page?exists && page.list?size gt 0>
			 					<#list page.list as bean>
			 					<tr>
			 						<td>${bean.depname}</td>
			 						<td>${bean.description}</td>
			 						<td>${bean.institutiontype}</td>
			 						<td>${bean.linkman}</td>
			 						<td>${bean.linkmantel}</td>
			 						<td>${bean.institutiontel}</td>
			 						<td>${bean.address}</td>
			 						<td>${bean.area}</td>
			 						<td>${bean.username}</td>
			 						<td>${bean.createdate}</td>
			 						<td><#if bean.status==1>是<#else>否</#if></td>
			 						<td>
			 							<div class="btn-group btn-group-xs">
				 							<button class="btn btn-primary" type="button" onclick="editItem('${bean.username}',this);">修改</button>
				 							<button class="btn btn-primary" type="button" onclick="delItem('${bean.username}',this);">删除</button>
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
	<script type="text/javascript" src="${basepath}/assets/js/include_dept_institution.js"></script>
  </body>
</html>