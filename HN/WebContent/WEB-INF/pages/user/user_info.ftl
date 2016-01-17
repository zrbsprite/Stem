<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='用户信息'>
    <title>${pageTitle}</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "frame/taglib.ftl">
    <#include "frame/header-ie.ftl">
    <!--[if lt IE 9]>
        <script src="${basepath}/assets/base/js/html5shiv.min.js"></script>
    <![endif]-->
    <style rel="stylesheet">
    	th,td{
    		vertical-align:middle!important;
    		text-align:center!important;
    	}
    </style>
  </head>
  <body>
	<#include "frame/top-nav.ftl">
	<#assign menu_name="menu_sysfunction">
	<div class="container-fluid lxui-docs-container">
	 	<div class="row show-grid">
	 		<#-- 菜单 -->
	 		<div class="span-col2">
	 			<#include "frame/left-nav.ftl">
	 		</div>
	 		<#-- 主体内容 -->
	 		<div class="span-col10 border-left-1 show-grid">
	 			<#include "frame/route.ftl">
	 			<div class="row">
	 				<div class="container-fluid">
			 			<div class="panel panel-default">
		  					<div class="panel-body">
		  					<#-- start -->
		  					<form class="form-horizontal" role="form" action="${basepath}/user/saveinfo.htm" method="post">
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">姓名</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="input_m_name" name="username" value="${bean.username}" placeholder="请输入姓名" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">性别</label>
							    <div class="span8">
							      <select class="form-control" name="sex">
							      	<option value="0">男</option>
							      	<option value="1" <#if bean.sex==1>selected</#if>>女</option>
							      </select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">出生年月</label>
							    <div class="span8">
							      <input type="date" class="form-control" id="" name="birthdate" value="${bean.birthdate}" placeholder="请选择出生年月" readonly onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">国籍</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="nationality" value="${bean.nationality}" placeholder="请输入国籍信息" maxlength="20">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">政治面貌</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="politicsstatus" value="${bean.politicsstatus}" placeholder="请输入政治面貌" maxlength="4">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">身份证号</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="idnumber" value="${bean.idnumber}" placeholder="请输入身份证号" maxlength="18">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_auth" class="span3 control-label">民族</label>
							    <div class="span8">
							    	<input type="text" class="form-control" id="" name="nation" value="${bean.nation}" placeholder="请输入民族" maxlength="10">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">邮政编码</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="post" value="${bean.post}" placeholder="请输入邮政编码" maxlength="6">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">毕业院校</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="graduateinstitutions" value="${bean.graduateinstitutions}" placeholder="请输入毕业院校" maxlength="100">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">毕业时间</label>
							    <div class="span8">
							      <input type="date" class="form-control" id="" name="graduatedate" value="${bean.graduatedate}" placeholder="请选择毕业时间"  readonly onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">学历</label>
							    <div class="span8">
							      <input type="date" class="form-control" id="" name="education" value="${bean.education}" placeholder="请输入学历"  readonly onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">学位</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="degree" value="${bean.degree}" placeholder="请输入学位" maxlength="50">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">专业</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="specialty" value="${bean.specialty}" placeholder="请输入专业" maxlength="100">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">执业医师级别</label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="grade" value="${bean.grade}" placeholder="请输入执业医师级别" maxlength="100">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">执业类别 </label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="category" value="${bean.category}" placeholder="请输入执业类别 " maxlength="100">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="input_role_name" class="span3 control-label">手机号码 </label>
							    <div class="span8">
							      <input type="text" class="form-control" id="" name="tel" value="${bean.tel}" placeholder="请输入手机号码 " maxlength="15">
							    </div>
							  </div>
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <input type="hidden" name="userpersonalinfoid" value="${bean.userpersonalinfoid}">
							      <button type="button" class="btn btn-theme2 btn-primary pull-right" id="btn_save">保存</button>
							    </div>
							  </div>
							</form>
		  					<#-- end -->
		  					</div>
						</div>	
					</div>	
				</div>
			</div>
		</div>
	</div>
	<#include "frame/footer.ftl">
	<#include "frame/js-ie.ftl">
	<script type="text/javascript" src="${basepath}/assets/layer/layer.js"></script>
	<script type="text/javascript" src="${basepath}/assets/layer/alert.js"></script>
	<script language="javascript" type="text/javascript" src="${basepath}/assets/js/My97DatePicker/WdatePicker.js"></script>
  </body>
</html>