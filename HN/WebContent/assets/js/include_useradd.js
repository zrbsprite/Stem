$(function(){
	//submit
	$("#btn_save").click(function(){
		var isOk=true;
		$("form input:text").each(function(){
			var $this=$(this);
			if(isEmpty($this.val())){
				dialog.tips($this.attr("placeholder"), this);
				this.focus();
				return isOk=faslse;
			}
		});
		if(isOk){
			$("#mainForm").submit();
		}
	});
});