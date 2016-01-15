$(function(){
	$("#btn_save").click(function(){
		var $modularName = $("#input_m_name");
		if(isEmpty($modularName.val())){
			dialog.tips("模块名称不能空！", $modularName.get(0));
			$modularName.focus();
			return false;
		}
		$("form").submit();
	});
});