<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>帐号</title>

<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManPage.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/wxNaturalManStyle.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css" />
</head>
<article class="u_info clearfix">
    <div class="u_info_pic">
		<img src="/assets/wxdgid/images/ab_group.png" />
	</div>
    <div class="u_info_txt">
   		<div> 
		    <#if type != "6" > ${name!""}<br/> </#if>
<!--	    <#if type == "6" && status == "4">${name!""}<span class="sh">(审核中)</span><br/> </#if>-->
		    <#if type == "6" && status == "1"&& name == "-"><input type='text' id="modifyname" class="inputName" value="请录入姓名 " onkeyup="checkname()" onblur="checkmodifyname();"><p class="inputName_tis"></p><p class="inputName_tisa"></p></#if>
		    <span><#if type != "5" >${kuser!""}</#if></span>
        </div>
    </div>
    <div class="clearfix"></div>
    <#-- 
    <div class="u_info_qd pr">
        <div class="u_select_btn selBox ShowChannel" id="selBox01"></div>
        <div class="u_select_btn selBox" id="selBox02" style="display:none;"></div>
        
        <div class="u_select_txt">所属渠道</div>
        <div class="u_select_arr"></div>
        <div class="u_textSel" id = "sourcesTypeText"></div>
        <ul class="u_selList optionList" id="sourcesType">
            <li lyid = '01' <#if sourcesType == "01" >class="active" </#if>>汽车渠道</li>
            <li lyid = '02' <#if sourcesType == "02" >class="active" </#if>>代理渠道</li>
            <li lyid = '03' <#if sourcesType == "03" >class="active" </#if>>银行渠道</li>
            <li lyid = '04' <#if sourcesType == "04" >class="active" </#if>>社区渠道</li>
            <li lyid = '05' <#if sourcesType == "05" >class="active" </#if>>法人渠道</li>
            <li lyid = '06' <#if sourcesType == "06" >class="active" </#if>>移动互联渠道</li>
            <li lyid = '07' <#if sourcesType == "07" >class="active" </#if>>政府渠道</li>
            <li lyid = '08' <#if sourcesType == "08" >class="active" </#if>>直销渠道</li>
            <li lyid = '09' <#if sourcesType == "09" >class="active" </#if>>门店渠道</li>
        </ul>
    </div>
    <div class="u_ts">提示：该设置将影响保单的归属渠道，请勿频繁修改！</div>
     -->
</article>


<article class="u_link pr">
    <a href="${ctx}/wx/account/password.htm"><img src="/assets/wxdgid/images/icon_u_03.png" class="t1" />修改密码</a>
    <a href=""><img src="/assets/wxdgid/images/icon_u_04.png" class="t2" />帮助中心</a>
    <a href="${ctx}/wx/userScore.htm"><img src="/assets/wxdgid/images/icon_u_01.png" class="t1" />我的积分</a>
    <a href="${ctx}/wx/getOpenidByOauth.htm"><img src="/assets/wxdgid/images/icon_u_05.png" class="t2" />积分兑换</a>
    <a href="${ctx}/wx/employeescore.htm"><img src="/assets/wxdgid/images/icon_u_02.png" class="t1" />排行榜&nbsp;&nbsp;&nbsp;</a>
    <a href="${ctx}/wx/getTaskOpenidByOauth.htm" class="yellow"><img src="/assets/wxdgid/images/icon_u_06.png" class="t3" style="margin-top:-5px;" />做任务，得邦豆</a>
    <div class="u_link_icon u_link_bg6"></div>
</article>
    

<article class="wrapper">
	    <div class="u_warning">好消息！任务系统惊喜上线，做任务即可得邦豆兑换红包，快去看看吧！</div>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
<!--弹出内容框-->
<div class="OpenBoxBg"></div>
<div class="OpenBox">
    
    <div class="context">修改后所出的单都将归属于该渠道，确认修改吗？</div>
    <div class="bottomBar2"><a href="javascript:void(0);" class="channelClose rline">确定</a><a href="javascript:void(0);" class="channelAllClose">取消</a></div>

</div>

<#include "commons/commonJS.ftl"/>
<script type="text/javascript">
	
</script>
</body>
</html>
