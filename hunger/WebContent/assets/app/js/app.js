A.launch({
	readyEvent: 'ready',
	backEvent: 'backmonitor',
	viewSuffix:''
});
A.Controller.add({
	 html : {
		selector : '[data-toggle="html"]',
		handler : function(hash, el) {
			hash = basepath + hash;
			try {
				location.href = base;
			} catch (e) {
				console.error(e);
				location.href = base;
			}
		}
	}
});