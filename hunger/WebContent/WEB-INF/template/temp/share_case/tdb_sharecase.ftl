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
        <h1>投贷宝</h1>
        <p>质押共赢系列的纸质保单，即可从银行申请一定金额的贷款！ </p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">用明天的钱，圆今天的梦，质押共赢系列纸质保单，“贷”来希望之光。</p>
                <div class="k clearfix"><img src="${imageUrl}/tdb.jpg" /><span>质押共赢系列的纸质保单，即可从银行申请一定金额的贷款！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">急！急！急！急用钱，无处筹钱？质押共赢系列纸质保单，即可从银行申请贷款！ </p>
                <div class="k clearfix"><img src="${imageUrl}/tdb.jpg" /><span>质押共赢系列的纸质保单，即可从银行申请一定金额的贷款！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">质押共赢系列纸质保单！放贷快！利率低！省时、划算、放心！</p>
	                <div class="k clearfix"><img src="${imageUrl}/tdb.jpg" /><span>质押共赢系列的纸质保单，即可从银行申请一定金额的贷款！</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享投贷宝</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
