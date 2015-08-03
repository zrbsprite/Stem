<!DOCTYPE html>
<html>
<head>
	<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="initial-scale=1, width=device-width,user-scalable=no">
	<script src="http://y.abic.cn/2048/WeixinJSBridge.js"></script>
	<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
	<link rel="stylesheet" media="screen" href="${cssUrl}/style_re1.css" />
	<link rel="stylesheet" type="text/css" href="${cssUrl}/font-family.css">
	<title>成都农商行理财产品</title>
	<script type="text/javascript">
		$(document).ready(function(){
			//打开微信工具栏
			document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
			      WeixinJSBridge.call('showOptionMenu');
		 	});
		 });
	</script>
</head>

<body class="purplBg">
<!-- banner -->
<div class="proBanner pr">
	<img src="/assets/wxdgid/images/re1/list_banner.gif" alt="" />
</div>
<article class="proListBox">
	<ul class="proList">
    	<li>
        	<h2><a href="#">蓉e一号银行理财（投资期限35天）</a></h2>
            <div class="proInfos clearfix mar_t1">
            	<img src="/assets/wxdgid/images/re1/pro_img.jpg" alt="蓉e一号产品图" />
                <p class="proTxt">
                	风险评级：PR2 <br />
                    预期年收益率：<span class="yellow">12%</span> <br />
                    产品类型：非保本浮动收益
                </p>
            </div>
            <div class="proTxt2">
            	募集期：<span class="yellow">2014年09月17日至2014年09月23日</span> <br />
                成立日期：2014年09月24日 <br />
                到期日期：2014年10月29日
            </div>
            <div class="mar_t1"><a href="${ctx}/wx/product/datil.htm?productId=7&re1QRflag=1&kuser=${kuser!""}"><img src="/assets/wxdgid/images/re1/buy_btn.png" alt="购买按钮"></a></div>
        </li>
    </ul>
</article>

<article class="proListBox">
	<ul class="proList">
    	<li>
        	<h2><a href="#">蓉e二号银行理财（投资期限90天）</a></h2>
            <div class="proInfos clearfix mar_t1">
            	<img src="/assets/wxdgid/products/xjal/pic_x.jpg" alt="蓉e一号产品图" />
                <p class="proTxt">
                	风险评级：PR2 <br />
                    预期年收益率：<span class="yellow">12%</span> <br />
                    产品类型：非保本浮动收益
                </p>
            </div>
            <div class="proTxt2">
            	募集期：<span class="yellow">2014年09月17日至2014年09月23日</span> <br />
                成立日期：2014年09月24日 <br />
                到期日期：2014年10月29日
            </div>
            <div class="mar_t1"><a href="${ctx}/wx/product/datil.htm?productId=19&re1QRflag=1&kuser=${kuser!""}"><img src="/assets/wxdgid/images/re1/buy_btn.png" alt="购买按钮"></a></div>
        </li>
    </ul>
</article>
<script type="text/javascript">
	var hostname=location.hostname;
	var shareTitle = '成都农商行理财产品';
	var shareTxt = '成都农商行理财产品,蓉E理财,理财容易!最安全,风险低,收益高！';
	var sharePic = 'http://'+hostname+'/assets/wxdgid/images/re1/list_banner.gif';
</script>
<script type="text/javascript">
	var hostname=location.hostname;
	var shareUrl = 'http://'+hostname+'/wx/product/re1QRCode.htm?&kuser=${kuser!""}';
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
 jQuery.fn.center = function(loaded) {
			var obj = this;
			body_width = parseInt($(window).width());
			body_height = parseInt($(window).height());
			block_width = parseInt(obj.width());
			block_height = parseInt(obj.height());
			
			left_position = parseInt((body_width/2) - (block_width/2)  + $(window).scrollLeft());
			if (body_width<block_width) { left_position = 0 + $(window).scrollLeft(); };
			
			top_position = parseInt((body_height/2) - (block_height/2) + $(window).scrollTop());
			if (body_height<block_height) { top_position = 0 + $(window).scrollTop(); };
			
			if(!loaded) {
				
				obj.css({'position': 'absolute'});
				obj.css({ 'top': top_position, 'left': left_position });
				$(window).bind('resize', function() { 
					obj.center(!loaded);
				});
				$(window).bind('scroll', function() { 
					obj.center(!loaded);
				});
				
			} else {
				obj.stop();
				obj.css({'position': 'absolute'});
				obj.animate({ 'top': top_position }, 200, 'linear');
			}
		}
</script>
<script type="text/javascript">
	<#--统计流量 -->
	$(function(){
		var url = "${ctx}/wx/TrafficStatistics.htm?productId=19&kuser=${kuser!""}&webType=3";
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			success: function(msg){
				
		    }
		});
	});
</script>
<script language="JavaScript" src="${ctx}/assets/wxdgid/js/m_code_weixin.js"></script>
<script type="text/javascript" src="${ctx}/assets/js/99click/m_code_weixin.js"></script>
</body>
</html>
