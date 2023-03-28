package com.example.kodomobackend;

public class Feed {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public Feed(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
