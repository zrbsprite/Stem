$(function(){
	$("#btn_submit").click(function(){
		//检验
		var $brainBloodHistory_isbrainblood=$("[name='brainBloodHistory.isbrainblood']:radio:checked");
		if($brainBloodHistory_isbrainblood.length<=0){
			dialog.info("请勾选有无脑血管病史");
			return false;
		}else if($brainBloodHistory_isbrainblood.val()==1){
			var $brainBloodHistory_number=$("[name='brainBloodHistory.number']");
			if(isEmpty($brainBloodHistory_number.val())){
				dialog.tips("发病次数不能为空", $brainBloodHistory_number.get(0));
				$brainBloodHistory_number.focus();
				return false;
			}
			var $brainBloodHistory_lasttime=$("[name='brainBloodHistory.lasttime']");
			if(isEmpty($brainBloodHistory_lasttime.val())){
				dialog.tips("请选择末发病时间", $brainBloodHistory_lasttime.get(0));
				$brainBloodHistory_lasttime.focus();
				return false;
			}
			var $brainBloodHistory_diagnosis=$("[name='brainBloodHistory.diagnosis']:radio:checked");
			if($brainBloodHistory_diagnosis.length<=0){
				dialog.info("请勾选主要诊断");
				return false;
			}
			var $brainBloodHistory_basisbrainct=$("[name='brainBloodHistory.basisbrainct']:checkbox:checked");
			if($brainBloodHistory_basisbrainct.length<=0){
				dialog.info("请勾选诊断依据");
				return false;
			}
		}
		//mrs评估
		var $brainBloodHistory_mrstime=$("[name='brainBloodHistory.mrstime']");
		if(isEmpty($brainBloodHistory_mrstime.val())){
			dialog.tips("请选择末评估时间", $brainBloodHistory_mrstime.get(0));
			$brainBloodHistory_mrstime.focus();
			return false;
		}
		var $brainBloodHistory_mrsoption=$("[name='brainBloodHistory.mrsoption']:radio:checked");
		if($brainBloodHistory_mrsoption.length<=0){
			dialog.info("请勾选评估选项");
			return false;
		}
		
		//heart
		var $heartDiseaseHistory_isheartdisease=$("[name='heartDiseaseHistory.isheartdisease']:radio:checked");
		if($heartDiseaseHistory_isheartdisease.length<=0){
			dialog.info("请勾选有无心脏病史");
			return false;
		}else if($heartDiseaseHistory_isheartdisease.val()==1){
			//心脏病类型
			var $disType=$heartDiseaseHistory_isheartdisease.closest("div").find(":checkbox:checked");
			if($disType.length<=0){
				dialog.info("请勾选心脏病类型");
				return false;
			}
			var $heartDiseaseHistory_coronarydisease=$("[name='heartDiseaseHistory.coronarydisease']:checkbox:checked");
			if($heartDiseaseHistory_coronarydisease.length>0){
				var $heartDiseaseHistory_number=$("[name='heartDiseaseHistory.number']");
				if(isEmpty($heartDiseaseHistory_number.val())){
					dialog.info("请填写冠心病发病次数");
					$heartDiseaseHistory_number.focus();
					return false;
				}
				var $heartDiseaseHistory_lasttime=$("[name='heartDiseaseHistory.lasttime']");
				if(isEmpty($heartDiseaseHistory_lasttime.val())){
					dialog.info("请填写冠心病发病次数");
					$heartDiseaseHistory_lasttime.focus();
					return false;
				}
				var $heartJudge=$("#div_heartDiseaseHistory_radio_01").find(":radio[name='heartDiseaseHistory.diagnosis']");
				if($heartJudge.length<=0){
					dialog.info("请勾选主要诊断选项");
					return false;
				}else{
					if($heartJudge.val()=='01'){
						var $judge01=$heartJudge.closest("div").find(".judge01:checked");
						if($judge01.length<=0){
							dialog.info("请勾选对应类型");
							return false;
						}
					}else{
						var $judge01=$heartJudge.closest("div").find(".judge02:checked");
						if($judge01.length<=0){
							dialog.info("请勾选对应类型");
							return false;
						}
					}
				}
				var $judgeby=$("#div_judgeby_checkbox_01 :checkbox:checked");
				if($judgeby.length<=0){
					dialog.info("请勾选冠心病诊断依据");
					return false;
				}
			}
			
			//房颤
			var $heartDiseaseHistory_coronarydisease=$("[name='heartDiseaseHistory.coronarydisease']:checkbox:checked");
			
		}
		
		$("#mainForm").submit();
		this.disabled="disabled";
	});
});
function addItem(that){
	
}