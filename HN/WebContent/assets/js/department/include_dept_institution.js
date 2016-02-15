$(function(){
	$("#btn_query").click(function(){
		$("#mainForm").submit();
	});
	$("#btn_add").click(function(){
		forward(basepath+"/admin/dept/add.htm").submit();
		this.disabled="disabled";
	});
});
function editItem(username, that){
	var url = basepath+"/dept/edit.htm";
	$("<form></form>").attr("action",url).attr("method","post").append("<input type='hidden' name='dn' value='"+username+"'/>").appendTo($("body"));
	that.disabled="disabled";
}
function delItem(username, that){
	dialog.confirm("确定要删除吗？",function(){
		if(""!=id){
			var url=basepath+"/admin/dept/del.htm?dn="+username;
			that.disabled="disabled";
			location.href=url;
		}
	});
}