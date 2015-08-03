<!DOCTYPE html>
<html>
<head>
	<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width,user-scalable=no">
    <script src="http://y.abic.cn/2048/WeixinJSBridge.js"></script>
    <script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
    <title>${product.promotionTitle?trim!""}</title>
    <script type="text/javascript">
        $(document).ready(function(){
        	//打开微信工具栏
        	document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
        	      WeixinJSBridge.call('showOptionMenu');
        	 });
        	$("#zancount").html(${productNum!""});
        	$("#salesNumber").html('${product.productNo!""}');
            /*世纪证券  跳转链接 开始*/
            $("#myborrowmoney").attr("href","${request.getContextPath()}/wap/borrowMoney.htm?productId=${productId}&kuser=${kuser!""}");
            $("#dowloadApp").attr("href","${request.getContextPath()}/wap/borrowMoney.htm?productId=${productId}&kuser=${kuser!""}");
            $("#bottomborrowMoney").attr("href","${request.getContextPath()}/wap/borrowMoney.htm?productId=${productId}&kuser=${kuser!""}");
            /*世纪证券  跳转链接 开始*/
            /*$("#zancount").html(${praiseEntity.praiseCount?trim!""});
            var url = "${ctx}/wx/product/clickPraise.htm?praiseId=${praiseEntity.id}";
            var ggkurl="http://y.abic.cn/scratchcard/ggk/getchance?kuser=${kuser!''}";
            $("#ggk").attr("href",ggkurl);
            var wjburl="http://y.abic.cn/gold-game?kuser=${kuser!''}";
            $("#wjb").attr("href",wjburl);
            var rankingurl="${ctx}/wx/order/listHLCOrder.htm?productNo=0045&kuser=${kuser!""}";
            $("#ranking").attr("href",rankingurl);
            $("#zanheart").click(function(){
                $.ajax({
                    url:url,
                    type:'post',
                    dataType:'json',
                    success:function(date){
                        if('' != date){
                            if(date.status != 'SUCCESS'){
                                
                            }else{
                                 //心形效果
                                $('#heart').show(); 
						    	$('#heart').animate({'opacity':1,'background-size':'40%'}, 200, function(){
						           $('#heart').animate({'opacity':0,'background-size':'90%'}, 300, function(){
						               $('#heart').animate({'opacity':0,'background-size':'0%'}, 10).hide();
						            });
						        }); 
						        //页面暂值加1
						        $("#zancount").html(parseInt($("#zancount").html()) + 1);
                            }
                        }
                    }
                });
            });*/
        });
   </script>
