package com.chat.app.model;

import lombok.Data;

@Data
public class ChatMessage {
    private long id;
    private String sender;
    private String content;

    public ChatMessage() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

