<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>菜单管理</title>
	<#include "include/taglib.ftl">
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style-1.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style_2_common.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/cymain.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/js/layer/skin/layer.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/resources/menu/menu.css" media="all">
	<script type="text/javascript" src="${basepath}/assets/js/jquery-1.8.3.min.js"></script>
</head>
<body id="nv_member" class="pg_CURMODULE">
	<#assign current='menu_menu'>
	<div id="wp" class="wp">
		<!--中间内容-->
		<div class="contentmanage">
			<div class="developer">
				<div class="tableContent">
					<#include "/include/left.ftl"/>
					<div class="content">
						<div class="cLineB">
							<h4 style="font-size:16px;">菜单管理</h4>
							<div class="clr"></div>
							</div>
							<div style="border-top: 1px solid #ccc; padding-top: 10px; margin-top: 10px;" class="msgWrap">
								<div style="margin: 5px 0">
									<div style="float: left; width: 60%;margin-bottom:20px;">
											<form action="" method="post" id="mainForm">
											</form>
									</div>
								</div>
								<table width="100%" cellspacing="0" cellpadding="0" border="0" class="userinfoArea">
									<tbody>
										<tr>
											<th style="width:300px;">
<div class="bg"><img src="${basepath}/resources/menu/home-default17.jpg" width="300px" height="450px;"></div>
<div class="nav4">
	<nav>
		<div id="nav4_ul" class="nav_4">
			<ul class="box">
				<#if data?exists>
				<#list data as bean>
				<li>
					<a href="javascript:;" class=""><span>${bean.wxMenu.menuName?default("")}</span></a>
					<#if bean.list?exists>
					<dl>
					<#list bean.list as vo>
						<dd><a href="javascript:void(0);"><span>${vo.menuName?default("")}</span></a></dd>
					</#list>
					</dl>
					</#if>
				</li>
				</#list>
				</#if>
			</ul>
		</div>
	</nav>
	<div id="nav4_masklayer" class="masklayer_div">&nbsp;</div>
</div>
											</th>
											<td>
											
												<table class="userinfoArea" border="0" cellSpacing="0" cellPadding="0" width="100%" style="margin:0;">
													<tbody>
														<tr>
															<th><span class="red"></span><label for="title">更换图片：</label></th>
															<td><input type="file" class="px"  value="" style="width: 300px;"></td>
														</tr>
													</tbody>
												</table>
												
											</td>
										</tr>
									</tbody>
								</table>
							</from>
							</div>				
					</div>
					<div class="clr"></div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="${basepath}/assets/js/layer/layer.js"></script>
<script src="${basepath}/resources/menu/nav4.js"></script>
<script type="text/javascript">
	nav4.bindClick(document.getElementById("nav4_ul").querySelectorAll("li>a"), document.getElementById("nav4_masklayer"));
	
	
</script>
</html>