$(function(){
	$("#btn_submit").click(function(){
		$("#mainForm").submit();
		this.disabled="disabled";
	});
});