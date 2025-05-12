package org.example.model;

public class Message {
    private String content;
    private User sender;
    private User receiver;

    public Message(User sender, User receiver, String content) {
        this.receiver = receiver;
        this.sender = sender;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }
}
