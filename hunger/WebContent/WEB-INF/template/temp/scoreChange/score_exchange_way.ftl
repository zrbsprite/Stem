<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>提取积分－数字id</title>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/redPackage/page.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/redPackage/style.css" />
<script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
</head>
<script type="text/javascript">
        var ctx = "${ctx}";
        function updateUserReceiveType() {
        
           
        }

        $(document).ready(function () {
            $("#next").click(function () {
            	var receiveType = $("input[name='exchange']:checked").val(); 
            	alert(receiveType);
            	$.ajax({
                url: ctx + "/wx/updateUserReceiveType.htm",
                type: 'post',
                data: {receiveType:receiveType},
                dataType: 'json',
                success: function (data) {
                    if (data != '') {
                        if (data.status == 'success') {
                            window.location.href = ctx + "/wx/extractionIntegral.htm";
                         
                        } else {
                            alert(data.message);
                        }
                    }
                }, error: function (e) {
                    alert('系统出错!请联系管理员');
                }
            });
            	
            	
            });
        });
       
    </script>
<body class="greyBg">
<article class="wrapper mar_b1">
    <form>
        <div class="reg_bg">
        	<div class="reg_txt reg_txt_tit">请选择积分提取方式</div>
            <div class="reg_txt"><label><input type="radio" name="exchange" value="1" checked="checked" /> 随工资发放（默认）</label></div>
        	<div class="reg_txt bbn"><label><input type="radio" value="2" name="exchange" /> 领取微信红包</label></div>
    	</div>
    	<div class="reg_txt_sm">说明：<br />
1、该设置<span>只能选择一次</span>，以后都按所选方式发放；<br />
2、两种方式都会与工资合并计税；<br />
3、选择随工资发放，会由公司随您的工资一起直接发放；<br />
4、领取微信红包需要您登录数字营销平台后手动领取，且受微信规则限制；每个红包最多只有200元，每天最多可领取2次，每月最多可领取10次；领取红包后请及时打开并转入微信钱包，否则红包会被系统会自动退回，<span>不再补发</span>。
</div>
    <input type="button" id = "next" class="btn blueBtn2 ShowPrompt" value="下一步" />
    </form>
</article>

<!--弹出内容框-->
<div class="OpenBoxBg"></div>
<div class="OpenBox">
    
    <div class="context">当前默认按工资发放，提取方式只能更改一次，请仔细查看说明，您确定要选择领取微信红包方式吗？（设置后下期生效）</div>
    <div class="bottomBar2"><a href="score_exchange.html" class="ClosePrompt rline">确定</a><a href="javascript:void(0);" class="ClosePrompt">取消</a></div>

</div>
</body>
</html>
