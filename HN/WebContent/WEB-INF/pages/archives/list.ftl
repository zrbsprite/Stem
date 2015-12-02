<!DOCTYPE html>
<html lang="en">
  <head>
    <title>档案筛查</title>
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
				  <div class="panel-heading">档案筛查</div>
				  <div class="panel-body">
				  	<div class="row">
					  <form role="form">
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">姓名:</span>
							  <input type="text" class="form-control" placeholder="用户名" name="name">
							</div>
				  		</div>
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie">
							  <span class="input-group-addon">手机号码:</span>
							  <input type="text" class="form-control" placeholder="用户名" name="phone">
							</div>
				  		</div>
				  		<div class="span1">
					  		<div class="input-group clearfix input-ie">
							 <span class="input-group-btn">
						        <button class="btn btn-default btn-theme2" type="button">查询</button>
						      </span>
							</div>
				  		</div>
					  </form>
				  	</div>
				  	<div class="row">
				  		<div class="span3">
					  		<div class="input-group clearfix input-ie pull-lefet">
							  <input type="button" class="form-control" placeholder="新增">
							</div>
				  		</div>
				  	</div>
				  </div>
	 			  <table class="table table-hover">
 					<thead>
 					<tr>
                      <th>姓名</th>
                      <th>性别</th>
                      <th>年龄</th>
                      <th>身份证号码</th>
                      <th>手机号码</th>
                      <th>病历状态</th>
                      <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 						<td>d</td>
 						<td>d</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 						<td>d</td>
 						<td>d</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 						<td>d</td>
 						<td>d</td>
 						<td>d</td>
 					</tr>
 					<#if page?exists>
 					<#list >
 					</#list>
 					</#if>
 					</tbody>
				</table>
				<div class="pull-right">
					<ul class="pagination">
					  <li><span>共 18 条记录&nbsp;&nbsp;1/2 页</span></li>
					  <li><span>&laquo;</span></li>
					  <li class="active"><span>1 <span class="sr-only">(current)</span></span></li>
					  <li><a href="#">2</a></li>
					  <li><a href="#">3</a></li>
					  <li><a href="#">4</a></li>
					  <li><a href="#">5</a></li>
					  <li><a href="#">&raquo;</a></li>
					</ul>
				</div>
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