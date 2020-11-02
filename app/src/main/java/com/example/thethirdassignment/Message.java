package com.example.thethirdassignment;

class Message {
    private String recipient;
    private String text_message;

    Message(){}

    Message(String recipient,String text_message){
        this.recipient = recipient;
        this.text_message = text_message;
    }
    //Hello
    public String getRecipient() {
        return recipient;
    }

    public String getText_message() {
        return text_message;
    }
}
