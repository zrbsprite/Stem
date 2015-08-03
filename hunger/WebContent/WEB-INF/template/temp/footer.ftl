<#if type?? && status?? && type =="6" && status != "1">
<#else>
<nav class="botNav">
	<div class="botTab">
        <a href="${basepath}/wx/userScore.htm" <#if menuval=="1">class="current"</#if>>积分</a>
		<a href="${basepath}/wx/doTheTask.htm" <#if menuval=="2">class="current"</#if>>邦豆</a>
        <a href="${basepath}/wx/product.htm" <#if menuval=="3">class="current"</#if>>产品</a>
        <a href="${basepath}/wx/account.htm" <#if menuval=="4">class="current"</#if>>帐号</a>
    </div>
</nav>
</#if>
<script language="JavaScript" src="${basepath}/assets/wxdgid/js/m_code_weixin.js"></script>