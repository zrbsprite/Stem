<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="initial-scale=1, width=device-width, minimum-scale=1, maximum-scale=1">
<meta name="format-detection" content="telphone=no" />
<title>安邦慧理财1号终身寿险－安邦保险</title>
<#include "/WEB-INF/content/wxdgid/tiglib.ftl"/>
<link rel="stylesheet" media="screen" href="${cssUrl}/insur_special.css" />
<script src="http://y.abic.cn/2048/WeixinJSBridge.js"></script>
<script src="${jsUrl}/jquery-1.7.2.min.js"></script>
<script src="${jsUrl}/openwin.js"></script>
<script type="text/javascript" src="${request.getContextPath()}/assets/wap/js/wechat-api-ab.js"></script>
</head>
<body style="background-color:#fff;">
<header id="headRed" class="changeH">
	<div class="leftBar"><a href="javascript:history.go(-1);" class="upPage"></a></div>
    <h1>慧理财1号终身寿险</h1>
    <a href="${request.getContextPath()}/wap/index.htm" class="backHome"></a>
</header>

<article class="proBanner"><img src="/assets/wxdgid/products/special/images/sp_top.jpg" /></article>

<div class="procedure pr">

    <article class="proTitle bg_yellow">
        <img src="/assets/wxdgid/products/special/images/tit_01.png" />
    </article>

    <div class="procedureBox pro_line1 mar_t1">

        <div class="procedure_txt">投保抢惊喜大礼，人生最大的智慧就是能够读懂自己，能够洞察对方的心灵。</div>

        <div class="procedure_tit2 pr"><span class="boll bo1"></span>大礼分为如下三档：</div>

        <table class="tal1"> 
            <tr>
                <th width="30%">保费排名</th>
                <th width="35%">奖品</th>
                <th width="35%">实例图片</th>
            </tr>
            <tr>
                <td>第1名</td>
                <td>价值15000元的50克金条</td>
                <td><img src="/assets/wxdgid/products/special/images/img_03.jpg" class="pic1" /></td>
            </tr>
            <tr>
                <td>第2-5名</td>
                <td>价值3000元的10克金条</td>
                <td><img src="/assets/wxdgid/products/special/images/img_04.jpg" class="pic2" /></td>
            </tr>
            <tr>
                <td>第6-10名</td>
                <td>价值1000元的金章</td>
                <td><img src="/assets/wxdgid/products/special/images/img_05.jpg" class="pic3" /></td>
            </tr>
        </table>



        <div class="procedure_txt2">活动有效期：2014-07-01至2014-08-01</div>

        <div class="procedure_tit pr"><span class="boll bo2"></span>最新慧理财投保排名(截止：2014-06-26)</div>

        <table class="tal2 clearfix"> 
            <tbody>
	            <tr>
	                <th width="20%">排名</th>
	                <th width="35%">投保人</th>
	                <th width="45%">保费</th>
	            </tr>
	            <#if resultOrders??>
		            <#list resultOrders as order>
			            <tr <#if (order_index)%2!=0>class="grey"</#if>>
			                <td>${order_index+1}</td>
			                <td>${order.policier_name}</td>
			                <td>${order.sumpremium}</td>
			            </tr>
			        </#list>
            	</#if>
            </tbody>
        </table>
        
        <div class="procedure_txt2">最终排行榜以活动结束后8月11日公布的有效排行榜为准，获奖用户不包含退保用户。</div>

    </div>

    <div class="procedure_b"><img src="/assets/wxdgid/products/special/images/hlc_bg_10.gif" /></div>

</div>

<div class="procedure pr ">

    <article class="proTitle bg_yellow">
        <img src="/assets/wxdgid/products/special/images/tit_02.png" />
    </article>

    <div class="procedureBox pro_line2 mar_t1">

        <div class="procedure_txt">微信投保送话费，投一千，送7元，投一万，送70元。</div>

        <div class="procedure_pic pr"><span class="boll bo3"></span><img src="/assets/wxdgid/products/special/images/img_02.jpg" /></div>

    </div>

    <div class="procedure_b"><img src="/assets/wxdgid/products/special/images/hlc_bg_10.gif" /></div>

