package com.stem.wechat.inf;

public enum SendAllMsgTypes {
    TEXT("text"),
    IMAGE("image"),
    VOICE("voice"),
    MPVIDEO("mpvideo"),
    MPNEWS("mpnews"),
    VIDEO("video");

    private String type;

    SendAllMsgTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
