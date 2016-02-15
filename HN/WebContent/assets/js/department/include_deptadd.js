function chooseImage(){
	window.layerIndex=layer.open({
	    type: 2,
	    title: '上传图片',
	    shadeClose: false,
	    shade: 0.8,
	    scrollbar:false,
	    area: ['500px', '50%'],
	    content: basepath+'/admin/dept/openwin.htm'
	}); 
}
function callback(imagePath){
	dialog.close(window.layerIndex);
	if(isEmpty(imagePath)){
		dialog.warn("上传异常！");
		return ;
	}
	dialog.info("上传成功！");
	var $logo = $("#input_logo");
	$logo.val(imagePath);
}
$(function(){
	$("#btn_save").click(function(){
		this.disabled="disabled";
		$("form").submit();
	});
});