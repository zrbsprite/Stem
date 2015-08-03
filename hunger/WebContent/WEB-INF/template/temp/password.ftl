<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
    <title>修改密码－数字id</title>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css"/>
    <script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${jsUrl}/form.js"></script>
    <script type="text/javascript">
        document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
            WeixinJSBridge.call('hideOptionMenu');
        });
        var currentUser = "${kuser}";
        var ctx = "${ctx}";
        function show(message) {
            $("#errorMessage").html("<span class='error'></span>" + message).show();
            return false;
        }


        $(document).ready(function () {
            var kuser = "${kuser}"

            $("#newPassword").blur(function () {
                var np = $("#newPassword").val();
                if (/^\d+$/g.test(np) || /^[a-z]+$/g.test(np) || /^[A-Z]+$/g.test(np) || /^[\!\@\#\$\%\&\*\(\)\-\_\+\=\?\.\|\,\`\~\<\>\:\;\"\[\]\{\}\^\'\/\\]+$/g.test(np)) {
                    $("#errorMessage").html("<span class='error'></span>" + "新密码强度：过低").show();
                }else if(np != ''){
                    $("#errorMessage").html("<span class='error'></span>" + "新密码强度：高").show();
                }else{
                    $("#errorMessage").html("<span class='error'></span>" + "新密码不符合要求,请确认").show();
                }
            });


            $("#btn").click(function () {
                $("#errorMessage").hide();
                var p = $("#password").val();
                var np = $("#newPassword").val();
                var op = $("#oldPassword").val();
                if (p == '') {
                    return show("原密码不能为空,请确认");
                }
                if (np == '') {
                    return show("新密码不符合要求,请确认");
                }

                if (op == '') {
                    return show("重复密码不正确,请确认");
                }
                if (np != op) {
                    return show("两次密码输入不一致");
                }
                if (np.length < 6 || np.length>20) {
                    return show('6~20位字符，支持字母数字和符号组合');
                }
                modify();
            });
        });

        function modify() {
            if (null != currentUser) {
                $.ajax({
                    url: ctx + "/wx/account/modifyPassword.htm",
                    type: 'post',
                    data: $("#modifyForm").serialize(),
                    dataType: 'json',
                    success: function (data) {
                        if (data != '') {
                            if (data.status == 'SUCCESS') {
                                window.location.href = ctx + "/wx/account/success.htm"
                            } else {
                                show(data.message);
                            }
                        }
                    },
                    error: function () {
                        show('保存失败，请重新修改');
                    }
                });
            }
        }
    </script>
</head>

<body>
<article class="wrapper">
    <h2 class="titleUnline">修改密码</h2>

    <form id="modifyForm">
        <ul class="formList">
            <li>
                <span class="formTit">原密码：</span>

                <div class="inpuTxtBg">
                    <input type="password" value="" class="inpuTxt" id="password" name="password"/>
                </div>
            </li>
            <li>
                <span class="formTit">新密码：</span>

                <div class="inpuTxtBg">
                    <input type="password" value="" class="inpuTxt" id="newPassword" name="newPassword"/>
                </div>
            </li>
            <li>
                <span class="formTit">再次输入新密码：</span>

                <div class="inpuTxtBg">
                    <input type="password" value="" name="oldPassword" id="oldPassword" class="inpuTxt"/>
                </div>
                <p class="prompt mar_t02" id="errorMessage">

                </p>
            </li>
        </ul>
        <input type="button" class="btn greenBtn " id="btn" value="保存" onclick=""/>
    </form>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
