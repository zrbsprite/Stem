<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>保费排行－全民营销</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css"/>
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
</head>

<body>
<nav class="botTopTab">
    <a href="${ctx}/wx/employeescore.htm"><img src="${imageUrl}/icon_topnav_01.png" class="p" />保费排名</a><!--
    --><a href="${ctx}/wx/activityAward.htm"><img src="${imageUrl}/icon_topnav_02.png" class="j" />活动奖励</a>
</nav>
<article class="wrapper">
	<!--
		<div class="sc_ranking_tit">
	        <a href="javascript:void(0);" class="bg">销售人员</a>
	        <a href="javascript:void(0);" class="bg1">非销售人员</a>
	    </div>
    -->
    <div class="score mar_b06">
        <h1>游轮活动推荐人排名</h1>
	</div>
    <ul class="sc_ranking">
		<#if scoreList??>
	    <!--	<li class="no1" ><p class="t1"><span>1</span>&nbsp;</p><p class="t2">刘鑫</p><p class="t4">9500</p></li>
	    	<#list scoreList as scoreList>
	    		<#if scoreList_index = 0>
	    		<li class="no2" ><p class="t1"><span>2</span>&nbsp;</p><p class="t2">赵亮</p><p class="t4">5700</p></li>
	    		<li class="no3" ><p class="t1"><span>3</span>&nbsp;</p><p class="t2">王宇航</p><p class="t4">${(scoreList.userScore!'0')+300}</p></li>
	    		<#else>
	    		</#if>
	    	</#list>-->
			<#list scoreList as scoreList>
				<#if scoreList_index <3>
			    	<li class="no${scoreList_index+1}" ><p class="t1"><span>${scoreList_index + 1}</span>&nbsp;</p><p class="t2">${scoreList.userName!}</p><p class="t4">${scoreList.userScore!'0'}</p></li>
				<#else>
					<li><p class="t1"><span>${scoreList_index+1}</span>&nbsp;</p><p class="t2">${scoreList.userName!}</p><p class="t4">${scoreList.userScore!'0'}</p></li>
				</#if>
			</#list>
		</#if>
    </ul>

    <div class="sc_ranking_txt">最终排行榜以活动结束后2015年7月15日公布的有效排行榜为准。活动期间内，同一推荐人累计推荐数字营销平台的产品保费≥50万元，按保费顺次排名，前十名中奖。保费相同者按时间顺序排名，时间较早者获奖。犹豫期退保保费不计入最终保费排名。 </div>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/> 	
</body>
</html>
