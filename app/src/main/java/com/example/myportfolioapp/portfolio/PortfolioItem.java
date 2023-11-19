package com.example.myportfolioapp.portfolio;

import java.io.Serializable;

public class PortfolioItem implements Serializable {

    private int image;
    private String title, shortDescription, longDescription;

    public PortfolioItem(){
    }

    public PortfolioItem(int image) {
        this.image = image;
    }

    public PortfolioItem(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public PortfolioItem(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.shortDescription = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
