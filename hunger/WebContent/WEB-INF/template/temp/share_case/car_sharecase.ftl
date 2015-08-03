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
        <h1>安邦汽车保险</h1>
        <p>小伙伴们，安邦汽车保险的分享案例已经帮您准备好了，您再也不用搜肠挂肚去想那些宣传文案了，长按即可复制哦。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">汽车保险哪家强，快捷、省钱、放心属安邦！</p>
                <div class="k clearfix"><img src="${imageUrl}/banner_10.jpg" /><span>安邦车险省时又省钱，让您的爱车得到全方面的呵护与保障！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">安邦汽车保险，优质的服务，高品质的保障，还等什么？有车一族快来抢购吧！ </p>
                <div class="k clearfix"><img src="${imageUrl}/banner_10.jpg" /><span>安邦车险省时又省钱，让您的爱车得到全方面的呵护与保障！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">选择安邦车险即可享受15%的优惠，还有多重豪礼相赠！</p>
	                <div class="k clearfix"><img src="${imageUrl}/banner_10.jpg" /><span>安邦车险省时又省钱，让您的爱车得到全方面的呵护与保障！</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享安邦车险</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
