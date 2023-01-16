package com.example.Movie.models;//package com.example.movie.models;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class ShoppingCart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private List<Snack> cartSnacks;
//    private List<Movie> cartMovies;
//
//    public ShoppingCart() {
//        this.cartSnacks = new ArrayList<>();
//        this.cartMovies = new ArrayList<>();
//    }
//
//    public void addSnack(Snack snack) {
//        this.cartSnacks.add(snack);
//    }
//
//    public void addMovie(Movie movie) {
//        this.cartMovies.add(movie);
//    }
//
//    public List<Snack> getSnacks() {
//        return cartSnacks;
//    }
//
//    public List<Movie> getMovies() {
//        return cartMovies;
//    }
//}
//
//