</head>
<body>	
${product.promotionContent}
<script type="text/javascript">
    var hostname=location.hostname;
	var shareUrl = 'http://'+hostname+'/wx/product/datil.htm?productId=${productId}&kuser=${kuser!""}';
	/**var onBridgeReady = function () {
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
	        'desc' : shareDesc,
	        'title' : shareDesc
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
	$(function(){
		$('#shareBtn').click(function(){
			var vheight = $(document.body).height();
			$(document).scrollTop(0);
			$('#maskbg').show();
			$('#maskbg').css("height",vheight);
			$('#wxtips').show();
		});
		$('.maskclose').click(function(){
			$('#maskbg').hide();
			$('#wxtips').hide();
			$(".infoLayer").hide();
		});	
 });

function goToBuy(){
	var re1QRflag = '${re1QRflag!"0"}';
	var pno = '${product.productNo!""}';
	if(re1QRflag=='1'){
		if(pno == 'ZFG15017'){
			buyQRUrCd();
		}
		if(pno == 'ZFG15018'){
			buyQRUrCd();
		}
	}else{
		if(pno == 'ZFG15017'){
			buyNoQR();
		}
		if(pno == 'ZFG15018'){
			buyNoQR();
		}
	}
}

function buyNoQR(){
	var kkk = '${kuser!''}';
	if(kkk==''||kkk==null){
		kkk = '21111111';
	}
	var url_hostname=location.hostname;
	if(url_hostname != null && (url_hostname=="w.ab95569.com" || url_hostname=="www.ab95569.com") ){ //生产地址
	location.href = "https://mbank.cdrcbank.com/dSale/financingAction.action?a=" + kkk + "&b=&c=${product.productNo!""}&d=1";
	}else{ // 测试地址
		location.href = "http://weitest.cdrcb.com/wechat/dSale/financingAction.action?a=" + kkk + "&c=${product.productNo!""}&d=1";
	}
}

function buyQRNoUrCd(){
	var url_hostname=location.hostname;
    if(url_hostname != null && (url_hostname=="w.ab95569.com" || url_hostname=="www.ab95569.com") ){ //生产地址
    	location.href = "https://mbank.cdrcbank.com/dSale/financingAction.action?a=21111111&b=&c=${product.productNo!""}";
    }else{ // 测试地址
    	location.href = "http://weitest.cdrcb.com/wechat/dSale/financingAction.action?a=21111111&c=${product.productNo!""}";
    }
}

function buyQRUrCd(){
	var kkk = '${kuser!""}';
	if(kkk==''||kkk==null){
		kkk = '21111111';
	}
	var url_hostname=location.hostname;
    if(url_hostname != null && (url_hostname=="w.ab95569.com" || url_hostname=="www.ab95569.com") ){ //生产地址
    	location.href = "https://mbank.cdrcbank.com/dSale/financingAction.action?a=" + kkk + "&b=&c=${product.productNo!""}&d=20";
    }else{ // 测试地址
    	  location.href = "http://weitest.cdrcb.com/wechat/dSale/financingAction.action?a=" + kkk + "&c=${product.productNo!""}&d=20";
    }
}
 
function buyQR(){
	var vheight = $(document.body).height();
	$(document).scrollTop(0);
	$('#maskbg').show().css("height",vheight);
	$('.infoLayer').show()
	$('.infoLayer').center();
}

function ajaxCheck(){
	var urCode = $("#refereeId").val();
	if(urCode==""){
		$(".errorTxt").html("请输入推荐人工号。");
	}else{
		var url = "${ctx}/wx/selectByCondition.htm";
		$.post(url,{'kuser':urCode,'type':'3'},function(data){
		    var jsonObj = jQuery.parseJSON(data);
		    if(jsonObj.result == 0){
		        $("#refereeName").attr("value",jsonObj.userName);
		        $(".errorTxt").html("");
		        setTimeout(buyQRUrCd,1000);
		    } else {
		        $("#refereeName").attr("value","推荐人姓名不用输入");
		        $(".errorTxt").html("推荐员工不存在，请重新输入或者跳过！");
		    }
		});
	}
}

function voidToBuy(){
	$(".infoLayer").hide();
	buyQRNoUrCd();
}

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
 
function openwin(){
    document.body.scrollTop = 0;
    document.getElementById("maskbg").style.display = "block";
    document.getElementById("maskbg").style.height =document.body.clientHeight+"px";
    document.getElementById("wxtips").style.display = "block";
}
function closewin(){
    document.getElementById("maskbg").style.display = "none";
    document.getElementById("wxtips").style.display = "none";
}
</script>
<script type="text/javascript">
	<#--统计流量 -->
	$(function(){
	    var re1QRflag = '${re1QRflag!"0"}';
	    if(re1QRflag=="1")
	    {var url = "${ctx}/wx/TrafficStatistics.htm?productId=${productId}&kuser=${kuser!""}&webType=4";
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			success: function(msg){
				
		    }
		})}
	    else{
		var url = "${ctx}/wx/TrafficStatistics.htm?productId=${productId}&kuser=${kuser!""}&webType=1";
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			success: function(msg){
				
		    }
		})};
	});
</script>
<script language="JavaScript" src="${ctx}/assets/wxdgid/js/m_code_weixin.js"></script>
</body>
</html>