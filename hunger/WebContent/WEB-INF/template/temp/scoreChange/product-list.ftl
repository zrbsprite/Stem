<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>产品列表</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/activeWindow.css" />

<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${jsUrl}/yxMobileSlider.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
<script type="text/javascript">
 $(document).ready(function(){
    var $prompt = ${prompt};
   // if(3==$prompt){
   //   $('body').css("overflow","hidden");
   // }
	//查看活动弹窗详细信息
    $("#activeImg").click(function(){
        // var url = "${request.getContextPath()}/wx/product/activeDetailInfo.htm";
        // doAjax('find',url);
    });
    //关闭活动弹窗   
    $("p[class='imgCloseBtn']").click(function(){
         var url = "${request.getContextPath()}/wx/product/closeActiveDetailInfo.htm";
         doAjax('close',url);
    });   
       
    function doAjax(param,url){
         $.post(url,{'param':param},function(data){
            if('error'==data.msg){
               alert("系统发生异常！");
               return false;
            }
              if("find"==data.param){
                 window.location.href = data.address;
              }
              if("close"==data.param){
                 window.location.href = "${request.getContextPath()}/wx/product.htm?prompt="+data.prompt+"&isShows="+data.isShows;
              }
               $("div[class='OpenTsBg']").hide();
               $("div[class='guideImg openLayer']").hide();
            });
    }
    
    //点击浮层跳转到活动页面
    $("#lyaer").click(function(){
      // var url = "${request.getContextPath()}/wx/toDetailPage.htm";
       //$.post(url,{},function(data){
       //  window.location.href = data.address;
       //});
    });
    
    //关闭浮层
    $("#closeBtn").click(function(){
       var url = "${request.getContextPath()}/wx/product/closeFuCeng.htm";
       $.post(url,{},function(data){
         if('error'==data.msg){
             alert("系统发生异常！");
             return false;
         }
         window.location.href = "${request.getContextPath()}/wx/product.htm?prompt="+data.prompt+"&isShows="+data.isShows;
         $("p[class='topLayer clearfix']").hide();
       });
    });
    
    //新手引导
    $("#newLead").click(function(){
         window.location.href = "http://mp.weixin.qq.com/s?__biz=MjM5ODA1NTkyMA==&mid=201029887&idx=1&sn=b339629d8f3ca83b397d85207d131c46&key=5814e98814c7ba4fe8b22b48ebae9dd4732302a67227128d71249dcfb8ad2c0189b1bc8d6348aa86c13d18beffc37865&ascene=1&uin=MTU2ODY3NzIwMA%3D%3D&devicetype=webwx&version=70000001&pass_ticket=MyHOjqZvtKzoJps1oqIDV6CXA0mVVR9XmUengDJkBWVKxSqf359V9r%2FuYTtZbWmJ";
         $("p[class='topLayer clearfix']").hide();
    });
    
    $("#newLeadBtn").click(function(){
         $("p[class='topLayer clearfix']").hide();
    });
 });
</script>
</head>

<body>
<!--活动浮层-->
<#if isShows == 'YES'>
<div class="topLayer clearfix">
	<p class="lyaerTxt" id="lyaer" align="center">4月11日22点至4月12日凌晨3点进行系统维护</p>
    <p class="closeBtn" id=""></p>
</div>
</#if>
<!--新手引导-->
<#if prompt == '0'>
<div class="topLayer clearfix">
	<p class="lyaerTxt" id="newLead">恭喜您成功登陆数字营销平台，点此了解营销平台使用帮助>></p>
    <p class="closeBtn" id="newLeadBtn"></p>
