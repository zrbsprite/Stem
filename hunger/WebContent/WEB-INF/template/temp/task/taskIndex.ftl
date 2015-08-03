<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>我的任务</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/form.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/common/common.js"></script>
<script type="text/javascript" >
 var loginDay = ${taskLog.loginDays};
 	function drawAjax(detailType){
 		//默认是每日签到！
		$("#lingqu").attr("href","#");
 	  var detailType ='1'
 	  var bangbeanNum = countBangbean(loginDay);
	 	 $.ajax({
		    url:'${ctx}/wx/drawBangbean.htm?detailType='+detailType+'&bangbeanNum='+bangbeanNum+'&loginDay='+loginDay,
            type: 'post',
            dataType: 'json',
            async:false,
            success: function (data) {
                   if ('' != data && data != null) {
	                 if (data.status != 'SUCCESS') {
	                     alert(data.message);
	                 } else {
	                     window.location.reload(true);
	                 }
	             	}
            }, error: function (e) {
                alert('系统错误');
            }
		 });
 	}
 	
 	function charge4(){
 		var kuser = '${kuser}';
 		var bdmoney = '${chargetomoney}';
 		
 		$.post('${ctx}/wx/naturalManMakeOrder.htm',{'kuser':kuser},function(data){
 		   if(null!=data.message&&''!=data.message){
 		     $(".OpenBoxBg").hide();
 		     $(".OpenBox").hide();
 		     openWinApp(data.message);
 		     return false;
 		   }else{
		 		if(5<=parseInt(bdmoney)&&parseInt(bdmoney)<201){
		 			openWin("恭喜您！可花费" + parseInt(bdmoney)*400 + "邦豆领取" + parseInt(bdmoney) + "元红包。");
				}else{
					openWin("恭喜您！可花费800,00邦豆领取200元红包。微信红包上限为200元，请分多次领取。" );
				} 
 		   }
 		},'json');
 	
 	}
 	
 	function cha(){
		location.href = "${ctx}/wx/product.htm";
 	}
 	
 	function charge4Money(){
 		var kuser = '${kuser}';
 		var bdmoney = '${chargetomoney}';
	 	 $.ajax({
		    url:'${ctx}/wx/receiveRedPacktes4bd.htm?kuser='+kuser+'&bdmoney='+bdmoney,
            type: 'post',
            async: false,
            dataType: 'json',
            success: function (data) {
                   if ('' != data && data != null) {
	                 if (data.status != 'SUCCESS') {
	                     var maskh = $(document).height();
	                     $(".OpenBoxBg").show().css("height",maskh);
	                     showOpenBox();
    					 $(".OpenBox").show();
	                     $(".tsbtn1").hide();
	                     $(".tsbtn2").show();
	                     $(".context").html(data.message);
	                 } else {
	                     var maskh = $(document).height();
	                     $(".OpenBoxBg").show().css("height",maskh);
	                     showOpenBox();
    					 $(".OpenBox").show();
	                     $(".tsbtn1").hide();
	                     $(".tsbtn2").show();
	                     $(".context").html(data.message);
	                 }
	             	}
            }, error: function (e) {
                alert('系统错误');
            }
		 });
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
    		
    		$("#appbg").hide();
            $("#appBox").hide();
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
        
        
 	function reload(){
 		 window.location.reload(true);
 	}
 	function countBangbean(loginDay){
 		 if(loginDay==1){
 	   		bangbeanNum = 5;
 	   }else if(loginDay==2){
 	  	 	bangbeanNum = 7;
 	   }else if(loginDay>=3 &&loginDay<=10){
 	   		bangbeanNum = 10;
 	   }else if(loginDay>=11 &&loginDay<=30){
 	   		bangbeanNum = 20;
 	   }else{
 	   		bangbeanNum = 30;
 	   }
 	   return bangbeanNum;
 	} 
 	
 	
      //提示框
 	  function openWinApp(content){
        	$("#context").html(content);
    		var maskh = $(document).height();
		    $("#appbg").show().css("height",maskh);
    		showOpenBoxApp();
    		$("#appBox").show();
        }
 
     
     //关闭弹出窗口
     function colseShow(){
          $("#appbg").hide();
          $("#appBox").hide();
     }
        
     function showOpenBoxApp() {
      var objWin = $(window); //当前窗口
      var objOpenBox = $("#appBox"); //对话框
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
      //$("#appbg").height(brsH);//背景框 灰色 高度和窗口一致
    }
    $(window).resize(function() {//页面窗口大小改变事件
      if (!$("#appBox").is(":visible")) {
        return;
      }
      showOpenBoxApp(); //设置提示对话框的Top与Left
    });   
</script>
</head>

<body>
<header class="myPrice clearfix">
	<div class="bangDou lineMiddle">
    	<h2 class="priceTit">我的邦豆<p class="taskDetail"><a href="${ctx}/wx/billingDetails.htm"></a></p></h2>
        <p class="priceNum"><img src="${imageUrl}/bangd_icon.png" alt="邦豆" class="bangd_icon" />${taskLog.bangbeanNum}</p>
        
    </div>
    <div class="hongBao">
    	<h2 class="priceTit arrowDown">可兑换红包 <span class="arrowBtn"></span></h2>
        <p class="priceNum">${chargetomoney}元</p>
    </div>
    
    <#if chargetomoney?number lt 5>
    	<p class="exchange"><a href="#" class="disabled">兑换</a></p>
	<#else>
    	<p class="exchange"><a href="javascript:charge4()">兑换</a></p>
    </#if>
</header>
<div class="sc_txt changeDesc">不足5元无法兑换，按整数领取，400邦豆=1元。</div>
<article class="taskListBox">
	<h2>完成任务赢邦豆</h2>
    <ul class="taskList">
    	<li>
        	<div class="listCon clearfix">
                <p class="taskIcon dataIcon"></p>
                <div class="taskTxt">
                	<a href="${ctx}/wx/taskExplain.htm?tab=1">
                    <h3>每日签到</h3>
                    <p>
                    	已连续登陆${taskLog.loginDays!"1"}天，可领取
                    	<#if taskLog.loginDays == 1>
	                    	5
	                    <#elseif taskLog.loginDays == 2>
	                    	7
	                    <#elseif taskLog.loginDays gte 3 && taskLog.loginDays lte 10>
	                    	10
	                    <#elseif taskLog.loginDays gte 11 && taskLog.loginDays lte 30>
	                    	20
	                    <#else>
	                    	30
	                    </#if>
	                    	邦豆，<br />连续登陆每日可领取更多邦豆。
	                </p>
                    </a>
                </div>
                <p class="taskbar pad_t016">
                	<#if drawType == 1>
                		<a href="javascript:drawAjax(1)" id="lingqu" class="orangeBtn">领取</a>
                	<#else>
                			<span class="okIcon1"></span><br />
                	</#if>	
                </p>
            </div>
            <div class="clearfix listCon divideLine">
            	<p class="taskIcon dataIcon1"></p>
                <div class="taskTxt">
                	<a href="${ctx}/wx/taskExplain.htm?tab=2"> 
                    <h3>每日分享</h3>
                    <p>每产生一次有效分享便可获得5邦豆，<br />每日由于分享获得的邦豆上限为1000！</p>
                    </a>
                </div>
            	<#if lanNum == 0 >
            		<p class="taskbar pad_t016">
            			<a href="javascript:cha(1)" class="orangeBtn">去分享</a>
            		</p>
            	<#else>
            	 	<p class="taskbar pad_t06">
	                    <span class="okIcon1"></span><br />
	                    <span class="smallTxt">${lanNum!""}次有效分享</span>
                    </p>
                </#if>
            </div>
        </li>
    </ul>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
<!--弹出内容框-->
<div class="OpenBoxBg"></div>
<div class="OpenBox">
    
    <div class="context"></div>
    <div class="bottomBar2 tsbtn1"><a href="javascript:charge4Money();" class="btn2 rline">领取</a><a href="" class="btn2">取消</a></div>
    <div class="bottomBar2 tsbtn2" style="display:none;"><a href="javascript:reload();" class="ClosePrompt btn2">我知道了</a></div>

</div>


<!--弹出框-->
<div class="OpenBoxBg" id="appbg"></div>
<div class="OpenBox" id="appBox">
    <div class="context" id="context"></div>
    <div class="bottomBar2 tsbtn1"><a id="appqd" href="javascript:colseShow();" class="btn2">确定</a></div>
</div>
</body>
</html>