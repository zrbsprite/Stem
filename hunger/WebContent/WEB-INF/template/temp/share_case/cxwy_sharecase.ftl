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
        <h1>出行无忧交通意外险</h1>
        <p>小伙伴们，出行无忧交通意外险的分享案例已经帮您准备好了，您再也不用搜肠刮肚去想那些宣传文案了，长按即可复制哦。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">随心保、自在行，真正出行无忧！</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>性价比最高的交通意外险，每天不到1毛钱，50元保一年，保额高达90万！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">父母在，不远游，游必有方！不是不让你出游啊，买个意外险就可以啦。</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>性价比最高的交通意外险，每天不到1毛钱，50元保一年，保额高达90万！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">给自己一份保障，送家人一份安心！</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>性价比最高的交通意外险，每天不到1毛钱，50元保一年，保额高达90万！</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享出行无忧交通意外险</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
