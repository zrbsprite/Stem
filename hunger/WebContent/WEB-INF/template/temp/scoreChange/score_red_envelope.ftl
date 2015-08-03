<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>积分兑换</title>
<link rel="stylesheet" media="screen" href="${request.getContextPath()}/assets/wap/wacai/css/insur.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/redPackage/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/redPackage/style.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/common/common.js"></script>

<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
</head>
<script type="text/javascript">
        
        $(document).ready(function () {
            loadOrder();
            $("#nextOrder").click(function () {
                loadNextOrder();
            });
            $(".ClosePrompt").click(function () {
                $(".OpenBoxBg").hide();
        		$(".OpenBox").hide();
        		location.reload() ;
            });
        });
        var currentPage = 1;
        var pageSize = 12;
        var ctx = "${ctx}";
        var guarantee_state="";
  
        function building(money, redPacketNo) {
		       return "<li><img src='/assets/wxdgid/images/redPackage/icon_redbag.png' /><p><span>" +
		        		"</span>"+ money.toFixed(2) +"元</p><input id = '" + redPacketNo + "input' type='hidden' value= '" + money.toFixed(2) + "' />" +
            "<div id='wait"+ redPacketNo+"' style='display:block;'><button id = '" + redPacketNo + "' class='sbtn blueBtn2 ShowPrompt' onclick='receiveRedPackte("+ redPacketNo + ")' >兑换</button></div><div id = '" + redPacketNo + "dd' class='sbtn' style='display:none;color:#999;' >等待中...</div>";
        }
        //兑换红包
        function receiveRedPackte(redPacket) {
         var validateDayLimit = "${validateDayLimit}"
        	if(validateDayLimit == "0"){
        		openWin("受微信规则限制，您今日/本月可兑换的红包数已达上限，请改日/下月兑换！");
        		return ;
        	}
        	var redPacketNo = $(redPacket).attr("id");
        	var monry1 = $("#" + redPacketNo + "input").val();
        	if(monry1 < 1){
        		openWin("红包金额不满1元，无法提取，请赚取更多积分后再来");
        		return;
        	}
        	$("#wait"+redPacketNo).css("display","none");
        	$("#"+redPacketNo+"dd").css("display","block");
        	loadmask();
        	$.ajax({
                url: ctx + "/wx/receiveRedPacktes.htm?redPacketNo="+redPacketNo,
                type: 'POST',
				async: true ,
                dataType: 'json',
                success: function (data) {
                    if ('' != data && data != null) {
                        if (data.status != 'SUCCESS') {
                            openWin(data.message);
                        } else {
                            openWin(data.message);
                          
                        }
                    }
                },
                error: function () {
                    openWin("系统繁忙，请稍后再试");
                }
            });
            //$("#wait"+redPacketNo).append("<button id = '" + redPacketNo + "' class='sbtn blueBtn2 ShowPrompt' onclick='receiveRedPackte("+ redPacketNo + ")' >兑换</button><div class='sbtn' id = '" + redPacketNo + "dd' style='color:#999;display:none;' >等待中...</div>");
        }
        //打开弹窗
        var startTimeout ;
        function openWin(content){
    		//定时执行，3秒后执行
    		Unmask();
        	$(".context").html(content);
    		var maskh = $(document).height();
		    $(".OpenBoxBg").show().css("height",maskh);
    		showOpenBox();
    		$(".OpenBox").show();
			//startTimeout = window.setTimeout(colseShow,3000)
        }
        //定时执行 关闭弹出窗口
        function colseShow(){
        	$(".OpenBoxBg").hide();
        	$(".OpenBox").hide();
        	window.clearTimeout(startTimeout); 
        }
        
        function showOpenBox() {
			var objWin = $(window); //当前窗口
			var objOpenBox = $(".OpenBox"); //对话框
			var brsW = objWin.width();
			var brsH = objWin.height();
			var sclL = objWin.scrollLeft();
			var sclT = objWin.scrollTop();
			var curW = objOpenBox.width();
			var curH = objOpenBox.height();
			
			//计算对话框居中时的左边距
			var left = sclL + (brsW - curW) / 2;
			//计算对话框居中时的上边距
			var top = sclT + (brsH - curH) / 2;
			//设置对话框在页面中的位置
			objOpenBox.css({ "left": left, "top": top });
		  //$(".OpenBoxBg").height(brsH);//背景框 灰色 高度和窗口一致
		}
		$(window).resize(function() {//页面窗口大小改变事件
			if (!$(".OpenBox").is(":visible")) {
				return;
			}
			showOpenBox(); //设置提示对话框的Top与Left
		});
        
        
        function loadOrder() {
       		var aaa =  ${chargeMoney?string("0.00")};
       		if(aaa.toFixed(2) <= 0.00){
       			$('#gotop').hide();
         		$("#nextOrder").html("没有可兑换的红包");
         		$("#nextOrder").show();
       		}else{
	       		$.ajax({
	                url: ctx + "/wx/wxRedPacketsInfoList.htm?pageSize=" + pageSize + "&currentPage=" + currentPage,
	                type: 'get',
	                dataType: 'json',
	                success: function (data) {
	                    if ('' != data && data != null) {
	                        if (data.status != 'SUCCESS') {
	                            alert(data.message);
	                        } else {
	                            appendData(eval(data.message));
	                        }
	                    }
	                },
	                error: function () {
	                }
	            });
       		}
        }
        function loadNextOrder() {
            currentPage = currentPage + 1;
            loadOrder();
        }
        //添加数据
        function appendData(datas) {
            if (datas != null && datas.length != 0) {
                for (var i = 0; i < datas.length; i++) {
                    var o = datas[i];
                    $("#redPacketsList").append(building(o.money, o.redPacketNo));
                }
               $('#gotop').show();
				  if(datas.length<12){
				  		$("#nextOrder").hide();
		          }else{
		          		$("#nextOrder").html("点击加载更多...");
		          		$("#nextOrder").show();
		          }
            } else {
            	if(currentPage != 1){
            		alert('没有更多数据!');
            	}else{
	            	$('#gotop').hide();
	         		$("#nextOrder").html("没有可兑换的红包");
	         		$("#nextOrder").show();
            	}
            }
        }
    </script>
