function delItem(codeid,that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=codeid){
			var url=basepath+"/sys/dic/type/del"+codeid +".htm";
			that.disabled="disabled";
			forward(url).submit();
		}
	});
}

function editItem(codeid,that){
	if(""!=codeid){
		var url=basepath+"/sys/dic/type/m/"+codeid+".htm?t=1";
		that.disabled="disabled";
		forward(url).submit();
	}
}
$(function(){
	$("#btn_add").click(function(){
		location.href=basepath+"/sys/dic/type/m/0.htm";
		this.disabled="disabled";
		forward(url).submit();
	});
	$("#btn_query").click(function(){
		$("#mainForm").submit();
	});
});