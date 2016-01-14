<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='机构管理-上传logo'>
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
	<div class="container-fluid lxui-docs-container">
	 	<div class="row show-grid">
	 		<#-- 主体内容 -->
	 		<div class="span-col10 border-left-1 show-grid">
	 			<#include "frame/route.ftl">
	 			<div class="row">
	 				<div class="container-fluid">
			 			<div class="panel panel-default">
		  					<div class="panel-body">
		  					<#-- start -->
		  					<form class="form-horizontal" role="form" action="${basepath}/dept/upload.htm" method="post" enctype="multipart/form-data">
							  <div class="form-group">
							    <label for="input_role_desc" class="span3 control-label">选择图片</label>
							    <div class="span8">
							        <span class="btn btn-primary fileinput-button">
									  <i class="glyphicon glyphicon-plus"></i>
									  <span>选择文件</span>
									  <input type="file" name="image"  accept="image/*">
									</span>
							    </div>
							  </div>
							  
							  <div class="form-group">
							  	<label class="span3"></label>
							    <div class="span8">
							      <button type="submit" class="btn btn-theme2 btn-primary pull-right" id="btn_save" onclick="return checkForm(this);">保存</button>
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
	<script type="text/javascript">
		function checkForm(ele){
			var $file = $(":file");
			if($file.val()==""){
				$file.focus();
				dialog.warn("请选择文件");
				return false;
			}
			ele.value='上传中...';
			return true;
		}
	</script>
  </body>
</html>