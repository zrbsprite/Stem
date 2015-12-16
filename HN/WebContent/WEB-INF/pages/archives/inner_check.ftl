<div class="container-fluid">
	<input type="hidden" name="cid" value="${cid}"/>
	<div class="row"><h4><b>8.1 血糖 </b></h4></div>
	<input type="hidden" name="bloodGlucoseExamInfos[0].bloodglucoseexamid" >
	<input type="hidden" name="bloodGlucoseExamInfos[0].crowdid" value="${cid}">
	<input type="hidden" name="bloodGlucoseExamInfos[0].bloodglucosetype" value="01" >
	<div class="row">
		<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>检查时间：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodGlucoseExamInfos[0].examtime"  onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
              </label>
              <label class="radio-inline">
              	<b>空腹血糖：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodGlucoseExamInfos[0].examresult" />mmol/L （必填）
              </label>
		</div>
	</div>
	<div class="row">
	<input type="hidden" name="bloodGlucoseExamInfos[1].bloodglucoseexamid" >
	<input type="hidden" name="bloodGlucoseExamInfos[1].crowdid" value="${cid}">
	<input type="hidden" name="bloodGlucoseExamInfos[1].bloodglucosetype" value="01" >
		<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>检查时间：</b>
              </label>
              <label class="radio-inline">
              	<input type="text"  name="bloodGlucoseExamInfos[1].examtime"  onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
              </label>
              <label class="radio-inline">
              	<b>餐后2小时血糖（推荐）：</b>
              </label>
              <label class="radio-inline">
              	<input type="text"  name="bloodGlucoseExamInfos[1].examresult" />mmol/L
              </label>
		</div>
	</div>
	<div class="row">
	<input type="hidden" name="bloodGlucoseExamInfos[2].bloodglucoseexamid" >
	<input type="hidden" name="bloodGlucoseExamInfos[2].crowdid" value="${cid}">
	<input type="hidden" name="bloodGlucoseExamInfos[2].bloodglucosetype" value="01" >
		<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>检查时间：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodGlucoseExamInfos[2]].examtime" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
              </label>
              <label class="radio-inline">
              	<b>糖化血红蛋白（糖尿病人推荐做）：</b>
              </label>
              <label class="radio-inline">
              	<input type="text"  name="bloodGlucoseExamInfos[2].examresult" />%
              </label>
		</div>
	</div>
	
	
	<div class="row"><h4><b>8.2 血脂</b></h4></div>
	<input name="bloodFatExamInfo.bloodfatexamid" type="hidden" >
	<input name="bloodFatExamInfo.crowdid" type="hidden" value="${cid}" >
	<div class="row">
		<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>检查时间：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodFatExamInfo.examtime" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
              </label>
		</div>
	</div>
	<div class="row">
		<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>甘油三酯：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodFatExamInfo.triglyceride" />mmol/L
              </label>
              <label class="radio-inline">
              	<b>胆固醇：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodFatExamInfo.cholesterol"/>mmol/L
              </label>
		</div>
	</div>
	<div class="row">
		<div class="input-group input-sm">
             <label class="radio-inline">
              	<b>低密度脂蛋白胆固醇：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodFatExamInfo.lowcholesterol"/>mmol/L
              </label>
              <label class="radio-inline">
              	<b>高密度脂蛋白胆固醇：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="bloodFatExamInfo.heightcholesterol"/>mmol/L
              </label>
		</div>
	</div>
	
	<div class="row"><h4><b>8.3 同型半胱氨酸（高血压病人推荐做）</b></h4></div>
	<input name="homocysteineExamInfo.homocysteineexamid" type="hidden" >
	<input name="homocysteineExamInfo.crowdid" type="hidden" value="${cid}" >
	<div class="row">
		<div class="input-group input-sm">
              <label class="radio-inline">
              	<b>检查时间：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="homocysteineExamInfo.examtime" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
              </label>
              <label class="radio-inline">
              	<b>同型半胱氨酸：</b>
              </label>
              <label class="radio-inline">
              	<input type="text" name="homocysteineExamInfo.homocysteine"/>mmol/L
              </label>
		</div>
	</div>
</div>