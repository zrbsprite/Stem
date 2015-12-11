<div class="container-fluid">
	<div class="row">
	 <div class="span12">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>检查时间：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="electrocardiogramExamInfo.examtime" value=""  onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
          </label>
          <label class="radio-inline">
          	<b>检查人：</b>
          </label>
          <label class="radio-inline">
          	<input type="text" name="electrocardiogramExamInfo.examman" value="" maxlength="50" placeholder="输入检查人姓名"/>
          </label>
      </div>
     </div>
   </div>
   <div class="row">
   	<div class="span4">
	   <div class="input-group input-sm">
          <label class="radio-inline">
          	<b>检查结果：</b>
          </label>
        </div>
    </div>
    <div class="span12">
		<div class="row">
			<div class="input-group input-sm">
	            <label class="radio-inline">
			      	<input type="radio" name="electrocardiogramExamInfo.examresult" value="0"/>正常
			      </label>
			</div>
		</div>
		<div class="row">
			<div class="input-group input-sm">
	            <label class="radio-inline">
			      	<input type="radio" name="electrocardiogramExamInfo.examresult" value="1"/>异常，异常类型：
			      </label>
			      <label class="radio-inline">
			      	<input type="radio" name="electrocardiogramExamInfo.exceptiontype" value="01"/>房颤 
			      </label>
			      <label class="radio-inline">
			      	<input type="radio" name="electrocardiogramExamInfo.exceptiontype" value="02" />其他类型心律失常
			      </label>
			</div>
		</div>
     </div>
   </div> 
</div>