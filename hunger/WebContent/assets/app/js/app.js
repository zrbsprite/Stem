A.launch({
	readyEvent: 'ready',
	backEvent: 'backmonitor',
	viewSuffix:''
});
A.Controller.add({
	 html : {
		selector : '[data-toggle="html"]',
		handler : function(hash, el) {
			try {
				location.href = hash;
			} catch (e) {
				console.error(e);
				location.href = hash;
			}
		}
	},
	section : {
		selector : '[data-toggle="section"]',
		container : '#section_container',
		transition : 'slide',
		history : [],
		complete : function($target, msg){
			var _add2History = function(hash,noState){
		    	var hashObj = A.util.parseURL(hash).getHashobject();
		    	var _history = _controllers.section.history;
		    	if(_history.length==0||(_history.length>1&&$(_history[0].tag).data('cache')==false||$(_history[0].tag).data('cache')=='false')){
		    		noState = true;
		    	}
		        if(noState){//不添加浏览器历史记录
		            _history.shift(hashObj);
		            window.history.replaceState(hashObj,'',hash);
		        }else{
		            window.history.pushState(hashObj,'',hash);
		        }
		        _history.unshift(hashObj);
		    };
			//var hash = '#'+$target.attr('id');
		    hash = "";
			msg = msg||{};
			if(msg.result=='thesame'){
				_add2History(hash ,true);
			}else if(msg.result=='success'){
				_add2History(hash ,false);
			}
		}
	}
});