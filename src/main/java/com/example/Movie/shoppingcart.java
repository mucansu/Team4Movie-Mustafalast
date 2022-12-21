package com.example.Movie;

import java.util.ArrayList;
import java.util.List;

public class shoppingcart {
    private List<Snacks> snacks;

    private List<Movie> movies;

    public shoppingcart() {
        this.snacks = new ArrayList<>();
        this.movies = new ArrayList<>();

    }public void addSnack(Snacks snack) {
        this.snacks.add(snack);

    }public void addMovie(Movie movie) {
        this.movies.add(movie);

    }public List<Snacks> getSnacks() {
        return snacks;
    }
    public List<Movie> getMovies() {
        return movies;
    }
}
