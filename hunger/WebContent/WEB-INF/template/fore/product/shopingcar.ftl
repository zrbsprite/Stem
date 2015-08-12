<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<#include "commons/tiglib.ftl"/>
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/css/common.css" />
<title>购物车</title>
</head>
<body>
	<div class="topnav">
	<div class="nav_back"></div>
	<div class="title">购物车</div>
	<div class="nav_icon">
		<span class="hb"></span>
		<span class="hb"></span>
		<span class="hb"></span>
	</div>
</div>
	
	<nav class="botNav">
		<a class="blueBtn2" href="">购买</a>
	</nav>
	
	<#include "commons/commonJS.ftl">
	<script>
		function getStore(){
			if(!!window.sessionStorage){
				for(var i=0;i<window.sessionStorage.length;i++){
					var key = sessionStorage.key(i);
					var value = sessionStorage.getItem(key);
					console.log(key+"- - -"+value);
				}
			}
		}
		$(function(){
			getStore();
		});
	</script>
</body>