<!DOCTYPE html>
<html lang="en">
  <head>
  	<#assign pageTitle='人群档案-采集'>
    <title>${pageTitle}</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "frame/taglib.ftl">
    <#include "frame/header-ie.ftl">
    <!--[if lt IE 9]>
        <script src="${basepath}/assets/base/js/html5shiv.min.js"></script>
    <![endif]-->
    <style rel="stylesheet">
    	td{
    		vertical-align:middle!important;
    		text-align:center!important;
    	}
    </style>
  </head>
  
<body>
<#assign menu_name='menu_crowsquery'>
<#include "frame/top-nav.ftl">
<div class="container-fluid lxui-docs-container">
 	<div class="row show-grid">
 		<#-- 菜单 -->
 		<div class="span-col2">
 			<#include "frame/left-nav.ftl">
 		</div>
 		<#-- 主体内容 -->
 		<div class="span-col10 border-left-1 show-grid">
 			<#include "frame/route.ftl">
 			<div class="row">
	 			<div class="container-fluid">
	 			<div class="panel panel-default">
				  <div class="panel-heading">${pageTitle} </div>
				  <div class="panel-body">
					  <form role="form" id="mainForm" action="${basepath}/archives/saveall.htm">
					  
					  	<div class="panel-group" id="accordion">
						  <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="collapseOne">
						          	一、基本信息
						        </a>
						      </h4>
						    </div>
						    <div id="collapseOne" class="panel-collapse collapse opening">
						      <div class="panel-body">
						      	<#include "archives/baseinfo.ftl">
						      </div>
						    </div>
						  </div>
						  <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="lifestyle">
						         	二、生活方式
						        </a>
						      </h4>
						    </div>
						    <div id="collapseTwo" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/lifestyle.ftl">
						      </div>
						    </div>
						  </div>
						  <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="family">
						          	三、家族史
						        </a>
						      </h4>
						    </div>
						    <div id="collapseThree" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/familyhistory.ftl">
						      </div>
						    </div>
						  </div>
						  
						   <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="control">
						          	四、既往病史及控制情况
						        </a>
						      </h4>
						    </div>
						    <div id="collapseFour" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/control.ftl">
						      </div>
						    </div>
						  </div>
						   <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="body">
						          	五、体格检查
						        </a>
						      </h4>
						    </div>
						    <div id="collapseFive" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/body.ftl">
						      </div>
						    </div>
						  </div>
						   <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="brainlevel">
						          	六、（1）脑卒中风险评级
						        </a>
						      </h4>
						    </div>
						    <div id="collapseSix" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/brain_level.ftl">
						      </div>
						    </div>
						  </div>
						   <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="heartinfo">
						          	七、心电图
						        </a>
						      </h4>
						    </div>
						    <div id="collapseSeven" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/heart.ftl">
						      </div>
						    </div>
						  </div>
						   <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="innercheck">
						          	八、实验室检查
						        </a>
						      </h4>
						    </div>
						    <div id="collapseEight" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/inner_check.ftl">
						      </div>
						    </div>
						  </div>
						   <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title">
						        <a data-ref="bblood">
						          	九、颈部血管超声
						        </a>
						      </h4>
						    </div>
						    <div id="collapseNine" class="panel-collapse collapse">
						      <div class="panel-body">
						        <#include "archives/blood.ftl">
						      </div>
						    </div>
						  </div>
						  
						</div>
	 			  	  </form>
				  </div>
			  </div>
 			</div>
		</div>
		<div class="row">
			<div class="span3 pull-right"><button type="button" class="btn btn-success">提交</button></div>
		</div>
	</div>
</div>
</div>

<#include "frame/footer.ftl">
<#include "frame/js-ie.ftl">
<script type="text/javascript" src="${basepath}/assets/js/include_crows_add.js"></script>
</body>
</html>