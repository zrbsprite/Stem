halo.use('pageinvite','pagedrag','warn',function(m){
	m.warn&&m.warn.set('#c3c3c3');
	var wrap=document.getElementById('wrap'),pager=m.pageinvite.bind(wrap,false),h_wrap=document.getElementById("h_wrap"),left=document.getElementById("left"),right=document.getElementById("right"),create=document.getElementById("create"),create_card_btn=document.getElementsByClassName('btn_center'),card_img=document.getElementById("card_img"),rechoice=document.getElementById("rechoice"),preview=document.getElementById("preview"),preview_card_img=document.getElementById("preview_card_img"),preview_closer=document.getElementById("preview_closer"),done=document.getElementById("done"),share=document.getElementById("share"),page=document.getElementsByClassName('page');
	var version='201407291256';
	var cardsinfo = {
		share:{},  
		shareicon:{
			'1':'http://pics0.paipaiimg.com/update/20140723/index_190235112.jpg',  
			'2':'http://pics0.paipaiimg.com/update/20140723/index_190234621.jpg',
			'3':'http://pics0.paipaiimg.com/update/20140723/index_190234161.jpg',
			'4':'http://pics0.paipaiimg.com/update/20140723/index_190235566.jpg',
			'5':'http://pics0.paipaiimg.com/update/20140723/index_190233714.jpg', 
			'6':'http://pics2.paipaiimg.com/update/20140723/index_190233282.jpg'   
		}  
	};  
	
	pager.infinite=false;
	loading_img(['images/sec_1.png?v='+version,'images/sec_5.png?v='+version],document.body,'#c3c3c3',function(loading){
		loading.parentNode.removeChild(loading);
		wrap.style.cssText='';
		//pager.move(4);
		var HPAGE=m.pagedrag.bind(h_wrap,'X','ismotions');
		(function(){//横屏页面切换
			var cur=0,li=h_wrap.getElementsByClassName('card'),totalpage=li.length;
			HPAGE.page_change=function(c,n){
				cur=n;
				li[c].style.cssText='display:none;',h_wrap_sub_load[n]&&(li[n].style.cssText='');
			}
			m.on(left,'flick',function(){//console.log(cur);
				//(cur<totalpage-1)&&(HPAGE.move(fixed(cur+1)));
				if(cur<totalpage-1){
					HPAGE.move(fixed(cur+1))
				}else{
					HPAGE.move(0)
				}
			},false);
			m.on(right,'flick',function(){
				//cur&&HPAGE.move(fixed(cur-1));
				if(cur){
					HPAGE.move(fixed(cur-1));
				}else{
					HPAGE.move(totalpage-1);
				}
			},false);
			var fixed=function(p){
				if(p<0)return 0;
				else if(p>totalpage){
					return totalpage-1;
				}
				return p;
			}
			//card2.png太大了，分成六张
			var h_wrap_sub_load=[0,0,0,0,0,0];
			(function(){
				var li=h_wrap.getElementsByTagName('li'),totalpage=li.length
				for(var i=0;i<totalpage;++i){
					(function(i){
						loading_img(['images/sec_'+(i+1)+'.png?v='+version],li[i],function(loading){
							loading.parentNode.removeChild(loading);
							h_wrap_sub_load[i]=1;
							i==cur&&(li[i].getElementsByClassName('card')[0].style.cssText='');
						});
					}(i));
				}
			}());
		}());
		//制作卡片
		for(var i=0,j=create_card_btn.length;i<j;++i){
			(function(i){
				m.on(create_card_btn[i],'flick',function(){
					create_card(i);
				},false);
			}(i));
		}
		//显示编辑卡片
		var create_card=function (index){
			m.msgbox.loading.show('卡片载入中...');
			done.setAttribute('index',index)
			var cardpng=new Image();
			cardpng.onload=function(){
				m.msgbox.loading.hide();
				card_img.src=cardpng.src;
				create.style.cssText='';
			}
			cardpng.onerror=function(){
				m.msgbox.loading.hide();
				m.msgbox.show('卡片载入失败',{text:'知道了'});
			}
			cardpng.src='images/r_c_'+(index+1)+'.jpg';
		}
		//返回编辑卡片
		m.on(rechoice,'flick',function(e){
			create.style.cssText='display:none;';
		},false);
		//显示预览卡片
		var preview_to=document.getElementById("preview_to"),preview_msg=document.getElementById("preview_msg"),preview_from=document.getElementById("preview_from"),from=document.getElementById("from"),to=document.getElementById("to"),msg=document.getElementById("msg");
		var preview_card=function(){
			if(!from.value||!to.value||!msg.value){
				m.msgbox.show('请完善卡片信息！',{text:'知道了'});
				return ;
			}
			if(from.value.length > 6){
				m.msgbox.show('接收者名字不能超过6字哦~',{text:'知道了'});
				return ;
			}
			if(to.value.length > 6){
				m.msgbox.show('发送者不能超过6字哦~',{text:'知道了'});
				return ;
			}
			if(msg.value.length > 30){
				m.msgbox.show('爱之密语不能超过30字哦~',{text:'知道了'});
				return ;
			}
			
		preview_from.innerHTML='FROM:'+from.value,preview_to.innerHTML='TO:'+to.value,preview_msg.innerHTML= '&nbsp;&nbsp;'+msg.value;

			
			var index=parseInt(done.getAttribute('index'))||0;
			m.msgbox.loading.show('预览生成中...');
			var cardpng=new Image();
			cardpng.onload=function(){
				m.msgbox.loading.hide();
				preview_card_img.src=cardpng.src;
				preview.style.cssText='';
				//分享微信小icon
				cardsinfo.share.icon = shareData.img_url = cardsinfo.shareicon[String(index+1)];
				//接收页面背景图片
				cardsinfo.share.bgpic = 'images/r_c_' + (index+1) + '.jpg';
				cardsinfo.share.title = shareData.title = (getCookie('wx_nickname') || from.value) +'送给你的情人节祝福：'+msg.value;
				//cardsinfo.share.content =  shareData.desc = msg.value;
				cardsinfo.share.url =  shareData.link= 'http://mm.wanggou.com/juhui/event5/recieve.html?PTAG=17013.3.4&rec=' + encodeURIComponent(to.value) + '&con=' + encodeURIComponent(msg.value) + '&sen=' + encodeURIComponent(from.value) + '&img=' + encodeURIComponent(cardsinfo.share.bgpic) + '&share_icon=' + encodeURIComponent(cardsinfo.share.icon);
			}
			cardpng.onerror=function(){
				m.msgbox.loading.hide();
				m.msgbox.show('预览失败',{text:'知道了'});
			}
			cardpng.src='images/r_'+(index+1)+'.jpg';
		}
		m.on(preview_closer,'flick',function(){
			preview.style.cssText='display:none';
		},false);
		m.on(done,'flick',function(){
			preview_card();
		},false);
	});
	//分屏加载
	loading_img(['images/sec_2.png?v='+version],page[1],function(loading){
		loading.parentNode.removeChild(loading);
		page[1].getElementsByClassName('card')[0].style.cssText='';
	});
	loading_img(['images/sec_3.png?v='+version],page[1],function(loading){
		loading.parentNode.removeChild(loading);
		page[2].getElementsByClassName('card')[0].style.cssText='';
	});
	loading_img(['images/sec_4.png?v='+version],page[1],function(loading){
		loading.parentNode.removeChild(loading);
		page[3].getElementsByClassName('card')[0].style.cssText='';
	});	
	
	
	var btn1=document.getElementsByClassName('btn1');
	/*for(var i=0,j=btn1.length;i<j;++i){
		(function(i){
			m.on(btn1[i],'flick',function(){
				location.href = "http://www.chinaamc.com/portal/cn/hxxc/2014/hxxjbsj/index.html?from=singlemessage&isappinstalled=0";
			},false)
		}(i));
	}*/

	var btn2=document.getElementsByClassName('btn2');
	var share=document.getElementById("share");
	for(var i=0,j=btn1.length;i<j;++i){
		(function(i){
			m.on(btn2[i],'flick',function(){
				share.style.cssText='display:block';
			},false)
		}(i));
	}

	m.on(share,'flick',function(){
		share.style.cssText='display:none';
	},false);	
	

	var globalAudio=document.getElementById("u-globalAudio");
	var audiomusic=document.getElementById("audiomusic");
	m.on(globalAudio,'flick',function(){
		if(globalAudio.className=="z-play"){
			globalAudio.className="z-pause";
			audiomusic.pause();
		}
		else{
			globalAudio.className="z-play";
			audiomusic.play();
		}
	},false);	
	
	//=============================微信分享  S==================
/*	var shareData = {
        img_url: 'http://www.feiyangad.com/vip/huaxia/xjb_wap/images/s_1.jpg',
        img_width: "100",
        img_height: "100",
        link: location.href.toString(),
        desc: '',
        title: '康赢5号，健康保障+长期理财=实现未来所需！'
    }
	document.addEventListener('WeixinJSBridgeReady', function() {
       // 发送给朋友
        WeixinJSBridge.on("menu:share:appmessage", shareFriends);

        // 发送到朋友圈分享
        WeixinJSBridge.on("menu:share:timeline", shareTimeline);

    });
	//发送给好友 发送给朋友圈
    window.shareDataFriends = window.shareDataTimeline = shareData;
	
	

    function shareFriends() {
        WeixinJSBridge && WeixinJSBridge.invoke("sendAppMessage", window.shareDataFriends, function(b) {})
    }


    function shareTimeline() {
        WeixinJSBridge && WeixinJSBridge.invoke("shareTimeline", window.shareDataTimeline, function(b) {})
    }
	
*/	
	//=============================微信分享  E==================
	
	
	
	//===========================工具函数===========================
	function getCookie(name) {
	//读取COOKIE
	var reg = new RegExp("(^| )" + name + "(?:=([^;]*))?(;|$)"), val = document.cookie.match(reg);
	return val ? (val[2] ? unescape(val[2]) : "") : null;
	}
	function xss(str, type) {
    if (!str) {
        return str === 0 ? "0" : "";
    }
    switch (type) {
        case "none":
            return str + "";
            break;
        case "html":
            return str.replace(/[&'"<>\/\\\-\x00-\x09\x0b-\x0c\x1f\x80-\xff]/g, function(r) {
                return "&#" + r.charCodeAt(0) + ";"
            }).replace(/ /g, "&nbsp;").replace(/\r\n/g, "<br />").replace(/\n/g, "<br />").replace(/\r/g, "<br />");
            break;
        case "htmlEp":
            return str.replace(/[&'"<>\/\\\-\x00-\x1f\x80-\xff]/g, function(r) {
                return "&#" + r.charCodeAt(0) + ";"
            });
            break;
        case "url":
            return escape(str).replace(/\+/g, "%2B");
            break;
        case "miniUrl":
            return str.replace(/%/g, "%25");
            break;
        case "script":
            return str.replace(/[\\"']/g, function(r) {
                return "\\" + r;
            }).replace(/%/g, "\\x25").replace(/\n/g, "\\n").replace(/\r/g, "\\r").replace(/\x01/g, "\\x01");
            break;
        case "reg":
            return str.replace(/[\\\^\$\*\+\?\{\}\.\(\)\[\]]/g, function(a) {
                return "\\" + a;
            });
            break;
        default:
            return escape(str).replace(/[&'"<>\/\\\-\x00-\x09\x0b-\x0c\x1f\x80-\xff]/g, function(r) {
                return "&#" + r.charCodeAt(0) + ";"
            }).replace(/ /g, "&nbsp;").replace(/\r\n/g, "<br />").replace(/\n/g, "<br />").replace(/\r/g, "<br />");
            break;
    }
    }
	
});/*  |xGv00|997441e95a7cb812430dc6bc0c4fcdb2 */