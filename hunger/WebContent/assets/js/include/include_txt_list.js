var editItem = function(id, wxid){
	var $form = $("#modify_form");
	$form.attr("action", $form.attr("data-url")+"/txt/toEdit");
	$(":hidden[name='wxid']").val(wxid);
	$(":hidden[name='id']").val(id);
	$form.submit();
};
var delItem = function(id, wxid){
	var $form = $("#modify_form");
	$form.attr("action", $form.attr("data-url")+"/txt/del");
	$(":hidden[name='wxid']").val(wxid);
	$(":hidden[name='id']").val(id);
	if(layer){
		layer.confirm("确定要删除吗？",{icon:0}, function(index){
			$form.submit();
			layer.close(index);
		});
	}else{
		if(confirm("确定要删除吗？")){
			$form.submit();
		}
	}
};