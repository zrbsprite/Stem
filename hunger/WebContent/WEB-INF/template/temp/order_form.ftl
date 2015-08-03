<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
    <title>我的销售订单</title>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/style.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/page.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="${cssUrl}/reload.css"/>
    <script type="text/javascript" src="${jsUrl}/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${jsUrl}/form.js"></script>
    <script type="text/javascript" src="${jsUrl}/iscroll.js"></script>
    <script type="text/javascript" src="${jsUrl}/openwin.js"></script>
    <script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
    <style type="text/css">

        .incod {
            width: 0.6em;
            height: 0.6em;
        }
    </style>
    <script type="text/javascript">
        
        $(document).ready(function () {
            loadOrder();
            $("#nextOrder").click(function () {
                loadNextOrder();
            });
        });
        hideMenu();
        var currentPage = 1;
        var pageSize = 12;
        var ctx = "${ctx}";
        var guarantee_state="";
        //v1 产品名称    v2订单创建时间       v3订单金额   v4订单渠道  v5订单状态  
        //v6订单ID    v7投保人姓名             v8投保人手机号         v9产品编号
        function building(v1, v2, v3, v4,v5,v6,v7,v8,v9) {
        	//if(v2 != null && "" != v2){
		        	if(v5!=null){
		        		if(v9 != null && (v9.indexOf('ZFG14') > -1 || v9.indexOf('ZFG15') > -1 || v9.indexOf('ZFG16') > -1)){//农商行理财产品
		        			if(v5 == '7'){
		        				guarantee_state="申请成功";
		        			}else{
		        				guarantee_state="申请失败";
		        			}
		        		}else if(v9 != null && v9=="SJ001"){
		        			if(v5 == '3'){
		        				guarantee_state ="下载成功";
		        			}else{
		        				guarantee_state ="开户成功";
		        			}
		        		}else{ //安邦保险产品
			        		if(v5=='1'){
			        			guarantee_state="核保通过未付款";
			        		}else if(v5=='2'){
			        			guarantee_state="订单已取消";
			        		}else if(v5=='3'){
			        			guarantee_state="支付成功";
			        		}else if(v5=='4'){
			        			guarantee_state="已退保";
			        		}else if(v5=='5'){
			            		guarantee_state="核保中";
			        		}else if(v5=='6'){
			            		guarantee_state="核保未通过";
			        		}else if(v5=='7'){
			        			guarantee_state='投保成功';
			        		}
		        		}
		        	}
		            if (v4 == '2') {
		            	
		            		return "<li class='grey'>" +
	                		"<p class='l pr'> "+v1+"<br /><span>"+v2+"</span><em class='name'>"+v7+"&nbsp;&nbsp;<a href='tel:"+v8+"'><img src='${imageUrl}/icon_tel.png' /></a></em></p>"
	                		+"<p class='m'>"+v3+"<br /><span>"+guarantee_state+"</span></p>" 
	                		+"<p class='r'><img src='${imageUrl}/icon_weixin.png' /><br/><br/></p>" +
	                		"<input type='hidden' value='"+v6+"' ></input>"+
	                		"</li>"	;
		                	
		            } else {
		            	return "<li class='grey'>" +
		            			"<p class='l pr'>"+v1+"<br /><span>"+v2+"</span><em class='name'>"+v7+"&nbsp;&nbsp;<a href='tel:"+v8+"'><img src='${imageUrl}/icon_tel.png' /></a></em></p>"
		                		+"<p class='m'>"+v3+"<br/><span>"+guarantee_state+"</span></p>" 
		                		+"<p class='r'></p>" +"<input type='hidden' value='"+v6+"' />"+
		                	    "</li>";
		            }
	        // }
        }
        function loadOrder() {
            $.ajax({
                url: ctx + "/wx/order/list.htm?pageSize=" + pageSize + "&currentPage=" + currentPage,
                type: 'get',
                dataType: 'json',
                success: function (data) {
                    if ('' != data && data != null) {
                        if (data.status != 'SUCCESS') {
                            alert(data.message);
                        } else {
                            appendData(eval(data.message));
                        }
                    }
                },
                error: function () {
                    alert('系统错误');
                }
            });
        }
        function loadNextOrder() {
            currentPage = currentPage + 1;
            loadOrder();
        }
        //添加数据
        function appendData(datas) {
            if (datas != null && datas.length != 0) {
                for (var i = 0; i < datas.length; i++) {
                    var o = datas[i];
                    if("" == o.guaranteeTime){
	                    $("#orderUl").append(building(o.productName, o.guaranteeTime, o.guaranteeMoney, o.channel,o.guarantee_state,o.id,o.policier_name, o.policyHoldeMobile,o.productNo));
                    }
                }
                for (var i = 0; i < datas.length; i++) {
                    var o = datas[i];
                    if("" != o.guaranteeTime){
	                    $("#orderUl").append(building(o.productName, o.guaranteeTime, o.guaranteeMoney, o.channel,o.guarantee_state,o.id,o.policier_name, o.policyHoldeMobile,o.productNo));
                    }
                }
               $('#gotop').show();
				  if(datas.length<12){
				  		$("#nextOrder").hide();
		          }else{
		          		$("#nextOrder").html("点击加载更多...");
		          		$("#nextOrder").show();
		          }
            } else {
            	if(currentPage != 1){
            		alert('没有更多数据!');
            	}else{
	            	$('#gotop').hide();
	         		$("#nextOrder").html("对不起，你还没有订单！");
	         		$("#nextOrder").show();
            	}
            }
        }

    </script>
</head>

<body>
<article class="orderForm">
	<ul class="orderUl" id="orderUl">
	   
	</ul>
	<div class='gotop' ><span id="nextOrder">点击加载更多...</span><img src='${imageUrl}/icon_arr.png' id='gotop' /></div>
</article>
<#include "/WEB-INF/content/wxdgid/footer.ftl"/>
</body>
</html>
