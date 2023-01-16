package com.example.Movie.controllers;

import com.example.Movie.repositories.MovieRepository;
import com.example.movie.models.Movie;
import com.example.movie.models.Snack;
import com.example.movie.repositories.MovieRepository;
import com.example.movie.repositories.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/homePage")
@Controller
public class HomepageController {

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    SnackRepository snackRepository;

    @GetMapping("")
    String getAll(Model model){
        List<Movie> movieList= (List<Movie>) movieRepository.findAll();
        List<Snack> snackList= (List<Snack>) snackRepository.findAll();
        model.addAttribute("snacks", snackList);
        model.addAttribute("movies", movieList);
        return "homePage";
    }

//    @GetMapping("/movies/{id}")
//    String getMovie(Model model, @PathVariable Long id){
//        Movie movie = movieRepository.findById(id).get();
//        model.addAttribute("movie",movie);
//        return "detailsMovie";
//    }
//
//    @GetMapping("/snacks/{id}")
//    String getSnack(Model model, @PathVariable Long id){
//        Snack snack = snackRepository.findById(id).get();
//        model.addAttribute("snack",snack);
//        return "detailsSnack";
//    }

}
