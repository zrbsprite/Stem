<div class="container-fluid">
	<input type="hidden" name="cid" value="${cid}" />
	<input type="hidden" name="physiqueexamid" value="${physiqueExamInfo.physiqueexamid}" />
	<div class="row"><h4><b>5.1一般体征 </b></h4></div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>身高：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="height" value="${physiqueExamInfo.height}" />cm
          </label>
       </div>
	</div>
    <div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>体重：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="weight" value="${physiqueExamInfo.weight}" />kg
          </label>
		</div>
	</div>
	<div class="row">
		<div class="input-group input-sm">
			<label class="radio-inline">
	          	<b>BMI（系统自动生成）：</b>
	          </label>
	          <label class="radio-inline">
	          	<input type="text" name="bmi" value="${physiqueExamInfo.bmi}" />(kg/m<sup>2</sup>)
	          </label>
	     </div>
   </div>     
  <div class="row">
	<div class="input-group input-sm">    
	          <label class="radio-inline">
	          	<b>腰围：</b>
	          </label>
	          <label class="radio-inline">
	          	<input type="text" name="waist" value="${physiqueExamInfo.waist}" />cm
	          </label>
         </div>
	</div>
	<div class="row"><h4><b>5.2现测血压（需测量2次）</b></h4></div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>第一次，收缩压SBP：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="onesbp" value="${physiqueExamInfo.onesbp}" />mmHg
          </label>
      </div>
	</div>
     <div class="row">
		<div class="input-group input-sm">     
          <label class="radio-inline">
          	<b>舒张压DBP：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="onedbp" value="${physiqueExamInfo.onedbp}" />mmHg
          </label>
      </div>
	</div>
      <div class="row">
		<div class="input-group input-sm">    
          <label class="radio-inline">
          	<b>脉搏：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="onepulse" value="${physiqueExamInfo.onepulse}"/>次/分
          </label>
		</div>
	</div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>第二次，收缩压SBP：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="twosbp" value="${physiqueExamInfo.twosbp}"/>mmHg
          </label>
      </div>
	</div>
      <div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>舒张压DBP：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="twodbp" value="${physiqueExamInfo.twodbp}" />mmHg
          </label>
	    </div>
	  </div>
      <div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>脉搏：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="twopulse" value="${physiqueExamInfo.twopulse}" />次/分
          </label>
		</div>
	</div>
	<div class="row"><h4><b>5.3 心脏听诊</b></h4></div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>心脏杂音：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="cardiacsouffle" value="0" <#if physiqueExamInfo.cardiacsouffle==0>checked</#if>/>无
          </label>
          <label class="radio-inline">
          	<input type="radio" name="cardiacsouffle" value="1" <#if physiqueExamInfo.cardiacsouffle==1>checked</#if>/>有
          </label>
          <label class="radio-inline">
          	<b>心律：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="rhythm" value="0" <#if physiqueExamInfo.rhythm==0>checked</#if>/>整齐 
          </label>
          <label class="radio-inline">
          	<input type="radio" name="rhythm" value="0" <#if physiqueExamInfo.rhythm==1>checked</#if>/>不齐
          </label>
       </div>
     </div>
</div>