package com.penzias.entity;

public class SmCodeitem extends SmCodeitemKey {
    private String description;

    private String pptr;

    private Byte cptr;

    private String spell;

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