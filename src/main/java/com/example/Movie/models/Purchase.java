package com.example.Movie.models;

import com.example.movie.controllers.PurchaseController;

import javax.persistence.*;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private Customer customer;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Snack snack;


    public Purchase() {
    }

    public Purchase(Long id, Movie movie, Snack snack) {
        this.id = id;
        this.movie = movie;
        this.snack = snack;

    }

    public Snack getSnack() {
        return snack;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }




}
