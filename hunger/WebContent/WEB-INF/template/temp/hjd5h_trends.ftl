<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<#assign productsimageUrl="${request.getContextPath()}/assets/wxdgid/products"/>
<!DOCTYPE html>
<html lang="zh-cn"> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport">
<meta content="yes" name="apple-mobile-web-app-capable">
<meta content="black" name="apple-mobile-web-app-status-bar-style">
<meta content="telephone=no" name="format-detection">
<meta content="email=no" name="format-detection">
<title>丈夫的日记</title> 
<link href="${request.getContextPath()}/assets/wxdgid/css/cards_hjd5.css?v=201407311741" type="text/css" rel="stylesheet" />
<script type="text/javascript">
    //android 2.3 hack
    var browser={
        versions:function(){
            var u = navigator.userAgent, app = navigator.appVersion;
            return {//移动终端浏览器版本信息
                trident: u.indexOf('Trident') > -1, //IE内核
                presto: u.indexOf('Presto') > -1, //opera内核
                webKit: u.indexOf('AppleWebKit') > -1, //苹果、谷歌内核
                gecko: u.indexOf('Gecko') > -1 && u.indexOf('KHTML') == -1, //火狐内核
                mobile: !!u.match(/AppleWebKit.*Mobile.*/)||!!u.match(/AppleWebKit/), //是否为移动终端
                ios: !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), //ios终端
                android: u.indexOf('Android') > -1 || u.indexOf('Linux') > -1, //android终端或者uc浏览器
                iPhone: u.indexOf('iPhone') > -1 || u.indexOf('Mac') > -1, //是否为iPhone或者QQHD浏览器
                iPad: u.indexOf('iPad') > -1, //是否iPad
                webApp: u.indexOf('Safari') == -1, //是否web应该程序，没有头部与底部
                weixin:u.indexOf('MicroMessenger')>-1
            };
         }(),
         language:(navigator.browserLanguage || navigator.language).toLowerCase(),
         versionNum:function(){
            /*版本号,只针对android*/
            var u = navigator.userAgent,matchIndex=u.indexOf('Android');
            if(matchIndex>-1){
                var num=u.substring(matchIndex+7,matchIndex+11).replace(' ','');
                return parseFloat(num);
            }
            return '';
         }(),
         avail:function(){
            return {width:document.documentElement.clientWidth,height:document.documentElement.clientHeight};   
         }()
    };
    if(browser.versions.android&&browser.versionNum<=2.3){
        document.write('<style>.android_2_3_x{opacity:.99;}</style>');
    }
	
</script>
</head>
<body>

<script>
	var ua = navigator.userAgent.toLowerCase();
	if(!(/micromessenger(\/[\d\.]+)*/.test(ua))){
		alert('请在微信里打开此页面~~');
	}
