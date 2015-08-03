<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, user-scalable=no">
<meta name="format-detection" content="telephone=no" >
<link rel="stylesheet" media="screen" href="${request.getContextPath()}/assets/wxdgid/css/secu_style.css" />
<script type="text/javascript" src="${request.getContextPath()}/assets/wxdgid/js/jquery-1.7.2.min.js"></script>
<script>
  $(document).ready(function(){
	  var openId = "${openId!''}";
	  $.post('${request.getContextPath()}/wx/returnCarTicketActiveCode.htm',{"openId":openId},function(data){
	     if(data.status=="FAIL"){
	        alert(data.message);
	     }
	     if(data.status=="SUCCESS"){
	        $("#randomCode").append(data.message);
	     }
	  },'json');
  });
</script>
<title>专车券活动</title>
</head>
<body>

<article class="secuDrt">
    <div class="secuDa">数字营销请您坐专车</div>
    <div class="secuDb">您的价值15元滴滴一号专车券的兑换码为：</div>
    <div class="secuDc" id="randomCode"></div>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <div class="secuDf">
    	<h2 class="secuDg">温馨提示：</h2>
        <h2 class="secuDg">1.兑换时间：7月1号-7月31号;<br/></h2>
        <h2 class="secuDg">2.使用有效期：自兑换之日起15天内使用有效;<br/></h2>
        <h2 class="secuDg">3.代金券兑换流程：<br/></h2>
        <h1 class="secuDg">    (1)下载一号专车APP，安装<br/></h1>
        <h1 class="secuDg">    (2)在APP内输入兑换码兑换</h1>
    </div>
</article>

</body>
</html>
