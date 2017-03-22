package com.example.theo.youtubeproject;


public class Item {

    private Snippet snippet;

    public Item(Snippet snippet) {
        this.snippet = snippet;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }
}
