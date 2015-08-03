var COOKIE_NAME = "kuser";//cookie 名称
var COOKIE_USER_NAME;
var separativeSign = "@@@@"//分隔符
// 表单交互 zml

// 文本框初始值及失去焦点
function clearDefaultText(el, message) {
    var obj = el;
    if (typeof(el) == "string")
        obj = document.getElementById(id);
    if (obj.value == message) {
        obj.value = "";
        obj.style.color = "#555";
    }
    obj.onblur = function () {
        if (obj.value == "") {
            obj.value = message;
            obj.style.color = "";
        }
    }
}
function clearDeTxt (el){
	var obj = el;
	var objinput = obj.previousSibling;
	if (typeof(el) == "string"){
		obj = document.getElementById(id);
	}
	obj.style.display = "none";
	objinput.focus();
	objinput.onfocus = function(){
		obj.style.display = "none";
	};
	objinput.onblur = function(){
		if (objinput.value == ""){
		   obj.style.display = "block";
		}
	};
}
/***
 * 获取用户kookie
 * @returns {*}
 */
function getCookie() {
    var cokuser = $.cookie(COOKIE_NAME);
    if (cokuser == undefined) {
        return '';
    }
    COOKIE_USER_NAME = cokuser;
    return COOKIE_USER_NAME;
}


/**
 * 关闭功能按钮
 */
function hideMenu() {
    document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
        WeixinJSBridge.call('hideOptionMenu');
    });
}
/**
 * 开启功能按钮
 */
function showMenu() {
    document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
        WeixinJSBridge.call('showOptionMenu');
    });
}





