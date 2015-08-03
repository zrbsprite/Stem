<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>分享给你一个真实免费的赚钱工具，注册可抽奖，100%中奖</title>
<link rel="stylesheet" type="text/css" media="screen" href="${request.getContextPath()}/assets/wap/inviteRegedit/css/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${request.getContextPath()}/assets/wap/inviteRegedit/css/style.css" />
<link href="${request.getContextPath()}/assets/wap/inviteRegedit/css/Bigwheel.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/inviteRegedit/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/inviteRegedit/js/regform.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/inviteRegedit/js/zp.js"></script>
<script src="http://y.abic.cn/2048/WeixinJSBridge.js"></script>
<script>
$(document).ready(function(){
   //打开微信工具栏
   document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
      WeixinJSBridge.call('hideToolbar'); 
      WeixinJSBridge.call('showOptionMenu');
   });
   
   //将表单信息放入后台cookie中
   $("#goAgree").click(function(){
      var productId='${productId!""}';
      var kuser = '${kuser!""}';
      var sourcesType = '${sourcesType!""}';
      var openid = '${openid!""}';
      var bangbeanNum = $("#bangbeanNum").val();
      var isReg='${isReg!""}';
      var userName = $("#userName").val();
      var password = $("#password").val();
      var mobile = $("#mobile").val();
      var verCode = $("#verCode").val();
      $.post('${request.getContextPath()}/wx/product/registerAgreement.htm',{'productId':productId,'kuser':kuser,'sourcesType':sourcesType,'userName':userName,'password':password,'mobile':mobile,'verCode':verCode,'openid':openid,'bangbeanNum':bangbeanNum,'isReg':isReg},
             function(data){
              window.location.href='${request.getContextPath()}/wx/inviteRegedit/goBack.htm?productId=${productId!""}&kuser=${kuser!""}&sourcesType=${sourcesType!""}';
      });
   });
   
   
   
   //返回显示注册yemina
   var backStatus = '${backStatus!""}';
   if('0'==backStatus){
     $(".reg_box").show();
     	var h = $(document).height();
		h=h+90;
		$('.reg_lucky_bg').height(h);
     $('.reg_lucky_bg').show()
   }
});
</script>
</head>

<body class="boy">
<div class="reg_lucky_bg"></div>
<div class="reg_box">
    	<div class="regTopa"><h1>恭喜您！</h1></div>
        <div class="regTopb"><span>获得<span class="bdval">${bangbeanNum!""}</span>邦豆，</span><span><img src="${request.getContextPath()}/assets/wap/inviteRegedit/images/reg_bangd.png" /></span></div>
		<div class="regTopc">完成注册即可兑换奖励啦！</div>
        <article class="wrappera">
            <form id="naturalManForm">
                <input type="hidden" name="kuser" value="${kuser!""}">
                <input type="hidden" name="sourcesType" value="${sourcesType!""}">
                <input type="hidden" name="bangbeanNum" id="bangbeanNum" value="${bangbeanNum!""}">
            <div class="rega_bg">
     <dl class="reg_form clearfix">
    	<dt><span>*</span>用户名：</dt>
        <dd><input type="text" value="${userName!""}" class="inpuTxt1" name="userName" id="userName" /><div class="txt">6~20位字符，支持字母数字和下划线</div></dd>
        <div class="reg_smtxt" id="nameMessage"></div>
    </dl>
    <dl class="reg_form clearfix">
        <dt><span>*</span>设置密码：</dt>
        <dd><input type="password" value="${password!""}" class="inpuTxt1" name="password" id="password"/><div class="txt">6~20位字符，支持字母数字和符号</div></dd>
        <div class="reg_smtxt" id="passwordMessage"></div>
    </dl>
    <dl class="reg_form clearfix">
        <dt><span>*</span>手机号：</dt>
        <dd><input type="tel" value="${mobile!""}" class="inpuTxt1" name="mobile" id="mobile"/><div class="txt">请输入您的手机号</div></dd>
        <div class="reg_smtxt" id="mobileMessage"></div>
    </dl>
    <dl class="reg_form clearfix bbn">
        <dt><span>*</span>短信验证码：</dt>
        <dd><input type="text" value="${verCode!""}" name="verCode" id="verCode" class="inpuTxt1 w30 " /><div class="txt w30">短信验证码</div><input type="button" class="fill_code_Btn" id='time_count' value="获取验证码" /></dd>
        <div class="reg_smtxt1" id="verCodeMessage"></div>
    </dl>
                <div class="reg_ydtxt rega"><label><input type="checkbox" name="" id="agreement"/> 我已阅读<a id="goAgree" href="#">《安邦数字营销用户注册协议》</a></label></div>
                <div class="reg_stxt txtc"></div>
                <input type="button" class="btna redBtn" value="立即注册" id="goToReg" />
            </div>
            </form>
        </article>
    </div>
