package com.rakovpublic.shoestore.model;

/**
 * Created by rakovskyi on 18.02.15.
 */
public class Message {
    private int idMessage;
    private String topic;
    private String bodyMessage;
    private boolean isRead;
    public Message() {
    }

    public Message(int idMessage, String topic, String bodyMessage, boolean isRead ) {
        this.idMessage = idMessage;
        this.bodyMessage = bodyMessage;
        this.isRead = isRead;
        this.topic= topic;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getBodyMessage() {
        return bodyMessage;
    }

    public void setBodyMessage(String bodyMessage) {
        this.bodyMessage = bodyMessage;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
