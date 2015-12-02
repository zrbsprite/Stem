<#assign currentPage=page.pageNum>
<#assign total=page.total>
<#assign pages=page.pages>
<#assign previouspage=currentPage-1>
<#assign nextpage=currentPage+1>
<div class="pull-right">
	<ul class="pagination">
	<li><span>共 ${total?default(0)} 条记录&nbsp;&nbsp;<#if pages gt 0>${currentPage?default(0)}<#else>0</#if>/${pages?default(0)} 页</span></li>
	<#if currentPage gt 1>
	<li><a href="javascript:void(0);" onclick="page(1);">首页</a></li>
	</#if>
	<#if previouspage gt 1>
	<li><a href="javascript:void(0);" onclick="page(${previouspage});">上一页</a></li>
	</#if>
	<#assign prevThree=(currentPage-3)>
	<#if prevThree gt 0>
	<li><a href="javascript:void(0);" onclick="page(${prevThree});">${prevThree}</a></li>
	</#if>
	<#assign prevTwo=(currentPage-2)>
	<#if prevTwo gt 0>
	<li><a href="javascript:void(0);" onclick="page(${prevTwo});">${prevTwo}</a></li>
	</#if>
	<#assign prevOne=previouspage>
	<#if (prevOne gt 0) && (prevOne lt currentPage)>
	<li><a href="javascript:void(0);" onclick="page(${prevOne});">${prevOne}</a></li>
	</#if>
	<#if (currentPage gt 0) && (pages gt 0)>
	<li class="active"><span>${currentPage} <span class="sr-only">(current)</span></span></li>
	</#if>
	<#assign nextOne=nextpage>
	<#if (nextOne gt currentPage) && (nextOne lt (pages+1))>
	<li><a href="javascript:void(0);" onclick="page(${nextOne});">${nextOne}</a></li>
	</#if>
	<#assign nextTwo=(nextOne+1)>
	<#if nextTwo lt pages>
	<li><a href="javascript:void(0);" onclick="page(${nextTwo});">${nextTwo}</a></li>
	</#if>
	<#assign nextThree=(nextTwo+1)>
	<#if nextThree lt pages>
	<li><a href="javascript:void(0);" onclick="page(${nextThree});">${nextThree}</a></li>
	</#if>
	<#if nextpage lt pages>
	<li><a href="javascript:void(0);" onclick="page(${nextpage});">下一页</a></li>
	</#if>
	<#if currentPage lt pages>
	<li><a href="javascript:void(0);" onclick="page(${pages?default(1)});">最后一页</a></li>
	</#if>
</div>