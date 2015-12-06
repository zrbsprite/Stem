$(function(){
	$("#accordion .panel-heading").click(function(){
		var $div = $(this);
		var dataRef = $div.find("a").eq(0).attr("data-ref");
		$div.next().slideToggle();
	});
});