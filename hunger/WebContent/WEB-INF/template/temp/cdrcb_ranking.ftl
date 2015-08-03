<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<meta name="format-detection" content="telephone=no" >
<title>排行榜</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/insur_cdrcb.css"/>
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
</head>

<body>
<article><img src="${imageUrl}/cdrcb/img_01.jpg" /></article>
<article class="procedureBox">
<table class="tal2 clearfix">
<tbody>
<tr>
<th>名次</th>
<th>员工编号</th>
<th>姓名</th>
<th>累计销售额</th>
</tr>
<#if scoreList??>
<#list scoreList as scoreList>
<#if scoreList_index <4>
<tr>
<td class="txtAlignL"><b>${scoreList_index + 1}</b><i></i></td>
<td>${scoreList.code!}</td>
<td>${scoreList.userName!}</td>
<td>${scoreList.userScore!'0'}</td>
</tr>
<#else>
<tr>
<td class="txtAlignL">${scoreList_index + 1}</td>
<td>${scoreList.code!}</td>
<td>${scoreList.userName!}</td>
<td>${scoreList.userScore!'0'}</td>
</tr>
</#if>
</#list>
</#if>
</tbody>
</table>
</article>
<article><img src="${imageUrl}/cdrcb/img_02.jpg" /></article>
<article><img src="${imageUrl}/cdrcb/img_03.jpg" /></article>
<article><img src="${imageUrl}/cdrcb/img_04.jpg" /></article>
<script type="text/javascript">


</script>
</body>
</html>
