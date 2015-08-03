$(function(){
$('.zan').click(function(){ 
        $('#heart').show(); 
    	$('#heart').animate({'opacity':1,'background-size':'40%'}, 200, function(){
           $('#heart').animate({'opacity':0,'background-size':'90%'}, 300, function(){
               $('#heart').animate({'opacity':0,'background-size':'0%'}, 10).hide();
               
               $("#clickPraise").click(function(){
                   $.ajax({
                       url:url,
                       type:'post',
                       dataType:'json',
                       success:function(date){
                           if('' != date){
                               if(date.status != 'SUCCESS'){
                                   alert(date.message)
                               }else{
                            	   var sumcount=parseInt($("#zancount").html())+1;
                                   $("#zancount").html(sumcount);
                               }
                           }
                       }
                   });
               });
               
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


