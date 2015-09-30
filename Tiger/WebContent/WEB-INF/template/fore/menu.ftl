<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>菜单管理</title>
	<#include "include/taglib.ftl">
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style-1.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style_2_common.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/cymain.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/js/layer/skin/layer.css" />
	<script type="text/javascript" src="${basepath}/assets/js/jquery-1.8.3.min.js"></script>
</head>
<body id="nv_member" class="pg_CURMODULE">
	<#assign current='menu_menu'>
	<div id="wp" class="wp">
		<!--中间内容-->
		<div class="contentmanage">
			<div class="developer">
				<div class="tableContent">
					<#include "/include/left.ftl"/>
					<div class="content">
						<div class="cLineB">
							<h4 style="font-size:16px;">菜单管理</h4>
						</div>
						<div class="cLine">
							<div style="margin: 0 auto;height:auto;" class="ftip">
								<p>如果要修改相关菜单回复的图片，请在下方选中响应的菜单将图片上传即可；</p>
								<p>如果需要修改菜单回复的图文内容，请在微信后台修改响应的图文素材即可；</p>
								<p>如果做了菜单回复的任何修改请务必同步菜单，只需要同步一次。<p>
							</div>
						</div>
						<div class="msgWrap" style="border-top: 1px solid #ccc; padding-top: 10px; margin-top: 10px;">
							<div style="margin-left:50px;">
								<div style="float: left; width: 60%;margin-bottom:20px;">
									<button class="btnGrayS" type="button" onclick="synMenu();">同步菜单回复</button>
								</div>
							</div>
							<form enctype="multipart/form-data" action="${basepath}/admin/uploadpic.htm" method="post" class="form" onsubmit="return checkForm();">
								<table width="100%" cellspacing="0" cellpadding="0" border="0" style="margin: 20px 0 0 0;" class="userinfoArea">
									<tbody>
										<tr>
											<th valign="top">
												<label for="Description">图片菜单选项：</label>
											</th>
											<td>
												<select name="id">
													<#list data as bean>
													<option value="${bean.id}">${bean.menuName}</option>
													</#list>
												</select>
											</td>
										</tr>
										<tr>
											<th valign="top">
												<span class="red"></span><label for="MusicUrl">图片地址：</label>
											</th>
											<td>
												<input type="file" readonly placeholder="请上传文件" name="picture" id="linkUrl" class="px">
											</td>
										</tr>
										<tr>
											<th></th>
											<td>
												<button class="btnGreen left" type="button" onclick="checkForm();">保存</button>
											</td>
										</tr>
									</tbody>
								</table>
							</form>
						</div>
					</div>			
					</div>
					<div class="clr"></div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="${basepath}/assets/js/layer/layer.js"></script>
<script type="text/javascript">
function checkForm(){
	var $file =  $("#linkUrl");
	if($file.val()==""){
		layer.alert("文件不能为空！");
		return false;
	}
	$("form").submit();
}

function synMenu(){
	layer.confirm('您是如何看待前端开发？', {
    	btn: ['确定','取消']
	}, function(index){
		layer.close(index);
		layerIndex = layer.msg('正在执行请稍后...', {icon: 16}, shade: [0.8, '#393D49'], time:0);
		$.ajax({
		   type: "POST",
		   url: "${basepath}/admin/makemenu.htm",
		   async: false,
		   cache: false,
		   success: function(data){
		   		layer.msg('菜单同步成功！', {icon: 1});
		   },
		   error :function(){
		   		layer.msg('菜单同步异常！', {shift: 6});
		   },
		   complete :function(){
		   	layer.close(layerIndex);
		   }
		});
	}, function(index){
		layer.close(index);
	});
}
</script>
</html>