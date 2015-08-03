<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<#assign productsimageUrl="${request.getContextPath()}/assets/wxdgid/products"/>
<!DOCTYPE html>
<html> 
<head> 
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport">
    <meta content="telephone=no" name="format-detection">
    <meta content="email=no" name="format-detection">
    <meta name="description" content="养老意外险">
    <title>养老意外险</title> 
    <link href="${request.getContextPath()}/assets/wxdgid/css/cards_pension.css?v=201407311741" type="text/css" rel="stylesheet" />
    
</head>

<body>
<img src="${request.getContextPath()}/assets/wxdgid/products/ywsh/dyn_images/spic.jpg" width="0" height="0" style="display:block" />
	<header style=" line-height:0; height:0;">
        <audio autoplay="autoplay" loop id="audiomusic" >
            <source src="${request.getContextPath()}/assets/wxdgid/products/ywsh/dyn_images/dnll.mp3" type="audio/mpeg"></source>
        </audio>
        <a href="javascript:void();" id="u-globalAudio" class="z-play">
            <i class="icon-music"></i>
        </a>
    </header>
    <div class="ttbg"></div>
    <div class="wrapper" id="wrap" style="display:none">
        <section class="page">
            <div class="dpage" id="dpage"><p class="on"></p><p></p><p></p><p></p><p></p><p></p><p></p></div>
            <div id="lp" style="display:none"><p></p></div>
            <div id="rp" class="bg2"><p></p></div>
            <ul id="h_wrap">
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                            <div class="txt3"></div>
                            <div class="txt4"></div>
                        </div>
                    </div>
                    
                </li>
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                        </div>
                    </div>
                    
                </li>
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                            <div class="txt3"></div>
                            <div class="txt4"></div>
                        </div>
                    </div>
                    
                </li>
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                        </div>
                    </div>
                    
                </li>
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                            <div class="txt3"></div>
                        </div>
                    </div>
                    
                </li>
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                            <div class="txt3"></div>
                            <div class="txt4"></div>
                        </div>
                    </div>
                    
                </li>
                <li>
                    <div class="card" style="display:none">
                        <div class="bg">
                            <div class="tit"></div>
                            <div class="txt1"></div>
                            <div class="txt2"></div>
                        </div>
                    </div>
                </li>
            </ul>
            <div id="left"><i></i></div>
            <div id="right"><i></i></div>
        </section>
        
    </div>
    

    <div class="btn_buy" id="btn_buy" onclick="location.href='/wap/ylaccident/index.htm?prono=A11008'">立即购买</div>
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
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/products/ywsh/js/halo.js?v=201407241709"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/products/ywsh/js/card_modules.js?v=20140730"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/products/ywsh/js/cards.js?v=20140730"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/products/ywsh/js/zepto.min.js"></script>
<script type="text/javascript">
var kuser = Request['kuser'];
var productId = Request['productId'];
var btnbuy=document.getElementById("btn_buy");
var durl = location.hostname;
halo.use('pageinvite','pagedrag','warn',function(m){
    m.on(btnbuy,'flick',function(){
        location.href = "http://"+durl+"/wx/product/datil.htm?productId="+productId+"&kuser="+kuser;
    },false);
});
</script>
<script type="text/javascript">
document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
    WeixinJSBridge.call('hideToolbar'); 
    WeixinJSBridge.call('showOptionMenu');
});
var shareTitle = '50秒看完你和母亲的故事！';
var shareTxt = '从孩童到壮年，妈妈我有很多话想对你说！90%的人看过都愿分享给自己的母亲！';
var host_Name=location.hostname;
var sharePic = '';
if(host_Name != null && ( host_Name == 'w.ab95569.com' || host_Name == 'www.ab95569.com' )){
    sharePic = 'http://w.ab95569.com/assets/wxdgid/products/ywsh/images/top_banner01.jpg';
}else{
	sharePic = 'http://36.ab95569.com/assets/wxdgid/products/ywsh/images/top_banner01.jpg';
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