</div>
</#if>
<input type="hidden" value="listwxProductBean"/>
<!--轮番图 start-->
<#include "/WEB-INF/content/wxdgid/scoreChange/lunfan.ftl"/>
<!--轮番图 end-->
<article class="wrapper">
	<ul class="proUl">
		<#list listwxProductBean as productBean>
	        <li>
	            <h2 class="pr">
	            	${productBean.productName}
	            	<#if productBean.productStatus??>
	            		<#if (productBean.productStatus)?trim == "1">
		            		<img src="${imageUrl}/hot.gif" />
		            	</#if>
		            	<#if (productBean.productStatus)?trim == "2">
		            		<img src="${imageUrl}/new.gif"/>
		            	</#if>
		            	<#if (productBean.productStatus)?trim == "3">
	            		<img src="${imageUrl}/hot.gif" /><img src="${imageUrl}/new.gif"/>
	            	</#if>
	            	</#if>
	            	
	            	<#if productBean.shareUrl??>
	            		<a href="${productBean.shareUrl}?productId=${productBean.id}"></a>
	            	</#if>
	            </h2>
	            <div class="pic clearfix">
	            	<#if productBean.listImage??>
	            		<a href="${ctx}/wx/product/datil.htm?productId=${productBean.id}&kuser=${kuser!""}&sourcesType=${sourcesType!""}">
	            			<img src="/uploadFile/${productBean.listImage}" />
	            		</a>
	            	</#if>
	                <p>
	                	<#if productBean.productIntroduce1??>${productBean.productIntroduce1}<br /></#if>
	                	<#if productBean.productIntroduce2??>${productBean.productIntroduce2}<br /></#if>
	                	<#if productBean.productIntroduce3??>${productBean.productIntroduce3}<br /></#if>
	                	<#if productBean.productIntroduce4??>${productBean.productIntroduce4}<br /></#if>
	                	<#if productBean.productIntroduce5??>${productBean.productIntroduce5}<br /></#if>
	                	<#if productBean.scoreStandard??>${productBean.scoreStandard}<br /></#if>
	                	<#if productBean.futuresExchange??>${productBean.futuresExchange}<br /></#if>
	                </p>
	            </div>
	            <#if (productBean.productActivityList?size>0)>
	            	<p class="tin_5">
	            		<span>当前活动：</span>
	            		<#list productBean.productActivityList as productActivityList>
	            		
	            			<#if productActivityList.activityUrl?? >
		            			<#if productActivityList.activityUrl?ends_with(".htm")?string == "true">
		            				<a href="${productActivityList.activityUrl}?productId=${productBean.id}&kuser=${kuser!""}" style="color:#1A8DE3">${productActivityList.activityName}>></a><br/>
		            			<#else>
		            				<a href="${productActivityList.activityUrl}&productId=${productBean.id}&kuser=${kuser!""}" style="color:#1A8DE3">${productActivityList.activityName}>></a><br/>
		            			</#if>
	            			<#else>
	            				<a>${productActivityList.activityName!""}</a><br/>
	            			</#if>
	            		</#list>
	            	</p>
	            </#if>
	            <#if productBean.trendsUrl??>
		            <div class="btnline clearfix">
			            <a href="${ctx}/wx/product/datil.htm?productId=${productBean.id}&kuser=${kuser!""}" class="fl btn c1 fs08">产品介绍（静态）</a>
			            <a href="${productBean.trendsUrl}?productId=${productBean.id}&kuser=${kuser!""}" class="fr btn c2 fs08">产品介绍（动态）</a>
			        </div>
		        <#else>
			        <div class="btnline clearfix">
		                <a href="${ctx}/wx/product/datil.htm?productId=${productBean.id}&kuser=${kuser!""}&sourcesType=${sourcesType!""}" class="btn c3">产品介绍</a>
					</div>
				</#if>
	        </li>
        </#list>
    </ul>

  <!--  <a href="${ctx}/wx/employeescore.htm" class="btn redBtn">慧理财1号积分排行榜</a> -->

</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
<!--弹出内容框-->
<!--<#if prompt == '0'>
<div class="OpenTsBg tsclose" style="display:block;"></div>
<div class="openTs tsclose"><img src="${imageUrl}/pic_ts.png" /></div>
</#if>-->
<!--
<#if prompt == '3' && isShows == 'YES'>
<div class="OpenTsBg" style="display:block;"></div>
<div class="guideImg openLayer">
	<img src="${imageUrl}/daonian1.jpg" id="activeImg"/>
    <p class="imgCloseBtn"><a>关闭<a></p>
</div>
</#if>-->
<#if prompt == '1' && type == '1'>
<!--弹出内容框-->
<div class="OpenTsBg" style="display:block;"></div>
<div class="guideTxt"><img src="/assets/wxdgid/images/guide_txt1.png" /></div>
<div class="navClickCon"><a href="${ctx}/wx/account.htm">帐号</a></div>
</#if>
</body>
</html>
