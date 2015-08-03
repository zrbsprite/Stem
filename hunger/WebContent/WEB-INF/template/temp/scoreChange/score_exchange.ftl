<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>我的积分</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/redPackage/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/redPackage/style.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
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
            });
            
            
            $("a[class='ubtn blueBtn2']").click(function(){
               $.post('${ctx}/wx/validateIsManyCodeUseOpenId.htm',{},function(data){
                  if(null!=data.message&&''!=data.message){
                     alert(data.message);
                  }else{
                     window.location.href="${ctx}/wx/extractionIntegral.htm";
                  }
               },'json');
            });
        });
        function optionWin(){
			var maskh = $(document).height();
		    $(".OpenBoxBg").show().css("height",maskh);
    		showOpenBox();
    		$(document).scrollTop(0);
    		$(".sc_num_ex").css({"top":"0"});
    		$(".OpenBox").show();
		}
        function showOpenBox() {
			var objWin = $(document); //当前窗口
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
			var top = sclT + (brsH - curH) / 3;
			//设置对话框在页面中的位置
			objOpenBox.css({ "left": left, "top": "200px" });
		  	//$(".OpenBoxBg").height(brsH);//背景框 灰色 高度和窗口一致
		}
		$(window).resize(function() {//页面窗口大小改变事件
			if (!$(".OpenBox").is(":visible")) {
				return;
			}
			showOpenBox(); //设置提示对话框的Top与Left
		});
		
        var currentPage = 1;
        var pageSize = 12;
        var ctx = "${ctx}";
        var guarantee_state="";
        function building(string1, createdTime, addOrMinus, receiveType, money) {

        	if (addOrMinus == '1' && money.toFixed(2)>0) {
		        	return "<li>" +
		        		"<p>" + string1  + "<br /><span>" + createdTime + "</span></p>" +
					"<em class='red'>+" +money.toFixed(2) + "</em></li>";
			}else{
			//	if (receiveType == '0'){
			//		return "<li>" +
		   //     		"<p>工资提取（默认）<br /><span>" + createdTime + "</span></p>" +
			//		"<em class='green'>-" +money.toFixed(2) + "</em></li>";
			//	}else if(receiveType == '1'){
			//		return "<li>" +
			//        		"<p>工资提取<br /><span>" + createdTime + "</span></p>" +
			//			"<em class='green'>-" +money.toFixed(2) + "</em></li>";
			//	}else{
					return "<li>" +
			        		"<p>" + string1  + "<br /><span>" + createdTime + "</span></p>" +
						"<em class='green'>" +money.toFixed(2) + "</em></li>";
			//	}
			}
        }

        function loadOrder() {
            $.ajax({
                url: ctx + "/wx/wxChargeDetaileInfoList.htm?pageSize=" + pageSize + "&currentPage=" + currentPage,
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
                    alert('系统错误');
                }
            });
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
                    $("#scoreList").append(building(o.string1, o.createdTime, o.addOrMinus, o.receiveType, o.money));
                }
               $('#gotop').show();
				  if(datas.length<12){
				  		$("#nextOrder").hide();
		          }else{
		          		$("#nextOrder").html("点击加载更多...");
		          		$("#nextOrder").show();
		          		$(".sc_num_ex").css({"top":"0"});
		          }
            } else {
            	if(currentPage != 1){
            		alert('没有更多数据!');
            	}else{
	            	$('#gotop').hide();
	         		$("#nextOrder").html("对不起，你还没有数据！");
	         		$("#nextOrder").show();
	         		$(".sc_num_ex").css({"top":"0"});
            	}
            }
        }
		
    </script>
<body>

<article class="sc_num_ex">
	<a href="javascript:optionWin();" class="link">?</a>
	<div class="s txtl">有效积分（1积分 = 1元）</div>
	<#setting number_format="0.##"> 
	<#if chargeMoney?? && chargeMoney?number gte 0.00 >
	<p class="txtl"><span class="red">${chargeMoney?string("0.00")}</span></p>
	<#else>
	<p class="txtl"><span class="green">${chargeMoney?string("0.00")}</span></p>
	</#if>
	<#if userType?? && userType == "1" && receiveType == "0">
		<a class="ubtn blueBtn2" href="#" >兑换微信红包</a>
	<#elseif userType?? && userType == "1" && receiveType == "1">
		<div class="uway gz">随工资发放</div>
	<#elseif userType?? && userType == "1" && receiveType == "2">
		<a class="ubtn blueBtn2" href="#" >兑换微信红包</a>
	<#else>
		<a class="ubtn blueBtn2" href="#" >兑换微信红包</a>
	</#if>
</article>

<article class="orderForm pad_t0">
	<ul class="scoreList" id = "scoreList">

    </ul>
    <div class='gotop' ><span id="nextOrder">点击加载更多...</span><img src="/assets/wxdgid/images/redPackage/icon_arr.png" id="gotop" /></div>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>


<!--弹出内容框-->
<div class="OpenBoxBg"></div>
<div class="OpenBox">
    
    <div class="context">若客户退单或者犹豫期内退保产生的积分减扣无法实时统计，系统会每月进行一次核算，减去需要扣除的积分后，您实际获得的可兑换的积分为有效积分，详情请见帮助中心。</div>
    <div class="bottomBar2"><a href="javascript:void(0);" class="ClosePrompt">我知道了</a></div>

</div>

</body>
</html>
