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
    <title>幸运宝箱，抽中几折打几折!</title> 
    <link href="${request.getContextPath()}/assets/wxdgid/products/wswy/css/cards.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript"> 
		//document.write('<link href="css/cards.css?v='+new Date().getTime()+'" type="text/css" rel="stylesheet" />');
    </script>
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
        <audio autoplay="autoplay" loop controls id="audiomusic">
          <source src="${request.getContextPath()}/assets/wxdgid/products/wswy/images_01/HappySong_bbb.mp3" type="audio/mpeg" />
        </audio>
		<a href="javascript:void();" id="u-globalAudio" class="z-play">
			<i class="icon-music"></i>
		</a>
	</header>

	<div class="wrapper" id="wrap" style="display:none">

        <section class="page">
        	<ul id="h_wrap">
            	<li>
                	<div class="card" style="display:none">
                        <!--<div class="ico_01"></div>-->
                        <div class="ico_01a"></div>
                        <div class="ico_02"></div>
                        <div class="ico_03"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
            	<!--第二屏-->
            	<li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="bigtxt"></div>
                        <div class="bigtxta"></div>
                        <div class="slogan"></div>
                        <!--<div class="slogan1"></div>
                        <div class="btn1" id="btnky5"></div>
                        <div class="btn2"></div>-->
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第三屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="bigtxt"></div>
                        <!--<div class="bigtxta"></div>-->
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第四屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="bigtxt"></div>
                        <div class="bigtxta"></div>
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第五屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第六屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="bigtxt"></div>
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第七屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="bigtxt"></div>
                        <div class="bigtxta"></div>
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第八屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
                <!--第九屏-->
                <li>
                	<div class="card" style="display:none;">
                        <div class="biground"></div>
                        <div class="slogan"></div>
                    </div>
                    <div class="but_left"><i></i></div>
                </li>
        		<!--第十屏-->
                <li>
                	<div class="card" style="display:none;">
                      <div id="box" class="boxb"></div>
                      <div class="slogan"></div>
                      <div class="wswyOr">
                        	<div style="overflow:hidden"><h1>活动规则：</h1><span id="but_close"><img src="${productsimageUrl}/wswy/images_01/close.png" /></span></div>
                            <p>1、 选择保障项目，完善被保险人信息后，可获得一次幸运猜猜猜的机会，<span class="tred">中奖率高达100%。</span></p>
                            <p>2、 通过幸运猜猜猜可以抽取折扣券<span class="tred">（3-6折折扣券）</span>，抽中几折即可享受对应折扣，可直接按照折扣后价格购买保障。
                    买一款保障可抽取5.5折券、5.8折券、6折券，
                    买两款保障可抽取4.5折券、4.8折券、5折券，
                    买三款及以上保障可抽取3折券、3.8折券、4折券；</p>
                            <p>3、 投保过程中，如果退出重新投保，则之前抽取的折扣券作废。</p>
                      </div>
                	<div class="but_end" id="btnwswy"><img src="${productsimageUrl}/wswy/images_01/but_end.png"></div>
                  </div>
                </li>
            </ul>
            <div id="left"><i></i></div>
            <div id="right"><i></i></div>
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
<script type="text/javascript" src="${jsUrl}/halo.js?v=201407241709"></script>
<script type="text/javascript" src="${jsUrl}/card_modules.js?v=20140730"></script>
<script type="text/javascript" src="${jsUrl}/cards.js?v=20140730"></script>
<script type="text/javascript" src="${jsUrl}/zepto.min.js"></script>
<script type="text/javascript">
var kuser = Request['kuser'];
var productId = Request['productId'];
var box=document.getElementById("box");
var but_close=document.getElementById("but_close");
var btnwswy=document.getElementById("btnwswy");
var durl = location.hostname;
halo.use('pageinvite','pagedrag','warn',function(m){
    m.on(box,'flick',function(){
		$('#box').removeClass('boxb');
		$('#box').addClass('boxa');
		setTimeout(function(){
			$('.wswyOr').show();
		},500)

    },false);
    m.on(but_close,'flick',function(){
		$('#box').removeClass('boxa');
		$('#box').addClass('boxb');
		$('.wswyOr').hide();
    },false);
    m.on(btnwswy,'flick',function(){
        location.href = "http://"+durl+"/wx/product/datil.htm?productId="+productId+"&kuser="+kuser;
    },false);
});
</script>
<script type="text/javascript">
document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
    WeixinJSBridge.call('hideToolbar'); //隐藏最下边按钮
    WeixinJSBridge.call('showOptionMenu');//打开分享按钮
});
var shareTitle = '幸运宝箱猜猜猜，抽中几折打几折。';
var shareTxt = '万事无忧交通意外险，完全DIY，史上最贴心，最低0.5元起。';

var host_Name=location.hostname;
var sharePic = '';
if(host_Name != null && ( host_Name == 'w.ab95569.com' || host_Name == 'www.ab95569.com' )){
    sharePic = 'http://w.ab95569.com/assets/wxdgid/products/wswy/images_01/wswy_banner_mini.jpg';
}else{
	sharePic = 'http://36.ab95569.com/assets/wxdgid/products/wswy/images_01/wswy_banner_mini.jpg';
}

var shareUrl = '${product.trendsUrl}?productId=${productId!""}&kuser=${kuser!""}';


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
        'desc' : title,
        'title' : title
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
</script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/products/wswy/js/m_code_shouji.js"></script>
<script language="JavaScript" src="${ctx}/assets/wxdgid/js/m_code_weixin.js"></script>
</body>
</html>