<body>
<div id="headRed" class="changeH">
    <div class="leftBar"><a href="${ctx}/wx/integralExchange.htm" class="upPage"></a></div>
    <h1>兑换微信红包</h1>
</div>
<!--
	<div class="scoreRedBagtxt">剩余领取红包数：今日<span>${validateDayLimit}</span>个<em>总金额：<span>${chargeMoney?string("0.00")}</span>元</em></div>
-->
	<#setting number_format="0.##"> 
<div class="scoreRedBagtxt">每天最多可兑换<span>2</span>个红包<#if chargeMoney?? && chargeMoney?number gte 0><em>总金额：<span class = "red">${chargeMoney?string("0.00")}</span>元</em><#else><em>总金额：<span class = "green">${chargeMoney?string("0.00")}</span>元</em></#if>></div>
<article class="orderForm pad_t0">
    <ul class="scoreRedBag" id = "redPacketsList">
    
    </ul>
    <div class='gotop' ><span id="nextOrder">点击加载更多...</span><img src="/assets/wxdgid/images/redPackage/icon_arr.png" id="gotop" /></div>
</article>

<#include "/WEB-INF/content/wxdgid/footer.ftl"/>

<!--弹出内容框-->
<div class="OpenBoxBg"></div>
<div class="OpenBox">
    <div class="context">受微信规则限制，您今日/本月可兑换的红包数已达上限，请改日兑换！</div>
	<div class="bottomBar2"><a href="javascript:void(0);" class="ClosePrompt">我知道了</a></div>
</div>
<!--正在加载 开始-->

<div id="screen"></div><!--screen end-->
<div class="popbox">
    <div class="Loading_content">
        <div class="leftContent">
            <div class="Loading_ball"></div>
            <div class="Loading_ball1"></div>
        </div>
        <div class="rightContent">
        等待中 ...</a> </div>
        <div class="clearfix"></div>
    </div>
</div>
</body>
</html>
