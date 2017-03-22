package com.example.theo.youtubeproject;


public class Snippet {

    private String title;
    private String description;
    private Thumbnails thumbnails;

    public Snippet(String title, String description, Thumbnails thumbnails) {
        this.title = title;
        this.description = description;
        this.thumbnails = thumbnails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }
}
