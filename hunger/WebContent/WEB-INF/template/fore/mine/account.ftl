<#include "/commons/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<title>帐号</title>

<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/wxNaturalManPage.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/wxNaturalManStyle.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="${basepath}/assets/group/fore/css/page.css" />
</head>
<body>
<#assign menuval = '4'>
<article class="u_info clearfix">
    <div class="u_info_pic">
		<img src="${basepath}/assets/group/fore/images/ab_group.png" /><#-- 个人头像 -->
	</div>
    <div class="u_info_txt">
   		<div> 
			${name?default("张日波")}<span class="sh"><#--用户状态--></span>
			<br/>
		    积分：<span>${score?default(0)}</span>
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
    <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_03.png" class="t1" />修改密码</a><a href=""><img src="${basepath}/assets/group/fore/images/icon_u_04.png" class="t2" />帮助中心</a>
    <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_01.png" class="t1" />我的积分</a><a href=""><img src="${basepath}/assets/group/fore/images/icon_u_05.png" class="t2" />积分兑换</a>
    <#-- <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_02.png" class="t1" />排行榜&nbsp;&nbsp;&nbsp;</a><a href="" class="yellow"><img src="${basepath}/assets/group/fore/images/icon_u_06.png" class="t3" style="margin-top:-5px;" />做任务，得邦豆</a> -->
    <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_01.png" class="t1" />购物车&nbsp;&nbsp;&nbsp;&nbsp;</a><a href=""><img src="${basepath}/assets/group/fore/images/icon_u_05.png" class="t2" />我的订单</a>
    <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_01.png" class="t1" />馋吧会员</a><a href=""><img src="${basepath}/assets/group/fore/images/icon_u_05.png" class="t2" />馋吧订单</a>
    <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_01.png" class="t1" />赚吧会员</a><a href=""><img src="${basepath}/assets/group/fore/images/icon_u_05.png" class="t2" />花吧订单</a>
    <a href=""><img src="${basepath}/assets/group/fore/images/icon_u_01.png" class="t1" />意见反馈</a><a href=""><img src="${basepath}/assets/group/fore/images/icon_u_05.png" class="t2" />版本升级</a>
    <div class="u_link_icon u_link_bg6"></div>
</article>
    

<article class="wrapper">
	    <div class="u_warning">好消息！任务系统惊喜上线，做任务即可得邦豆兑换红包，快去看看吧！</div><#-- 消息中心 -->
</article>

<#include "/commons/footer.ftl"/>

<#include "commons/commonJS.ftl"/>
</body>
</html>
