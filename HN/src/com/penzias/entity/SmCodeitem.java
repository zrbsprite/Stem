package com.penzias.entity;

/**
 * 描述：字典信息<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:29:15<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class SmCodeitem extends SmCodeitemKey {
	
	//明细
    private String description;

    private String pptr;

    private Byte cptr;

    //全拼
    private String spell;

    //
    private String remarks;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPptr() {
        return pptr;
    }

    public void setPptr(String pptr) {
        this.pptr = pptr;
    }

    public Byte getCptr() {
        return cptr;
    }

    public void setCptr(Byte cptr) {
        this.cptr = cptr;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}