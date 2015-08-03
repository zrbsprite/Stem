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
    <title>一次投保，终身受益！乐享晚年，从这里开始！</title> 
    <link href="${request.getContextPath()}/assets/wxdgid/css/cards_lx1.css?v=201407311741" type="text/css" rel="stylesheet" />
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
        <audio autoplay="autoplay" loop id="audiomusic" >
            <source src="${productsimageUrl}/lexiang1h/images/lx1.mp3" type="audio/mpeg"></source>
        </audio>
    </header>

    <div class="wrapper" id="wrap" style="display:none">
        <section class="page">
            <div class="card">
                <div class="txt_01">等我老了,我要牵着你的手,走过清晨小路,轻风吹过,花瓣飘落</div>
            </div>
            <div class="start"></div>
            <div class="btn_tb btnbg_01 btnbuy"></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_01"></i>
            </a>
        </section>
        <section class="page">
            <div class="card" style="display:none;">
                <div class="txt_01">等我老了,我要牵着你的手,在夏荫下乘凉,买只雪糕,一起分享</div>
            </div>
            <div class="start"></div>
            <div class="btn_tb btnbg_02 btnbuy"></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_02"></i>
            </a>
        </section>
        <section class="page">
            <div class="card" style="display:none;">
                <div class="txt_01">等我老了</div>
            </div>
            <div class="start"></div>
            <div class="btn_tb btnbg_02 btnbuy"></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_02"></i>
            </a>
        </section>
        <section class="page">
            <div class="card" style="display:none;">
                <div class="txt_01">等我老了,我要牵着你的手,坐在午后的玻璃窗下,晒晒暖阳</div>
            </div>
            <div class="start"></div>
            <div class="btn_tb btnbg_02 btnbuy"></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_02"></i>
            </a>
        </section>
        <section class="page">
            <div class="card">
                <div class="txt_01">如果有一天,我不得不离开,我希望留给你的,不是债</div>
            </div>
            <div class="start"></div>
            <div class="btn_tb btnbg_02 btnbuy"></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_02"></i>
            </a>
        </section>
        <section class="page">
            <div class="card">
                <div class="txt_01">如果有一天</div>
            </div>
            <div class="start"></div>
            <div class="btn_tb btnbg_02 btnbuy"></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_02"></i>
            </a>
        </section>
        <section class="page">
            <ul id="h_wrap">
                <li>
                    <div class="card" style="display:none;">
                        <div class="slogan">安邦养老乐享一号</div>
                        <div class="arr">更多惊喜等你来拿！</div>
                        <div class="txt_02 btn_go"></div>
                        <div class="txt_01" id="btnlx1"></div>
                    </div>
                </li>
            </ul>
            <div id="left"><i></i></div>
            <div id="right"><i></i></div>
            <a href="javascript:void();" class="u-globalAudio z-play">
                <i class="icon-music musicbg_02"></i>
            </a>
        </section>
    </div>
    <div id="share" onClick="closeBox()"><i></i></div>
    
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
var btnlx1=document.getElementById("btnlx1");
var btngoto=document.getElementsByClassName("btn_go");
var btnbuy=document.getElementsByClassName("btnbuy");
var durl = location.hostname;

halo.use('pageinvite','pagedrag','warn',function(m){
    m.on(btnlx1,'flick',function(){
        location.href = "http://"+durl+"/wap/annuity/index.htm?prono=A11005";
    },false);
    for(var i=0,j=btngoto.length;i<j;++i){
        (function(i){
            m.on(btngoto[i],'flick',function(){
                location.href = "http://"+durl+"/wx/product/datil.htm?productId="+productId+"&kuser="+kuser;
            },false)
        }(i));
    }
    for(var i=0,j=btnbuy.length;i<j;++i){
        (function(i){
            m.on(btnbuy[i],'flick',function(){
                location.href = "http://"+durl+"/wap/annuity/index.htm?prono=A11005";
            },false)
        }(i));
    }


    var globalAudio=document.getElementsByClassName("u-globalAudio");
    var audiomusic=document.getElementById("audiomusic");
    for(var i=0,j=btngoto.length;i<j;++i){
        (function(i){
            m.on(globalAudio[i],'flick',function(){
                if(globalAudio[i].className=="u-globalAudio z-play"){
                    globalAudio[i].className="u-globalAudio z-pause";
                    audiomusic.pause();
                }
                else{
                    globalAudio[i].className="u-globalAudio z-play";
                    audiomusic.play();
                }
            },false)
        }(i));
    }
});
</script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script type="text/javascript">
document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
    WeixinJSBridge.call('hideToolbar'); 
    WeixinJSBridge.call('showOptionMenu');
});
var shareTitle = '一次购买，终身受益，理财养老，本就如此简单！';
var shareTxt = '乐享一号兼顾理财和保险，灵活保本增值，让您的养老无后顾之忧。';
var shareTxt2 = '一次购买，终身受益，理财养老，本就如此简单！';
var host_Name=location.hostname;
var sharePic = '';
if(host_Name != null && ( host_Name == 'w.ab95569.com' || host_Name == 'www.ab95569.com' )){
    sharePic = 'http://w.ab95569.com/assets/wxdgid/products/lexiang1h/images/lx1_s.jpg';
}else{
	sharePic = 'http://36.ab95569.com/assets/wxdgid/products/lexiang1h/images/lx1_s.jpg';
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
        var title = shareTxt2;
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
<script language="JavaScript" src="${ctx}/assets/wxdgid/js/m_code_weixin.js"></script>
</body>
</html>