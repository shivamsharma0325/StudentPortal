package com.example.studentportal;

public class Event {
    private String description;
    private String urlArcticle;
    private int id;
    private String imageUrl;
    private String Date;
    private String title;

    public Event(int id, String imageUrl, String date, String title, String description, String urlArcticle) {
        this.id = id;
        this.imageUrl = imageUrl;
        Date = date;
        this.title = title;
        this.description = description;
        this.urlArcticle = urlArcticle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
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

    public String getUrlArcticle() {
        return urlArcticle;
    }

    public void setUrlArcticle(String urlArcticle) {
        this.urlArcticle = urlArcticle;
    }


}
