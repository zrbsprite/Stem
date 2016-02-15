<div class="">
	<ul class="nav bs-sidenav">
		<li class="<#if (menu_name?exists) && !(menu_name?index_of('menu_sys') lt 0)>active</#if> li-parent">
			<a <#if (menu_name?exists) && !(menu_name?index_of('menu_sys') lt 0)>class="parent-selected"</#if>><span class="glyphicon glyphicon-user"></span> 系统管理</a>
			<ul class="nav">
				<li <#if menu_name='menu_sysuser'>class="selected"</#if>><a href="${basepath}/admin/um/index.htm"><span class="glyphicon glyphicon-cog"></span> 用户管理</a></li>
				<li <#if menu_name='menu_sysrole'>class="selected"</#if>><a href="${basepath}/admin/role/index.htm"><span class="glyphicon glyphicon-search"></span> 角色管理</a></li>
				<li <#if menu_name='menu_sysfunction'>class="selected"</#if>><a href="${basepath}/admin/modular/index.htm"><span class="glyphicon glyphicon-asterisk"></span> 功能管理</a></li>
				<#--<li <#if menu_name='menu_sysauth'>class="selected"</#if>><a href="${basepath}/admin/auth/index.htm"><span class="glyphicon glyphicon-plus"></span> 权限管理</a></li> -->
			</ul>
		</li>
		<li class="<#if menu_name?exists && !(menu_name?index_of('menu_dept') lt 0)>active</#if> li-parent">
			<a <#if menu_name?exists && !(menu_name?index_of('menu_dept') lt 0)>class="parent-selected"</#if>><span class="glyphicon glyphicon-th"></span> 机构管理</a>
			<ul class="nav">
				<li <#if menu_name='menu_dept_institution'>class="selected"</#if>><a href="${basepath}/admin/dept/index.htm"><span class="glyphicon glyphicon-zoom-in"></span> 机构管理</a></li>
				<#-- <li <#if menu_name='menu_deptment'>class="selected"</#if>><a href="${basepath}/admin/dept/index.htm"><span class="glyphicon glyphicon-zoom-in"></span> 科室管理</a></li> -->
			</ul>
		</li>
		<li class="<#if menu_name?exists && !(menu_name?index_of('menu_dic') lt 0)>active</#if> li-parent">
			<a <#if menu_name?exists && !(menu_name?index_of('menu_dic') lt 0)>class="parent-selected"</#if>><span class="glyphicon glyphicon-th"></span> 数据字典</a>
			<ul class="nav">
				<li <#if menu_name='menu_diccat'>class="selected"</#if>><a href="${basepath}/dic/type/index.htm"><span class="glyphicon glyphicon-zoom-in"></span> 字典类别</a></li>
				<li <#if menu_name='menu_dicinfo'>class="selected"</#if>><a href="${basepath}/dic/item/index.htm"><span class="glyphicon glyphicon-signal"></span> 字典信息</a></li>
			</ul>
		</li>
		<li class="<#if menu_name?exists && !(menu_name?index_of('menu_crows') lt 0)>active</#if> li-parent">
			<a <#if menu_name?exists && !(menu_name?index_of('menu_crows') lt 0)>class="parent-selected"</#if>><span class="glyphicon glyphicon-th"></span> 人群管理</a>
			<ul class="nav">
				<li <#if menu_name='menu_crowsinfo'>class="selected"</#if>><a href="${basepath}/archives/crows.htm"><span class="glyphicon glyphicon-zoom-in"></span> 人群档案</a></li>
				<li <#if menu_name='menu_crowsquery'>class="selected"</#if>><a href="${basepath}/archives.htm"><span class="glyphicon glyphicon-zoom-in"></span> 人群筛查</a></li>
				<li <#if menu_name='menu_crowscheck'>class="selected"</#if>><a href="${basepath}/archives/check.htm"><span class="glyphicon glyphicon-signal"></span> 人群检验</a></li>
				<li <#if menu_name='menu_crowsjudge'>class="selected"</#if>><a href="${basepath}/archives/check.htm"><span class="glyphicon glyphicon-time"></span> 人群诊断</a></li>
				<li <#if menu_name='menu_crowsheal'>class="selected"</#if>><a href="${basepath}/archives/check.htm"><span class="glyphicon glyphicon-time"></span> 人群治疗</a></li>
			</ul>
		</li>
	</ul>
</div>