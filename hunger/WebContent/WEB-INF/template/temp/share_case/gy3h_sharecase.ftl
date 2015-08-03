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
        <h1>共赢三号</h1>
        <p>保险保障+理财收益” 双重保障，保费前十名赠送大金条。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">前几天有个哥们儿，买了公司的共赢3号，听说已经上了排行榜的前三，我靠，金砖等着他咧</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>保险保障+理财收益” 双重保障，保费前十名赠送大金条。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">保险+理财，现在投还有抽奖活动，绝对值得投资的稳健产品。</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>保险保障+理财收益” 双重保障，保费前十名赠送大金条。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">奖品可是真金白银的金砖啊，还有iphone5S，要的朋友赶紧了。</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>保险保障+理财收益” 双重保障，保费前十名赠送大金条。</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享共赢三号</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
