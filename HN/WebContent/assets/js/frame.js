$(function(){
	//左侧菜单
	$(".bs-sidenav li").on("click",function(){
		var $this = $(this);
		if($this.hasClass("li-parent")){
			$(".parent-selected").removeClass("parent-selected");
			//$this.parent(".bs-sidenav").find(".active").removeClass("active");
			if($this.hasClass("active")){
				$this.removeClass("active");
			}else{
				$this.addClass("active").find("a").first().addClass("parent-selected");
			}
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
	
	//标签页
	$("#main_tab li").click(function(){
		var $li = $(this);
		if(!$li.hasClass("active")){
			$("#main_tab li.active").removeClass("active");
			$li.addClass("active");
		}
		var ref = $li.find("a").attr("data-ref");
		$(".tab-content").first().find(".active")
			.removeClass("active").closest(".tab-content").find("div#"+ref)
			.addClass("active");
	});
	$(window).scroll(function(){
		var top = $(this).scrollTop();
		var $back = $('.backTop');
		if(top==0){
			$back.hide();
		}else if(top>100){
			if($back.is(":hidden")){
				$back.show();
			}
		}
	});
	 $('.backTop').click(function(){
	    $('html,body').animate({scrollTop: '0px'}, 800);
	 });
});

function page(pageNo){
	var $form = $("#mainForm");
	var $page = $("<input type='hidden' name='currentPage' value='"+pageNo+"' />");
	$form.append($page);
	$form.submit();
}
function isEmpty(val){
	if(null==val || ""==val){
		return true;
	}
	return false;
}
function forward(url){
	return $("<form></form>").attr("action",url).attr("method","post").appendTo($("body"));
}