<div class="container-fluid">
	<input type="hidden" name="cid" value="${cid}"> 
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>高血压：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="hypertension" value="1" />是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="hypertension" value="0" />无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>血脂异常：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="dyslipidemia"  value="1"/>是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="dyslipidemia"  value="0"/>无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>糖尿病：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="diabetes"  value="1"/>是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="diabetes" value="0" />无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>房颤或瓣膜性心脏病：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="atrialfibrillation"  value="1"/>是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="atrialfibrillation"  value="0"/>无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>吸烟史：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="smokinghistory"  value="1"/>是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="smokinghistory" value="0" />无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>明显超重或肥胖：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="overweight" value="1" />是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="overweight" value="0" />无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>运动缺乏或轻体力劳动者：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="sportslack" value="1" />是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="sportslack"  value="0"/>无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>脑卒中家族史：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="familyhistory" value="1" />是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="familyhistory" value="0" />无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>既往脑卒中：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="paststroke" value="1" />是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="paststroke" value="0" />无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="input-group input-sm">
          <label class="radio-inline">
          	<b>既往短暂性脑缺血发作（TIA）：</b>
          </label>
          <label class="radio-inline">
          	<input type="radio" name="pasttia" value="1" />是
          </label>
           <label class="radio-inline">
          	<input type="radio" name="pasttia"  value="0"/>无
          </label>
       </div>
   </div>
	<div class="row">
		<div class="span2">
			<div class="input-group input-sm">
	          <label class="radio-inline">
	          	<b>风险分级：</b>
	          </label>
	       </div>
		</div>
		<div class="span2">
				<div class="input-group input-sm">
					<label class="radio-inline">
			      	  <input type="radio" name="grade"  value="01" />脑卒中
			        </label>
				</div>
			</div>
			<div class="span2">
				<div class="input-group input-sm">
					<label class="radio-inline">
			      	  <input type="radio" name="grade" value="02" />TIA
			        </label>
				</div>
			</div>
			<div class="span2">
				<div class="input-group input-sm">
					<label class="radio-inline">
			      	  <input type="radio" name="grade"  value="03"/>n≥3高危
			        </label>
				</div>
			</div>
   </div>
   <div class="row">
   		<div class="span2">
			<div class="input-group input-sm">
	       </div>
		</div>
		<div class="span2">
			<div class="input-group input-sm">
				<label class="radio-inline">
		      	  <input type="radio" name="grade" value="04"/>中危
		        </label>
			</div>
		</div>
		<div class="span2">
			<div class="input-group input-sm">
				<label class="radio-inline">
		      	  <input type="radio" name="grade" value="05"/>低危
		        </label>
			</div>
		</div>
	</div>
   <div class="row">
		<div class="span2">
			<div class="input-group input-sm">
	          <label class="radio-inline">
	          	<b>危险标识：</b>
	          </label>
	       </div>
		</div>
		<input type="hidden" name="mark" value=""/>
		<div class="span6">
			<div class="alert alert-success" role="alert"></div>
		</div>
		<div class="span2">
			<div class="alert alert-warning" role="alert"></div>
		</div>
		<div class="span2">
			<div class="alert alert-danger" role="alert"></div>
		</div>
   </div>
   <div class="row">
		<div class="span2">
			<div class="input-group input-sm">
	          <label class="radio-inline">
	          	<b>管理分级：</b>
	          </label>
	       </div>
		</div>
		
		<input type="hidden" name="managelevel" value=""/>
		
		<div class="span6">
			<div class="input-group input-sm">
				<label class="radio-inline">
					强化管理
				</label>
			</div>
		</div>
		<div class="span2">
				<div class="input-group input-sm">
					<label class="radio-inline">
					规范化管理
					</label>
				</div>
		</div>
		<div class="span2">
				<div class="input-group input-sm">
					<label class="radio-inline">
					健康管理
					</label>
				</div>
		</div>
   </div>
   
</div>