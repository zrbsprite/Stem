<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html>
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
	    <title>验证失败</title>
	    <link rel="stylesheet" media="screen" href="${request.getContextPath()}/assets/HuiFinancingInsurance/css/insur_fail.css" />
	</head>
	<body>   
    	<article id="conBox">
			<div class="failIcon"></div>
	    	<p class="failInfo">身份验证失败，请在销售管理中留言，运营人员会与您联系！</p>
	    	<#-- <input type="hidden" value="错误信息：${errorMessage?if_exists}" />-->
		</article>
    </body>
</html>