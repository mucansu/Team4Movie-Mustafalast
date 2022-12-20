package com.example.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieRepository repository;

    @Autowired
    SnackRepository repository2;

    @GetMapping("/")
    String get(Model model) {
        List<Movie> movies = repository.getMovies();
        List<Snacks> snacks = repository2.getSnacks();
        model.addAttribute("movies", movies);
        model.addAttribute("snacks", snacks);
        return "index";
    }

    @GetMapping("/movie/{imageName}")
    String get1(Model model, @PathVariable String imageName){
        Movie movie = repository.getMovie(imageName);
        Snacks snack = repository2.getSnack(imageName);
        model.addAttribute("movie",movie);
        model.addAttribute("snack", snack);
        return "details";
    }

}
