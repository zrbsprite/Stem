<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>注册－数字id</title>
<link rel="stylesheet" type="text/css" media="screen" href="${request.getContextPath()}/assets/wap/inviteRegedit/css/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${request.getContextPath()}/assets/wap/inviteRegedit/css/page.css" />
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/inviteRegedit/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/inviteRegedit/js/regform.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
</head>

<body class="greyBg">
<article class="wrapper mar_b1">
    <form id="naturalManForm">
    <input type="hidden" name="kuser" value="${kuser!""}">
     <input type="hidden" name="sourcesType" value="${sourcesType!""}">
     <input type="hidden" name="isReg" value="goToReg">
    <div class="reg_bg">
    <dl class="reg_form clearfix">
    	<dt><span>*</span>用户名：</dt>
        <dd><input type="text" value="" class="inpuTxt1" name="userName" id="userName" /><div class="txt">6~20位字符，支持字母数字和下划线</div></dd>
        <div class="reg_smtxt" id="nameMessage"></div>
    </dl>
    <dl class="reg_form clearfix">
        <dt><span>*</span>设置密码：</dt>
        <dd><input type="password" value="" class="inpuTxt1" name="password" id="password"/><div class="txt">6~20位字符，支持字母数字和符号</div></dd>
        <div class="reg_smtxt" id="passwordMessage"></div>
    </dl>
    <dl class="reg_form clearfix">
        <dt><span>*</span>手机号：</dt>
        <dd><input type="tel" value="" class="inpuTxt1" name="mobile" id="mobile"/><div class="txt">请输入您的手机号</div></dd>
        <div class="reg_smtxt" id="mobileMessage"></div>
    </dl>
    <dl class="reg_form clearfix bbn">
        <dt><span>*</span>短信验证码：</dt>
        <dd><input type="text" value="" name="verCode" id="verCode" class="inpuTxt1 w30 " /><div class="txt w30">短信验证码</div><input type="button" class="fill_code_Btn" id='time_count' value="获取验证码" /></dd>
        <div class="reg_smtxt1" id="verCodeMessage"></div>
    </dl>
    </div>

        <div class="reg_ydtxt"><label><input type="checkbox" name="" id="agreement"/> 我已阅读<a href="${request.getContextPath()}/wx/product/registerAgreementTwo.htm
">《安邦数字营销用户注册协议》</a></label></div>
        <div class="reg_stxt txtc"></div>
    
    <input type="button" class="btn blueBtn2" value="立即注册" id="goToReg"/>
    <div class="regTxt_s"><span>tips：安邦员工已默认开通，请使用员工号和初始密码登录，登录后请及时更改密码，忘记密码请发邮件到quanmin@ab-insurance.com</span></div>
    </form>
</article>
<script type="text/javascript">
<#--倒计时-->
var interval = null;
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
	}
}		
<#--页面进来加载-->
$(document).ready(function() {
		$('#time_count').val('获取验证码');
		$('#time_count').attr('disabled', false);
		
	$("#goToReg").click(function() {
		if (!checkName()) {
			return;
		}
		if (!checkPassword()) {
			return;
		}
		if (!checkMobile()) {
			return;
		}
		if ($("#verCode").val()=="") {
			$("#verCodeMessage").html("请输入短信验证码");
			return;
		}else{
			$("#verCodeMessage").html("");
		}
		if(!document.getElementById("agreement").checked){
   			 alert("请阅读《安邦数字营销用户注册协议》");
   			 return ;
		}
		goToReg();
	});		
	
	$("#time_count").click(function() {
	    if (!checkName()) {
			return;
		}
		if (!checkPassword()) {
			return;
		}
		if (!checkMobile()) {
			return;
		}
		 checkCode();
	});
});		
 var ctx = '${request.getContextPath()}';
   <#--验证码-->
	function checkCode(){
		$("#verCodeMessage").html("");
		$("#nameMessage").html("");
		$("#mobileMessage").html("");
		$("#passwordMessage").html("");
		$.ajax({
		url : ctx + "/wx/inviteRegedit/getMobileCode.htm",
		type : 'post',
		data : $("#naturalManForm").serialize(),
		dataType : 'json',
		success : function(data) {
			if (data != '') {
				if (data.status == 'SUCCESS') {
					$("#mobileMessage").html("");
					$("#verCodeMessage").html("");
					$("#error").html("");					
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
	<#--姓名-->
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
			$("#nameMessage").html("6~20位字符，只支持字母数字和下划线");
			return false;
		}
	}

	<#--密码-->
	function checkPassword() {
		var p = $("#password").val();
		if (''==p) {
			$("#passwordMessage").html("请输入密码");
			return false;
		}
		if (p.length < 6 || p.length > 20) {
			$("#passwordMessage").html('6~20位字符，支持字母数字和符号组合');
			return false;
		}
		$("#passwordMessage").html("");
		return true;
	}

	<#--手机号-->
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


	<#-- 注册-->
	function goToReg() {
		$("#verCodeMessage").html("");
		$("#nameMessage").html("");
		$("#mobileMessage").html("");
		$("#passwordMessage").html("");
		$("#emailMessage").html("");
			$.ajax({
					url : ctx + "/wx/inviteRegedit/doRegisterInfo.htm",
					type : 'post',
					data : $("#naturalManForm").serialize(),
					dataType : 'json',
					success : function(data) {
						if (data != '') {
							if (data.status == 'SUCCESS') {
							
								window.location.href = ctx
										+ "/wx/inviteRegedit/registerSuccess.htm";
							} else if (data.status == 'NAME') {
								$("#nameMessage").html(
										data.message);
							} else if (data.status == 'MOBILE') {
								$("#mobileMessage").html(
										data.message);
							} else if (data.status == 'ERRORCODE') {
								$("#verCodeMessage").html(
										data.message);
							} else {
								$("#error").html(data.message);
							}
						}
					},
					error : function() {
						$("#error").html('注册失败，请重新修改');
					}
				});
	}
</script>
</body>
</html>
