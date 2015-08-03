<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport">
<meta content="yes" name="apple-mobile-web-app-capable">
<meta content="black" name="apple-mobile-web-app-status-bar-style">
<meta content="telephone=no" name="format-detection">
<meta content="email=no" name="format-detection">
<link rel="stylesheet" type="text/css" href="${cssUrl}/wxNaturalManStyle_new.css"/>
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script type="text/javascript">
  $(document).ready(function(){
   
   $("#goAgree").click(function(){
      $.post('${request.getContextPath()}/wx/inviteRegedit/goLogin.htm',{},
             function(data){
              window.location.href='${request.getContextPath()}/wx/product.htm';
      });
   });
});
</script>
<title>自然人注册成功</title>
<script>
function banClose(){
	document.getElementById("banShow").style.display = "none";
}


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
	});
</script>
</head>

<body>
	<div id="wrapper">
  	<div class="conTxt"><span><img src="/assets/wxdgid/images/natureMan/ico_ok.png"></span>恭喜！注册成功！ </div>
    <div class="butLogin"><a href="#" id="goAgree"><img src="/assets/wxdgid/images/natureMan/but_login.png"></a></div>
    </div>
<div class="banBot" id="banShow">
    <div class="banCa">
      <div class="banLogo"><img src="/assets/wxdgid/images/natureMan/img_logo.png" /></div>
      <div class="banBtn"><a href="http://bby.ab95569.com/assets/bangbangying/download.html">立即下载</a></div>
    </div>
    <div class="banClose" onClick="banClose()"><img src="/assets/wxdgid/images/natureMan/banClose.png" /></div>
</div>
</body>
</html>
