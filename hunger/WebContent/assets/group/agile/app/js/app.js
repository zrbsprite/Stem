A.launch({
	readyEvent: 'ready',
	backEvent: 'backmonitor',
	viewSuffix:'.htm'
});
A.Controller.add({
	 html : {
		selector : '[data-toggle="html"]',
		handler : function(hash){
			location.href = hash;
		}
	}
});