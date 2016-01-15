package com.penzias.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmModular {

	// 程序模块编码
	@Expose
	private Integer id;

	// 上级模块编码
	@Expose
	private Integer parentId;

	// 名称
	@Expose
	@SerializedName("name")
	private String modularName;

	// 功能模块地址
	private String modularUrl;

	// 描述
	private String modularDesc;

	// 顺序
	private Integer modularOrder;

	// 样式或图标
	private String modularStyle;

	// 是否显示：0-不显示，1-显示
	private String modularShow;

	// 标识,基于样式控制
	private String modularFlag;

	// 增删改查
	private String crud;

	// 以下不参与映射
	@Expose
	private boolean open;

	// 是否选中
	@Expose
	private boolean checked;

	public Integer getId(){

		return id;
	}

	public void setId(Integer id){

		this.id = id;
	}

	public Integer getParentId(){

		return parentId;
	}

	public void setParentId(Integer parentId){

		this.parentId = parentId;
	}

	public String getModularName(){

		return modularName;
	}

	public void setModularName(String modularName){

		this.modularName = modularName;
	}

	public String getModularUrl(){

		return modularUrl;
	}

	public void setModularUrl(String modularUrl){

		this.modularUrl = modularUrl;
	}

	public String getModularDesc(){

		return modularDesc;
	}

	public void setModularDesc(String modularDesc){

		this.modularDesc = modularDesc;
	}

	public Integer getModularOrder(){

		return modularOrder;
	}

	public void setModularOrder(Integer modularOrder){

		this.modularOrder = modularOrder;
	}

	public String getModularStyle(){

		return modularStyle;
	}

	public void setModularStyle(String modularStyle){

		this.modularStyle = modularStyle;
	}

	public String getModularShow(){

		return modularShow;
	}

	public void setModularShow(String modularShow){

		this.modularShow = modularShow;
	}

	public String getModularFlag(){

		return modularFlag;
	}

	public void setModularFlag(String modularFlag){

		this.modularFlag = modularFlag;
	}

	public String getCrud(){

		return crud;
	}

	public void setCrud(String crud){

		this.crud = crud;
	}

	public boolean isOpen(){

		return open;
	}

	public void setOpen(boolean open){

		this.open = open;
	}

	public boolean isChecked(){

		return checked;
	}

	public void setChecked(boolean checked){

		this.checked = checked;
	}

}