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
        <h1>旅游意外伤害保险</h1>
        <p>小伙伴们，旅游意外伤害保险的分享案例已经帮您准备好了，您再也不用搜肠刮肚去想那些宣传文案了，长按即可复制哦。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">投保成功即可领取微信红包一个，一万份红包大奖，先到先得，快来抢购吧！</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>低保费,高保障,多种保险期间为旅途提供全方面呵护</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">多款保险期间供您选择，无论您是周末 游，国庆游，蜜月游，自由行，总有一款适合您，而且还有红包大奖领取哦！</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>低保费,高保障,多种保险期间为旅途提供全方面呵护</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">给旅游一份保障，送自己一份安心！</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>低保费,高保障,多种保险期间为旅途提供全方面呵护</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享旅游意外伤害保险</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
