<div class="container-fluid">
	<div class="row"><h4><b>1.1 人口学信息</b></h4></div>
	<div class="row">
		<div class="span4">
			<div class="input-group input-sm">
              <label class="radio-inline">姓名：</label>
              <label class="radio-inline">
                <input type="text" placeholder="输入姓名" required name="baseinfo.fullname">
              </label>
			</div>
		</div>
		<div class="span3">
			<div class="input-group input-sm">
              <label class="radio-inline"> 性别：</label>
              <label class="radio-inline">
                <input type="radio" value="1" name="baseinfo.sex" checked> 男
              </label>
              <label class="radio-inline">
                <input type="radio" value="0" name="baseinfo.sex"> 女
              </label>
			</div>
		</div>
		<div class="span5">
			<div class="input-group input-sm">
              <label class="radio-inline">民族：</label>
              <label class="radio-inline">
                <select name="baseinfo.nation">
                	<option value="汉族">汉族</option>
                </select>
              </label>
			</div>
		</div>
		<div class="span6">
			<div class="input-group input-sm">
              <label class="radio-inline"> 身份证号：</label>
              <label class="radio-inline">
                <input type="text" value="" name="baseinfo.certificatesid" required placeholder="请输入身份证号">
              </label>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span5">
			<div class="input-group input-sm">
              <label class="radio-inline">年龄：</label>
              <label class="radio-inline">
                <input type="number" placeholder="输入年龄" required name="baseinfo.age">岁
              </label>
			</div>
		</div>
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline"> 受教育程度：</label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.education"> 小学及以下 
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.education"> 初中
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.education"> 中专/高中
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.education"> 专/大本
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.education"> 硕士及以上
              </label>
              <#list educationList as bean>
              	  <label class="radio-inline">
	                <input type="radio" value="${bean.description}" name="baseinfo.education"> ${bean.description}
	              </label>
              </#list>
			</div>
		</div>
	</div>
	<div class="row">
	  <div class="span100">
		<div class="input-group input-sm">
          <label class="radio-inline"> 职业（退休前职业）：</label>
          <label class="radio-inline">
            <input type="radio" value="" name="job"> 国家机关、党群组织、企业、事业单位负责人 
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="job"> 专业技术人员
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="job"> 办事人员和有关人员
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="job"> 商业、服务业人员
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="job"> 农、林、牧、渔、水利业生产人员
          </label>
		  <label class="radio-inline">
            <input type="radio" value="" name="job"> 生产、运输设备操作人员及有关人员
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="job"> 军人
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.occupation"> 不便分类的其他从业人员
          </label>
          <#list occupationList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${baseinfo.description}" name="baseinfo.occupation"> ${bean.description}
              </label>
          </#list>
		</div>
	  </div>
	</div>
	<div class="row">
		<div class="span12">
			<div class="input-group input-sm">
              <label class="radio-inline"> 本人年均收入：</label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.income"> 5千元以下 
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.income"> 5千-1万
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.income"> 1万-2万
              </label>
              <label class="radio-inline">
                <input type="radio" value="" name="baseinfo.income"> 1万-2万
              </label>
              <#list incomeList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${baseinfo.description}" name="baseinfo.income"> ${bean.description}
              </label>
          </#list>
			</div>
		</div>
	</div>
	<div class="row">
	  <div class="span100">
		<div class="input-group input-sm">
          <label class="radio-inline"> 主要医疗付费方式：</label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 城镇职工基本医疗保险 
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 新城镇居民基本医疗保险
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 新型农村合作医疗
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 商业医疗保险
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 全公费
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 全自费
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 其他社会保险
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 贫困救助
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.pay"> 其他
          </label>
          <#list incomeList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${baseinfo.description}" name="baseinfo.pay"> ${bean.description}
              </label>
          </#list>
		</div>
	  </div>
	</div>
	<div class="row"><h4><b>1.2 通讯及联系方式</b></h4></div>
	   <div class="row">
		 <div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline"> 户籍地址：</label>
              <label class="radio-inline">
                <input type="text" value="" name="baseinfo.censusregisteraddress" maxlength="98" placeholder="请输入详细户籍地址"> （详细到街道）
              </label>
			</div>
		</div>
		<div class="span8">
			<div class="input-group input-sm">
              <label class="radio-inline">邮编（选填）：</label>
              <label class="radio-inline">
                <input type="number" placeholder="请输入邮编" name="baseinfo.censusregistercode" maxlength="6">
              </label>
			</div>
		</div>
	</div>
	<div class="row">
	  <div class="span8">
		<div class="input-group input-sm">
          <label class="radio-inline"> 现居住地址：</label>
          <label class="radio-inline">
            <input type="text" value="" name="baseinfo.liveaddress" placeholder="请输入详细住址" maxlength="98"> （详细到街道）
          </label>
		</div>
	  </div>
	  <div class="span8">
		<div class="input-group input-sm">
          <label class="radio-inline">邮编（选填）：</label>
          <label class="radio-inline">
            <input type="number" placeholder="请输入邮编" name="baseinfo.livecode" maxlength="6">
          </label>
		</div>
	 </div>
   </div>
	<div class="row">
	  <div class="span6">
		<div class="input-group input-sm">
          <label class="radio-inline"> 联系手机：</label>
          <label class="radio-inline">
            <input type="text" value="" name="baseinfo.mobile" placeholder="请输入手机号" maxlength="11">
          </label>
		</div>
	  </div>
	  <div class="span6">
		<div class="input-group input-sm">
          <label class="radio-inline"> 联系电话：</label>
          <label class="radio-inline">
            <input type="text" value="" name="baseinfo.tel" placeholder="请输入电话号码" maxlength="15">
          </label>
		</div>
	  </div>
	  <div class="span6">
		<div class="input-group input-sm">
          <label class="radio-inline">电子邮箱（选填）：</label>
          <label class="radio-inline">
            <input type="email" placeholder="请输入邮编" name="baseinfo.email" maxlength="50">
          </label>
		</div>
	 </div>
   </div>
	<div class="row">
	  <div class="span5">
		<div class="input-group input-sm">
          <label class="radio-inline"> 主要联系人姓名：</label>
          <label class="radio-inline">
            <input type="text" value="" name="baseinfo.linkman" placeholder="联系人姓名" maxlength="20">
          </label>
		</div>
	  </div>
	  <div class="span7">
		<div class="input-group input-sm">
          <label class="radio-inline"> 与本人关系：</label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.relationship"> 父母
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.relationship"> 配偶
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.relationship"> 子女
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.relationship"> 兄弟姐妹
          </label>
          <label class="radio-inline">
            <input type="radio" value="" name="baseinfo.relationship"> 其他：<input type="text" value="" name="" style="width:50px;" placeholder="请填写">  
          </label>
           <#list shipList as bean>
          	  <label class="radio-inline">
                <input type="radio" value="${baseinfo.description}" name="baseinfo.relationship"> ${bean.description}<#if bean.code=="05"><input type="text" value="" placeholder="请填写" name="baseinfo.relationship" style="width:50px;"></#if>
              </label>
          </#list>
		</div>
	  </div>
	  <div class="span6">
		<div class="input-group input-sm">
          <label class="radio-inline">联系人手机：</label>
          <label class="radio-inline">
            <input type="text" placeholder="请输入联系人手机" name="baseinfo.linkmanmob" maxlength="11">
          </label>
		</div>
	 </div>
   </div>
  
  
  
</div>