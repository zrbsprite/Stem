function delItem(id,that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=id){
			var url=basepath+"/role/del.htm?k="+id;
			that.disabled="disabled";
			location.href=url;
		}
	});
}

function editItem(id,that){
	if(""!=id){
		var url=basepath+"/role/edit.htm?k="+id;
		that.disabled="disabled";
		location.href=url;
	}
}
$(function(){
	$("#btn_add").click(function(){
		location.href=basepath+"/role/add.htm";
		this.disabled="disabled";
	});
});