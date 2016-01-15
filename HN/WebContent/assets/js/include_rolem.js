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
function authrize(id){
	window.layerIndex=layer.open({
	    type: 2,
	    title: '权限管理',
	    shadeClose: false,
	    shade: 0.8,
	    scrollbar:false,
	    area: ['380px', '70%'],
	    content: basepath+'/modular/data?rid='+id
	}); 
}
function authFun(ids, rid){
	dialog.close(layerIndex);
	var index = dialog.loading('处理中，请稍后...');
	if(""==ids){
		dialog.close(index);
		dialog.info("未做权限修改！");
		return false;
	}
	$.post(basepath+"/modular/auth",{rid:rid, mids:ids}, function(data){
		if(data.state==200){
			dialog.close(index);
			dialog.infoOk("授权成功");
		}else{
			dialog.close(index);
			dialog.infoWarn("授权异常");
		}
	},"json");
}