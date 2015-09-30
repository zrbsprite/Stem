<!--左侧功能菜单-->
<#if !current?exists>
	<#assign current=''>
</#if>
<div class="sideBar" id="sideBar">
	<div class="catalogList">
		<ul id="menu">
			<a class="nav-header nav-header-current"><b class="base"></b>基础设置</a>
			<ul>
				<li <#if current=='menu_fans'>class="selected"<#else>class="subCatalogList"</#if>><a href="${basepath}/admin/fanslist.htm">粉丝信息</a></li>
				<li <#if current=='menu_menu'>class="selected"<#else>class="subCatalogList"</#if>><a href="${basepath}/admin/menulistonly.htm">微信菜单</a></li>
			</ul>
		</ul>
	</div>
</div>
<script type="text/javascript">	
$(document).ready(function(){
	$(".nav-header").mouseover(function(){
		$(this).addClass('navHover');
	}).mouseout(function(){
		$(this).removeClass('navHover');
	}).click(function(){
		$(this).toggleClass('nav-header-current').next().slideToggle();
	});
	$("#menu li[class='selected']").parent("ul").css("display","block")
});
</script>