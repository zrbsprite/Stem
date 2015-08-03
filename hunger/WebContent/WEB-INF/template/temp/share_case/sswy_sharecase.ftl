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
        <h1>盛世无忧终身寿险</h1>
        <p>盛世理财，一生无忧。安邦理财，收益无忧。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">前几天有一个好朋友，买了盛世无忧终身寿险，听说已经上排行榜，我去，大奖等着他咧！</p>
                <div class="k clearfix"><img src="${imageUrl}/sswy.png" /><span>“专家理财+收益稳定”还有何忧？不妨速来，打榜还有iphone6。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">盛世理财，一生无忧。安邦理财，收益无忧。朱镕基总理信任的公司，还有何忧？ </p>
                <div class="k clearfix"><img src="${imageUrl}/sswy.png" /><span>“专家理财+收益稳定”还有何忧？不妨速来，打榜还有iphone6。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">奖品可是真金白银的金砖啊，还有iphone6，要的朋友赶紧了。</p>
	                <div class="k clearfix"><img src="${imageUrl}/sswy.png" /><span>“专家理财+收益稳定”还有何忧？不妨速来，打榜还有iphone6。</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享盛世无忧</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
