<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>产品列表</title>
<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<#include "commons/tiglib.ftl"/>
<#include "include/css.ftl">
</head>
<body>
<div id="aside_container">
	<aside id="right_push_aside" data-position="right" data-transition="push" style="width:9.5em;">
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
	<section id="single_section" data-role="section" class="active" data-aside-right="#right_push_aside" __init_controller__="true">
		<header>
		    <div class="titlebar">
		    	<a data-toggle="back" href="#"><i class="iconfont iconline-arrow-left"></i></a>
		    	<h1>产品列表</h1>
		    	<a data-toggle="aside" href="#right_push_aside"><i class="iconfont iconline-list"></i></a>
		    </div>
		</header>
		<article data-role="article" id="main_article" data-scroll="pullup" class="active" style="top:44px;bottom:50px;">
		 	<div class="scroller">
			 	<div id="slide" data-role="slider" class="full-width" style="heigh:154px;overflow: hidden;">
			 		<div class="scroller">
						<div class="slide">
							<img src="${basepath}/assets/images/banner/20150804rbhmzv.jpg" class="full-width"/>
							<#-- <div class="slider_label">综合新闻</div> -->
						</div>
						<div class="slide">
							<img src="${basepath}/assets/images/banner/20150728guexki.jpg" class="full-width"/>
						</div>
						<div class="slide">
							<img src="${basepath}/assets/images/banner/20150804rbhmzv.jpg" class="full-width"/>
						</div>
					</div>
				</div>
				<ul class="listitem">
				<#if page?exists>
	        	<#list page.data as bean>
				    <li>
				    	<a href="${bean.buyUrl?default('#')}"><img alt="" src="${basepath}/anno/img.htm?path=${bean.pic}" style="width:9.5em;" class="img" />
				    	<i class="ricon iconfont iconline-arrow-right"></i>
				       	<div class="text">商品名称：${bean.title}
				            <small class="nowrap ellipsis">商品价格：￥${bean.salePrice}</small>
				            <small class="nowrap ellipsis">市场价格：￥${bean.marketPrice}</small>
				            <small class="nowrap ellipsis">销售单位：${bean.unit}</small>
				        </div>
				        <small class="rcaption">1891跟帖</small>
				        </a>
				    </li>
				    <li>
				    	<a href="${bean.buyUrl?default('#')}"><img alt="" src="${basepath}/anno/img.htm?path=${bean.pic}" style="width:9.5em;" class="img" />
				    	<i class="ricon iconfont iconline-arrow-right"></i>
				       	<div class="text">商品名称：${bean.title}
				            <small class="nowrap ellipsis">商品价格：￥${bean.salePrice}</small>
				            <small class="nowrap ellipsis">市场价格：￥${bean.marketPrice}</small>
				            <small class="nowrap ellipsis">销售单位：${bean.unit}</small>
				        </div>
				        <small class="rcaption">1891跟帖</small>
				        </a>
				    </li>
			    </#list>
	        	</#if>
				</ul>
			</div>
		</article>
		<footer>
			<nav class="menubar">
				<a class="menu active" data-role="tab" href="#">
				    <span class="menu-text">馋吧</span>
				</a>
				<a class="menu" data-role="tab" href="${basepath}/spend/index.htm" data-toggle="html">
				    <span class="menu-text">花吧</span>
				</a>
				<a class="menu" data-role="tab" href="${basepath}/income/index.htm" data-toggle="html">
				    <span class="menu-text">赚吧</span>
				</a>
				<a class="menu" data-role="tab" href="${basepath}/mine/index.htm" data-toggle="html">
				    <span class="menu-text">我的</span>
				</a>
			</nav>
		</footer>
	</section>
</div>

<#include "include/js.ftl">
<script type="text/javascript">
	A.Slider('#slide',{dots : 'right'});
</script>
</body>
</html>