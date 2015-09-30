package com.stem.vo;

import java.util.List;

import com.stem.entity.WxMenu;

public class WxMenuVO {

	private WxMenu wxMenu;

	private List<WxMenu> list;

	public WxMenu getWxMenu(){

		return wxMenu;
	}

	public void setWxMenu(WxMenu wxMenu){

		this.wxMenu = wxMenu;
	}

	public List<WxMenu> getList(){

		return list;
	}

	public void setList(List<WxMenu> list){

		this.list = list;
	}

}
