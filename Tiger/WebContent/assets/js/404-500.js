// 投保流程
$(function(){
	function showOpenBox() {
		var objWin = $(document); //当前窗口
		var objOpenBox = $(".content"); //对话框
		var brsW = objWin.width();
		var brsH = objWin.height();
		var sclL = objWin.scrollLeft();
		var sclT = objWin.scrollTop();
		var curW = objOpenBox.width();
		var curH = objOpenBox.height();
		
		//计算对话框居中时的左边距
		var left = sclL + (brsW - curW) / 2;
		//计算对话框居中时的上边距
		var top = sclT + (brsH - curH) / 2;
		//设置对话框在页面中的位置
		objOpenBox.css({ "left": left, "top": top });
	}
	$(window).load(function(){
		showOpenBox();
	})
});
