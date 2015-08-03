<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>微信自然人找回密码</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManPage.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManStyle.css"/>
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/regform.js"></script>
</head>

<body class="greyBg">
<article class="wrapper mar_b1">
	
    <form id="naturalManForm">
    <div class="reg_bg mar_b1">
    <dl class="reg_form clearfix">
    	<dt>用户名：</dt>
        <dd class="txt">${userName}</dd>
        <input type="hidden" value = '${userName}' id= "userName" name="userName" />
    </dl>
    <dl class="reg_form clearfix">
        <dt>设置密码：</dt>
        <dd><input type="password"  maxlength="20" id="password" name="password" value="" class="inpuTxt1" /><div class="txt" >6~20位字符，支持字母数字和符号组合</div></dd>
        <div class="reg_smtxt" id="passwordMessage"></div>
        <div id="error1"  class="reg_smtxt"></div>
    </dl>
    <dl class="reg_form clearfix bbn">
        <dt>确认密码：</dt>
        <dd><input type="password" maxlength="20"  id="newPassword" value="" class="inpuTxt1" /><div class="txt" >请再次输入上面的密码</div></dd>
        <div class="reg_smtxt" id="newPassMessage" ></div>
        <div id="error2"  class="reg_smtxt"></div>
    </dl>
    </div >
    <div id="error"  class="reg_stxt txtc"></div>
    <input type="button" class="btn blueBtn2" value="确定" id="btn" />
     
    </form>
</article>
<script type="text/javascript">
  $(document).ready(function () {
	  var ctx = "${ctx}";
            $("#btn").click(function () {
                var p = $("#password").val();
                var np = $("#newPassword").val();
                if (p == '') {
                 	$("#error").html("");
               		$("#error1").html("");
                	$("#error2").html("");
                	return $("#error1").html("请设置新密码");
                }      
                if (p.length < 6 || p.length>20) {
                	 $("#error").html("");
               		 $("#error1").html("");
               		 $("#error2").html("");
                	return $("#error1").html("6~20位字符，支持字母数字和符号组合");
                }        
                if (np == '') {
                	$("#error").html("");
              		$("#error1").html("");
              		$("#error2").html("");
                	return $("#error2").html("与设置密码不一致");
                }
                if (p != np) {
                 	$("#error").html("");
               		$("#error1").html("");
                	$("#error2").html("");
                	return $("#error2").html("与设置密码不一致");
                }
                $("#error").html("");
                $("#error1").html("");
                $("#error2").html("");
                findPassLast();
            });

     function findPassLast() {
			$.ajax({
			url : ctx + "/wx/naturalman/findPassLast.htm",
			type : 'post',
			data : $("#naturalManForm").serialize(),
			dataType : 'json',
			success : function(data) {
				if (data != '') {
					if (data.status == 'SUCCESS') {
						window.location.href = ctx+ "/wx/naturalman/findPssSuccess.htm";
					} else {
						$("#error").html(data.message);
					}
				}
			},
			error : function() {
				$("#error").html('找回密码失败，请重新修改');
			}
		 });
	}    
});        

</script>
</body>
</html>
