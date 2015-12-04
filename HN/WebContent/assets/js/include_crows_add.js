$(function(){
	$("#accordion a").click(function(){
		var $a = $(this);
		var dataRef = $a.attr("data-ref");
		$a.closest(".panel-heading").next().slideToggle();
	});
});