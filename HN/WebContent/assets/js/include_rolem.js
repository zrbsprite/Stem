function delItem(id,that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=id){
			var url=basepath+"/role/del?k="+id;
			that.disabled="disabled";
			location.href=url;
		}
	});
}

function editItem(id,that){
	if(""!=id){
		var url=basepath+"/role/edit?k="+id;
		that.disabled="disabled";
		location.href=url;
	}
}