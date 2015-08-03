<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>验证身份</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManPage.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManStyle.css"/>
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/regform.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
</head>
<body class="greyBg">
<article class="wrapper mar_b1">
	<input type="hidden" id='currentDate' name="currentDate" value="${(currentDate!'')?trim}" />
    <div class="regTxt">感谢您的注册，为了保证能顺利推广和结算，请如实提交以下个人资料。</div>
    <div class="regTxt_s">（系统目前试运营，提交后会进行人工审核验证，请耐心等待）。</div>
    <form id="naturalManForm">
    <div class="reg_bg">
    <dl class="reg_form clearfix">
    	<dt>姓名：</dt>
        <dd><input type="text" value="" id="userName" name="userName" maxlength="20"  class="inpuTxt1" /><div class="txt" >请输入真实姓名</div></dd>
        <div class="reg_smtxt" id="nameMessage"> </div>
    </dl>
    <dl class="reg_form clearfix bbn">
        <dt>身份证号：</dt>
        <dd><input type="tel" value="" class="inpuTxt1" id="idCard" name="idCard" maxlength="18"  /><div class="txt" >请输入18位身份证号码</div></dd>
        <div class="reg_smtxt"  id="idCardMessage"></div>
    </dl>
    </div>
    <div class="reg_btn mar_t1">
        <input type="button" class="btn blueBtn3 w45 fl" id="goBack" value="以后再说" ;" />
        <input type="button" class="btn blueBtn2 ShowPrompt w45 fr" value="提交验证" id="btn" />
    </div>
    </form>
</article>

<!--弹出内容框-->
<div class="OpenBoxBg" id="success"></div>
<div class="OpenBox">
    
    <div class="context">资料提交成功，我们会尽快审核，感谢您的支持！</div>
    <div class="bottomBar2"><a href="javascript:goHome()" class="ClosePrompt">确定</a></div>

</div>
<script type="text/javascript">
var ctx = "${ctx}";
 function goHome(){
 window.location.href = ctx +"/wx/account.htm";
 }
<#-- 姓名-->
// 姓名
function checkName() {
	var chname = /^([A-Za-z]|[\u4E00-\u9FA5])+$/;
	if(''==$("#userName").val()){
		$("#nameMessage").html('请输入真实姓名');
		return false;
	}
	if (!chname.test($("#userName").val()) || $("#userName").val().replace(/[^\x00-\xff]/g, 'xx').length < 2 || $("#userName").val().replace(/[^\x00-\xff]/g, 'xx').length > 20) {
		$("#nameMessage").html('姓名需为1-10位中文字符或2-20个英文字符');
		return false;
	}else{
		$("#nameMessage").html("");
		return true;
	}
}
<#--身份证号-->
<#--根据身份证带出出生年月日-->
function getBirday(IDNO) {
var val = IDNO;
var birthdayValue;
if (18 == val.length) {// 18位身份证号码
	birthdayValue = val.charAt(6) + val.charAt(7) + val.charAt(8) + val.charAt(9) + "-" + val.charAt(10) + val.charAt(11) + "-" + val.charAt(12) + val.charAt(13);
}
return birthdayValue;
}

function getAge(birth){
	var returnAge = "";
	var aDate = $("#currentDate").val();
	var nowYear = aDate.split("-")[0];
	var nowMonth = aDate.split("-")[1];
	var nowDay = aDate.split("-")[2];
	//时间的校验
		function add_zero(temp)
		{
		 if(temp<10) return "0"+temp;
		 else return temp;
		}	
	var birthYear = birth.split("-")[0];
	var birthMonth = birth.split("-")[1];
	var birthDay = birth.split("-")[2];
	if(nowYear == birthYear)
	    {
	        returnAge = 0;//同年 则为0岁
	    }
	    else
	    {
	        var ageDiff = nowYear - birthYear ; //年之差
	        if(ageDiff > 0)
	        {
	            if(nowMonth == birthMonth)
	            {
	                var dayDiff = nowDay - birthDay;//日之差
	                if(dayDiff < 0)
	                {
	                    returnAge = ageDiff - 1;
	                }
	                else
	                {
	                    returnAge = ageDiff ;
	                }
	            }
	            else
	            {
	                var monthDiff = nowMonth - birthMonth;//月之差
	                if(monthDiff < 0)
	                {	
	                    returnAge = ageDiff - 1;
	                }
	                else
	                {
	                    returnAge = ageDiff ;
	                }
	            }
	        }
	        else
	        {
	        	$("#idCardMessage").html("请输入正确的身份证号码");
	        	returnAge='999';
	        }
	    }
	return returnAge;
}
function getAgeByIDCard(IDNO) {
	var birth = getBirday(IDNO);
	var age = getAge(birth);
	return age;
}
function checkIdCard() {
	var idCard = $("#idCard").val();
	if(idCard==''){
		$("#idCardMessage").html("请输入身份证号");
		return false;
	}
	var reg = /^[1-9]([0-9]{14}|[0-9]{16}([0-9xX]))$/;
	if (reg.test(idCard)) {
		var age = getAgeByIDCard(idCard);
		if(age > 110 || age < 0){
			$("#idCardMessage").html("请输入正确的身份证号码");
			return false;
		}else{
			if (!idCard.match('^[1-9][0-9]{5}(19[0-9]{2}|20[0-1]{1}[0-9]{1})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$')){
				$("#idCardMessage").html("请输入正确的身份证号码");
				return false;
			}else{
				$("#idCardMessage").html("");
				return true;
			}
		}
	} else {
		$("#idCardMessage").html("请输入正确的身份证号码");
		return false;
	}
}
function goSubmit() {
	$.ajax({
		url : ctx + "/wx/naturalman/goSubmit.htm",
		type : 'post',
		data : $("#naturalManForm").serialize(),
		dataType : 'json',
		success : function(data) {
			if (data != '') {
				if (data.status == 'SUCCESS') {
					$(".OpenBoxBg").show();
					showOpenBox();
					$(".OpenBox").show();
				} else {
					//$("#error").html(data.message);
					alert(data.message);
				}
			}
		},
		error : function() {
			//$("#error").html('注册失败，请重新修改');
			alert(data.message);
		}
	});
}


$(document).ready(function() {
	$("#btn").click(function(){
		if(!checkName()){
			return;
		}
		if(!checkIdCard()){
			return;
		}
		goSubmit();
	});		
		$("#goBack").click(function(){
	 window.location.href = ctx +"/wx/account.htm";
	});	
});

	/*根据当前页面与滚动条位置，设置提示对话框的Top与Left*/
	function showOpenBox() {
		var objWin = $(document); //当前窗口
		var objOpenBox = $(".OpenBox"); //对话框
		var brsW = objWin.width();
		var brsH = objWin.height();
		var sclL = objWin.scrollLeft();
		var sclT = objWin.scrollTop();
		var curW = objOpenBox.width();
		var curH = objOpenBox.height();
		
		//计算对话框居中时的左边距
		var left = sclL + (brsW - curW) / 2;
		//计算对话框居中时的上边距
		var top = sclT + (brsH - curH) / 3;
		//设置对话框在页面中的位置
		objOpenBox.css({ "left": left, "top": top });
	  //$(".OpenBoxBg").height(brsH);//背景框 灰色 高度和窗口一致
	}
	$(window).resize(function() {//页面窗口大小改变事件
		if (!$(".OpenBox").is(":visible")) {
			return;
		}
		showOpenBox(); //设置提示对话框的Top与Left
	});
</script>
</body>
</html>
