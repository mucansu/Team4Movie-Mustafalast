package com.example.Movie;

public class Snacks {
    private String product;
    private double snackPrice;

    private String description;
    private String imageName;


    public Snacks() {
    }

    public Snacks(String product, double snackPrice,String imageName ,String description ) {
        this.product = product;
        this.snackPrice = snackPrice;
        this.description = description;
        this.imageName= imageName;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }


}
