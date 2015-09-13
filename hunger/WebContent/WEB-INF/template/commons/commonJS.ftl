<script type="text/javascript" src="${basepath}/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="${basepath}/assets/js/art/dialog-min.js"></script>
<script type="text/javascript">
var win = {
	alert:function(msg){
		var d = dialog({
			fixed: true,
		    title: '提示信息',
		    content: msg,
		    ok: function () {
		    	this.close();
		    }
		});
		d.width(250).showModal();
	},
	confirm:function(msg, okFun, cancelFun){
		var d = dialog({
		    title: '提示',
		    fixed: true,
		    content: msg,
		    okValue: '确定',
		    ok: function () {
		        okFun();
		    },
		    cancelValue: '取消',
		    cancel: function () {
		    	cancelFun();
		    }
		});
		d.width(250).showModal();
	},
	loading:function(){
		var d = dialog({});
		d.width(250).height(250).showModal();
		return d;
	},
	screen:function(msg){
		var d = dialog({content:msg});
		d.width(250).height(250).showModal();
		return d;
	},
	tip:function(msg, ele, autoClose){
		var d = dialog({
			align: 'right bottom',
			content: msg,
			quickClose: true
		});
		d.show(ele);
		if(autoClose){
			setTimeout(function () {
			    d.close().remove();
			}, 2000);
		}
	}
};
</script>
