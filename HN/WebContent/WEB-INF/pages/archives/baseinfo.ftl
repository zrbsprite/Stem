<div class="container-fluid">
	<input type="hidden" value="${crowdid}" name="crowdid">
	<div class="row">
		<div class="span10">
			<h4><b>1.1 人口学信息</b></h4>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline">姓名：</label>
		</div>
		<div class="span8">
			<input type="text" placeholder="输入姓名" required name="fullname" data-msg="姓名不能为空" class="form-control">
		</div>
	</div>         
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 性别：</label>
		</div>
		<div class="span8">
			<label class="radio-inline">
	            <input type="radio" value="1" name="sex" checked> 男
	          </label>
	          <label class="radio-inline">
	            <input type="radio" value="0" name="sex"> 女
	  		</label>	
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline">民族：</label>
		</div>
		<div class="span8">
            <select name="nation" class="form-control">
            	<#list nationList as bean>
            	<option value="${bean.code}">${bean.description}</option>
            	</#list>
            </select>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 身份证号：</label>
		</div>
		<div class="span8">
           <input type="text" value="" name="certificatesid" required placeholder="请输入身份证号" data-msg="身份证号不能空" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline">年龄：</label>
		</div>
		<div class="span8">
			<div class="input-group">
          		<input type="number" placeholder="输入年龄" required name="age" data-msg="年龄不能为空" class="form-control"><span class="input-group-addon">岁</span>
          	</div>	
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 受教育程度：</label>
		</div>
		<div class="span8">
          <#list educationList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${bean.code}" name="education"> ${bean.description}
              </label>
          </#list>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 职业（退休前）：</label>
		</div>
		<div class="span8">
          <#list occupationList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${bean.code}" name="occupation"> ${bean.description}
              </label>
          </#list>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 本人年均收入：</label>
		</div>
		<div class="span8">
         <#list incomeList as bean>
	      	  <label class="radio-inline">
	            <input type="radio" value="${bean.code}" name="income"> ${bean.description}
	          </label>
          </#list>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 主要医疗付费方式：</label>
		</div>
		<div class="span8">
          <#list payList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${bean.code}" name="pay"> ${bean.description}
              </label>
          </#list>
		</div>
	</div>
	<div class="row">
		<div class="span10">
			<h4><b>1.2 通讯及联系方式</b></h4>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 户籍地址：</label>
		</div>
		<div class="span8">
			<div class="input-group">
          		<input type="text" value="" name="censusregisteraddress" maxlength="98" placeholder="请输入详细户籍地址" class="form-control"><span class="input-group-addon">（详细到街道）</span>
      		</div>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
         <label class="radio-inline">邮编（选填）：</label>
		</div>
		<div class="span8">
          <input type="number" placeholder="请输入邮编" name="censusregistercode" maxlength="6" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 现居住地址：</label>
		</div>
		<div class="span8">
           <div class="input-group">
	           <input type="text" value="" name="liveaddress" placeholder="请输入详细住址" maxlength="98" class="form-control"><span class="input-group-addon">（详细到街道）</span>
      		</div>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline">邮编（选填）：</label>
		</div>
		<div class="span8">
           <input type="number" placeholder="请输入邮编" name="livecode" maxlength="6" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline"> 联系手机：</label>
		</div>
		<div class="span8">
           <input type="text" value="" name="mobile" placeholder="请输入手机号" maxlength="11" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
         <label class="radio-inline"> 联系电话：</label>
		</div>
		<div class="span8">
           <input type="text" value="" name="tel" placeholder="请输入电话号码" maxlength="15" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline">电子邮箱（选填）：</label>
		</div>
		<div class="span8">
           <input type="email" placeholder="请输入邮编" name="email" maxlength="50" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
         <label class="radio-inline"> 主要联系人姓名：</label>
		</div>
		<div class="span8">
           <input type="text" value="" name="linkman" placeholder="联系人姓名" maxlength="20" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
         <label class="radio-inline"> 与本人关系：</label>
		</div>
		<div class="span10">
           <#list shipList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${bean.code}" name="relationship"> ${bean.description}
              </label>
              <#if bean.code=="05">
              	<label class="radio-inline">
              		<input type="text" value="" placeholder="请填写" name="flag" style="width:50px;margin-left:-20px;"  class="form-control">
              	</label>
              </#if>
          </#list>
		</div>
	</div>
	<div class="row">
		<div class="span3 text-right">
          <label class="radio-inline">联系人手机：</label>
		</div>
		<div class="span8">
          <input type="text" placeholder="请输入联系人手机" name="linkmanmob" maxlength="11" class="form-control">
		</div>
	</div>
  
  
</div>