<div class="reg_luck">
    <img src="${request.getContextPath()}/assets/wap/inviteRegedit/images/register/1.jpg" />
    <img src="${request.getContextPath()}/assets/wap/inviteRegedit/images/register/2.jpg" />
    <img src="${request.getContextPath()}/assets/wap/inviteRegedit/images/register/3.jpg" />
    <div id="body">
    
        <div class="main">
            <div class="pointer"></div>
            <div class="cj-bg" style="background-image: url(${request.getContextPath()}/assets/wap/inviteRegedit/images/wheel_6.png) ;"></div>
            <div class="start" count="0"></div>
        </div>
    
    </div>
    <img src="${request.getContextPath()}/assets/wap/inviteRegedit/images/register/4.jpg" />
    <a href="${request.getContextPath()}/wx/product/goRegister.htm?productId=${productId!""}&kuser=${kuser!""}&sourcesType=${sourcesType!""}" class="btna redBtn">跳过抽奖直接注册</a>
</div>

<script>
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
<script type="text/javascript">
	<#--统计二级推荐人有效分享流量 -->
	$(function(){
	    var url = "${request.getContextPath()}/wx/TrafficStatistics.htm?productId=${productId!""}&kuser=${kuser!""}&webType=1";
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			success: function(msg){
				
		    }
		});
	   //关闭浮层
	   $("#closePic").click(function(){
	      $("#tsclose").hide();
	      $(this).hide();
	   });
	});
