package com.example.Movie.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Snack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "snack", cascade = CascadeType.ALL)
    private List<Purchase> purchaseList = new ArrayList<>();

    public Snack() {
    }

    public Snack(Long id, String name, String imageName, double price, String description, List<Purchase> purchaseList) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.price = price;
        this.description = description;
        this.purchaseList = purchaseList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }
}
