<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='系统管理-功能管理'>
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
								<div class="row">
								  <form role="form" id="mainForm" action="${basepath}/modular/index.htm" method="post">
							  		<div class="span3">
								  		<div class="input-group clearfix input-ie">
										  <span class="input-group-addon">姓名:</span>
										  <input type="text" class="form-control" placeholder="填写模块名称" name="name" value="${name}">
										</div>
							  		</div>
							  		<div class="span1">
								  		<div class="input-group clearfix input-ie">
										 <span class="input-group-btn">
									        <button class="btn btn-default btn-theme2" type="submit">查询</button>
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
			                      <th colspan="7"><button class="btn btn-theme2 btn-primary pull-left" type="button" id="btn_add">新增</button></th>
			                    </tr>
			 					<tr>
			                      <th>编号</th>
			                      <th>模块名称</th>
			                      <th>模块链接</th>
			                      <th>模块说明</th>
			                      <th>显示排序</th>
			                      <th>是否显示</th>
			                      <th>操作</th>
			                    </tr>
		                    	</thead>
			                    <tbody>
			 					<#if page?exists && page.list?size gt 0>
			 					<#list page.list as bean>
			 					<tr>
			 						<td>${page.pageSize*(page.pageNum-1)+bean_index+1}</td>
			 						<td>${bean.modularName}</td>
			 						<td>${bean.modularUrl}</td>
			 						<td>${bean.modularDesc}</td>
			 						<td>${bean.modularOrder}</td>
			 						<td><#if bean.modularShow==1>是<#else>否</#if></td>
			 						<td>
			 							<div class="btn-group btn-group-xs">
				 							<button class="btn btn-primary" type="button" onclick="delItem('${bean.id}',this)">删除</button>
				 							<button class="btn btn-primary" type="button" onclick="editItem('${bean.id}',this)">修改</button>
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
	<script type="text/javascript" src="${basepath}/assets/js/modular/include_funm.js"></script>
  </body>
</html>