<!DOCTYPE html>
<html lang="en">
  <head>
    <title>demo</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "frame/taglib.ftl">
    <#include "frame/css.ftl">
    <!--[if lt IE 9]>
        <script src="assets/base/js/html5shiv.min.js"></script>
    <![endif]-->
  </head>
  
<body>
<#-- 导航栏 -->
 <nav class="navbar navbar-default navbar-fixed-top navbar-color-primary" role="navigation">
  <div class="container">
  <div class="container-fluid">
    <!-- logo和手机窗口的菜单 -->
    <div class="navbar-header">
      <a class="navbar-brand" >Logo</a>
    </div>
    <!-- 包括链接、表单和下拉菜单 -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
	        <li class="active"><a >我被选中</a></li>
	        <li><a >链接</a></li>    
	        <li><a >链接</a></li>    
	        <li><a >链接</a></li>    
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a target="_blank">右侧</a></li>
	      <li><a target="_blank">右侧导航</a></li>   
	    </ul>
    </div>
  </div>
  </div>
</nav>
<div class="container-fluid lxui-docs-container">
 	<div class="row">
 		<#-- 菜单 -->
 		<div class="col-md-2">
 			<div class="">
 			<#-- <div class="bs-sidebar hidden-print"> -->
				<ul class="nav bs-sidenav">
					<li class="active li-parent">
						<a class="parent-selected">文字段落</a>
						<ul class="nav">
							<li class="selected"><a >标题</a></li>
							<li><a >页面主体</a></li>
							<li><a >文字样式</a></li>
							<li><a >名片地址</a></li>
							<li><a >引用文本</a></li>
							<li><a >列表</a></li>
						</ul>
					</li>
					<li class="li-parent">
						<a >背景</a>
						<ul class="nav">
							<li><a >背景样式</a></li>
							<li><a >背景不重复</a></li>
							<li><a >背景固定</a></li>
						</ul>
					</li>
				</ul>
			</div>
 		</div>
 		<#-- 主体内容 -->
 		<div class="col-md-10 border-left-1">
 			<div class="row">
 				<div class="container-fluid">
 					<ol class="breadcrumb">
					  <li><a href="#">主页</a></li>
					  <li><a href="#">资源库</a></li>
					  <li class="active">数据源</li>
					</ol>
 				</div>
 			</div>
 			<div class="row">
	 			<div class="container-fluid">
	 			<div class="panel panel-default">
				  <div class="panel-heading">Panel heading</div>
				  <div class="panel-body">
				  <form class="form-horizontal navbar-form navbar-left" role="form">
				  	<div class="input-group">
					  <span class="input-group-addon">用户名</span>
					  <input type="text" class="form-control" placeholder="用户名">
					</div>
					<button type="submit" class="btn btn-default">提交</button>
				  </form>
				  </div>
	 			  <table class="table table-hover">
 					<thead>
 					<tr>
                      <th>#id</th>
                      <th>姓名</th>
                      <th>性别</th>
                      <th>属性</th>
                    </tr>
                    </thead>
                    <tbody>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					<tr>
 						<td>a</td>
 						<td>b</td>
 						<td>c</td>
 						<td>d</td>
 					</tr>
 					</tbody>
				</table>
				<div class="pull-right">
					<ul class="pagination">
					  <li class="disabled"><a href="#">&laquo;</a></li>
					  <li class="active"><a href="#">1</a></li>
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
<#-- 底部信息  -->
 <footer class="lxui-docs-footer">
	 <div class="container clearfix">
	 	<div class="hn-center lxui-docs-footInfo">版权所有 ©  All Rights <b>Bob.Zhang</b> Reserved. </div>
	 	<#-- 
	 	<div class="pull-left lxui-docs-footInfo">左侧 <b>强调</b> 普通文字</div>
		<div class="pull-right lxui-docs-footInfo"><a >右侧</a></div>
	 	 -->
	 </div>
</footer>
<#include "frame/js.ftl">
</body>
</html>