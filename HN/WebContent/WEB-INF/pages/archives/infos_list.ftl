<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='人群档案'>
    <title>${pageTitle}</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "frame/taglib.ftl">
    <#include "frame/header-ie.ftl">
    <!--[if lt IE 9]>
        <script src="${basepath}/assets/base/js/html5shiv.min.js"></script>
    <![endif]-->
  </head>
  
<body>
<#include "frame/top-nav.ftl">
<#assign menu_name='menu_crowsinfo'>
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
				  <div class="panel-heading">${pageTitle}<span class="pull-right glyphicon-image glyphicon-img-diagonalsin" id="span_close"></span></div>
				  <div class="panel-body">
				  <form role="form" id="mainForm" action="${basepath}/archives/crowsinfos.htm" method="post">
				  	 <div class="row">
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">姓名:</span>
							  <input type="text" class="form-control" placeholder="填写姓名" name="name" value="${name}">
							</div>
				  		</div>
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">手机号码:</span>
							  <input type="text" class="form-control" placeholder="填写手机号码" name="phone" value="${phone}">
							</div>
				  		</div>
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">管理分级:</span>
							  <select class="form-control" name="manage">
								  <#list manageLevel as yf>
								  	<option value="${yf.code}" <#if yf.code==manage>selected</#if>>${yf.description}</option>
								  </#list>
								</select>
							</div>
				  		</div>
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">风险等级:</span>
							  <select class="form-control" name="zf">
								  <#list zfLevel as yf>
								  	<option value="${yf.code}"<#if yf.code==zf>selected</#if>>${yf.description}</option>
								  </#list>
								</select>
							</div>
				  		</div>
					 </div>
					 <div class="row">
					 	<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">病历状态:</span>
							  <select class="form-control" name="ze">
								  <#list zeLevel as yf>
								  	<option value="${yf.code}" <#if yf.code==ze>selected</#if>>${yf.description}</option>
								  </#list>
								</select>
							</div>
				  		</div>
				  		<div class="span9">
							 <div class="input-group input-ie pull-right">
							 <span class="input-group-btn">
						        <button class="btn btn-default btn-theme2 pull-right" type="submit">查询</button>
						      </span>
							</div>
				  		</div>
					 </div>
 			  	  </form>
				  </div>
	 			  <table class="table table-hover">
 					<thead>
 					<tr>
                      <th>姓名</th>
                      <th>性别</th>
                      <th>年龄</th>
                      <th>身份证号码</th>
                      <th>手机号码</th>
                      <th>风险等级</th>
                      <th>病历状态</th>
                      <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
 					<#if page?exists && page.list?size gt 0>
 					<#list page.list as bean>
 					<#assign gc=bean.gradeColor>
 					<#if gc?exists>
 					<tr class="<#if gc==1>success<#elseif gc==2>warning<#else>danger</#if>">
 					<#else>
 					<tr>
 					</#if>
 						<td>${bean.fullname}</td>
 						<td><#if bean.sex=='1'>男<#elseif bean.sex=='0'>女<#else>未知</#if></td>
 						<td>${bean.age}</td>
 						<td>${bean.certificatesid}</td>
 						<td>${bean.mobile}</td>
 						<td>${bean.gradeInfo}</td>
 						<td>${bean.status}</td>
 						<td>
 							<div class="btn-group btn-group-xs">
	 							<button class="btn btn-primary" type="button">修改</button>
	 							<button class="btn btn-primary" type="button">删除</button>
	 							<button class="btn btn-primary" type="button">浏览</button>
 							</div>
 						</td>
 					</tr>
 					</#list>
 					</#if>
 					</tbody>
				</table>
				<#include "frame/pagination.ftl">
			  </div>
 			</div>
		</div>
	</div>
</div>
</div>

<#include "frame/footer.ftl">
<#include "frame/js-ie.ftl">
</body>
</html>