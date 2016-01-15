package com.penzias.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmModular {

	// ����ģ�����
	@Expose
	private Integer id;

	// �ϼ�ģ�����
	@Expose
	private Integer parentId;

	// ����
	@Expose
	@SerializedName("name")
	private String modularName;

	// ����ģ���ַ
	private String modularUrl;

	// ����
	private String modularDesc;

	// ˳��
	private Integer modularOrder;

	// ��ʽ��ͼ��
	private String modularStyle;

	// �Ƿ���ʾ��0-����ʾ��1-��ʾ
	private String modularShow;

	// ��ʶ,������ʽ����
	private String modularFlag;

	// ��ɾ�Ĳ�
	private String crud;

	// ���²�����ӳ��
	@Expose
	private boolean open;

	// �Ƿ�ѡ��
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