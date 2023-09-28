package com.example.lab11;

public class Shoe {
    String image,title;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Shoe(String image, String title) {
        this.image = image;
        this.title = title;
    }
}