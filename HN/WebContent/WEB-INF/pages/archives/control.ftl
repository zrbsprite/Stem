<div class="container-fluid">
	<div class="row"><h4><b>4.1 脑血管病史 </b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>脑血管病史：</b>
              </label>
			</div>
		</div>
		<div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="isbrainblood" checked>无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="isbrainblood">有，发病次数：<input type="text" value="" name="number" required> 次
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	末次发病时间：
	              </label>
	              <label class="radio-inline">
	              	<input type="text" value="" name="lasttime"  onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" required> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	主要诊断：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="01" name="diagnosis" checked> 脑梗死
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="02" name="diagnosis"> 脑出血
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="03" name="diagnosis"> 蛛网膜下腔出血
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="04" name="diagnosis"> 短暂性脑缺血发作（TIA）
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	诊断依据：
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="basisbrainct"> 脑部CT
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="basisbrainmri"> 脑部MRI
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="clinical"> 临床表现 （症状、体征）
	              </label>
			  </div>
			</div>
		</div>
	</div>
	<div class="row"><h4><b>MRS评分（脑血管病患者填写）</b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>评估时间：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" value="" name="mrstime" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})">
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>选项(单选)</b>
              </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>评分值</b>
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
				<input type="radio" value="01" name="mrsoption"> 完全无症状
	          </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	0
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="02" name="mrsoption"> 尽管有症状，但无明显功能障碍，能完成所有日常工作和生活
              </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	1
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="03" name="mrsoption"> 轻度残疾，不能完成病前所有活动，但不需帮助能照顾自己的日常生活
              </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	2
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="04" name="mrsoption"> 中度残疾，需部分帮助，但能独立行走
              </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	3
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="05" name="mrsoption"> 重度残疾，不能独立行走，无他人帮助不能满足自身日常生活需求
              </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	4
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="06" name="mrsoption"> 严重残疾，持续卧床、二便失禁，需持续护理和关注，日常生活完全依赖他人
              </label>
			</div>
		</div>
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	5
              </label>
			</div>
		</div>
	</div>
	
	
	<div class="row"><h4><b>4.2 心脏病史 </b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>心脏病史：</b>
              </label>
			</div>
		</div>
		<div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="heartDiseaseHistory.isheartdisease">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="heartDiseaseHistory.isheartdisease">有，心脏病类型：
	              </label>
	               <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.coronarydisease"> 冠心病
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.atrialfibrillation"> 房颤
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.vhd"> 瓣膜性心脏病
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.other"> 其他
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	如果有冠心病，冠心病发病次数：
	              </label>
	              <label class="radio-inline">
	              	<input type="text" value="" name="heartDiseaseHistory.number" maxlength='4'> 次
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	 冠心病末次发病时间：
	              </label>
	              <label class="radio-inline">
	              	<input type="text" value="" name="heartDiseaseHistory.lasttime"   onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	主要诊断：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="01" name="heartDiseaseHistory.diagnosis"> 心肌梗死（
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0101" name="heartDiseaseHistory.diagnosisItem"> ST段抬高型心肌梗死 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0102" name="heartDiseaseHistory.diagnosisItem"> 非ST段抬高型心肌梗死
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0103" name="heartDiseaseHistory.diagnosisItem"> 不详）
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="02" name="heartDiseaseHistory.diagnosis"> 心绞痛（
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0201" name="heartDiseaseHistory.diagnosisItem"> 稳定型
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0202" name="heartDiseaseHistory.diagnosisItem"> 不稳定型
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0203" name="heartDiseaseHistory.diagnosisItem"> 不详）
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	诊断依据：
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.basismyocardialenzymes"> 心肌酶升高
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.basisecg">心电图异常
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.basiscoronaryangiography"> 冠脉造影
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="heartDiseaseHistory.clinical"> 临床表现
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	如果有房颤，首次确诊时间：
	              </label>
	              <label class="radio-inline">
	              	<input type="text" value="" placeholder="点击选择时间" name="heartDiseaseHistory.firsttime" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否服用抗血小板药物：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="heartDiseaseHistory.isplatelet"> 是
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="heartDiseaseHistory.isplatelet"> 否
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	目前经常服用的抗血小板药物：
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否服用抗凝药物：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="heartDiseaseHistory.isanticoagulant"> 是
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="heartDiseaseHistory.isanticoagulant"> 否
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	目前经常服用的抗凝药物：
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="historyPharmacy.pharmacyname">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="historyPharmacy.pharmacyyear">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="historyPharmacy.pharmacysituation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="historyPharmacy.pharmacysituation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
		</div>
	</div>
	<div class="row"><h4><b>4.3 高血压  </b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>血压测量频率：</b>
              </label>
              <label class="radio-inline">
              	<input type="radio" value="01" name="hypertensionHistory.frequency"> 从未测量
              </label>
              <label class="radio-inline">
              	<input type="radio" value="02" name="hypertensionHistory.frequency"> 经常测量（每月至少1次）
              </label>
              <label class="radio-inline">
              	<input type="radio" value="03" name="hypertensionHistory.frequency"> 偶尔测量
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为高血压：</b>
              </label>
			</div>
		</div>
		<div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="hypertensionHistory.ishypertension">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="hypertensionHistory.ishypertension">有，确诊时间：<input type="text" value="" name="hypertensionHistory.diagnosistime"  onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否服用降压药：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="hypertensionHistory.ishypotensor">否 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="hypertensionHistory.ishypotensor">是
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	目前经常服用的降压药物 ：
	              </label>
              </div>
          </div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否服用降同型半胱氨酸药：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="hypertensionHistory.iscysteine">否 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="hypertensionHistory.iscysteine">是
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	 目前经常服用的降同型半胱氨酸药物：
	              </label>
              </div>
          </div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>血压控制情况：</b>
              </label>
              <label class="radio-inline">
              	<input type="radio" value="01" name="hypertensionHistory.control"> 基本平稳 
              </label>
              <label class="radio-inline">
              	<input type="radio" value="02" name="hypertensionHistory.control"> 波动较大
              </label>
              <label class="radio-inline">
              	<input type="radio" value="03" name="hypertensionHistory.control"> 不清楚，
              </label>
              <label class="radio-inline">
              	此情况已维持年限：<input type="text" value="" name="hypertensionHistory.controlyear">年
              </label>
			</div>
		</div>
	</div>
	
	
	<div class="row"><h4><b>4.4 血脂异常 </b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>血脂测量频率：</b>
              </label>
              <label class="radio-inline">
              	<input type="radio" value="01" name="bloodFatHistory.frequency"> 从未检测
              </label>
              <label class="radio-inline">
              	<input type="radio" value="02" name="bloodFatHistory.frequency"> 定期检测
              </label>
              <label class="radio-inline">
              	<input type="radio" value="03" name="bloodFatHistory.frequency"> 偶尔检测（每年检测不足1次）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为血脂异常：</b>
              </label>
			</div>
		</div>
		<div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="bloodFatHistory.isbloodfat">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="bloodFatHistory.isbloodfat">有，确诊时间：<input type="text" value="" name="bloodFatHistory.diagnosistime" onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	 血脂异常类型：
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="bloodFatHistory.highcholesterol"> 高胆固醇
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="bloodFatHistory.hightriglyceride"> 高甘油三酯
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="bloodFatHistory.highldlC"> 高LDL-C
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="bloodFatHistory.lowhdlC"> 低HDL-C
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="bloodFatHistory.other"> 不详
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否服用调脂药：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="bloodFatHistory.islipidLowering">否 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="bloodFatHistory.islipidLowering">是
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	目前经常服用的调脂药物：
	              </label>
              </div>
            </div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	血脂控制情况：
	              </label>
              </div>
            </div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<b>胆固醇：</b>
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="01" name="bloodFatHistory.cholesterolcontrol"> 基本达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="02" name="bloodFatHistory.cholesterolcontrol"> 未达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="03" name="bloodFatHistory.cholesterolcontrol"> 不清楚
	              </label>
	              <label class="radio-inline">
	              	，此情况已维持年限：<input type="text" value="" name="bloodFatHistory.cholesterolyear" maxlength='3'>年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<b>甘油三酯：</b>
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="01" name="bloodFatHistory.triglyceridecontrol"> 基本达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="02" name="bloodFatHistory.triglyceridecontrol"> 未达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="03" name="bloodFatHistory.triglyceridecontrol"> 不清楚
	              </label>
	              <label class="radio-inline">
	              	，此情况已维持年限：<input type="text" value="" name="bloodFatHistory.triglycerideyear" maxlength='3'>年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<b>LDL-C：</b>
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="01" name="bloodFatHistory.ldlCcontrol"> 基本达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="02" name="bloodFatHistory.ldlCcontrol"> 未达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="03" name="bloodFatHistory.ldlCcontrol"> 不清楚
	              </label>
	              <label class="radio-inline">
	              	，此情况已维持年限：<input type="text" value="" name="bloodFatHistory.ldlCyear" maxlength='3'>年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<b>HDL-C：</b>
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="bloodFatHistory.hdlCcontrol"> 基本达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="bloodFatHistory.hdlCcontrol"> 未达标 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="bloodFatHistory.hdlCcontrol"> 不清楚
	              </label>
	              <label class="radio-inline">
	              	，此情况已维持年限：<input type="text" value="" name="bloodFatHistory.hdlCyear" maxlength='3'>年
	              </label>
			  </div>
			</div>
		</div>
	</div>
	<div class="row"><h4><b>4.5 糖尿病 </b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>血糖测量频率：</b>
              </label>
              <label class="radio-inline">
              	<input type="radio" value="01" name="diabetesHistory.frequency"> 从未检测
              </label>
              <label class="radio-inline">
              	<input type="radio" value="02" name="diabetesHistory.frequency"> 定期检测
              </label>
              <label class="radio-inline">
              	<input type="radio" value="03" name="diabetesHistory.frequency"> 偶尔检测（每年检测不足1次）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为糖尿病：</b>
              </label>
			</div>
		</div>
		<div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="diabetesHistory.isdiabetes">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="diabetesHistory.isdiabetes">有，确诊时间：<input type="text" value="" name="diabetesHistory.diagnosistime" onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否服降糖药：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="diabetesHistory.ishypoglycemic">否 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="diabetesHistory.ishypoglycemic">是
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	目前经常服用的降糖药物：
	              </label>
              </div>
            </div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	药品通用名：<input type="text" value="" name="nation">
	              </label>
	              <label class="radio-inline">
	              	，用药年限：<input type="text" value="" name="nation">年
	              </label>
	              <label class="radio-inline">
	              	，用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="" name="nation"> 不规律
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否使用胰岛素：
	              </label>
              </div>
            </div>
            <div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	是否使用胰岛素：
	              </label>
	               <label class="radio-inline">
	              	<input type="radio" value="0" name="diabetesHistory.isinsulin">否 
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="diabetesHistory.isinsulin">是
	              </label>
	               <label class="radio-inline">
	              	如果是,用药情况：
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="0" name="diabetesHistory.pharmacysituation">规律
	              </label>
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="diabetesHistory.pharmacysituation">不规律
	              </label>
              </div>
            </div>
            <div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	血糖控制情况：
	              </label>
	               <label class="radio-inline">
	              	<input type="radio" value="01" name="diabetesHistory.control">基本达标
	              </label>
	               <label class="radio-inline">
	              	<input type="radio" value="02" name="diabetesHistory.control">未达标
	              </label>
	               <label class="radio-inline">
	              	<input type="radio" value="03" name="diabetesHistory.control">不清楚 
	              </label>
	               <label class="radio-inline">
	              	此情况已维持年限：
	              </label>
	               <label class="radio-inline">
	              	<input type="number" name="diabetesHistory.controlyeat" maxlength='3' />年
	              </label>
              </div>
            </div>
		</div>
	</div>
	
	<div class="row"><h4><b>4.6 肾脏疾病 </b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为肾脏疾病：</b>
              </label>
			</div>
		</div>
	  <div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="kidneyDiseaseHostory.iskidneydisease">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="kidneyDiseaseHostory.iskidneydisease">有，确诊时间：<input type="text" value="" name="kidneyDiseaseHostory.diagnosistime" onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<b>肾脏疾病类型：</b>
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="kidneyDiseaseHostory.diabetes"> 糖尿病肾病
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="kidneyDiseaseHostory.hypertension"> 高血压肾病 
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="kidneyDiseaseHostory.renalfailure"> 肾功能衰竭
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="kidneyDiseaseHostory.acutenephritis"> 急性肾炎
	              </label>
	              <label class="checkbox-inline">
	              	<input type="checkbox" value="1" name="kidneyDiseaseHostory.chronicnephritis"> 慢性肾炎
	              </label>
			  </div>
			</div>
		</div>
	</div>
	
	<div class="row"><h4><b>4.7 下肢动脉病变 </b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为下肢动脉病变：</b>
              </label>
              <input type="hidden" name="others[0].othertype" value="01">
			</div>
		</div>
	  <div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="others[0].isother">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="others[0].isother">有，确诊时间：<input type="text" value="" name="others[0].diagnosistime" onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
		</div>
	</div>
	
	
	<div class="row"><h4><b>4.8 眼底血管病变 </b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为眼底血管病变：</b>
              </label>
              <input type="hidden" name="others[1].othertype" value="02">
			</div>
		</div>
	  <div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="0" name="others[1].isother">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="1" name="others[1].isother">有，确诊时间：<input type="text" value="" name="others[1].diagnosistime" onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
		</div>
	</div>
	 
	 
	<div class="row"><h4><b>4.9 肺源性疾病 </b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>既往有无被诊断为肺源性疾病：</b>
              </label>
			</div>
		</div>
	  <div class="span12">
			<div class="row">
				<div class="input-group input-sm">
		            <label class="radio-inline">
		             	<input type="radio" value="" name="pulmonaryDiseaseHistory.ispulmonarydisease">无
		            </label>
				</div>
			</div>
			<div class="row">
			  <div class="input-group input-sm">
	              <label class="radio-inline">
	              	<input type="radio" value="" name="pulmonaryDiseaseHistory.ispulmonarydisease">有，确诊时间：<input type="text" value="" name="pulmonaryDiseaseHistory.diagnosistime" onfocus="WdatePicker({dateFmt:'yyyy'})"> 年
	              </label>
			  </div>
			</div>
		</div>
	</div>
	
	<div class="row"><h4><b>4.10 口腔炎症 </b></h4></div>
	<div class="row">
		<div class="input-group input-sm">
			<input type="hidden" name="others[2].othertype" value="03">
            <label class="radio-inline">
             	<input type="radio" value="0" name="others[2].isother">无
            </label>
            <label class="radio-inline">
          		<input type="radio" value="1" name="others[2].isother">有
          </label>
		</div>
	</div>
	<div class="row"><h4><b>4.11 精神心理疾病 </b></h4></div>
	<div class="row">
		<div class="input-group input-sm">
			<input type="hidden" name="others[3].othertype" value="04">
            <label class="radio-inline">
             	<input type="radio" value="0" name="others[3].isother">无
            </label>
            <label class="radio-inline">
          		<input type="radio" value="1" name="others[3].isother">有
          </label>
		</div>
	</div>
	
	
</div>