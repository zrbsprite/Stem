<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>邦豆明细</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" >
     var addMinus = "";
     var currentPage = 1;
	 var pageSize = 12;
	 var ctx = "${ctx}";
$(function(){
	 var $title = $(".tabTitlepayment li");
	$title.click(function(){
		$(this).addClass("current")
			 .siblings().removeClass("current");
		var index = $title.index(this);
		addMinus = index;
		currentPage = 1;
		$("#ListTbl").html("");
		loadMore(addMinus);
	});
	 loadMore(addMinus);
     $("#loadMore").click(function () {
         loadNextMore();
     });
});
	 //v1 详情名称     v2 详情备注        v3 创建时间  v4邦豆收入为1,邦豆支出为2  v5邦豆数量
	 function building(v1, v2, v3, v4 ,v5) {
		 if(v4 == 1){
		 	v4 = "+";
		 	return "<li class='clearfix  topLine'>"+
            		"<div class='taskCon'>"+
            			"<p class='taskName'>" + v1 + "<span class='grayTxt pad_l15'>" + v2 +"</span></p>"+
            			"<p class='grayTxt'>"+v3+"</p>"+
            		"</div>"+
            		"<p class='taskNum fOrange'>"+ v4 + v5 +"</p>"+
            	"</li>";
		 }else{
		 	v4 = "-";
		 	return "<li class='clearfix topLine'>"+
            		"<div class='taskCon'>"+
            			"<p class='taskName'>" + v1 + "<span class='grayTxt pad_l15'>" + v2 +"</span></p>"+
            			"<p class='grayTxt'>"+v3+"</p>"+
            		"</div>"+
            		"<p class='taskNum fGreen'>"+ v4 + v5 +"</p>"+
            	"</li>";
		 }
	 }
	 function loadMore(addMinus) {
	     $.ajax({
	         url: ctx + "/wx/billingList.htm",
	         dataType: 'json',
	         data:{"pageSize":pageSize,
	         	   "currentPage":currentPage,
	         	   "addMinus":addMinus
	         },
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
	 function loadNextMore() {
	     currentPage = currentPage + 1;
	     	loadMore(addMinus);
	 }
	 //添加数据
	 function appendData(datas) {
	     if (datas != null && datas.length != 0) {
	         for (var i = 0; i < datas.length; i++) {
	             var o = datas[i];
	             $("#ListTbl").append(building(o.detailName, o.detailRemark, o.createdTime, o.addMinus ,o.bangbeanNum));
	         }
	         if(currentPage != 1){
		         $('#gotop').show();
         	}else{
         		$('#gotop').hide();
         	}
	          if(datas.length<12){
			  		$("#loadMore").hide();
	          }else{
	          		$("#loadMore").html("点击加载更多...");
	          		$("#loadMore").show();
	          }
	     }else{
	     	if(currentPage != 1){
	     	
         	}else{
         		//$("#scoredetail").hide();
         		$('#gotop').hide();
         		$("#loadMore").html("暂无，完成任务即可赢邦豆。");
         		$("#loadMore").show();
         	}
	     } 
	 }
</script>
</head>

<body>
<article class="txtConBox">
	<ul class="paymentTit clearfix tabTitlepayment">
    	<li class="current">全部</li>
        <li>收入</li>
        <li>支出</li>
    </ul>
    <div class="conBox">
        <div class="taskBox tabCon">
            <ul id="ListTbl">
                
            </ul>
        </div><!-- /全部 end -->
        
    </div>
</article>

<article class="orderForm">
	<ul class="orderUl" id="orderUl">
	   
	</ul>
	<div class='gotop' ><span id="loadMore">点击加载更多...</span><img src='${imageUrl}/icon_arr.png' id='gotop' /></div>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
