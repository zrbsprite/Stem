package com.stem.wechat.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 输出图文消息
 */
public class NewsOutMessage extends OutMessage {

	private String MsgType = "news";

	private Integer ArticleCount;

	private List<Articles> Articles;

	public String getMsgType(){

		return MsgType;
	}

	public int getArticleCount(){

		return ArticleCount;
	}

	public List<Articles> getArticles(){

		return Articles;
	}

	public void setMsgType(String msgType){

		MsgType = msgType;
	}

	public void setArticleCount(Integer articleCount){

		ArticleCount = articleCount;
	}

	public void setArticles(List<Articles> articles){

		if(articles != null){
			if(articles.size() > 10)
				articles = new ArrayList<Articles>(articles.subList(0,10));

			ArticleCount = articles.size();
		}
		Articles = articles;
	}
}
