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
        <h1>乐享一号</h1>
        <p>小伙伴们，乐享1号的分享案例已经帮您准备好了，您再也不用搜肠刮肚去想那些宣传文案了，长按即可复制哦。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">一次购买，终身受益，理财养老，本就如此简单！</p>
                <div class="k clearfix"><img src="${imageUrl}/banner_lexiang_683x343_1.jpg" /><span>乐享一号兼顾理财和保险，灵活保本增值，让您的养老无后顾之忧。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">如果有一天，我老无所依，我也能有尊严的老去！ </p>
                <div class="k clearfix"><img src="${imageUrl}/banner_lexiang_683x343_1.jpg" /><span>乐享一号兼顾理财和保险，灵活保本增值，让您的养老无后顾之忧。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">乐享晚年，从这里开始！立即投保，惊喜无限！</p>
	                <div class="k clearfix"><img src="${imageUrl}/banner_lexiang_683x343_1.jpg" /><span>乐享一号兼顾理财和保险，灵活保本增值，让您的养老无后顾之忧。</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享乐享一号年金保险</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
