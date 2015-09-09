<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no" />
<meta name="viewport" content="initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,width=device-width" />
	<title>大虎交易</title>
	<link rel="stylesheet" href="${basepath}/css/success.css"/>
</head>
<body>
	<div class="topnav">
        <div class="title">操作信息</div>
    </div>
    
	<div class='content findPass'>
		<div class="b_img"><img src="${basepath}/images/dui.jpg" /></div>
		<div class="title">${msg?default('绑定成功！')}</div>
		<div class="button"><a href="javascript:void(0);" target="_self" id="closeWindow">关闭</a></div>
	</div>
</body>

<script type="text/javascript">
function onBridgeReady(){
  WeixinJSBridge.call('hideOptionMenu');
  document.getElementById("closeWindow").addEventListener("click",function(){
    WeixinJSBridge.invoke("closeWindow",{},function(e){})
  },!1);
}
if (typeof WeixinJSBridge == "undefined"){
    if( document.addEventListener ){
        document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
    }else if (document.attachEvent){
        document.attachEvent('WeixinJSBridgeReady', onBridgeReady); 
        document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
    }
}else{
    onBridgeReady();
}
</script>
</html>