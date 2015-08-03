<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, user-scalable=no">
<meta name="format-detection" content="telephone=no" >
<link rel="stylesheet" media="screen" href="${request.getContextPath()}/assets/wxdgid/css/secu_style.css" />
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/jquery-1.7.2.min.js"></script>
<script>
  $(document).ready(function(){
     //员工姓名
     checkInfo("userName");
     clearInfo("userName","spanname");
     //员工编号
     checkInfo("userCode");
     clearInfo("userCode","spancode");
     //证件编号
     checkInfo("IDNO");
     clearInfo("IDNO","spanIDNO");
     //证件校验
     checkInfo("IDverification");
      clearInfo("IDverification","spanverification");
     //联系电话
     checkInfo("tel");
     clearInfo("tel","spantel");
     //验证码
     checkInfo("verificationCode");
     clearInfo("verificationCode","spanverificationCode");
        
        
     //************提交表单开始************
     $("#button").click(function(){
         var flag = false;
	     //员工姓名
	     flag = isNullOrEmpty("userName","spanname","员工姓名");
	     if(flag){
	        return false;
	     }
	     //员工编号
	     flag = isNullOrEmpty("userCode","spancode","员工编号");
	     if(flag){
	        return false;
	     }
	     //证件编号
	     flag = isNullOrEmpty("IDNO","spanIDNO","证件编号");
	     if(flag){
	        return false;
	     }
	     //证件校验
	     flag = isNullOrEmpty("IDverification","spanverification","证件校验");
	     if(flag){
	        return false;
	     }
	     //联系电话
	     flag = isNullOrEmpty("tel","spantel","联系电话");
	     if(flag){
	        return false;
	     }
	     //验证码
	     flag = isNullOrEmpty("verificationCode","spanverificationCode","验证码");
	     if(flag){
	        return false;
	     }
	     
	     var IDNO = $("#IDNO").val();
	     var IDverification = $("#IDverification").val();
	     if(IDNO!=IDverification){
	        $("#spanverification").text("与证件编号信息不一致，请重新输入！");
	        return false;
	     }
	     
	    //身份证校验
		var chID = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
		if (chID.test(IDNO)) {
			$("#spanIDNO").text("");
		} else {
			$("#spanIDNO").text("身份证格式不正确，请重新输入");
			return false;
		}
		

	    //电话格式校验 
	    var mobile = $("#tel").val();
		var chmobile = /^(13|15|18)[0-9]{9}$/;
		if (chmobile.test(mobile)) {
			$("#spantel").text("");
		} else {
			$("#spantel").text("手机号格式不正确，请重新输入");
			return false;
		}
		
	     if(confirm("确认填写信息填写正确，并提交数据？")){
	        $("#button").attr("disabled",true);
	        $("#button").css("background-color","#AAAAAA");
	       $.post("/wx/doLginValidate.htm",
	            {"userName":$("#userName").val(),"userCode":$("#userCode").val(),"IDNO":IDNO,
	            "IDverification":IDverification,"tel":$("#tel").val(),"verificationCode":$("#verificationCode").val()},
	          function(data){
	            if("VARCODE"==data.status){
	               $("#spanverificationCode").text(data.message);
	               $("#button").attr("disabled",false);
	               $("#button").css("background-color","#FF0000");
	               return false;
	            }
	            if("IDNUM"==data.status){
	               $("#spanIDNO").text(data.message);
	               $("#button").attr("disabled",false);
	               $("#button").css("background-color","#FF0000");
	               return false;
	            }
	            if("FAIL"==data.status){
	               $("#spanverification").text(data.message);
	               $("#button").attr("disabled",false);
	               $("#button").css("background-color","#FF0000");
	               return false;
	            }
	            if("MOBILE"==data.status){
	               $("#spanverificationCode").text(data.message);
	               $("#button").attr("disabled",false);
	               $("#button").css("background-color","#FF0000");
	               return false;
	            }
	            if("ERRORCODE"==data.status){
	               $("#spanverificationCode").text(data.message);
	               $("#button").attr("disabled",false);
	               $("#button").css("background-color","#FF0000");
	               return false;
	            }
	            if("ALERT"==data.status){
	               alert(data.message);
	               $("#button").attr("disabled",false);
	               $("#button").css("background-color","#FF0000");
	               return false;
	            }
	            if("SUCCESS"==data.status){
	               $("#button").attr("disabled",false);
	               window.location.href="/wx/securitiesLoginSuccess.htm";
	            }
	          },'json');
	     }
     });
 //************提交表单结束************
     //获取验证码
     $("#btn").click(function(){
	   //联系电话
	   var flag = isNullOrEmpty("tel","spantel","联系电话");
	    if(flag){
		   return false;
	    }
	    
	    var mobile = $("#tel").val();
		var chmobile = /^(13|15|18)[0-9]{9}$/;
		if (chmobile.test(mobile)) {
			$("#spantel").text("");
		} else {
			$("#spantel").text("手机号格式不正确，请重新输入");
			return false;
		}
		
	    time(this);//读秒
       $.post("/wx/getValidateCode.htm",{"userCode":$("#userCode").val(),"IDNO":$("#IDNO").val(),"userCode":$("#userCode").val(),"tel":$("#tel").val(),"verificationCode":$("#verificationCode").val()},
	       function(data){
			  if("FAIL"==data.status){
			    $("#spanverificationCode").text(data.message);
			  }
	       },'json');
     });
     
     //判空
     function isNullOrEmpty(str,spanId,info){
        var $str = $("#"+str+"");
        var val = $str.val();
        if(null==val||""==val){
           $("#"+spanId+"").text(""+info+"信息不能为空！");
           return true;
        }else{
           return false;
        }
     }
     //清空placeholder信息
     function checkInfo(str){
        var $str = $("#"+str+"");
        $str.click(function(){
           $str.attr("placeholder","");
        });
     }
     //清空内容
     function clearInfo(str,spanID){
        var $str = $("#"+str+"");
        $str.blur(function(){
          $("#"+spanID+"").text("");
        });
     }
     
  });
