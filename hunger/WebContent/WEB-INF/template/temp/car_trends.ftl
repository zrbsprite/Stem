<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html>
<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
	<title>车险抢红包</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/assets/wxdgid/css/anniversary.css">
</head>

<body>
	<div style="display: block;" class="anniversary-pages hide">
		<!-- first page -->
		<div style="height: 826px;" class="page first-page absolute active">
			<svg width="100%" height="100%" xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg">
				<g>
					<path id="page1-svg0" d="M 10 10"></path>
					<circle id="page1-circle0" cx="552" cy="185" r="6" fill="#ffc64a"></circle>
					<path id="page1-svg1" stroke-width="1" stroke="" fill="none" d="M552 185 L324.96000000000004 340.52"></path>
					<circle id="page1-circle1" cx="324.96000000000004" cy="340.52" r="12" fill="#ffc64a"></circle>
					<path id="page1-svg2" stroke-width="1" stroke="" fill="none" d="M324.96000000000004 340.52 L485.4 491 L567 501.92"></path>
					<circle id="page1-circle2" cx="567" cy="501.92" r="7.199999999999999" fill="#ffc64a"></circle>
					<path id="page1-svg3" stroke-width="1" stroke="" fill="none" d="M567 501.92 L435 617"></path>
				</g>
			</svg>
			<div class="headline-area">
				<div class="yuan bg-sprites-1 absolute"></div>
				<div class="line bg-sprites-1 absolute"></div>
				<div class="hb100 bg-sprites-1 absolute"></div>
				<div class="hb200 bg-sprites-1 absolute"></div>
				<div class="hb100-small bg-sprites-1 absolute"></div>
				<div class="hb500 bg-sprites-1 absolute"></div>
				<div class="slogen bg-sprites-1 absolute"></div>
				<div class="ablogo bg-sprites-1 absolute"></div>
				<div class="text-1 bg-sprites-1 absolute"></div>
				<div class="text-2 bg-sprites-1 absolute"></div>
				<div class="text-3 bg-sprites-1 absolute"></div>
			</div>
			<div class="next-page bg-sprites-1 absolute"></div>
		</div>

		<!-- second page -->
		<div class="page second-page absolute">
			<!-- clock -->
			<div class="second-page-block-1 clock relative">
				<div class="ufo bg-sprites-2 page2-prev-page"></div>
				<div class="clock-line-circle"></div>
				<div class="clock-line-wrap">
					<div class="clock-line relative"></div>
				</div>
				<div class="clock-img bg-sprites-2 relative">
			  </div>
				<div class="clock-text bg-sprites-2 relative"></div>
			</div>
			<!-- shield -->
			<div class="second-page-block-4 shield relative">
				<div class="time-line-wrap">
					<div class="time-line animation"></div>
				</div>
                <div class="shield-img-wrap relative animation">
					<div class="shield-img bg-sprites-2"></div>
                   <div class="shield-text bg-sprites-2 relative"></div>
                </div>
            </div>
			<!-- wx account -->
			<div class="second-page-block-5 wx-account relative">
				<div class="time-line-wrap">
					<div class="time-line animation"></div>
				</div>
			  <div class="wx-account-img-wrap relative animation">
				<div class="wx-account-img bg-sprites-2"></div>
			  <div class="wx-account-text bg-sprites-2 relative"></div>
			  </div>
			</div>
			<!-- working time -->
			<div class="end-ball">
		  <div class="time-line-wrap animation">
					<div class="time-line"></div>
					<div class="end-ball-line-circle"></div>
				</div>
				<div class="working-time-img bg-sprites-2 relative animation">
					<div class="man bg-sprites-2 absolute"></div>
					<div class="bird bg-sprites-2 absolute"></div>
					<div class="pluses bg-sprites-2 absolute"></div>
					<div class="y500 bg-sprites-2 absolute"></div>
					<div class="rpR bg-sprites-2 absolute"></div>
                    <div class="working-time-text bg-sprites-2 relative"></div>
				</div>
			</div>
			<!-- ending word -->
            <div class="share relative">
				<div class="share-btn"><a href="${request.getContextPath()}/wx/product/datil.htm?productId=${productId!""}&kuser=${kuser!""}">我也要抢红包</a></div>
                <div class="rp-rule"><a href="${request.getContextPath()}/wx/product/datil.htm?productId=${productId!""}&kuser=${kuser!""}#prizeMd">红包规则</a></div>
			</div>
			<!-- copyright -->
	  </div>
	</div>
	<!-- 分享到微信的遮罩效果 -->
	<div class="anniversary-share-mask hide"></div>
	<div class="anniversary-share-icon bg-sprites-1 hide"></div>
	<!-- data -->
	<div id="anniversary-data" class="hide" data-hiredate="2012-07-13"></div>
	</div>
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/jquery.js"></script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script type="text/javascript">
$(function () {
	currentScrollTop = 0;
	lastScrollTop = -1;
	window.currentPage = 0;

	// ie浏览器直接提示错误
	if ($.browser.msie) {
		$('.loading-page').addClass('hide-important');
		$('.anniversary-pages').addClass('hide-important');
		$('.js-error-page-ie').show();
	}

	// 首页loading
	$('#progress-bar .ui-progress').css('width', '7%');
	$('#progress-bar .ui-progress').animateProgress(87, 1200, function() {});
	window.onload = function () {
		$('#progress-bar .ui-progress').animateProgress(100, 300, function() {
			$('.loading-page').hide();
			$('.anniversary-pages').show();
			$('.first-page').addClass('active');
		});
	};
	// 高度，svg，动画初始化
	pageHeight = $("html").height();
	$('.first-page').css('height', pageHeight);
	initFirstPageSvg();

	// 个人信息的位置
	var hiredate = $('#anniversary-data').data('hiredate');
	var hireArr = hiredate.split('-');
	var positionId;
	if (hireArr[0] >= 1998) {
		if (hireArr[0] < 2004 || hireArr[0] == 2004 && hireArr[1] < 6) {
			positionId = 1;
		} else if (hireArr[0] < 2007 || hireArr[0] == 2007 && hireArr[1] < 6) {
			positionId = 2;
		} else if (hireArr[0] < 2010 || hireArr[0] == 2010 && hireArr[1] < 3) {
			positionId = 3;
		} else if (hireArr[0] < 2013 || hireArr[0] == 2013 && hireArr[1] < 1) {
			positionId = 4;
		} else {
			positionId = 5;
		}
	} else {
		positionId = 5;
	}
	$('.second-page-block-' + positionId).after($('#hiredate').html());

	try {
		// 页面翻动效果
		document.body.addEventListener("touchstart", function(e) {
			lastPosition = e.touches[0].pageY;
			lastScrollTop = $("body").scrollTop();
			lastScreenY = e.changedTouches[0].screenY;
		});
		// 首屏翻到第二页
		$('.first-page')[0].addEventListener("touchmove", function(e) {
			e.preventDefault();
		});
		$('.first-page')[0].addEventListener("touchend", function(e) {
			currentScrollTop = $("body").scrollTop();
			currentPosition = e.changedTouches[0].pageY;
			// 下翻
			if (window.currentPage == 0) {
				if (currentPosition < pageHeight) {
					if (currentPosition < lastPosition - 15) {
						window.currentPage = 1;
						$(".first-page").css({webkitTransition: '200ms', webkitTransform: 'translate3d(0, ' + -pageHeight + 'px, 0)'});
						setTimeout(function () {
							$('.second-page').addClass('active');
						}, 200);
						setTimeout(function () {
							$('.second-page-block-1').next().find('.animation').addClass('active');
						}, 1000);
					} else {
						window.currentPage = 0;
						$(".first-page").css({webkitTransition: '200ms', webkitTransform: 'translate3d(0, 0, 0)'});
					}
				};
			}
		});
		// 第二页翻到首屏
		$('.second-page')[0].addEventListener("touchmove", function(e) {
			if (e.changedTouches[0].pageY == e.changedTouches[0].clientY && e.changedTouches[0].screenY > lastScreenY && window.currentPage == 1) {
				e.preventDefault();

				window.currentPage = 0;
				$(".first-page").css({webkitTransition: '200ms', webkitTransform: 'translate3d(0, 0, 0)'});
			}
		});
		// 点击向下箭头翻到第二页
		$('.next-page').click(function() {
			window.currentPage = 1;
			$(".first-page").css({webkitTransition: '200ms', webkitTransform: 'translate3d(0, ' + -pageHeight + 'px, 0)'});
			setTimeout(function () {
				$('.second-page').addClass('active');
			}, 200);
			setTimeout(function () {
				$('.second-page-block-1').next().find('.animation').addClass('active');
			}, 1000);
		});

		// 第二页随页面滚动的动画
		$(window).scroll(function () {
			$('.animation').each(function () {
				var scrollTop = $('body').scrollTop();
				var offsetTop = $(this).offset().top;
				var height = $(this).height() ? $(this).height() : $(this).parent().height();
				if (offsetTop - scrollTop < pageHeight) {
					$(this).addClass('active');
				}
			});
		});
	} catch (e) {}

	// 分享到微信
	$('.js-share-btn').click(function () {
		$('.anniversary-share-mask').show();
		$('.anniversary-share-icon').show();
		$('.anniversary-share-wording').show();
	});
	$('.anniversary-share-mask').click(function () {
		shareCallback();
	});
});