</div>

<div class="procedure pr ">

    <article class="proTitle bg_yellow">
        <img src="/assets/wxdgid/products/special/images/tit_03.png" />
    </article>

    <div class="procedureBox pro_line3 mar_t1">
        <p class="t03 pr"><em class="boll bo4"></em><span>1、挖金币，送红包</span><a href="http://mp.weixin.qq.com/s?__biz=MjM5ODA1NTkyMA==&mid=200899872&idx=1&sn=aaaceaf1810adf1bd5f669b3fc094dfb#rd" class="btn01">活动连接</a><br />参与挖金币小游戏，赚取10-200元微信红包！</p>
        <p class="t03 pr"><em class="boll bo5"></em><span>2、狂欢世界杯</span><a href="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6cba2be5d7b26f70&redirect_uri=http://y.abic.cn/fifagame/ydkfwxgamescore/welcome&response_type=code&scope=snsapi_base&state=1#wechat_redirect" class="btn02">活动连接</a><br />参与世界杯摇一摇，惊喜好礼等待你！</p>
    </div>

    <div class="procedure_b"><img src="/assets/wxdgid/products/special/images/hlc_bg_10.gif" /></div>

</div>

<article class="btnBox mar_t15">
    <a href=""><img src="/assets/wxdgid/products/special/images/btn_buy_2.png" /></a>
</article>

<article class="btnBox mar_t15 clearfix">
    <div class="sbtn fl"><a href=""><img src="/assets/wxdgid/products/special/images/btn_ab.png" /></a></div>
    <div class="sbtn fr"><a href="javascript:void(0);" id="shareBtn" onclick="openwin()"><img src="/assets/wxdgid/products/special/images/btn_fx.png" /></a></div>
</article>

<div class="telBox"><img src="/assets/wxdgid/products/special/images/icon_phone_2.png" />客服电话：400-1111111-5</div>

<!--弹出内容框-->
<div id="maskbg" class="maskclose"></div>
<div id="wxtips" class="maskclose"></div>

<script type="text/javascript">

var shareTitle = '安邦狂欢世界杯，豪礼等你摇出来，快来PK吧！';
var shareTxt = '安邦狂欢世界杯，豪礼等你摇出来，快来PK吧！';
var shareUrl = 'http://xym.163.com/2014/jgb/';
var sharePic = '/assets/wxdgid/products/special/images/fifagame.jpg';
var onBridgeReady = function () {
    var appId = '';
    // 发送给好友;
    WeixinJSBridge.on('menu:share:appmessage', function(argv){
        var imgUrl = sharePic;
        var link = shareUrl;
        var title = shareTitle;
        var shareDesc = shareTxt;
        WeixinJSBridge.invoke('sendAppMessage',{
            'img_url' : imgUrl,
            'img_width' : '200',
            'img_height' : '200',
            'link' : link,
            'desc' : shareDesc,
            'title' : title
            }, function(res) {

        });
        
    });
    // 分享到朋友圈;
    WeixinJSBridge.on('menu:share:timeline', function(argv){
        var imgUrl = sharePic;
        var link = shareUrl;
        var title = shareTitle;
        var shareDesc = shareTxt;
        WeixinJSBridge.invoke('shareTimeline',{
        'img_url' : imgUrl,
        'img_width' : '200',
        'img_height' : '200',
        'link' : link,
        'desc' : shareDesc,
        'title' : shareDesc
        }, function(res) {

        });
        
    });
};
if(document.addEventListener){
    document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
} else if(document.attachEvent){
    document.attachEvent('WeixinJSBridgeReady' , onBridgeReady);
    document.attachEvent('onWeixinJSBridgeReady' , onBridgeReady);
}
</script>

</body>
</html>
