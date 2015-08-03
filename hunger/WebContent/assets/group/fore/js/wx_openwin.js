$(function(){
	
	//内容页面 自适应内容 弹出窗口 2012-3-20*************************************************
	$(".ShowPopups").click(function() {
		var maskh = $(document).height();
		$(".OpenBoxBg").show().css("height",maskh); //显示背景色
		showOpenBox(); //设置提示对话框的Top与Left
		var clickBoxName = $(this).attr("name");

		$(".OpenBox").show();
//		$(".OpenBox > div[rel="+ clickBoxName+"]").siblings().hide();
		$(".OpenBox > div[rel="+ clickBoxName+"]").show();
		$(".OpenBox div[id="+ clickBoxName+"] ").load("/includeHtm/wxdgid/"+clickBoxName+".html");
		return;
	});
	
	//关闭图片点击事件
	$(".OpenBoxClose").click(function() {
		$(".OpenBoxBg").hide();
		$(".OpenBox").hide();
		$("select").show(); 
	});	
	
	/*根据当前页面与滚动条位置，设置提示对话框的Top与Left*/
	function showOpenBox() {
		var objWin = $(document); //当前窗口
		var objOpenBox = $(".OpenBox"); //对话框
		var brsW = objWin.width();
		var brsH = objWin.height();
		var sclL = objWin.scrollLeft();
		var sclT = objWin.scrollTop();
		var curW = objOpenBox.width();
		var curH = objOpenBox.height();
		
		//计算对话框居中时的左边距
		var left = sclL + (brsW - curW) / 2;
		//计算对话框居中时的上边距
		var top = sclT + (brsH - curH) / 28;
		//设置对话框在页面中的位置
		objOpenBox.css({ "left": left, "top": top });
	  //$(".OpenBoxBg").height(brsH);//背景框 灰色 高度和窗口一致
	}
	$(window).resize(function() {//页面窗口大小改变事件
		if (!$(".OpenBox").is(":visible")) {
			return;
		}
		showOpenBox(); //设置提示对话框的Top与Left
	});
		
});//结束


