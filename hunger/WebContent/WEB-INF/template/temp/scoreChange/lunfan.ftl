<!-- banner开始 -->
<div class="slider">
	<ul>
		
		<#if type == "3">
			<li><a href="${ctx}/wx/scorerank.htm" target="_blank"><img src="${ctx}/assets/wxdgid/images/cdrcb/cdrcb.jpg" alt=""></a></li>
		</#if>
		<#if type== "4">
			<li><a href="${ctx}/wx/scorerank.htm" target="_blank"><img src="${ctx}/assets/wxdgid/images/cdrcb/cdrcb.jpg" alt=""></a></li>
		</#if>
	    <!--<li><a href="${ctx}/wx/employeescore.htm" target="_blank"><img src="${ctx}/assets/wxdgid/images/lunFan/youlun3.jpg" alt=""></a></li>-->
	    <li><a href="${ctx}/wx/getTaskOpenidByOauth.htm" target="_blank"><img src="${ctx}/assets/wxdgid/images/lunFan/bangdou_640x143.gif" alt=""></a></li>
		<!--<li><a id="CSWY" target="_blank"><img src="${ctx}/assets/wxdgid/images/lunFan/bangdou2_640x143.gif" alt=""></a></li>-->
	</ul>
</div>
<script>
	$(".slider").yxMobileSlider({width:640,height:143,during:3000});
	$(document).ready(function(){
        $("#CSWY").click(function(){
           var str='20006';
           doAjax(str);
        });
        
        function doAjax(str){
           $.post('${ctx}/wx/product/queryLunFanViewInfo.htm',{'str':str},function(data){
		       var productId = data;
		       if("error"==data){
		          alert("数据异常，请联系管理员！");
		          return;
		       }else
		       if(''==data||null==data){
		         alert("系统异常，请联系管理员！");
		         return;
		       }else{
		       window.location.href="${ctx}/wx/product/datil.htm?productId="+productId+"&kuser=${kuser!""}";
		       }
		   });
        }
	});
</script>
<!-- banner结束 -->