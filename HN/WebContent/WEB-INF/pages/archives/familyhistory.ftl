<div class="container-fluid">
	<input type="hidden" value="${cid}" name="cid">
	<div class="row"><h4><b>3.1脑卒中（中风）</b></h4></div>
	<input type="hidden" value="01" name="arrays[0].diseasetype">
	<input type="hidden" value="${zr_brain.familyid}" name="arrays[0].familyid">
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="0" name="arrays[0].isexist" checked>无
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	 <input type="radio" value="1" name="arrays[0].isexist" <#if zr_brain.isexist?exists && zr_brain.isexist==1>checked</#if>>有，与本人关系：
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[0].father" <#if zr_brain.father?exists && zr_brain.father==1>checked</#if>>父亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[0].mother" <#if zr_brain.mother?exists && zr_brain.mother==1>checked</#if>>母亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[0].brothersister" <#if zr_brain.brothersister?exists && zr_brain.brothersister==1>checked</#if>>兄弟姐妹（患病<input type="number" value="${zr_brain.brothersisterNo}" name="arrays[0].brothersisterNo" class="input-short" maxlength="2">人）
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[0].children" <#if zr_brain.children?exists && zr_brain.children==1>checked</#if>>子女（患病<input type="number" value="${zr_brain.childrenNo}" name="arrays[0].childrenNo" class="input-short" maxlength="2">人）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
               <label class="radio-inline">
              	<input type="radio" value="2" name="arrays[0].isexist" <#if zr_brain.isexist?exists && zr_brain.isexist==2>checked</#if>>不详
              </label>
			</div>
		</div>
	</div>
	
	
	<div class="row"><h4><b>3.2 冠心病</b></h4></div>
	<input type="hidden" value="02" name="arrays[1].diseasetype">
	<input type="hidden" value="${zr_diabetes.familyid}" name="arrays[1].familyid">
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="0" name="arrays[1].isexist" <#if zr_diabetes.isexist?exists && zr_diabetes.isexist==0>checked</#if>>无
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	 <input type="radio" value="1" name="arrays[1].isexist" <#if zr_diabetes.isexist?exists && zr_diabetes.isexist==1>checked</#if>>有，与本人关系：
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[1].father" <#if zr_diabetes.father?exists && zr_diabetes.father==1>checked</#if>>父亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[1].mother" <#if zr_diabetes.mother?exists && zr_diabetes.mother==1>checked</#if>>母亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[1].brothersister" <#if zr_diabetes.brothersister?exists && zr_diabetes.brothersister==1>checked</#if>>兄弟姐妹（患病<input type="number" value="${zr_diabetes.brothersisterNo}" name="arrays[1].brothersisterNo" class="input-short" maxlength="2">人）
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[1].children" <#if zr_diabetes.children?exists && zr_diabetes.children==1>checked</#if>>子女（患病<input type="number" value="${zr_diabetes.childrenNo}" name="arrays[1].childrenNo" class="input-short" maxlength="2">人）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
               <label class="radio-inline">
              	<input type="radio" value="2" name="isexist" <#if zr_diabetes.isexist?exists && zr_diabetes.isexist==2>checked</#if>>不详
              </label>
			</div>
		</div>
	</div>
	
	
	<div class="row"><h4><b>3.3 高血压</b></h4></div>
	<input type="hidden" value="03" name="arrays[2].diseasetype">
	<input type="hidden" value="${zr_dyslipidemia.familyid}" name="arrays[2].familyid">
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="0" name="arrays[2].isexist" <#if zr_dyslipidemia.isexist?exists && zr_dyslipidemia.isexist==0>checked</#if>>无
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	 <input type="radio" value="1" name="arrays[2].isexist" <#if zr_dyslipidemia.isexist?exists && zr_dyslipidemia.isexist==1>checked</#if>>有，与本人关系：
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[2].father" <#if zr_dyslipidemia.father?exists && zr_dyslipidemia.father==1>checked</#if>>父亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[2].mother" <#if zr_dyslipidemia.mother?exists && zr_dyslipidemia.mother==1>checked</#if>>母亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[2].brothersister" <#if zr_dyslipidemia.brothersister?exists && zr_dyslipidemia.brothersister==1>checked</#if>>兄弟姐妹（患病<input type="number" value="${childrenNo.brothersisterNo}" name="arrays[2].brothersisterNo" class="input-short" maxlength="2">人）
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[2].children" <#if zr_dyslipidemia.children?exists && zr_dyslipidemia.children==1>checked</#if>>子女（患病<input type="number" value="${zr_dyslipidemia.childrenNo}" name="arrays[2].childrenNo" class="input-short" maxlength="2">人）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
               <label class="radio-inline">
              	<input type="radio" value="2" name="arrays[2].isexist" <#if zr_dyslipidemia.isexist?exists && zr_dyslipidemia.isexist==2>checked</#if>>不详
              </label>
			</div>
		</div>
	</div>
	
	<div class="row"><h4><b>3.4 糖尿病</b></h4></div>
	<input type="hidden" value="04" name="arrays[3].diseasetype">
	<input type="hidden" value="${zr_heart.familyid}" name="arrays[3].familyid">
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="0" name="arrays[3].isexist" <#if zr_heart.isexist?exists && zr_heart.isexist==0>checked</#if>>无
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	 <input type="radio" value="1" name="arrays[3].isexist" <#if zr_heart.isexist?exists && zr_heart.isexist==1>checked</#if>>有，与本人关系：
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[3].father" <#if zr_heart.father?exists && zr_heart.father==1>checked</#if>>父亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[3].mother" <#if zr_heart.mother?exists && zr_heart.mother==1>checked</#if>>母亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[3].brothersister" <#if zr_heart.brothersister?exists && zr_heart.brothersister==1>checked</#if>>兄弟姐妹（患病<input type="number" value="${zr_heart.brothersisterNo}" name="arrays[3].brothersisterNo" class="input-short" maxlength="2">人）
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[3].children" <#if zr_heart.children?exists && zr_heart.children==1>checked</#if>>子女（患病<input type="number" value="${zr_heart.childrenNo}" name="arrays[3].childrenNo" class="input-short" maxlength="2">人）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
               <label class="radio-inline">
              	<input type="radio" value="2" name="arrays[3].isexist" <#if zr_heart.isexist?exists && zr_heart.isexist==2>checked</#if>>不详
              </label>
			</div>
		</div>
	</div>
	
	<div class="row"><h4><b>3.5血脂异常</b></h4></div>
	<input type="hidden" value="05" name="arrays[4].diseasetype">
	<input type="hidden" value="${zr_highblood.familyid}" name="arrays[4].familyid">
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="0" name="arrays[4].isexist" checked>无
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	 <input type="radio" value="1" name="arrays[4].isexist" <#if zr_highblood.isexist?exists && zr_highblood.isexist==1>checked</#if>>有，与本人关系：
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[4].father" <#if zr_highblood.father?exists && zr_highblood.father==1>checked</#if>>父亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[4].mother" <#if zr_highblood.mother?exists && zr_highblood.mother==1>checked</#if>>母亲
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[4].brothersister" <#if zr_highblood.brothersister?exists && zr_highblood.brothersister==1>checked</#if>>兄弟姐妹（患病<input type="number" value="${zr_highblood.brothersisterNo}" name="arrays[4].brothersisterNo" class="input-short" maxlength="2">人）
              </label>
              <label class="checkbox-inline">
              	 <input type="checkbox" value="1" name="arrays[4].children" <#if zr_highblood.children?exists && zr_highblood.children==1>checked</#if>>子女（患病<input type="number" value="${zr_highblood.childrenNo}" name="arrays[4].childrenNo" class="input-short" maxlength="2">人）
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
               <label class="radio-inline">
              	<input type="radio" value="2" name="arrays[4].isexist" <#if zr_highblood.isexist?exists && zr_highblood.isexist==2>checked</#if>>不详
              </label>
			</div>
		</div>
	</div>
	
</div>