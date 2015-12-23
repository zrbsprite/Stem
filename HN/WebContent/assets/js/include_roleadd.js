$(function(){
	$("#btn_save").click(function(){
		var $input_role_name=$("#input_role_name");
		if(isEmpty($input_role_name.val())){
			dialog.tips("权限名称不能空！", $input_role_name.get(0));
			$input_role_name.focus();
			return false;
		}
		var $input_role_desc=$("#input_role_desc");
		if(isEmpty($input_role_desc.val())){
			dialog.tips("权限描述不能空！", $input_role_desc.get(0));
			$input_role_desc.focus();
			return false;
		}
		this.disabled="disabled";
		$("form").submit();
	});
});