</script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script type="text/javascript">
	var shareTitle = '分享给你一个真实免费的赚钱工具，注册可抽奖，100%中奖';
	var shareTxt = '注册数字营销，赚钱好轻松！';
	var hostname = location.hostname;
	var sharePic ;
	if(hostname != null && ( hostname == 'w.ab95569.com' || hostname == 'www.ab95569.com' ) ){
	 	sharePic = 'http://w.ab95569.com/assets/wap/inviteRegedit/images/register/1.jpg';
	}else{
		sharePic = 'http://36.ab95569.com/assets/wap/inviteRegedit/images/register/1.jpg';
	}
	var shareUrl = 'http://'+hostname+'/wx/product/datil.htm?productId=${productId!""}&kuser=${kuser!""}&sourcesType=${sourcesType!""}';
	/**
	var onBridgeReady = function () {
	    var appId = '';
	    // 发送给好友;
	    WeixinJSBridge.on('menu:share:appmessage', function(argv){
	        var imgUrl = sharePic;
	        var link = shareUrl;
	        var title = shareTitle;
	        var shareDesc = shareTxt;
	        WeixinJSBridge.invoke('sendAppMessage',{
	            'img_url' : imgUrl,
	            'img_width' : '200',
	            'img_height' : '200',
	            'link' : link,
	            'desc' : shareDesc,
	            'title' : title
	            }, function(res) {
	
	        }); 
	    });
	    // 分享到朋友圈;
	    WeixinJSBridge.on('menu:share:timeline', function(argv){
	        var imgUrl = sharePic;
	        var link = shareUrl;
	        var title = shareTitle;
	        var shareDesc = shareTxt;
	        WeixinJSBridge.invoke('shareTimeline',{
	        'img_url' : imgUrl,
	        'img_width' : '200',
	        'img_height' : '200',
	        'link' : link,
	        'desc' : shareDesc,
	        'title' : shareDesc
	        }, function(res) {
	        });   
	    });
	};
	if(document.addEventListener){
	    document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
	} else if(document.attachEvent){
	    document.attachEvent('WeixinJSBridgeReady' , onBridgeReady);
	    document.attachEvent('onWeixinJSBridgeReady' , onBridgeReady);
	}**/
	var appId="${appId!""}";
	var timestamp="${timestamp!""}";
	var randomStr="${randomStr!""}";
	var signature="${signature!""}";
	
	wx.config({
	debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    appId: appId, // 必填，公众号的唯一标识
	timestamp: timestamp, // 必填，生成签名的时间戳
	nonceStr: randomStr, // 必填，生成签名的随机串
	signature: signature,// 必填，签名，见附录1
	jsApiList: ['showOptionMenu','onMenuShareTimeline','onMenuShareAppMessage','onMenuShareQQ','onMenuShareWeibo'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2	
	});
	wx.ready(function(){
		wx.showOptionMenu();
		//发送朋友圈
		wx.onMenuShareTimeline({
		    title : shareTitle, // 分享标题
		    link : shareUrl, // 分享链接
		    imgUrl: sharePic, // 分享图标
		    success: function () { 
		        // 用户确认分享后执行的回调函数
		    },
		    cancel: function () { 
		        // 用户取消分享后执行的回调函数
		    }
		});
		//发送给朋友
		wx.onMenuShareAppMessage({
		    title: shareTitle, // 分享标题
		    desc: shareTxt, // 分享描述
		    link: shareUrl, // 分享链接
		    imgUrl: sharePic, // 分享图标
		    type: 'link', // 分享类型,music、video或link，不填默认为link
		    dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
		    success: function () { 
		        // 用户确认分享后执行的回调函数
		    },
		    cancel: function () { 
		        // 用户取消分享后执行的回调函数
		    }
			});
		//分享到QQ
		wx.onMenuShareQQ({
			title: shareTitle, // 分享标题
			desc: shareTxt, // 分享描述
			link: shareUrl, // 分享链接
			imgUrl: sharePic, // 分享图标
			success: function () { 
			// 用户确认分享后执行的回调函数
			},
			cancel: function () { 
			// 用户取消分享后执行的回调函数
			}
		});
		//分享到腾讯微博
		wx.onMenuShareWeibo({
			title: shareTitle, // 分享标题
			desc: shareTxt, // 分享描述
		    link: shareUrl, // 分享链接
		    imgUrl: sharePic, // 分享图标
		    success: function () { 
		       // 用户确认分享后执行的回调函数
		    },
		    cancel: function () { 
		        // 用户取消分享后执行的回调函数
		    }
		});
    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
	});	
	$(function(){
		$('#shareBtn').click(function(){
			var vheight = $(document.body).height();
			$(document).scrollTop(0);
			$('#maskbg').show();
			$('#maskbg').css("height",vheight);
			$('#wxtips').show();
		});
		$('.maskclose').click(function(){
			$('#maskbg').hide();
			$('#wxtips').hide();
		});	
 });
</script>
<!--弹出内容框-->
<#if isReg == 'Y'>
<div class="OpenTsBg tsclose" id="tsclose" style="display:block;"></div>
<div class="openTs " id="closePic" style="display:block;">
   <img src="${request.getContextPath()}/assets/wap/inviteRegedit/images/login_tit.png" />
</div>
</#if>
</body>
</html>
