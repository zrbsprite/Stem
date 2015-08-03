$(function(){

    //for(var i=0; i<$(".txt").length; i++){
    //    var input = 
    //}
    $(".inpuTxt1").each(function(i){
        var objtxt = $(this).next();
        if($(this).val() == ""){
            objtxt.show();
        }else{
            objtxt.hide();
        }
     });

	$('.txt').click(function(){
		var objinput = $(this).prev();
        $(this).hide();
        objinput.focus();
    });

    $('.inpuTxt1').blur(function(){
        var objtxt = $(this).next();
        if($(this).val() == ""){
            objtxt.show();
        }else{
            objtxt.hide();
        }
    });
	
});
	
//-->	