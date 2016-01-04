package com.stem.entity;

public class WxTextReply {
    private Integer id;

    private String textKeyword;

    private String textContent;

    private Integer textStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextKeyword() {
        return textKeyword;
    }

    public void setTextKeyword(String textKeyword) {
        this.textKeyword = textKeyword;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Integer getTextStatus() {
        return textStatus;
    }

    public void setTextStatus(Integer textStatus) {
        this.textStatus = textStatus;
    }
}