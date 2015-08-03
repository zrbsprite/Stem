$(function(){
	
	$('.zan').click(function(){ 
        $('#heart').show(); 
    	$('#heart').animate({'opacity':1,'background-size':'40%'}, 200, function(){
           $('#heart').animate({'opacity':0,'background-size':'90%'}, 300, function(){
               $('#heart').animate({'opacity':0,'background-size':'0%'}, 10).hide();
            });
        });
     });

	$('#shareBtn').click(function(){
		var vheight = $(document.body).height();
		$(document).scrollTop(0);
		$('#maskbg').show();
		$('#maskbg').css("height",vheight);
		$('#wxtips').show();
	});
	
	$('.maskclose').click(function(){
		$('#maskbg').hide();
		$('#wxtips').hide();
	});
		
});//结束


