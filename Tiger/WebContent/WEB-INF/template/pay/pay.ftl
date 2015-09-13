<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
    <title>微信支付</title>
</head>  
<body>
<#-- 支付信息 -->
<input type="button" value="发起支付" id="getBrandWCPayRequest"/>
</body>
<script type="text/javascript">
function onBridgeReady(){
	$('#getBrandWCPayRequest').click(function(e){
	   WeixinJSBridge.invoke('getBrandWCPayRequest', {
	           "appId" ： "${appid}",     
	           "timeStamp"：" ${timeStamp}",      
	           "nonceStr" ： "${nonceStr}",
	           "package" ： "${package}", 
	           "signType" ： "MD5",
	           "paySign" ： "${paySign}"
	       },
	       function(res){     
	           if(res.err_msg == "get_brand_wcpay_request：ok" ) {
	           		
	           }else{
	           }
	       }
	   );
   });
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