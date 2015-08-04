;(function($,window,layer){
	var box = new Object();
	layer.config({
	    extend: ['skin/myskin/style.css'], //加载新皮肤
	    skin: 'layer-ext-seaing' //一旦设定，所有弹层风格都采用此主题。
	});
	box.prototype={
		tip:function(msg, id){
			layer.tips(msg,'#'+id);
		},
		alert:function(msg){
			layer.alert(msg, {icon:0});
		},
		confirm:function(msg,okFun, cancelFun, title){
			if(!title||title=="")title='确认信息';
			layer.confirm(msg,{icon: 4, title:title},function(index){
				okFun();
				layer.close(index);
			},function(index){
				cancelFun();
				layer.close(index);
			});
		},
		open:function(title, content){
			 var layerIndex = layer.open({
			    type: 1,
			    scrollbar: false,
			    area: ['600px', '450px'],
			    fix: true,
			    title: title,
			    content: content
			});
			return layerIndex;
		},
		iframe:function(title, url){
			var layerIndex = layer.open({
			    type: 2,
			    area: ['600px', '450px'],
			    fix: true,
			    title: title,
			    content: url
			});
			return layerIndex;
		},
		loading:function(){
			return layer.msg('处理中，请稍后...', {icon: 16,shade: [0.5, '#393D49'],time:0});
		},
		msg:function(msg, callback){
			var index = layer.msg(msg, function(){
				callback();
			});
			return index;
		},
		imageView:function(path){
			layer.open({
			    type: 1,
			    area: ['500px', '500px'],
			    title: false,
			    skin: 'layui-layer-nobg',
			    shadeClose: true,
			    content: '<p style="text-align: center;"><img src="'+path+'" alt="无法显示图片" style="width:100%;height:100%;" /></p>'
			});
		},
		prompt:function(callback){
			layer.prompt(function(val){
			    callback(val);
			});
		}
	};
}($,window,layer));