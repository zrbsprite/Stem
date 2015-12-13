$(function(){
	$("#btn_submit").click(function(){
		var $isSmokeFlag = $(":radio:checked[name='isSmokeFlag']");
		if($isSmokeFlag.val()=='01'){
			var $isSecondSmokenFlag = $(":radio:checked[name='isSecondSmokenFlag']");
			if($isSecondSmokenFlag.length<=0){
				dialog.warn("请勾选是否被动抽烟选项！");
				return false;
			}else if($isSecondSmokenFlag.val()=='0102'){
				var $secondSmokenYear = $isSecondSmokenFlag.next("input");
				var secondSmokenYearVal = $secondSmokenYear.val();
				if(""==secondSmokenYearVal){
					dialog.tips($secondSmokenYear.get(0));
					$secondSmokenYear.focus();
					return false;
				}
			}
		}
		dialog.loading();
		$("#mainForm").submit();
		this.disabled="disabled";
	});
});