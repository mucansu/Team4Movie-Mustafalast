package com.example.Movie;

public class Movie {

    private String title;
    private int price;

    private String genre;
    private String imageName;
    private String description;

    public Movie() {

    }

    public Movie(String title, int price, String genre, String imageName, String description) {
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.imageName = imageName;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
