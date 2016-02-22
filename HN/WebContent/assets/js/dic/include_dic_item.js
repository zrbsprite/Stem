function delItem(code,codeid,that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=codeid && ""!=code){
			var url=basepath+"/sys/dic/item/del"+codeid +"/"+code+".htm";
			that.disabled="disabled";
			forward(url).submit();
		}
	});
}

function editItem(code,codeid,that){
	if(""!=codeid && ""!=code){
		var url=basepath+"/sys/dic/item/m/"+codeid +"/"+code+".htm?t=1";
		that.disabled="disabled";
		forward(url).submit();
	}
}
$(function(){
	$("#btn_add").click(function(){
		location.href=basepath+"/sys/dic/item/m/0/0.htm";
		this.disabled="disabled";
		forward(url).submit();
	});
	$("#btn_query").click(function(){
		$("#mainForm").submit();
	});
});