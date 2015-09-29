<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>关注粉丝管理</title>
	<#include "include/taglib.ftl">
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style-1.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style_2_common.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/cymain.css" />
</head>
<body id="nv_member" class="pg_CURMODULE">
	<#assign current='menu_fans'>
	<div id="wp" class="wp">
		<!--中间内容-->
		<div class="contentmanage">
			<div class="developer">
				<div class="tableContent">
					<#include "/include/left.ftl"/>
					<div class="content">
						<div class="cLineB">
							<h4 style="font-size:16px;">关注粉丝</h4>
							<div class="clr"></div>
							</div>
							<#-- 
							<div class="cLine">
								<div style="margin: 0 auto" class="ftip">认证公众号才能使用此功能，点击下面的“同步粉丝信息”便会同步您的粉丝信息</div>
							</div>
							<div class="cLine">
								<div class=" left">
									 <a class="btnGrayS vm bigbtn" href="${basepath}/fansUser/toUpdate"><img class="vm" src="${basepath}/images/text.png">同步粉丝信息</a>
								</div>
								<div class="clr"></div>
							</div>
							 -->
							<div style="border-top: 1px solid #ccc; padding-top: 10px; margin-top: 10px;" class="msgWrap">
								<div style="margin: 5px 0">
									<div style="float: left; width: 60%;margin-bottom:20px;">
											<form action="" method="post" id="mainForm">
											<input name="currentPage" id="currentPage" type="hidden"></input>
											<input type="text" value="${keyword?default('')}" name="keyword" id="keyword" placeholder="输入昵称搜索" class="px" id="msgSearchInput1" />
											<#-- 
											&nbsp;&nbsp;
											按分组查看粉丝： 
											       <select id="groupid1" name="groupid1">
											          <option value="">全部</option>
											          <#list grouList as group >		
											  		    <option value="${group.groupId}" <#if group.groupId == wechatgroupid> selected="selected" </#if>>${group.name}</option>
													  </#list>	
											      </select>
											      -->
											<input type="button" title="搜索" class="btnGrayS" id="msgSearch" value="搜索" />
											<input type="button" title="同步粉丝" class="btnGrayS" id="synFans" value="同步粉丝" />
											</form>
									</div>
									<#-- 
									<div style="width: 40%; float: right">
											将选中粉丝转移到分组中 <select name="groupid2" id="groupid2">			
													<#list grouList as group >		
											  		 <option value=${group.groupId}>${group.name}</option>
													</#list>
											</select> 
											<input type="button" title="转移" class="btnGrayS" href="" id="msgSearchBtn" onClick="changeGroup();" value="转移">
											
										</div>
										<div style="clear: both"></div>
								 	-->
								</div>
								<table width="100%" cellspacing="0" cellpadding="0" border="0" class="ListProduct">
									<thead>
										<tr>
											<#-- <th class="select"><input type="checkbox"  id="check_box"></th> -->
											<th>头像</th>
											<th>粉丝昵称</th>
											<th>性别</th>
											<th>省(直辖市)</th>
											<th>城市</th>
											<th style="width:110px;">关注时间</th>
										</tr>
									</thead>
									<tbody>
										<#if page?exists>
										<#list page.recordList as bean >
											<tr>
												<#-- <td><input type="checkbox" name="fanids" id="fanids" class="cbitem" value="${bean.id}"></td> -->
												<td style="width:50px;"><div class="cateimg">
														<img class="cateimg_small" src="${bean.headimgurl?default('')}">
													</div>
												</td>
												<td>${bean.nickname?default('')}</td>
												<td>
													<#if bean.sex==1>男
													<#elseif bean.sex==2>女
													<#else>未知</#if>													
												</td>
												<td>${bean.province?default('')}</td>
												<td>${bean.city?default('')}</td>
												<td>${bean.subscribeTimeLable}</td>											
											</tr>
										</#list>
										</#if>
									</tbody>
								</table>
							</from>
							</div>				
						<#include "/include/form_pagination.ftl"/>					
					</div>
					<div class="clr"></div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="${basepath}/assets/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="${basepath}/assets/js/layer/skin/layer.css" />
<script type="text/javascript" src="${basepath}/assets/js/layer/layer.js"></script>
<script type="text/javascript">
	function page(currentPage){
		$("#currentPage").val(currentPage);
		$("#mainForm").submit();
	}
	$(function(){
		$("#msgSearch").click(function(){
			$("#mainForm").submit();
		});
		$("#synFans").click(function(){
			$.post("${basepath}/admin/synajax.htm", {}, function(data){
				if(data&&data.success==true){
					layer.alert('同步请求已发送，请稍后查看结果！', {icon: 6});
				}else{
					layer.alert("系统异常，请联系管理员！");
				}
			});
		});
	});
</script>
</html>