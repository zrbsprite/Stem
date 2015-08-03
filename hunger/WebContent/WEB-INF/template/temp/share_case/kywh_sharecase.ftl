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
        <h1>康赢五号</h1>
        <p>如果您想要积极稳健的投资回报，又期望有一份长期高额的健康保障，和谐康赢5号将是您的最佳选择。每投保满1万元就有50元京东E卡拿呦~</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">康赢五号=稳健回报+健康保障，投保满5万关爱升级。</p>
                <div class="k clearfix"><img src="${imageUrl}/banner_08_mini.jpg" /><span>康赢5号,健康保障+长期理财,实现未来所需！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">活动期间购买每满万元送京东E卡，多买多增，手快有~手慢无~</p>
                <div class="k clearfix"><img src="${imageUrl}/banner_08_mini.jpg" /><span>康赢5号,健康保障+长期理财,实现未来所需！</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">一次购买终生呵护，多重保障关爱生命，利率保底财富增值。</p>
                <div class="k clearfix"><img src="${imageUrl}/banner_08_mini.jpg" /><span>康赢5号,健康保障+长期理财,实现未来所需！</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">我要分享康赢五号理财险</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
