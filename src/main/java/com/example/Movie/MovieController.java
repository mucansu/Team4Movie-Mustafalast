package com.example.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieRepository repository;

    @Autowired
    SnackRepository repository2;

    @Autowired
    ShoppingCart shoppingCart;

    @GetMapping("/")
    String get(Model model) {
        List<Movie> movies = repository.getMovies();
        List<Snacks> snacks = repository2.getSnacks();
        model.addAttribute("movies", movies);
        model.addAttribute("snacks", snacks);
        return "index";
    }

    @GetMapping("/movie/{imageName}")
    String getmovie(Model model, @PathVariable String imageName){
        Movie movie = repository.getMovie(imageName);
        model.addAttribute("movie",movie);
        return "detailsMovie";
    }

    @GetMapping("/snacks/{imageName}")
    String getsnacks(Model model, @PathVariable String imageName){
        Snacks snack = repository2.getSnack(imageName);
        model.addAttribute("snack", snack);
        return "detailsSnacks";
    }


    @GetMapping("/cart")
    public String showShoppingCart(Model model) {
        model.addAttribute("movies", shoppingCart.getMovies());
        model.addAttribute("snacks", shoppingCart.getSnacks());
        return "cart";
    }
    @PostMapping("/cart/addSnack")
    public String addSnackToCart(@RequestParam String product) {
        Snacks snack = repository2.getSnack(product);
        shoppingCart.addSnack(snack);
        System.out.println(snack.getProduct());
        return "redirect:/cart";
    }

    @PostMapping("/cart/addMovie")
    public String addMovieToCart(@RequestParam String title) {
        Movie movie = repository.getMovie(title);
        shoppingCart.addMovie(movie);
        System.out.println(movie.getTitle());
        return "redirect:/cart";
    }


}
