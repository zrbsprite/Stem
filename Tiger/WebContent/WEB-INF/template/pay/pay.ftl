<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
    <title>微信支付</title>
</head>  
<body>

</body>
<script type="text/javascript">
	//当微信内置浏览器完成内部初始化后会触发WeixinJSBridgeReady事件。
	document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
		//公众号支付
		$('#getBrandWCPayRequest').click(function(e){
			WeixinJSBridge.invoke('getBrandWCPayRequest',{
				"appId" : "${appid}", //公众号名称，由商户传入
				"timeStamp" : "${timeStamp}", //时间戳
				"nonceStr" : "${nonceStr}", //随机串
				"package" : "${package}", ////扩展包
				"signType" : "sha1", //微信签名方式:1.sha1
				"paySign" : "${paySign}" ////微信签名
			},function(res){
				// 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回ok，但并不保证它绝对可靠。
				//因此微信团队建议，当收到ok返回时，向商户后台询问是否收到交易成功的通知，若收到通知，前端展示交易成功的界面；若此时未收到通知，商户后台主动调用查询订单接口，查询订单的当前状态，并反馈给前	展示相应的界面。
			});
		});
	}, false);
</script>
</html>  