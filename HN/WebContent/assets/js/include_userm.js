$(function(){
	$("#btn_query").click(function(){
		var $input_username=$("#input_username");
		var $input_name=$("#input_name");
		if(isEmpty($input_username.val()) && isEmpty($input_name.val())){
			dialog.warn("请输入查询条件！");
			return false;
		}
		$("#mainForm").submit();
	});
	$("#btn_add").click(function(){
		this.disabled="disabled";
		forward(basepath+"/admin/um/add.htm").submit();
	});
});
function editItem(un,that){
	that.disabled="disabled";
	location.href=basepath+"/admin/um/edit.htm?un="+un;
}
function delItem(un,that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=un){
			var url=basepath+"/admin/um/del.htm?un="+un;
			that.disabled="disabled";
			location.href=url;
		}
	});
}
function authItem(un,that){
	var $form = forward(basepath+"/admin/role/roles.htm");
	$form.append("<input name='uid' value='"+un+"' type='hidden'>");
	$form.submit();
}