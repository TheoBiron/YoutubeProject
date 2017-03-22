package com.example.theo.youtubeproject;


import java.io.Serializable;

public class Thumbnails implements Serializable {

    private High high;

    public Thumbnails(High high) {
        this.high = high;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public class High implements Serializable {

        private String url;

        public High(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
