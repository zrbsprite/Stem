function delItem(id,that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=id){
			var url=basepath+"/admin/modular/del.htm?k="+id;
			that.disabled="disabled";
			forward(url).submit();
		}
	});
}

function editItem(id,that){
	if(""!=id){
		var url=basepath+"/admin/modular/m/"+id +".htm";
		that.disabled="disabled";
		forward(url).submit();
	}
}
$(function(){
	$("#btn_add").click(function(){
		location.href=basepath+"/admin/modular/m/0.htm";
		this.disabled="disabled";
		forward(url).submit();
	});
});