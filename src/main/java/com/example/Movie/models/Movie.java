package com.example.Movie.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Column(name = "GENRE")
    @Enumerated(EnumType.STRING)
    private MovieGenre genre;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "MOVIE_LENGTH")
    private LocalTime length; // ändra tillbaka till String
    @Column(name="RELEASE")
    private LocalDate release;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Purchase> purchaseList = new ArrayList<>();

    public Movie() {
    }

    public Movie(Long id, String title, String imageName, MovieGenre genre, int price, String description, LocalTime length, LocalDate release, List<Purchase> purchaseList) {
        this.id = id;
        this.title = title;
        this.imageName = imageName;
        this.genre = genre;
        this.price = price;
        this.description = description;
        this.length = length;
        this.release = release;
        this.purchaseList = purchaseList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getLength() {
        return length;
    }

    public void setLength(LocalTime length) {
        this.length = length;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }


}
