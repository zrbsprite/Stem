$(function(){
	//左侧菜单
	$(".bs-sidenav li").on("click",function(){
		var $this = $(this);
		if($this.hasClass("li-parent")){
			$(".parent-selected").removeClass("parent-selected");
			$(".active").removeClass("active");
			$this.addClass("active").find("a").first().addClass("parent-selected");
		}else{
			$(".selected").removeClass("selected");
			$this.addClass("selected");
		}
	});
	
	$("#span_close").click(function(){
		var $this = $(this);
		if($this.hasClass("glyphicon-img-diagonalsin")){
			$this.removeClass("glyphicon-img-diagonalsin").addClass("glyphicon-img-diagonalsout");
			$this.parent(".panel-heading").next().slideUp();
		}else{
			$this.removeClass("glyphicon-img-diagonalsout").addClass("glyphicon-img-diagonalsin");
			$this.parent(".panel-heading").next().slideDown();
		}
	});
});

function page(pageNo){
	var $form = $("#mainForm");
	var $page = $("<input type='hidden' name='currentPage' value='"+pageNo+"' />");
	$form.append($page);
	$form.submit();
}