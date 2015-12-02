$(function(){
	$("#btn_login").click(function(){
		var $username=$("#div_username input");
		var username=$username.val();
		if(null==username||""==username){
			dialog.tip($username.get(0));
			$username.focus();
			return false;
		}
		var $password=$("#div_password input");
		var password=$password.val();
		if(null==password||""==password){
			dialog.tip($password);
			$password.focus();
			return false;
		}
		var url = $(this).attr("data-url");
		$.ajax({
		   type: "POST",
		   url: url,
		   cache: false,
		   dataType: "json",
		   data:  {userName:username,password:password},
		   success: function(data){
			   if(!!data){
				   if(data.status==200){
					   $("#mainForm").submit();
				   }else{
					   dialog.info(data.msg);
				   }
			   }else{
				   dialog.error("系统异常");
			   }
		   },
		   error :function(XMLHttpRequest, textStatus, errorThrown){
			   dialog.warn("系统异常");
		   }
		});
	});
});