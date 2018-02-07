package com.haoranchat.flashchatnewfirebase;

/**
 * Created by guohr on 1/2/2018.
 */

public class instantMessage {

    private String message;
    private String author;

    public instantMessage(String message, String author){
        this.message = message;
        this.author = author;
    }

    public instantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
