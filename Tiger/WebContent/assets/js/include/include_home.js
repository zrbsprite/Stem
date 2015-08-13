$(document).ready(function () {
    $("#login_btn").click(function () {
    	var $userName = $("#userName");
        var userName = $userName.val();
        var $password = $("#password");
        var password = $password.val();
        if (userName == '') {
        	$userName.focus();
	    	var d = dialog({
	    		align: 'right top',
	    		content: '用户名不能为空'
	    	});
	    	d.show($userName.get(0));
	    	setTimeout(function () {
	    	    d.close().remove();
	    	}, 2000);
	    	return false;
        }	
        if (password == '') {
        	$password.focus();
        	var d = dialog({
	    		align: 'right top',
	    		content: '密码不能为空'
	    	});
	    	d.show($password.get(0));
	    	setTimeout(function () {
	    	    d.close().remove();
	    	}, 2000);
	    	return false;
        }
        loginAjax();
    });
});
function loginAjax() {
    $.ajax({
        url: basepath + "/login.htm",
        type: 'post',
        data: $("#loginFrom").serialize(),
        dataType: 'json',
        success: function (data) {
            if (data != '') {
                if (data.errcode==200) {
                	$("#loginFrom").submit();
                }else{
                	showTip(data.errmsg);
                }
            }
        }, error: function (e) {
        	showTip('系统出错!请联系管理员');
        }
    });
}
function showTip(msg){
	var d = dialog({
		fixed: true,
	    title: '提示信息',
	    content: msg,
	    ok: function () {
	    	this.close();
	    }
	});
	d.width(250).showModal();
}

function register(){
	win.confirm("hello",function(){console.log(1);},function(){console.log(2);});
	//window.location.href = basepath + "/naturalman/goRegister.htm";
}

function findPass(){
	window.location.href = basepath + "/naturalman/findPass.htm";
}  