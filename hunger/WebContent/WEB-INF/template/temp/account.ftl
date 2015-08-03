<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
    <title>个人中心</title>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css"/>
</head>
<body>
<article class="wrapper">
    <h2 class="titleUnline">推荐人ID <span class="righTxt" id="spanUserName">${kuser}</span></h2>
    <section class="verticalCon">
        <div class="td">
            <form>
                <a href="${ctx}/wx/account/password.htm" class="btn greenBtn">修改推荐人登录密码</a>
                <a href="${ctx}/wx/logOut.htm"><input type="button" class="btn redBtn mar_t1" id="logOut" value="退出账号登录"/></a>
            </form>
        </div>
    </section>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
