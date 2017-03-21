package com.example.theo.youtubeproject;


public class Video {

    private String title;
    private String channel;

    public Video(String title, String channel) {
        this.title = title;
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
