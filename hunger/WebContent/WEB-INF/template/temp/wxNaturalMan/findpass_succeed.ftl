<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>微信自然人找回密码</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManPage.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManStyle.css"/>
<script type="text/javascript" src="${jsUrl}/form.js"></script>
</head>

<body>
<article class="wrapper">
	
    <section class="verticalCon">
        <div class="td txtc">
            <span class="ok_icon"></span>
            <p class="resulTxt1">恭喜！密码已重新设置成功！</p>
        </div>
    </section>
    <a href="javascript:login()" class="btn blueBtn1 mar_t1">点此登录</a>
</article>
<script type="text/javascript">
 var ctx = "${ctx}";
	function login(){
	window.location.href = ctx + "/wx/home.htm";
	}
</script>
</body>
</html>