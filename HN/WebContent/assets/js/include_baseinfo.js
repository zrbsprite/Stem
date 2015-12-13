$(function(){
	$("#btn_submit").click(function(){
		var $requireds = $("input[required]");
		var len = $requireds.length;
		for(var i=0;i<len;i++){
			var $input = $requireds.eq(i);
			var val = $input.val();
			if(null==val || ""==val){
				dialog.tips($input.attr("data-msg"), $input.get(0));
				$input.focus();
				return false;
			}
		}
		dialog.loading();
		$("#mainForm").submit();
		this.disabled="disabled";
	});
});