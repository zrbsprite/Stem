package com.penzias.entity;

/**
 * 描述：字典信息类别<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:28:24<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class SmCodecollect {
	//id
    private String codeid;

    //详细
    private String description;

    //长度
    private Integer length;

    public String getCodeid() {
        return codeid;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}