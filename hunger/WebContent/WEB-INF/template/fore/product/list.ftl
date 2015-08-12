<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />

<title>馋吧产品列表</title>
<#include "commons/tiglib.ftl"/>
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/css/common.css" />
<link rel="stylesheet" type="text/css" href="${basepath}/assets/js/art/ui-dialog.css"/>
</head>
<body>
<#assign menuval = '1'>
	<div class="topnav">
		<div class="nav_back"></div>
		<div class="title">专题活动(团购)</div>
		<div class="nav_icon">
			<span class="hb"></span>
			<span class="hb"></span>
			<span class="hb"></span>
		</div>
	</div>
    <article class="wrapper" id="wrapper">
	<ul class="proUl" id="ul_com">
        <#if page?exists>
        <#list page.data as bean>
        <li>
        	<#-- 
            <h2 class="pr">${bean.title?default('')} <img src="${basepath}/assets/group/fore/images/hot.gif" />
            	<a href="${bean.buyUrl?default('#')}"></a>
            </h2>
             -->
            <div class="pic clearfix">
            	<a href="${bean.buyUrl?default('#')}"><img src="${basepath}/anno/img.htm?path=${bean.pic}" /></a>
            	<input type="hidden" value="${bean.code}" />
                <p>商品名称：${bean.title}<br />商品价格：￥${bean.salePrice} <span class="font_10">￥${bean.marketPrice}</span><br />销售单位：${bean.unit}<br />
                	<span class="one_line"><span>加入购物车：</span><button class="btn_mul"></button><input name="buyCount" class="wid_20 mid" value="0"/><button class="btn_plus"></button></span></p>
            </div>
            <p class="tin_5" style="display:none">
            	<span>当前活动：</span><a href="#" style="color:#1A8DE3"></a>
            </p>
            <div class="btnline clearfix">
	            <a href="#" class="fl btn c3">产品介绍</a>
	        </div>
            <#-- 
            <div class="btnline clearfix">
	            <a href="#" class="fl btn c1 fs08">产品介绍（静态）</a>
	            <a href="#" class="fr btn c2 fs08">产品介绍（动态）</a>
	        </div>
	         -->
        </li>
        </#list>
        </#if>
    </ul>
</article>
<div class="jdm-toolbar-tabs">
	<div class="jdm-toolbar-tab jdm-tbar-tab-cart">
		<i class="tab-ico"></i> <em class="tab-text">购物车</em>
		<span class="tab-sub J-count hide" style="display: none;">0</span>
		<div class="tabs-tip hide">
			<span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b>
		</div>
	</div>
</div>
<#include "commons/footer.ftl"/>

<#include "commons/commonJS.ftl">

<script type="text/javascript" src="${basepath}/assets/js/iscroll.js"></script>
<script type="text/javascript">
	var myScroll;
	var pageIndex = 1;
	function appendData(){
		loading();
		pageIndex++;
		$ul = $("#ul_com");
		//data
		$.post("${basepath}/pro/data.htm",{"pageIndex":pageIndex},function(data){
			window.winIndex.close();
			if(data&&data.errcode==200){
				var mate = data.page.data;
				if(mate.length<=0){
					showTip("没有更多数据了");
					return;
				}
				for(var i=0;i<mate.length;i++){
					var d = mate[i];
					var content = '<li><div class="pic clearfix"><a href="'+d.buyUrl+'"><img src="'+basepath+'/anno/img.htm?path='+d.pic+'" /></a><input type="hidden" value="'+d.code+'" />';
					content += '<p>商品名称：'+d.title+'<br />商品价格：￥'+d.salePrice+' <span class="font_10">￥'+d.marketPrice+'</span><br />销售单位：'+d.unit+'<br />';
					content += '<span class="one_line"><span>加入购物车：</span><button class="btn_mul"></button><input name="buyCount" class="wid_20 mid" value="0"/><button class="btn_plus"></button></span></p></div>';
					content += '<div class="btnline clearfix"><a href="#" class="fl btn c3">产品介绍</a></div></li>';
					var $content =  $(content);
					$ul.append($content);
				}			
				myScroll.refresh();
			}
		}, "json");
	}
	function loaded() {
		var y = 0;
		var maxY = 0;
		myScroll = new iScroll('wrapper',{
			hScroll:false,
			onScrollMove: function(){
				y = this.y;
				maxY = this.maxScrollY;
			},
			onScrollEnd: function () {
				if ((-y - maxY) > 10) {
					appendData();
		        }
        	}  
		});
	}
	document.addEventListener('touchmove', function (e){ e.preventDefault(); }, false);
	document.addEventListener('DOMContentLoaded', loaded, false);
	
	function loading(){
		window.winIndex = win.loading();
	}
	
	function showTip(msg){
		win.alert(msg);
	}
	$(function(){
		$(".btn_plus").click(function(){
			var $text = $(this).prev();
			var txt = $text.val();
			if(txt==""){
				txt = 0;
			}
			txt = parseInt(txt);
			txt += 1;
			$text.val(txt);
			var $code = $(this).closest("div.pic").children().find("input");
			addData($code.val(), txt);
		});
		$(".btn_mul").click(function(){
			var $text = $(this).next();
			var txt = $text.val();
			if(txt==""){
				txt = 0;
			}
			txt = parseInt(txt);
			txt -= 1;
			if(txt<=0){
				txt = 0;
			}
			$text.val(txt);
			var $code = $(this).closest("div.pic").children().find("input");
			addData($code.val(), txt);
		});
		
		$(".tab-ico").click(function(){
			window.location.href="${basepath}/shop/index.htm";
		});
		<#-- 
		.mouseenter(function(){
			$(this).find("li").next().css("background-color","#c81623").animate({"left":"-60px"},"fast");
		}).mouseout(function(){
			$(this).find("li").next().animate({"left":"35px"},"fast");
		});
		 -->
	});
	function addData(code, num){
		if(!!window.sessionStorage){
			if(!window.sessionStorage.name){
				window.sessionStorage.name = 'stem';
			}
			window.sessionStorage.setItem(code, num);
		}
	}
</script>
</body>
</html>
