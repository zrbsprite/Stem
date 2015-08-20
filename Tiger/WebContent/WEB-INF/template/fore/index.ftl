<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Test</title>
<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<#include "include/taglib.ftl" />
<link rel="stylesheet" href="${basepath}/assets/agile/css/agile.layout.css">
<link rel="stylesheet" href="${basepath}/assets/agile/css/flat/flat.component.css">
<link rel="stylesheet" href="${basepath}/assets/agile/css/flat/flat.color.css">
<link rel="stylesheet" href="${basepath}/assets/agile/css/flat/iconline.css">
<link rel="stylesheet" href="${basepath}/assets/app/css/app.css">
</head>
<body>
<div id="aside_container">
	<aside id="right_push_aside" data-position="right" data-transition="push" style="width:80px;">
	    <ul class="menu" style="text-align:center;font-size:2em;">
            <li style="padding: 10px 0;">
                <i class="iconfont iconline-box" style="font-size:20px;"></i>
            </li>
            <li style="padding: 10px 0;">
                <i class="iconfont iconline-box-empty" style="font-size:20px;"></i>
            </li>
            <li style="padding: 10px 0;">
                <i class="iconfont iconline-box-in" style="font-size:20px;"></i>
            </li>
            <li style="padding: 10px 0;">
	            <i class="iconfont iconline-box-out" style="font-size:20px;"></i>
	        </li>
        </ul>
	</aside>
</div>

<div id="section_container">
			<section id="signle_section" data-role="section" class="active" data-aside-right="#right_push_aside" __init_controller__="true">
				<header>
				    <div class="titlebar">
				    	<a data-toggle="back" href="#"><i class="iconfont iconline-arrow-left"></i></a>
				    	<h1>单页模式</h1>
				    	<a data-toggle="aside" href="#right_push_aside"><i class="iconfont iconline-list"></i></a>
				    </div>
				</header>
				<article data-role="article" id="first_article" data-scroll="verticle" class="active" style="top:44px;bottom:56px;" __init_controller__="true">
					<div class="scroller" style="transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1); -webkit-transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1); transition-duration: 0ms; -webkit-transition-duration: 0ms; transform: translate(0px, 0px) translateZ(0px);">  
						<ul class="listitem">
							<li class="sliver">实现</li>
					        <li>
					        	单页模式通过控制器data-toggle="section|article|modal|aside"来实现
					        </li>
					        <li class="sliver">示例</li>
					        <li>
					        	<code>
					        		&lt;a href="#index_section" data-toggle="section"&gt;当前页面中打开index_section&lt;/a&gt;
					        	</code>
					        </li>
					        <li class="sliver">说明</li>
					        <li>
					        	所有单页模式控制器都会触发 load|show|hide事件，触发事件规则为控制器名+事件名。比如，当section第一次加载的时候会触发
					        	sectionload事件，section每次处于激活状态的时候会触发sectionshow事件，当section处于非激活状态的时候会触发sectionhide事件
					        </li>
					        <li>
					        	单页模式的所有内容均可以在当前页面已经加载好，也可以通过远程加载本地的一个同名的html页面来实现(aside除外)。
					        	Agile会通过href的值优先找当前页面已经加载好的内容，如果不存在则远程加载本地的一个同名html页面。
					      		当为远程加载的时候，控制器可以设置data-cache="true|false"定义此远程加载的内容是否要缓存，默认是true缓存
					        </li>
					        <li>
					        	href的值有两种形式，第一种是#id；第二种是url相对地址，如：index_section.html?a=1。当为第二种的时候，
					        	需要远程加载的本地页面的内容中有相应的id为相对地址的文件名的元素，且第二种方式可以通过当前控制器的data-params中获取参数
					        </li>
						</ul>
    				</div>  

				<div class="iScrollVerticalScrollbar iScrollLoneScrollbar" style="overflow: hidden; pointer-events: none; transform: translateZ(0px); transition-duration: 0ms; -webkit-transition-duration: 0ms; opacity: 0;"><div class="iScrollIndicator" style="transition-duration: 0ms; -webkit-transition-duration: 0ms; display: block; height: 548px; transform: translate(0px, 0px) translateZ(0px); transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1); -webkit-transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1);"></div></div></article>
				
				<article data-role="article" id="second_article" data-scroll="verticle" style="top:44px;bottom:56px;">
					<div class="scroller">  
						<ul class="listitem">
							<li class="sliver">article的实现</li>
						    <li>
						       	article控制器data-toggle="article"来实现
						    </li>
						    <li class="sliver">说明</li>
							<li>
						       	article控制器必须指向一个data-role="article"的组件，比如：<br>
						       	<code>&lt;article data-role="article" id="second_article" data-scroll="verticle" style="top:44px;bottom:56px;"&gt;

&lt;/article&gt;</code>
						    </li>
					    </ul>
    				</div>  

				</article>
				<footer>
					<nav class="menubar">
						<a class="menu active" data-role="tab" href="${basepath}/anno/temp.htm" data-toggle="article">
							<span class="menu-icon iconfont iconline-mail"></span>
						    <span class="menu-text">Article</span>
						</a>
						<a class="menu" data-role="tab" href="second_article.html?id=1" data-toggle="article">
							<span class="menu-icon iconfont iconline-notebook"></span>
						    <span class="menu-text">Article</span>
						</a>
						<a class="menu" data-role="tab" href="#index_section" data-toggle="section">
							<span class="menu-icon iconfont iconline-file"></span>
						    <span class="menu-text">Section</span>
						</a>
						<a class="menu" data-role="tab" href="#index_modal" data-toggle="modal">
							<span class="menu-icon iconfont iconline-map-location"></span>
						    <span class="menu-text">Modal</span>
						</a>
					</nav>
				</footer>
			</section>
			
			<section id="index_section" data-role="section">
				<header>
				    <div class="titlebar">
				    	<a data-toggle="back" href="#"><i class="iconfont iconline-arrow-left"></i></a>
				    	<h1>新Section</h1>
				    </div>
				</header>
				<article data-role="article" id="index_article" data-scroll="verticle" class="active" style="top:44px;bottom:0px;">
					<div class="scroller">
						<ul class="listitem">
							<li class="sliver">section的实现</li>
						    <li>
						       	section控制器data-toggle="section"来实现
						    </li>
						    <li class="sliver">说明</li>
							<li>
						       	section控制器必须指向一个data-role="section"的组件，比如：<br>
						       	<code>&lt;section id="index_section" data-role="section"&gt;

&lt;/section &gt;</code>
						    </li>
					    </ul>
    				</div>  
				</article>
			</section>
		<div id="section_container_mask"></div></div>

<script src="${basepath}/assets/third/jquery/jquery-2.1.3.min.js"></script>
<script src="${basepath}/assets/third/jquery/jquery.mobile.custom.min.js"></script>
<script src="${basepath}/assets/third/iscroll/iscroll-probe.js"></script>
<script src="${basepath}/assets/third/arttemplate/template-native.js"></script>
<script type="text/javascript" src="${basepath}/assets/agile/js/agile.js"></script>
<script type="text/javascript" src="${basepath}/assets/app/js/app.js"></script>
</body>
</html>