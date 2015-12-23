(function($,window){
	var Dialog=function(){};
	Dialog.prototype={};
	Dialog.prototype.warn=function(msg){
		layer.alert(msg,{icon: 0,title:'提示信息'},function(index){
		    layer.close(index);
		})
	};
	Dialog.prototype.ok=function(msg){
		layer.alert(msg,{icon: 1,title:'提示信息'},function(index){
		    layer.close(index);
		})
	};
	Dialog.prototype.error=function(msg){
		layer.alert(msg,{icon: 2,title:'错误信息'},function(index){
			layer.close(index);
		})
	};
	Dialog.prototype.question=function(msg){
		layer.alert(msg,{icon: 3,title:'错误信息'},function(index){
			layer.close(index);
		})
	};
	Dialog.prototype.lock=function(msg){
		layer.alert(msg,{icon: 4,title:'错误信息'},function(index){
			layer.close(index);
		})
	};
	Dialog.prototype.cry=function(msg){
		layer.alert(msg,{icon: 5,title:'错误信息'},function(index){
			layer.close(index);
		})
	};
	Dialog.prototype.smile=function(msg){
		layer.alert(msg,{icon: 6,title:'错误信息'},function(index){
			layer.close(index);
		})
	};
	Dialog.prototype.confirm=function(msg,sure,cancel){
		layer.confirm(msg, {
		    btn: ['确定','取消'],
		    icon: 0
		}, function(index){
			layer.close(index);
			if(undefined!=sure&&null!=sure&&typeof sure=="function"){
				sure();
			}
		}, function(index){
			layer.close(index);
			if(undefined!=cancel&&null!=cancel&&typeof cancel=="function"){
				cancel();
			}
		});
	}
	Dialog.prototype.info=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6});
	};
	Dialog.prototype.infoOk=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:1});
	};
	Dialog.prototype.infoWarn=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:0});
	};
	Dialog.prototype.infoFail=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:2});
	};
	Dialog.prototype.infoQuestion=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:3});
	};
	Dialog.prototype.infoSmile=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:6});
	};
	Dialog.prototype.infoCry=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:5});
	};
	Dialog.prototype.infoLock=function(msg){
		layer.msg(msg,{shade: [0.8, '#393D49'],shift :6, icon:4});
	};
	Dialog.prototype.tips=function(msg,ele){
		layer.tips(msg, ele,{tips: [1, '#3595CC']});
	}
	Dialog.prototype.prompt=function(title,callback){
		layer.prompt({
		    title: title,
		    formType: 0,
		}, function(text,index){
			if(undefined!=callback&&null!=callback&&typeof callback=="function"){
				callback(text);
			}
			layer.close(index);
		});
	}
	Dialog.prototype.promptPassword=function(title,callback){
		layer.prompt({
			title: title,
			formType: 1,
		}, function(password,index){
			if(undefined!=callback&&null!=callback&&typeof callback=="function"){
				callback(password);
			}
			layer.close(index);
		});
	}
	Dialog.prototype.promptText=function(title,callback){
		layer.prompt({
			title: title,
			formType: 3,
		},function(text,index){
			if(undefined!=callback&&null!=callback&&typeof callback=="function"){
				callback(text);
			}
			layer.close(index);
		});
	}
	Dialog.prototype.loading=function(){
		return layer.load(0,{shade: [0.5, '#393D49']}); 
	}
	Dialog.prototype.loading1=function(){
		return layer.load(1,{shade: [0.8, '#393D49']}); 
	}
	Dialog.prototype.loading2=function(){
		return layer.load(1,{shade: [0.8, '#393D49']}); 
	}
	
	//todo
	Dialog.prototype.sysMsg=function(content,callback){
		layer.open({
		    type: 1,
		    title: false,
		    closeBtn: 0,
		    shade: [0],
		    area: ['340px', '215px'],
		    offset: 'rb',
		    time: 5000,
		    shift: 2,
		    content:content,
		    end: function(){
		    	if(undefined!=callback&&null!=callback&&typeof callback=="function"){
					callback();
				}
		    }
		});
	}
	
	Dialog.prototype.openPage=function(title, url){
		layer.open({
		    type: 1,
		    skin: 'layui-layer-lan',
		    area: ['420px', '240px'],
		    content: 'html内容'
		});
	}
	Dialog.prototype.openIframe=function(title, url){
		layer.open({
		    type: 2,
		    title: title,
		    shadeClose: true,
		    shade: 0.8,
		    area: ['380px', '90%'],
		    content: url
		}); 
	}
	Dialog.prototype.openElement=function($ele){
		layer.open({
		    type: 1,
		    shade: [0.8, '#393D49'],
		    title: false,
		    content: $ele,
		    cancel: function(index){
		        layer.close(index);
		    }
		});
	}
	window.dialog=new Dialog();
})($,window);