</script>

	<header style=" line-height:0; height:0;">
        <audio autoplay="autoplay" loop id="audiomusic">
          <source src="${request.getContextPath()}/assets/wxdgid/products/hjd5/images/HappySong.mp3" type="audio/mpeg" />
        </audio>
		<a href="javascript:void();" id="u-globalAudio" class="z-play">
			<i class="icon-music"></i>
		</a>
	</header>

	<div class="wrapper" id="wrap" style="display:none">
    	<section class="page">
        	<div class="card">
                <div class="sec1a"></div>
            	<div class="sec1b"></div>
            	<div class="sec1c"></div>
            	<div class="sec1d"></div>
            </div>
            <!--<div class="start"></div>-->
        </section>
        <!--第二页-->
        <section class="page">
        	<div class="card">
            	<div class="ceng"></div>
                <div class="sec4a"></div>
                <div class="sec4b"></div>
                <div class="sec4c"></div>
                <div class="sec4q"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第三页-->
        <section class="page">
        	<div class="card">
                <div class="ceng"><div class="sec5a"></div></div>
            	<div class="sec5ax"></div>
            	<div class="sec5b"></div>
            	<div class="sec5c"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        <!--第四页-->
        <section class="page">
        	<div class="card">
            	<div class="sec6atex"></div>
                <!--<div class="ceng"><div class="sec5a"></div></div>-->
            	<div class="sec6a"></div>
            	<div class="sec6b"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        <!--第五页-->
        <section class="page">
        	<div class="card">
                <div class="sec7a"></div>
            	<div class="ceng"></div>
            	<div class="sec7tex"></div>
            	<div class="sec7b"></div>
            	<div class="sec7c"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第六页-->
        <section class="page">
        	<div class="card">
            	<div class="ceng"><div class="sec3a"></div></div>
            	<div class="sec3b"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第七页-->
        <section class="page">
        	<div class="card">
            	<div class="sec9d"></div>
            	<div class="sec9c"></div>
            	<div class="sec8a"></div>
            	<!--<div class="sec7c"></div>-->
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第八页-->
        <section class="page">
        	<div class="card">
            	<!--<div class="sec9c"></div>-->
                <div class="ceng"><div class="sec9a"></div></div>
            	<div class="sec9b"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第九页-->
        <section class="page">
        	<div class="card">
            	<div class="sec10c"></div>
                <div class="sec10a"></div>
            	<div class="sec10b"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第十页-->
        <section class="page">
        	<div class="card">
                <div class="ceng"><div class="sec11a"></div></div>
            	<div class="sec11b"></div>
            	<div class="sec11c"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第十一页-->
        <section class="page">
        	<div class="card">
                <div class="sec12a"></div>
            	<div class="sec12b"></div>
            </div>
        	<!--<div class="start"></div>-->
        </section>
        
        <!--第十二页-->
        <section class="page">
        	<div class="card">
                <div class="sec13a"></div>
                <div class="sec13c"></div>
            	<!--<div class="sec13b"></div>-->
            	<div id="box" class="sec13e"></div>
                <!--<div class="secHand"></div>-->
            </div>
        </section>
        
    </div>
    <div id="share" onClick="closeBox()"><i></i></div>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>    
<script language="javascript">
function GetRequest() {
   var url = location.search;
   var theRequest = new Object();
   if (url.indexOf("?") != -1) {
      var str = url.substr(1);
      strs = str.split("&");
      for(var i = 0; i < strs.length; i ++) {
         theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
      }
   }
   return theRequest;
}
var Request = new Object();
Request = GetRequest();

</script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/halo.js?v=201407241709"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/card_modules.js?v=20140730"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/cards.js?v=20140730"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/zepto.min.js"></script>
<script type="text/javascript">
var kuser = Request['kuser'];
var productId = Request['productId'];
var box=document.getElementById("box");
var btngoto=document.getElementById("btn_go");
var durl = location.hostname;
halo.use('pageinvite','pagedrag','warn',function(m){
    m.on(box,'flick',function(){
        location.href = "http://"+durl+"/wx/product/datil.htm?productId="+productId+"&kuser="+kuser;
    },false);
    m.on(btngoto,'flick',function(){
        location.href = "http://"+durl+"/wx/product/datil.htm?productId="+productId+"&kuser="+kuser;
    },false);
});
</script>
<script type="text/javascript">
document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
    WeixinJSBridge.call('hideToolbar'); 
    WeixinJSBridge.call('showOptionMenu'); 
});
var shareTitle = '丈夫的日记';
var shareTxt = '丈夫的日记';
var host_Name=location.hostname;
var sharePic = '';
if(host_Name != null && ( host_Name == 'w.ab95569.com' || host_Name == 'www.ab95569.com' )){
    sharePic = 'http://w.ab95569.com/assets/wxdgid/products/hjd5/images/hjd5.jpg';
}else{
	sharePic = 'http://36.ab95569.com/assets/wxdgid/products/hjd5/images/hjd5.jpg';
}

var shareUrl = '${product.trendsUrl}?productId=${productId!""}&kuser=${kuser!""}';
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
</script>
</body>
</html>