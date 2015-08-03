<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>分享案例</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
</head>
<body>
<article class="wrapper">
	<div class="score">
        <h1>居安宝家庭财产险</h1>
        <p>小伙伴们，居安宝家庭财产险的分享案例已经帮您准备好了，您再也不用搜肠挂肚去想那些宣传文案了，长按即可复制哦</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">一年低至30元保费，转嫁您家庭财产损失的不可测风险。家有多安，运有多好！</p>
                <div class="k clearfix"><img src="/assets/wxdgid/products/ju_anbao/images/banner.jpg" /><span>爱家就全面守护她，给家一份安居保障！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">为自住型家庭而生的专属产品，为您的爱家提供全面安宁的守护! 不论离家多久行走多远都会安心有余。</p>
                <div class="k clearfix"><img src="/assets/wxdgid/products/ju_anbao/images/banner.jpg" /><span>爱家就全面守护她，给家一份安居保障！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">全面贴心的保障大到整个房屋小到室内装潢，盗抢险额外附赠！</p>
	                <div class="k clearfix"><img src="/assets/wxdgid/products/ju_anbao/images/banner.jpg" /><span>爱家就全面守护她，给家一份安居保障！</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
