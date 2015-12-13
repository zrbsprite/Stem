<div class="container-fluid">
	<input type="hidden" value="${cid}" name="crowdid">
	<input type="hidden" value="${lifestyle.lifestyleid}" name="lifestyleid">
	<div class="row"><h4><b>2.1吸烟</b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline"><input type="radio" value="01" name="isSmokeFlag" checked>否，是否被动吸烟（暴露于吸烟者呼出烟雾的场所）：</label>
              <label class="radio-inline">
                <input type="radio" value="0101" name="isSecondSmokenFlag"> 否
              </label>
              <label class="radio-inline">
                <input type="radio" value="0102" name="isSecondSmokenFlag"> 是，被动吸烟大约<input type="number" value="" name="secondSmokenYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="02" name="isSmokeFlag">是，若正在吸烟，吸烟年限<input type="number" value="" name="smokingYear" class="input-short">年，每天<input type="number" value="" name="smokeday" class="input-short">支
              </label>
               <label class="radio-inline">
              	若已戒烟，戒烟年限<input type="number" value="" name="dontSmokeYear" class="input-short">年，曾经吸烟<input type="number" value="" name="smokenYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row"><h4><b>2.2饮酒</b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="01" name="wine" checked>无饮酒习惯
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="02" name="wine">有饮酒习惯，但很少大量饮用，饮酒年限：<input type="number" value="" name="littleDrinkMountYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="03" name="wine">经常大量饮酒（白酒≥3次/周，每次≥2两），饮酒年限：<input type="number" value="" name="lotDrinkMountYear" class="input-short"> 年
              </label>
			</div>
		</div>
	</div>
	<div class="row"><h4><b>2.3运动习惯</b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="01" name="sports" checked>经常运动（相当于快步走的中等强度运动，且每周≥3次、每次≥30分钟，包含中度、重度体力劳动者)，该习惯已经维持<input type="number" value="" name="hasSportYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	<input type="radio" value="02" name="sports">缺乏运动 (不符合上述经常运动标准者），该习惯已经维持<input type="number" value="" name="hasNoSportYear" class="input-short"> 年
              </label>
			</div>
		</div>
	</div>
	
	<div class="row"><h4><b>2.4膳食习惯</b></h4></div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	口味：
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0101" name="eatStyle">偏咸
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0102" name="eatStyle">偏油
              </label>
              <label class="radio-inline">
              	 <input type="radio" value="0103" name="eatStyle">喜甜食
              </label>
              <label class="radio-inline">
              	 <input type="radio" value="0104" name="eatStyle">其他，该习惯已经维持<input type="number" value="" name="eatStyleOtherYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	荤素：
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0201" name="meatStyle">荤素均衡
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0202" name="meatStyle">多食肉类
              </label>
              <label class="radio-inline">
              	 <input type="radio" value="0203" name="meatStyle">素食为主，该习惯已经维持<input type="number" value="" name="meatStyleOtherYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	吃蔬菜：
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0301" name="vagStyle">≥5天/周
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0302" name="vagStyle">3-4天/周
              </label>
              <label class="radio-inline">
              	 <input type="radio" value="0303" name="vagStyle">≤2天/周，该习惯已经维持<input type="number" value="" name="vagStyleOtherYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	吃水果：
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0401" name="fruitStyle">≥5天/周
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0402" name="fruitStyle">3-4天/周
              </label>
              <label class="radio-inline">
              	 <input type="radio" value="0403" name="fruitStyle">≤2天/周，该习惯已经维持<input type="number" value="" name="fruitStyleOtherYear" class="input-short">年
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline">
              	牛奶或酸奶：
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0501" name="milkStyle"> ≥200毫升/天且≥5天/周
              </label>
              <label class="radio-inline">
              	<input type="radio" value="0502" name="milkStyle"> 偶尔或从不喝
              </label>
              <label class="radio-inline">
              	 <input type="radio" value="0503" name="milkStyle">不属于以上两种情况，该习惯已经维持<input type="number" value="" name="milkStyle" class="input-short">年
              </label>
			</div>
		</div>
	</div>
</div>