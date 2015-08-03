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
        <h1>慧理财1号</h1>
        <p>三个月年化5%预期收益，7%的话费返回，保费前十名还赠送金条大奖哦。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">保保本预期5%的收益，另外赠送千分之五的话费,买一千返5元话费，买一万返50元话费，三个月就可以赎回，还等什么，这款产品还是相当不错的。</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>安邦慧理财1号，预期年化收益5%，外加0.5%的话费返回，还有金条大奖哦。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">我们公司的产品，近期举办挖金币活动，小伙伴们快来吧，真金白银往出散了，话说微信平台真的很方便呢！</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>安邦慧理财1号，预期年化收益5%，外加0.5%的话费返回，还有金条大奖哦。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">前几天一个哥们儿，买了公司的慧理财1号，听说已经上了排行榜的前三，我靠，金砖等着他咧~</p>
                <div class="k clearfix"><img src="${imageUrl}/share_1.jpg" /><span>安邦慧理财1号，预期年化收益5%，外加0.5%的话费返回，还有金条大奖哦。</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享慧理财1号</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