// 进度条
(function($){
	$.fn.animateProgress = function(progress, duration, callback) {
		return this.each(function() {
			$(this).animate({
				width: progress + '%'
			}, {
				duration: duration,
				easing: 'swing',
				step: function(progress) {},
				complete: function(scope, i, elem) {
					if (callback) {
						callback.call(this, i, elem );
					};
				}
			});
		});
	};
})(jQuery);

// 初始化第一页的svg
function initFirstPageSvg() {
	pageHeight = $("html").height();
	pageWidth = $("html").width();
	// var rem_size = $("html").css("font-size");
	var rem_size = 12;
	var x1 = pageWidth/2 + 9.75*rem_size;
	var y1 = pageHeight/2 - 19*rem_size;
	// var page1_path0 = 'M'+x1+' '+y1;
	// $('#page1-svg0')[0].setAttribute("d", page1_path0);
	$("#page1-circle0")[0].setAttribute("cx", x1);
	$("#page1-circle0")[0].setAttribute("cy", y1);
	$("#page1-circle0")[0].setAttribute("r", rem_size*0.5);

	var x2 = pageWidth/2 - 9.17*rem_size;
	var y2 = pageHeight/2 - 6.04*rem_size;
	var page1_path1 = 'M'+x1+' '+y1+' L'+x2+' '+y2;
	$('#page1-svg1')[0].setAttribute("d", page1_path1);
	$("#page1-circle1")[0].setAttribute("cx", x2);
	$("#page1-circle1")[0].setAttribute("cy", y2);
	$("#page1-circle1")[0].setAttribute("r", rem_size*1);

	var x3 = pageWidth/2 + 4.2*rem_size;
	var y3 = pageHeight/2 + 6.5*rem_size;

	var x4 = pageWidth/2 + 11*rem_size;
	var y4 = pageHeight/2 + 7.41*rem_size;
	var page1_path2 = 'M'+x2+' '+y2+' L'+x3+' '+y3+' L'+x4+' '+y4;
	$("#page1-svg2")[0].setAttribute("d", page1_path2);
	$("#page1-circle2")[0].setAttribute("cx", x4);
	$("#page1-circle2")[0].setAttribute("cy", y4);
	$("#page1-circle2")[0].setAttribute("r", rem_size*0.6);

	var x5 = pageWidth/2;
	var y5 = pageHeight/2 + 17*rem_size;

	var page1_path3 = 'M'+x4+' '+y4+' L'+x5+' '+y5;
	$("#page1-svg3")[0].setAttribute("d", page1_path3);
}

/**function onBridgeReady() {**/
	var ctx = "${request.getContextPath()}";
	var shareUrl = 'https://hr.m.tencent.com/RedirectFiles/16years.php?TargetName=' + $('#anniversary-data').data('targetname') + '&T_Secret=' + $('#anniversary-data').data('tsecret');
	var sharePic = $('#anniversary-data').data('avatar_path');
	var working_days = $('#anniversary-data').data('working_days');
	var shareTitle = (isNaN(working_days) || working_days <= 0) ? '腾讯司庆日 - 今天我们16岁了！' : '腾讯16岁，我已经陪伴了她' + working_days + '天';
	var shareTxt = '十六年，一路走来，说一声谢谢，愿你一起分享，在腾讯最深刻的记忆……';
	var tempShareUrl=window.location.href;
	//var useShareUrl=document.URL;
	var useShareUrl=tempShareUrl.replace("&","@@");
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
function shareCallback () {
	$('.anniversary-share-mask').hide();
	$('.anniversary-share-icon').hide();
	$('.anniversary-share-wording').hide();
}
//执行
/**try{
	document.addEventListener('WeixinJSBridgeReady', function() {
		onBridgeReady();
	});
} catch(e) {}**/
</script>

</body></html>