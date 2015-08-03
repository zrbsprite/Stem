<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>我的积分</title>

<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css"/>

<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css"/>
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/form.js"></script>
<script type="text/javascript" src="${jsUrl}/iscroll.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>

<script type="text/javascript" >
	 var date = "";
	 var currentPage = 1;
	 $(document).ready(function () {
	 		$.ajax({
			         url: ctx + "/wx/score/queryScore.htm",
			         type: 'post',
			         dataType: 'json',
			         success: function (data) {
			 			var latelyScore ;
				         var sumScore  ;
			 			if(data == null ){
			 				latelyScore = 0.00;
			 				sumScore = 0.00;
			 				dayScore = 0.00
		 				}else{
		 					//latelyScore = data.latelyScore * 1; 
		 					//sumScore = data.sumScore * 1;
		 					dayScore = data.dayScore * 1;
		 				}
					         //$("#latelyScore").html(latelyScore.toFixed(2));
					         //$("#sumScore").html(sumScore.toFixed(2));
					         $("#dayScore").html(dayScore.toFixed(2));
					         
			         },
			         error: function () {
			             alert('系统错误');
			         }
			     });
	     loadOrder("");
	     $("#nextScore").click(function () {
	         loadNextOrder();
	     });
	     $("#dateSelect li").click(function () {
	    	 currentPage=1;
	         date = $(this).attr("id");
	         $("#scoreUl").html("");
	         loadOrder(date);
	     });
	 });
	 
	
	 var pageSize = 12;
	 var ctx = "${ctx}";
	 //v1 产品名称    v2订单创建时间       v3订单金额   v4订单渠道  v5保单号   
     //v6投保人姓名     v7产品提成费率         v8产品编号    v9第三方合作订单积分 v10 订单编号
	 function building(v1, v2, v3, v4,v5,v6,v7,v8,v9,v10) {
	 		//alert("v1:"+v1+"v2:"+v2+"v3:"+v3+"v4:"+v4+"v5:"+"v6:"+v6+"v7:"+v7+"v8:"+v8+"v9:"+v9+"v10:"+v10);
	 	var countScore=null ;
	 	if("" == v7 || v7 == "0"){
	 		//成都农商行数据
	 		if(v8 != null && (v8.indexOf('ZFG14') > -1 || v8.indexOf('ZFG15') > -1 || v8.indexOf('ZFG16') > -1)){
	 			countScore = v9;
	 		}else if(v8 != null && (v8 =="SJ001")){//世纪证券数据
	 			countScore = v9;
	 		}else if(v8 == "YQHYZC"){
	 		    countScore = 5;
	 		    countScore = countScore.toFixed(2);
	 		}else{
	 			countScore = 0 ;
	 			countScore = countScore.toFixed(2);
	 		}
	 	}else{
	 		if(v8 != null && (v8.indexOf('ZFG14') > -1 || v8.indexOf('ZFG15') > -1 || v8.indexOf('ZFG16') > -1)){
	 			countScore = v9;
	 		}else{
	 			countScore = v7 * v3 ;
	 			countScore = countScore.toFixed(2);
	 		}
	 	}
	 
	 	var year = v2.substring(0,v2.indexOf(" "));
	 	var hour = v2.substring(v2.indexOf(" "),v2.length);
	     if (v4 == '2') {
	    	 if(v8 != null && (v8.indexOf('ZFG14') > -1 || v8.indexOf('ZFG15') > -1 || v8.indexOf('ZFG16') > -1)){
	    		 return "<li><p><span class='l'>订单 "+v10+"</span>"+
					"<span class='r'>保费:"+v3+"</span>"+
					"<span class='m'><img src='/assets/wxdgid/images/icon_weixin.png' /></span>"+
					"</p><table><tr>"+
					"<td width='40%' class='l1'>"+v1+"</td>"+
					"<td width='20%'></td>"+
					"<td width='25%'>"+year+"<br />"+hour+"</td>"+
					"<td width='15%'><span>"+countScore+"</span></td>"+
					"</tr></table>"+
					"</li>";
	    	 }else if( v8 != null && v8=="SJ001" ){
	    		 return "<li><p><span class='l'>订单 "+v10+"</span>"+
					"<span class='r'>保费:"+v3+"</span>"+
					"<span class='m'><img src='/assets/wxdgid/images/icon_weixin.png' /></span>"+
					"</p><table><tr>"+
					"<td width='40%' class='l1'>"+v1+"</td>"+
					"<td width='20%'></td>"+
					"<td width='25%'>"+year+"<br />"+hour+"</td>"+
					"<td width='15%'><span>"+countScore+"</span></td>"+
					"</tr></table>"+
					"</li>";
	    	 }else if(v8 == "YQHYZC"){
	    	        return "<li><p><span class='l'>邀请注册 "+v5+"</span>"+
					"<span class='r'></span>"+
					"<span class='m'><img src='/assets/wxdgid/images/icon_weixin.png' /></span>"+
					"</p><table><tr>"+
					"<td width='40%' class='l1'>"+v1+"</td>"+
					"<td width='20%'>"+v6+"</td>"+
					"<td width='25%'>"+year+"<br />"+hour+"</td>"+
					"<td width='15%'><span>"+countScore+"</span></td>"+
					"</tr></table>"+
					"</li>";
	    	 }else{
	    		 return "<li><p><span class='l'>保单号 "+v5+"</span>"+
					"<span class='r'>保费:"+v3+"</span>"+
					"<span class='m'><img src='/assets/wxdgid/images/icon_weixin.png' /></span>"+
					"</p><table><tr>"+
					"<td width='40%' class='l1'>"+v1+"</td>"+
					"<td width='20%'>"+v6+"</td>"+
					"<td width='25%'>"+year+"<br />"+hour+"</td>"+
					"<td width='15%'><span>"+countScore+"</span></td>"+
					"</tr></table>"+
					"</li>";
	    	 }
	         
	     } else  if(v8 == "YQHYZC"){
	    	        return "<li><p><span class='l'>邀请注册 "+v5+"</span>"+
					"<span class='r'></span>"+
					"<span class='m'><img src='/assets/wxdgid/images/icon_weixin.png' /></span>"+
					"</p><table><tr>"+
					"<td width='40%' class='l1'>"+v1+"</td>"+
					"<td width='20%'>"+v6+"</td>"+
					"<td width='25%'>"+year+"<br />"+hour+"</td>"+
					"<td width='15%'><span>"+countScore+"</span></td>"+
					"</tr></table>"+
					"</li>";
	    	 }else{
	                return "<li><p><span class='l'>保单"+v5+"</span>"+
					"<span class='r'>保费:"+v3+"</span>"+
					"<span class='m'></span>"+
					"</p><table><tr>"+
					"<td width='40%' class='l1'>"+v1+"</td>"+
					"<td width='20%'>"+v6+"</td>"+
					"<td width='25%'>"+year+"<br />"+hour+"</td>"+
					"<td width='15%'><span>"+countScore+"</span></td>"+
					"</tr></table>"+
					"</li>";      		 
	     }
	 }

	 function loadOrder(date) {
	     $.ajax({
	         url: ctx + "/wx/score/list.htm?pageSize=" + pageSize + "&currentPage=" + currentPage+ "&queryDate=" + date,
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
	     	loadOrder(date);
	 }
	 //添加数据
	 function appendData(datas) {
	     if (datas != null && datas.length != 0) {
	         for (var i = 0; i < datas.length; i++) {
	             var o = datas[i];
	             $("#scoreUl").append(building(o.productName, o.guaranteeTime, o.guaranteeMoney, o.channel,o.guarantee_slip_no,o.policier_name,o.productRate,o.productNo,o.orderScore,o.orderId));
	         }
	         $('#gotop').show();
			  if(datas.length<12){
			  		$("#nextScore").hide();
	          }else{
	          		$("#nextScore").html("点击加载更多...");
	          		$("#nextScore").show();
	          }
	         //$("#nextScore").html("点击加载更多...<img src='${imageUrl}/icon_arr.png' id='gotop' />")
	     } else {
	    	 if(currentPage != 1){
         		alert('没有更多数据!');
         	}else{
         		//$("#scoredetail").hide();
         		$('#gotop').hide();
         		$("#nextScore").html("对不起，你还没有订单！");
         		$("#nextScore").show();
         	}
	     }
	 }
	 
	 

</script>
<script>
  //订单列表页面
  $(document).ready(function(){
      $("#orderList").click(function(){
         window.location.href="${ctx}/wx/order.htm";
      });
  });
</script>
</head>

<body>

<article class="sc_num pr">
	<a href="http://mp.weixin.qq.com/s?__biz=MjM5ODA1NTkyMA==&mid=201029887&idx=1&sn=b339629d8f3ca83b397d85207d131c46&key=5814e98814c7ba4fe8b22b48ebae9dd4732302a67227128d71249dcfb8ad2c0189b1bc8d6348aa86c13d18beffc37865&ascene=1&uin=MTU2ODY3NzIwMA%3D%3D&devicetype=webwx&version=70000001&pass_ticket=MyHOjqZvtKzoJps1oqIDV6CXA0mVVR9XmUengDJkBWVKxSqf359V9r%2FuYTtZbWmJ" class="link">?</a>
	<p class="bg"><span class="red" id = "dayScore"></span>&nbsp;&nbsp;&nbsp;<img id="orderList" title="订单" src="/assets/wap/inviteRegedit/images/task_detail.png" id="newJf" /><br /><a href="javascript:void(0);" id="newJfbtn">今日新增积分 <img src="/assets/wxdgid/images/icon_up_arr.png" id="newJf" /></a></p><!--
	--><!--<p><span class="blue" id = "sumScore"></span><br /><a href="javascript:void(0);" id="jfbtn">累计积分 <img src="/assets/wxdgid/images/icon_up_arr.png" id="jf" /></a></p>-->
	<a class="ubtn blueBtn2" href="${ctx}/wx/getOpenidByOauth.htm" >积分兑换</a>
	</article>
	
	<article class="sc_txt" id="newJfCon" style="display:none;">今日支付成功的订单预计可获得的积分数</article>
	<article class="sc_txt" id="jfCon" style="display:none;">累计积分：累计使用本系统出单成功支付的保单产生的积分。</article>

	<!--
		<article class="sc_txt_b pr" id="scoredetail">积分明细
		<div class="sc_select">
			<div class="sc_select_arr"></div>
			<div class="textSel selBox" id = "selectText" >全部</div>
			<ul class="selList clearfix seloptionList" id = "dateSelect">
				<li id = "">全部</li>
				<li id = "week">近一周</li>
				<li id = "month">近一月</li>
			</ul>
		</div>
	-->
</article>

<article class="orderForm pad_t0">
	<ul class="scoreUl" id="scoreUl">
        
    </ul>
    <!-- <div class="gotop" id="nextScore"></div> -->
    <div class="gotop"><span id="nextScore">点击加载更多...</span><img src="${imageUrl}/icon_arr.png" id="gotop" /></div>

</article>
	<#include "/WEB-INF/content/wxdgid/footer.ftl"/>

</body>
</html>