$(function(){
	$("#btn_save").click(function(){
		var $pwd = $("#input_old_pwd");
		var $newpwd = $("#input_new_pwd");
		var $renewpwd = $("#input_new_pwd_re");
		if(isEmpty($pwd.val())){
			dialog.tips("请输入原密码",$pwd.get(0));
			$pwd.focus();
			return false;
		}
		if(isEmpty($newpwd.val())){
			dialog.tips("请输入新密码",$newpwd.get(0));
			$newpwd.focus();
			return false;
		}
		if(isEmpty($renewpwd.val())){
			dialog.tips("请输入新密码",$renewpwd.get(0));
			$renewpwd.focus();
			return false;
		}
		if($newpwd.val()!=$renewpwd.val()){
			dialog.warn("两次密码输入不一致！");
			return false;
		}
		$.post(basepath+"/user/vp.htm",{pwd:$pwd.val()},function(data){
			if(data.state==200){
				$("form").submit();
			}else{
				dialog.error(data.msg);
			}
		},"json");
	});
});