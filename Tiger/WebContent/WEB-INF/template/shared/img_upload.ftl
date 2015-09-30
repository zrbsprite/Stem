<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>上传图片</title>
	<#include "include/taglib.ftl">
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style-1.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/css/style_2_common.css" />
	<link rel="stylesheet" type="text/css" href="${basepath}/assets/js/layer/skin/layer.css" />
	<script type="text/javascript" src="${basepath}/assets/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="${basepath}/assets/js/layer/layer.js"></script>
</head>
<body>
<body style="background: #fff">
	<div class="" style="display: none; position: absolute;">
		<div class="aui_outer">
			<table class="aui_border">
				<tbody>
					<tr>
						<td class="aui_nw"></td>
						<td class="aui_n"></td>
						<td class="aui_ne"></td>
					</tr>
					<tr>
						<td class="aui_w"></td>
						<td class="aui_c"><div class="aui_inner">
								<table class="aui_dialog">
									<tbody>
										<tr>
											<td colspan="2" class="aui_header"><div
													class="aui_titleBar">
													<div class="aui_title" style="cursor: move;"></div>
													<a class="aui_close" href="javascript:/*artDialog*/;">×</a>
												</div></td>
										</tr>
										<tr>
											<td class="aui_icon" style="display: none;"><div
													class="aui_iconBg" style="background: none;"></div></td>
											<td class="aui_main" style="width: auto; height: auto;"><div
													class="aui_content" style="padding: 20px 25px;"></div></td>
										</tr>
										<tr>
											<td colspan="2" class="aui_footer"><div
													class="aui_buttons" style="display: none;"></div></td>
										</tr>
									</tbody>
								</table>
							</div></td>
						<td class="aui_e"></td>
					</tr>
					<tr>
						<td class="aui_sw"></td>
						<td class="aui_s"></td>
						<td class="aui_se" style="cursor: se-resize;"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div style="background: #fefbe4; border: 1px solid #f3ecb9; color: #993300; padding: 10px; width: 90%; margin: 40px auto 5px auto;">选中文件后点击上传按钮或者点击“从素材库选择”直接从已上传文件中选择</div>
	<form enctype="multipart/form-data" action="${basepath}/admin/uploadpic.htm" id="thumbForm" method="POST" style="font-size: 14px; padding: 30px 20px 10px 20px;">
		<p id="picsize" style="margin-bottom: 20px">
			<span style="color: #930; font-size: 14px; margin-bottom: 20px;">图片最佳尺寸：无限制</span>
		</p>
		<p></p>
		<div style="font-size: 14px;">
			选择本地文件：<br>
			<br>
			<input type="file" style="width: 90%; border: 1px solid #ddd" name="picture" accept="image/*">
		</div>
		<div style="padding: 50px 0; text-align: center;">
			<input id="submitbtn" name="doSubmit" type="submit" class="btnGreen"
				value="上传" onclick="return checkForm(this);">
		</div>
		<p></p>
	</form>
	<div style="display: none; position: fixed; left: 0px; top: 0px; width: 100%; height: 100%; cursor: move; opacity: 0; background: rgb(255, 255, 255);"></div>
	
	<script type="text/javascript">
		function checkForm(ele){
			var $file = $(":file");
			if($file.val()==""){
				$file.focus();
				layer.alert("请选择文件",{icon:1});
				return false;
			}
			ele.value='上传中...';
			return true;
		}
	</script>
</body>
</body>
</html>