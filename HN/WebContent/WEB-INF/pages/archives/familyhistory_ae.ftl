<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='人群档案-家族史'>
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
    	td{
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
								<ul class="nav nav-pills">
								  <li><a href="${basepath}/archives/baseinfo.htm">基本信息&gt;</a></li>
								  <li><a href="${basepath}/archives/lifestyle.htm">生活方式&gt;</a></li>
								  <li class="active"><a>家族史&gt;</a></li>
								  <li><a href="${basepath}/archives/control.htm">既往病史及控制情况&gt;</a></li>
								  <li><a href="${basepath}/archives/body.htm">体格检查&gt;</a></li>
								  <li><a href="${basepath}/archives/heartinfo.htm">心电图&gt;</a></li>
								  <li><a href="${basepath}/archives/innercheck.htm">实验室检查&gt;</a></li>
								  <li><a href="${basepath}/archives/bblood.htm">颈部血管超声&gt;</a></li>
								  <li><a href="${basepath}/archives/brainlevel.htm">脑卒中风险评级</a></li>
								</ul>
								<#include "archives/familyhistory.ftl">
							</div>
						</div>	
					</div>	
				</div>
				<div class="row">
					<div class="span3 pull-right"><button type="button" class="btn btn-success">下一步</button></div>
				</div>
			</div>
		</div>
	</div>
	<#include "frame/footer.ftl">
	<#include "frame/js-ie.ftl">
	<script type="text/javascript" src="${basepath}/assets/js/include_family.js"></script>
  </body>
</html>