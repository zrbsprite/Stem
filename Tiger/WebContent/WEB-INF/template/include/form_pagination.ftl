<div class="cLine">
	<div class="pageNavigator right">
	<#assign currentPage=page.currentPage>
	<#assign total=page.total>
	<#assign pages=page.pages>
	<#assign previouspage=page.previouspage>
	<#assign nextpage=page.nextpage>
		<div class="pages">
			共 ${total?default(0)} 条记录 <#if pages gt 0>${currentPage?default(0)}<#else>0</#if>/${pages?default(0)} 页 
			<#if currentPage gt 1>
			<a href="javascript:void(0);" onclick="page(1);">首页</a>
			</#if>
			<#if previouspage gt 1>
			<a href="javascript:void(0);" onclick="page(${previouspage});">上一页</a>
			</#if>
			<#assign prevThree=(currentPage-3)>
			<#if prevThree gt 0>
			<a href="javascript:void(0);" onclick="page(${prevThree});">${prevThree}</a>
			</#if>
			<#assign prevTwo=(currentPage-2)>
			<#if prevTwo gt 0>
			<a href="javascript:void(0);" onclick="page(${prevTwo});">${prevTwo}</a>
			</#if>
			<#assign prevOne=previouspage>
			<#if (prevOne gt 0) && (prevOne lt currentPage)>
			<a href="javascript:void(0);" onclick="page(${prevOne});">${prevOne}</a>
			</#if>
			<#if (currentPage gt 0) && (pages gt 0)>
			<span class="current">${currentPage}</span>
			</#if>
			<#assign nextOne=nextpage>
			<#if (nextOne gt currentPage) && (nextOne lt (pages+1))>
			<a href="javascript:void(0);" onclick="page(${nextOne});">${nextOne}</a>
			</#if>
			<#assign nextTwo=(nextOne+1)>
			<#if nextTwo lt pages>
			<a href="javascript:void(0);" onclick="page(${nextTwo});">${nextTwo}</a>
			</#if>
			<#assign nextThree=(nextTwo+1)>
			<#if nextThree lt pages>
			<a href="javascript:void(0);" onclick="page(${nextThree});">${nextThree}</a>
			</#if>
			<#if nextpage lt pages>
			<a href="javascript:void(0);" onclick="page(${nextpage});">下一页</a>
			</#if>
			<#if currentPage lt pages>
			<a href="javascript:void(0);" onclick="page(${pages?default(1)});">最后一页</a>
			</#if>
		</div>
	</div>
	<div class="clr"></div>
</div>
