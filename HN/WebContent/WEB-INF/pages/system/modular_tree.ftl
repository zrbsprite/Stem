<!DOCTYPE html>
<html lang="en">
<head>
	<#assign pageTitle='系统管理-角色管理'>
	<title>${pageTitle}</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<#include "frame/taglib.ftl">
	<#include "frame/header-ie.ftl">
	<!--[if lt IE 9]>
	    <script src="${basepath}/assets/base/js/html5shiv.min.js"></script>
	<![endif]-->
	<style type="text/css">
		div.content_wrap {width: 90%;height:90%;}
		div.content_wrap div.left{float: left;width:100%;}
		div.function_background {width:100px;height:100%;text-align:left;padding-left:10px;}
		.btnGreen{margin-top:50px;margin-bottom: 100px;}
	</style>
</head>
<body>
<div class="content_wrap">
	<div class="function_background left">
		<ul id="tree_panel" class="ztree"></ul>
		<input class="btn btn-theme2 btn-primary pull-right" type="button" onclick="authrize()" value="确定"/>
	</div>
</div>
<#include "frame/js-ie.ftl">
<script type="text/javascript" src="${basepath}/assets/layer/layer.js"></script>
<script type="text/javascript" src="${basepath}/assets/layer/alert.js"></script>
<script type="text/javascript">
var setting = {check: {enable: true},data: {simpleData: {enable: true,idKey: "id",pIdKey: "parentId",rootPId: 0}}};
<#if nodes?exists>
var zNodes=${nodes};
<#else>
var zNodes=[];
</#if>
var zTreeObj = $.fn.zTree.init($("#tree_panel"), setting, zNodes);
var rid=${roleid};
function authrize(){
	var changedNodes = zTreeObj.getChangeCheckedNodes();
	var ids = new Array();
	if(changedNodes.length>0){
		var nodes = zTreeObj.getCheckedNodes(true);
		var len = nodes.length;
		for(var i=0;i<len;i++){
			ids.push(nodes[i].id);
		}
		ids = ids.join(",");
	}
	parent.authFun(ids, rid);
}
</script>
</body>
</html>