</script>
<title>预约开户</title>
</head>
<body>

<article class="secuArt">

    <div class="secuAtit">万三佣金 世纪证券预约开户</div>
	<form id="form1" name="form1" method="post" action="">
    <div class="secuBox">    
        <dl class="secuYa">
        	<dt>员工姓名：</dt>
            <dd><input type="text" placeholder="请输入员工姓名" name="userName"id="userName" class="secuInpa" /></dd><span id="spanname" style='color: red;font-size:15px'></span>
        	<dt>员工编号：</dt>
            <dd><input type="text" placeholder="请输入员工编号" name="userCode"id="userCode" class="secuInpa" /></dd><span id="spancode" style='color: red;font-size:15px'></span>
        	<dt>证件编号：</dt>
            <dd><input type="text" placeholder="请输入证件编号" name="IDNO" id="IDNO" class="secuInpa" /></dd><span id="spanIDNO" style='color: red;font-size:15px'></span>
       	    <dt>证件校验：</dt>
            <dd><input type="text" placeholder="请再次输入证件编号" name="IDverification" id="IDverification" class="secuInpa" /></dd><span id="spanverification" style='color: red;font-size:15px'></span>
       	    <dt>联系电话：</dt>
            <div class="secuYadx">
            	<span><input type="text" placeholder="请输入您的联系电话" name="tel" id="tel" class="secuInpb" size='2'/></span>
                <input type="button" id='btn' class="secu_code_Btn" value="获取验证码" /><div id="spantel" style='color: red;font-size:15px'></div>
            </div>
        </dl>
        <dl class="secuYz">
       	    <dt>验证码：</dt>
            <dd><input type="text" placeholder="" name="verificationCode" id="verificationCode" class="secuInpa" /></dd>
        </dl>
	</div>
        <span id="spanverificationCode" style='color: red;font-size:15px'></span>
    <div class="secuBtn"><input type="button" name="button" id="button" value="提交" class="secuInpc"/></div>
    </form>
</article>

</body>
<script type="text/javascript">
var wait=120;
function time(o) {
        if (wait == 0) {
            o.removeAttribute("disabled");            
            o.value="获取验证码";
            wait = 120;
			o.className='secu_code_Btn';
        } else {
            o.setAttribute("disabled", true);
            o.value="重新发送 " + wait;
			o.className='secu_code_Btn_gray';
            wait--;
            setTimeout(function() {
                time(o)
            },
            1000)
        }
    }

//document.getElementById("btn").onclick=function(){time(this);}
</script>

</html>
