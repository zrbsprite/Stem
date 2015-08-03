<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />

<title>赚吧活动列表</title>
<#include "commons/tiglib.ftl"/>
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/css/common.css" />
</head>
<body>
<#assign menuval = '2'>
    <article class="wrapper" id="wrapper">
	<ul class="proUl" id="ul_com">
      	 <li>
      	 <#-- 
            <h2 class="pr">乐无忧重大疾病保障计划 <img src="${basepath}/assets/group/fore/images/hot.gif" />
        -->
            	<#-- 分享 -->
            	<#-- <a href="#"></a> -->
            </h2>
            <div class="pic clearfix">
            	<a href="#"><img src="${basepath}/assets/group/fore/images/careFree.jpg" /></a>
                <p>名称：教育培训<br />说明：点赞1积分，购买10积分<br />点赞：290/350<br />转发：300/450</p>
            </div>
            <p class="tin_5" style="display:none">
            	<span>当前活动：</span><a href="#" style="color:#1A8DE3"></a>
            </p>
            <!-- 
            <div class="btnline clearfix">
	            <a href="#" class="fl btn c1 fs08">产品介绍（静态）</a>
	            <a href="#" class="fr btn c2 fs08">产品介绍（动态）</a>
	        </div>
	        -->
        </li>
        <#if page?exists>
        <#list page.data as bean>
        <li>
            <h2 class="pr">${bean.title?default('')} <img src="${basepath}/assets/group/fore/images/hot.gif" />
            	<a href="${bean.buyUrl?default('#')}"></a>
            </h2>
            <div class="pic clearfix">
            <a href="${bean.buyUrl?default('#')}"><img src="" /></a>
                <p>保险期限：至25周岁<br />起售金额：725.00元<br />积分标准：4.5%</p>
            </div>
            <p class="tin_5" style="display:none">
            	<span>当前活动：</span><a href="#" style="color:#1A8DE3"></a>
            </p>
            <div class="btnline clearfix">
	            <a href="#" class="fl btn c1 fs08">产品介绍（静态）</a>
	            <a href="#" class="fr btn c2 fs08">产品介绍（动态）</a>
	        </div>
        </li>
        </#list>
        </#if>
    </ul>
</article>
<ul id="ul_content" style="display:none;">
	<li>
            <h2 class="pr">乐无忧重大疾病保障计划 <img src="${basepath}/assets/group/fore/images/hot.gif" />
            	<a href="#"></a>
            </h2>
            <div class="pic clearfix">
            <a href="#"><img src="${basepath}/assets/group/fore/images/careFree.jpg" /></a>
                <p>保险期限：至25周岁<br />起售金额：725.00元<br />积分标准：4.5%</p>
            </div>
            <p class="tin_5" style="display:none">
            	<span>当前活动：</span><a href="#" style="color:#1A8DE3"></a>
            </p>
            <div class="btnline clearfix">
	            <a href="#" class="fl btn c1 fs08">产品介绍（静态）</a>
	            <a href="#" class="fr btn c2 fs08">产品介绍（动态）</a>
	        </div>
        </li>
</ul>
<#include "commons/footer.ftl"/>

<#include "commons/commonJS.ftl">
<script type="text/javascript" src="${basepath}/assets/js/iscroll.js"></script>
<script type="text/javascript">
	var myScroll;
	function appendData(){
		loading();
		$ul = $("#ul_com");
		
		//data
		$ul.append($("#ul_content").html());
		
		myScroll.refresh();
		win.close();
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
		win = dialog({
   			width: '20em'
		});
		win.showModal();
	}
</script>
</body>
</html>
