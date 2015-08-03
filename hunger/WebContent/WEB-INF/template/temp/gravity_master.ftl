<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>分享达人榜</title>
<meta name="viewport" content="initial-scale=1, width=device-width,user-scalable=no">
<link href="${cssUrl}/public.css" type="text/css" rel="stylesheet" />
<link href="${cssUrl}/top.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
</head>

<script type="text/javascript" >
	 var currentPage = 1;
	 $(document).ready(function () {
	     loadMore();
	     $("#loadMore").click(function () {
	         loadNextMore();
	     });
	    if($("#productName").html().length < 10){
	    	$("#productName").css({"left":"2%","text-align":"center","width":"100%"});
	    }else{
	    	$("#productName").css({"left":"32%","text-align":"left"});
	    }
	 });
	 
	
	 var pageSize = 20;
	 var ctx = "${ctx}";
	 //v1 排行    v2userName       v3 userCode  v4吸引力  
	 function building(v1, v2, v3, v4) {
	 v3 = v3.substr(0,2)+"***"+v3.substr(v3.length-1,v3.length);
	    	 if(v1 == "1"){
	    		 return "<tr><td width='16%'><p class='oneIcon'></p></td>"+
	                "<td width='60%' class='unline'><span class='f2'>" + v2 + "</span>（" + v3 + "）</td>"+
	                "<td width='24%' class='num unline'>" + v4 + "</td></tr>";
	    	 }else if(v1 == "2"){
	    		 return "<tr><td><p class='twoIcon'></p></td>"+
	                "<td class='unline'><span class='f2'>" + v2 + "</span>（" + v3 + "）</td>"+
	                "<td class='num unline'>" + v4 + "</td></tr>";
	    	 }else if(v1 == "3"){
		    	 return "<tr><td><p class='threeIcon'></p></td>"+
		                "<td class='unline'><span class='f2'>" + v2 + "</span>（" + v3 + "）</td>"+
		                "<td class='num unline'>" + v4 + "</td></tr>";
	    	 }else{
		    	 return "<tr><td><p class='numBg'>" + v1 + "<span class='numArrow'></span></p></td>"+
			                "<td class='unline'><span class='f2'>" + v2 + "</span>（" + v3 + "）</td>"+
			                "<td class='num unline'>" + v4 + "</td></tr>";
	    	 }
	 }
	 var rankedNumber;
	 function loadMore() {
	 	var startTime = $("#startTime").html();
	 	var endTime = $("#endTime").html();
	 	rankedNumber = $("#rankedNumber").html();
	 	var productNo = $("#productNo").val();
	     $.ajax({
	         url: ctx + "/wx/gravityMaster/list.htm",
	         data:{"pageSize":pageSize,
	         	   "currentPage":currentPage,
	         	   "startTime":startTime,
	         	   "endTime":endTime,
	         	   "rankedNumber":rankedNumber,
	         	   "productNo":productNo
	         },
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
	 function loadNextMore() {
	     currentPage = currentPage + 1;
	     	loadMore();
	 }
	 //添加数据
	 function appendData(datas) {
	 var rankedNoPage = rankedNumber/20;
	     if (datas != null && datas.length != 0) {
	         for (var i = 0; i < datas.length; i++) {
	             var o = datas[i];
	             $("#topListTbl").append(building(o.rownums, o.name, o.phone, o.gravityMasterNum));
	         }
			  if(datas.length<20 || rankedNoPage == currentPage){
			  		$("#loadMore").hide();
	          }else{
	          		$("#loadMore").html("点击加载更多...");
	          		$("#loadMore").show();
	          }
	         //$("#loadMore").html("点击加载更多...<img src='${imageUrl}/icon_arr.png' id='gotop' />")
	     } else {
	    	 if(currentPage != 1){
         	}else{
         		//$("#scoredetail").hide();
         		$('#gotop').hide();
         		$("#loadMore").html("对不起，你还没有排行！");
         		$("#loadMore").show();
         	}
	     }
	 }
</script>



<body>
<header class="topBanner">
<input type="hidden" name="productNo" id="productNo" value="${productNo!""}" />
	<div class="topDesc clearfix">
    	<dl class="clearfix">
        	<dt>活动内容：</dt>
            <dd>分享达人榜，比比谁的分享能吸引最多的点击量（同一好友每天最多只算一次点击）</dd>
        </dl>
        <dl class="clearfix">
        	<dt>活动时间：</dt>
        	<#if startTime?? || endTime??>
        		<dd><span name="startTime" id="startTime">${startTime!""}</span>~<span name="endTime" id="endTime">${endTime!""}</span></dd>
        	<#else>
        			<dd><span name="startTime" id="startTime"></span>长期有效。<span name="endTime" id="endTime"></span></dd>
        	</#if>
            
        </dl>
    </div>
    <div class="topTit">
    	<h1 id="productName">${productName!"达人总排行榜"}</h1>
        <p class="topNum" name="rankedNumber" id="rankedNumber">${rankedNumber!"20"}</p>
    </div>
</header>
<article class="topBg">
	<div class="topListBox">
    	<ul class="topListTit">
        	<li class="ranked">排名</li>
            <li class="staff">推荐人</li>
            <li class="num">点击量</li>
        </ul>
        <table class="topListTbl" id = "topListTbl">
        </table>
        	<div class="loadMore" id="loadMore"></div>
    </div>
</article>
</body>
</html>
