$(function(){

	//内容页面 自适应内容 弹出窗口 2012-3-20*************************************************
	$(".ShowPopups").click(function() {
		var maskh = $(document).height();
		$(".OpenBoxBg").show().css("height",maskh); //显示背景色
		showOpenBox(); //设置提示对话框的Top与Left

		var clickBoxName = $(this).attr("name");
		$(".OpenBox").show();
		$("select").hide(); //隐藏select标签
		$(".OpenBox > div[rel="+ clickBoxName+"]").siblings().hide();
		$(".OpenBox > div[rel="+ clickBoxName+"]").show();
		$(".OpenBox div[id="+ clickBoxName+"] ").load(clickBoxName+".html");
	});

	//关闭图片点击事件
	$(".OpenBoxClose").click(function() {
		$(".OpenBoxBg").hide();
		$(".OpenBox").hide();
		$("select").show(); 
	});	
	//关闭公告
	$(".noticeClose").click(function() {
		$(".noticeBg").hide();
	});	

	//返回顶部
	$("#gotop").click(function() {
		$(document).scrollTop(0);
	});	

	//新增积分下拉
	$("#newJfbtn").click(function() {
		if($("#newJfCon").css("display") == "none"){
			$("#newJfCon").show();
			$("#jfCon").hide();
			$("#newJf").attr("src","/assets/wxdgid/images/icon_down_arr.png");
			$("#jf").attr("src","/assets/wxdgid/images/icon_up_arr.png");
		}else{
			$("#newJfCon").hide();
			$("#newJf").attr("src","/assets/wxdgid/images/icon_up_arr.png");
		}
	});	
	//累计积分下拉
	$("#jfbtn").click(function() {
		if($("#jfCon").css("display") == "none"){
			$("#jfCon").show();
			$("#newJfCon").hide();
			$("#newJf").attr("src","/assets/wxdgid/images/icon_up_arr.png");
			$("#jf").attr("src","/assets/wxdgid/images/icon_down_arr.png");
		}else{
			$("#jfCon").hide();
			$("#jf").attr("src","/assets/wxdgid/images/icon_up_arr.png");
		}
	});	

	//下拉框
	$(".textSel").click(function(){
		$(".seloptionList").toggle();
	});
	$(".seloptionList li").click(function(){
		$(this).parent().hide();
		$(".selBox").html($(this).text());
	});
	$(".seloptionList").mouseleave(function(){
		$(".seloptionList").hide();
	});

	//下拉框
	$(".selBox").click(function(){
		$(".optionList").toggle();
		if($(".optionList").is(":hidden")){
			$(".u_select_arr").css('background-image','url(/assets/wxdgid/images/icon_selarr_down.gif)');
			$("#selBox01").show();
			$("#selBox02").hide();
		}else{
			$(".u_select_arr").css('background-image','url(/assets/wxdgid/images/icon_selarr_up.gif)');
		}

	});
	$(".optionList li").click(function(){
		var maskh = $(document).height();
		$(".OpenBoxBg").show().css("height",maskh); //显示背景色
		showOpenBox(); //设置提示对话框的Top与Left
		$(".OpenBox").show();
		$(".optionList li").removeClass("active");
		$(".optionList li").data("liText",$(this).text());
		$(".optionList li").data("liVal",$(this).attr("lyid"));
		$(".optionList li").data("liClass",$(this).addClass("active"));
	});
	
	//内容页面 自适应内容 弹出窗口 2012-3-20*************************************************
	$(".ShowPrompt").click(function() {
		var maskh = $(document).height();
		$(".OpenBoxBg").show().css("height",maskh); //显示背景色
		showOpenBox(); //设置提示对话框的Top与Left
		
		$(".OpenBox").show();
	});
	$(".ClosePrompt").click(function() {
		$(".OpenBoxBg").hide();
		$(".OpenBox").hide();
	});
	
	//渠道下拉框
	$(".ShowChannel").click(function() {
		var maskh = $(document).height();
		//$(".OpenBoxBg").show().css("height",maskh); //显示背景色
		//showOpenBox(); //设置提示对话框的Top与Left
		//$(".OpenBox").show();
	});
	$(".channelClose").click(function() {
		$(".optionList").hide();

		var sourcesType = $(".optionList li").data("liVal");
		var url = "/wx/editSourcesType.htm?sourcesType="+sourcesType;
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			success: function(data){
				if(data.status == "SUCCESS"){
					alert(data.message);
				}else{
					window.location.href ="/wx/home.htm";
				}
			}
		});

		$(".u_textSel").html($(".optionList li").data("liText"));
		$(".u_select_arr").css('background-image','url(/assets/wxdgid/images/icon_selarr_down.gif)');
		/*$(".u_select_arr").hide();
		$(".u_select_btn").hide();
		$("#selBox01").hide();*/
		$("#sourcesTypes").val(sourcesType);
		$(".OpenBoxBg").hide();
		$(".OpenBox").hide();
	});

	$(".channelAllClose").click(function() {
		var type = $(".optionList li").data("liVal");
		var types=$("#sourcesTypes").val();
		$(".u_select_arr").css('background-image','url(/assets/wxdgid/images/icon_selarr_down.gif)');
		/*if(null==type || ''==type ){
			$(".optionList li[lyid="+type+"]").removeClass("active");
			$(".optionList li[lyid='06']").addClass("active");
		}else{*/
			$(".optionList li[lyid="+type+"]").removeClass("active");
			$(".optionList li[lyid="+types+"]").addClass("active");
		//}
		$(".OpenBoxBg").hide();
		$(".OpenBox").hide();
		$(".optionList").hide();
	});

	//提示谈层关闭
	var tsh = $(document).height();
	$(".OpenTsBg").show().css("height",tsh);
	$(".tsclose").click(function() {
		$(".OpenTsBg").hide();
		$(".openTs").hide();
	});

	//排行切换
	$('.sc_ranking_tit a').click(function(){
		//alert($(this).index());
		if($(this).index() == 0){
			$('.bg').css('background-color','#fb6d07');
			$('.bg1').css('background-color','#333e44');
		}else{
			$('.bg').css('background-color','#333e44');
			$('.bg1').css('background-color','#fb6d07');
		}

		$('.sc_ranking').hide();
		$('.sc_ranking:eq('+$(this).index()+')').show();
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
		var top = sclT + (brsH - curH) / 3;
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

	/*兑换积分说明*/
	$(".arrowDown").click(function(){
		if($(".changeDesc").is(":visible")){
			$(".changeDesc").hide();
			$(this).find(".arrowBtn").removeClass("arrowBtnDown");
		}else{
			$(".changeDesc").show();
			$(this).find(".arrowBtn").addClass("arrowBtnDown")
		}
	})
	/* 任务说明点击标题 */
	$(".showTit").click(function(){
		if($(this).next().is(":visible")){
			$(this).next().hide();
			$(this).find("span img").attr("src","/assets/wxdgid/images/add_icon.png");
		}else{
			$(this).next().show()
			.siblings("div").hide();
			$(this).find("span img").attr("src","/assets/wxdgid/images/minus_icon.png");
			$(this).siblings("h2").find("span img").attr("src","/assets/wxdgid/images/add_icon.png");
		}
		
		
	})
	
	/* tab切换 */
	var $title = $(".tabTitle li");
	$title.click(function(){
		$(this).addClass("current")
			 .siblings().removeClass("current");
		var index = $title.index(this);
		$("div.conBox > .tabCon")
			 .eq(index).css("display", "block")
			 .siblings().css("display", "none");	
	});
	
	/* 引导层 */
	$(window).load(function(){
		if($(".OpenTsBg").is(":visible")){
			$('body').addClass("noScroll");
		}else{
			$('body').removeClass("noScroll");
		}
	})
	$(".clickHid").click(function(){
		$(this).hide();
		$(".OpenTsBg, .guideLayer").hide();
		$('body').removeClass("noScroll");
	})
	
	
	/* 列表页顶部下拉层 */
	$(".closeBtn").click(function(){
		$(this).parent().hide();
	})
	
	//弹层
	$(window).load(function(){
		var objW = $(window);
		var maskh = $(window).height();
		var w = $(window).width();
		var boxW = $('.openLayer').width();
		var curH = $(".openLayer").height();
		var sclT = objW.scrollTop();
		var top =sclT + (maskh - curH) / 2;
		w=parseInt((w-boxW)/2)+'px';
		if($(window).height()<$(document.body).height()){
			maskh = $(document.body).height();
		}
		$('.openLayer').css({left:w, top:top + "px"}).show();
		
		
		var obj = this;
		body_width = parseInt($(window).width());
		body_height = parseInt($(window).height());
		block_width = parseInt(obj.width());
		block_height = parseInt(obj.height());
		
		left_position = parseInt((body_width/2) - (block_width/2)  + $(window).scrollLeft());
		if (body_width<block_width) { left_position = 0 + $(window).scrollLeft(); };
		
		top_position = parseInt((body_height/2) - (block_height/2) + $(window).scrollTop());
		if (body_height<block_height) { top_position = 0 + $(window).scrollTop(); };
		
		if(!loaded) {
			
			obj.css({'position': 'absolute'});
			obj.css({ 'top': top_position, 'left': left_position });
			$(window).bind('resize', function() { 
				obj.center(!loaded);
			});
			$(window).bind('scroll', function() { 
				obj.center(!loaded);
			});
			
		} else {
			obj.stop();
			obj.css({'position': 'absolute'});
			obj.animate({ 'top': top_position }, 200, 'linear');
		}
	});
	/* 关闭窗口
	$(".imgCloseBtn").click(function(){
		$(".OpenTsBg").hide();
		$(".openLayer").hide();
	}) */
	$(".infoOpenLayer").click(function(){
		var vheight = $(document.body).height();
		$(document).scrollTop(0);
		$('#maskbg').show().css("height",vheight);
		$('.infoLayer').show()
		$('.infoLayer').center();
	});
	
	$('.maskclose').click(function(){
		$('#maskbg').hide();
		$('#wxtips').hide();
		$(".infoLayer").hide();
	});
	/* 隔行变色 */
	$(".innerSty tr:even").addClass("grayBg");
		
	
});//结束