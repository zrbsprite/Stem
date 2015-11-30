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
});