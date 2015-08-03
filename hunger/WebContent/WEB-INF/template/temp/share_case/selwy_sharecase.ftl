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
        <h1>乐无忧</h1>
        <p>28日至12周岁少儿重大疾病保险，一次性缴费，保至孩子25周岁。</p>
    </div>
    <ul class="proShareUl">
        <li>
            <div class="l"><img src="${imageUrl}/head_1.jpg" /></div>
            <div class="r">
                <p class="l1">大象 <span>分享了一个链接</span></p>
                <p class="l2">满25岁后，还能按105%收回满期给付金！</p>
                <div class="k clearfix"><img src="${imageUrl}/careFree.jpg" /><span>乐无忧少儿重疾险，一次性缴费，保至25周岁。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_2.jpg" /></div>
            <div class="r">
                <p class="l1">摩米 <span>分享了一个链接</span></p>
                <p class="l2">有孩子的来看看，可保25种重大疾病保险</p>
                <div class="k clearfix"><img src="${imageUrl}/careFree.jpg" /><span>乐无忧少儿重疾险，一次性缴费，保至25周岁。</span></div>
            </div>
        </li>
        <li>
            <div class="l"><img src="${imageUrl}/head_3.jpg" /></div>
            <div class="r">
                <p class="l1">Lee <span>分享了一个链接</span></p>
                <p class="l2">推荐有孩子的父母看看，1~2岁的宝宝投保费用最低！不到800元可保至25岁</p>
                <div class="k clearfix"><img src="${imageUrl}/careFree.jpg" /><span>乐无忧保25种少儿重大疾病，一次性缴费，保至25周岁。</span></div>
            </div>
        </li>
    </ul>
    <a href="${ctx}/wx/product/datil.htm?productId=${productId}&kuser=${kuser}" class="btn blueBtn">
我要分享乐无忧</a>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
