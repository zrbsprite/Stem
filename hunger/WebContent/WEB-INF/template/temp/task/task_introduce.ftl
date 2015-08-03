<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>任务说明</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script>
(function($){
	$.getUrlParam = function(name){
		var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if (r!=null) return unescape(r[2]); return null;
	}
})(jQuery);
$(function(){
    var tab = $.getUrlParam("tab");
		for(var i=1;i<5;i++){
		    if(tab == i){
			    $('.tabCon'+tab+'').removeClass('disNon');
				$('.controlIcon').find("span img").attr("src","${imageUrl}/add_icon.png");
				$('.tab'+tab+' span img').attr("src","${imageUrl}/minus_icon.png");
			}else{
				$('.tabCon'+i+'').addClass('disNon');
				$('.controlIcon').find("span img").attr("src","${imageUrl}/add_icon.png");
				$('.tab'+i+' span img').attr("src","${imageUrl}/add_icon.png");
			}
		}
});
</script>
</head>

<body>
<article class="txtConBox">
	<section>
    	<dl class="qAList">
        	<dt>什么是邦豆？</dt>
            <dd>邦豆是重要的积分工具。</dd>
            <dt>邦豆可以做什么？</dt>
            <dd>当邦豆累积到一定数额后，可以用来兑换现金红包。</dd>
            <dt>如何获得邦豆？</dt>
            <dd>通过完成任务中心的任务可以获得邦豆，如通过“每日签到”任务，最多可领取30邦豆。</dd>
            <dt>邦豆兑换规则。</dt>
            <dd>每400邦豆可以兑换1元现金红包，不足5元时无法兑换，兑换红包时只能按整数领取。</dd>
        </dl>
    </section>
    <section class="taskIntro">
    	<h2 class="showTit tab1"><span class="controlIcon"><img src="${imageUrl}/minus_icon.png" alt="" /></span>每日签到</h2>
        <div class="introTxt tabCon1">
        	<p>登录数字营销平台，坚持登录的天数越多，每天可获得的邦豆越多；</p>
            <p>第1天：获得5邦豆；</p>
            <p>第2天：获得7邦豆； </p>
            <p>第3~10天： 获得10邦豆/天； </p>
            <p>第11~30天：获得20邦豆/天；  </p>
            <p>>30天：获得30邦豆/天；  </p>
            <p>若连续2天不登录，登录天数重新计算；  </p>
        </div>
        <h2 class="showTit tab2 "><span class="controlIcon"><img src="${imageUrl}/add_icon.png" alt="" /></span>每日分享</h2>
        <div class="introTxt disNon tabCon2">
        	<p>有效分享：分享数字营销平台产品给好友或分享至朋友圈，有好友点击你分享的页面便完成一次有效分享。</p>
            <p>每产生一次有效分享便可获得1邦豆。</p>
            <p>每日由于分享获得的邦豆上限为50。</p>
        </div>
    </section>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>

