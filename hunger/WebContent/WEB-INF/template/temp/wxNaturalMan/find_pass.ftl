<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>微信自然人找回密码</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManPage.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManStyle.css"/>

<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/web3/js/auto_channel/js.js"></script>
<script type="text/javascript" src="${jsUrl}/regform.js"></script>
</head>

<body class="greyBg">
<article class="wrapper mar_b1">
    <form id="naturalManForm">
    <div class="reg_bg mar_b1">
    <dl class="reg_form clearfix">
    	<dt>用户名：</dt>
        <dd><input type="text" id="userName" name="userName" value=""  maxlength="20" class="inpuTxt1" /><div class="txt" >请输入您的用户名</div></dd>
        <div class="reg_smtxt" id="nameMessage"></div>
    </dl>
    <dl class="reg_form clearfix">
        <dt>手机号：</dt>
        <dd><input type="tel" id="mobile" name="mobile" maxlength="11"  value="" class="inpuTxt1" /><div class="txt" >请输入您注册时使用的手机号</div></dd>
        <div class="reg_smtxt" id="mobileMessage"></div>
    </dl>
    <dl class="reg_form clearfix bbn">
        <dt>短信验证码：</dt>
        <dd><input type="text" id="verCode" name="verCode" maxlength="6" value="" class="inpuTxt1 w30" /><div class="txt w30" >短信验证码</div><input type="button" class="fill_code_Btn" id="time_count"  value="获取验证码" /></dd>
        <div class="reg_smtxt1" id="verCodeMessage"></div>
    </dl>
    </div>
    <div id="error"  class="reg_stxt txtc"></div>
    <input type="button" class="btn blueBtn2" value="下一步" id="goFindPass" />
    <div class="regTxt_s"><span style="word-break:break-all;">tips：安邦员工请发邮件到quanmin@ab-insurance.com重置密码</span></div>
    </form>
</article>
<script type="text/javascript">
var ctx = "${ctx}";
// 姓名
	function checkName() {
		var chname = /^[a-zA-Z0-9_]\w{5,19}$/;
		if(''==$("#userName").val()){
			$("#nameMessage").html("请输入用户名");
			return false;
		}
		if (chname.test($("#userName").val())) {
			if("ab"==$("#userName").val().substr(0, 2) || "AB"==$("#userName").val().substr(0, 2)
			|| "Ab"==$("#userName").val().substr(0, 2) || "aB"==$("#userName").val().substr(0, 2)
			) {
				$("#nameMessage").html("用户名不能使用ab开头，请重新输入");
				return false;
			}
			$("#nameMessage").html("");
			return true;
		} else {
			$("#nameMessage").html("用户名6~20位字符，支持字母数字和下划线");
			return false;
		}
	}
// 手机号
function checkMobile() {
	var mobile = $("#mobile").val();
	var chmobile = /^(13|15|18)[0-9]{9}$/;
	if(''==mobile){
		$("#mobileMessage").html("请输入手机号");
		return false;
	}
	if (chmobile.test(mobile)) {
		$("#mobileMessage").html("");
		return true;
	} else {
		$("#mobileMessage").html("手机号不正确，请重新输入");
		return false;
	}
}

// 下一步
function goFindPass() {
		$("#verCodeMessage").html("");
		$("#nameMessage").html("");
		$("#mobileMessage").html("");
	$.ajax({
		url : ctx + "/wx/naturalman/goFindPass.htm",
		type : 'post',
		data : $("#naturalManForm").serialize(),
		dataType : 'json',
		success : function(data) {
			if (data != '') {
				if (data.status == 'SUCCESS') {
					window.location.href = ctx+ "/wx/naturalman/findPassNest.htm?userName="+data.message;
				} else if (data.status == 'MOBILE') {
					$("#mobileMessage").html(data.message);
				}else if (data.status == 'ERRORCODE') {
					$("#verCodeMessage").html(data.message);
				} else if (data.status == 'NAME') {
					$("#nameMessage").html(data.message);
				}else {
					$("#error").html(data.message);
				}
			}
		},
		error : function() {
			$("#error").html('系统异常，稍后再试');
		}
	});
}
var time = 59;//默认60秒

function timeOut() {
	if (time != 0) {
		$('#time_count').val('重新发送(' + time + ')');
		time--;
	} else {
		clearInterval(intervalID);
		time = 59;
		$('#time_count').val('获取验证码');
		$('#time_count').attr('disabled', false);
		//$("#mobile").attr("disabled", false);
	}
}
function findPassCode(){
		$("#verCodeMessage").html("");
		$("#nameMessage").html("");
		$("#mobileMessage").html("");
		$.ajax({
		url : ctx + "/wx/naturalman/findPassCode.htm",
		type : 'post',
		data : $("#naturalManForm").serialize(),
		dataType : 'json',
		success : function(data) {
			if (data != '') {
				if (data.status == 'SUCCESS') {
					$("#mobileMessage").html("");
					$("#verCodeMessage").html("");
					$("#error").html("");
					//$("#mobile").attr("disabled", true);
					intervalID = setInterval("timeOut()", 1000);
					$("#time_count").attr("disabled",true);
				} else if (data.status == 'MOBILE') {
					$("#mobileMessage").html(data.message);
				}else if (data.status == 'ERRORCODE') {
					$("#verCodeMessage").html(data.message);
				} else if (data.status == 'NAME') {
					$("#nameMessage").html(data.message);
				}else {
					$("#error").html(data.message);
				}
			}
		},
		error : function() {
			$("#error").html('系统异常，稍后再试');
		}
	});
	}
<#--页面进来加载-->
$(document).ready(function() {
		$('#time_count').val('获取验证码');
		$('#time_count').attr('disabled', false);
		$("#mobile").attr("disabled", false);
		
		$("#goFindPass").click(function() {
			if (!checkName()) {
				return;
			}
			if (!checkMobile()) {
				return;
			}
			<#--验证码-->
			goFindPass();
		});	
		
		$("#time_count").click(function() {
			if (!checkName()) {
			return;
		}
		if (!checkMobile()) {
			return;
		}
		 findPassCode();
	});						
});					
</script>
</body>
</html>
