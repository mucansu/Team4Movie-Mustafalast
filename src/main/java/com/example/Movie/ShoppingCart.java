package com.example.Movie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShoppingCart {
    private List<Snacks> cartSnacks;
    private List<Movie> cartMovies;


    public ShoppingCart() {
        this.cartSnacks = new ArrayList<>();
        this.cartMovies = new ArrayList<>();
    }

    public void addSnack(Snacks snack) {
        this.cartSnacks.add(snack);
    }

    public void addMovie(Movie movie) {
        this.cartMovies.add(movie);
    }

    public List<Snacks> getSnacks() {
        return cartSnacks;
    }

    public List<Movie> getMovies() {
        return cartMovies;
    }
}
