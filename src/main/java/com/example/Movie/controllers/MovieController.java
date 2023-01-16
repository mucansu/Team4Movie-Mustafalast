package com.example.Movie.controllers;

import com.example.Movie.repositories.MovieRepository;
import com.example.movie.models.Movie;
import com.example.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/movies")
@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;
//    @Autowired
//    CustomerRepository customerRepository;

    // ShoppingCart till ArrayList. Leva i minnet till en http session.
    // ShoppingCart måste vara specifik för varje användare.

    @GetMapping("")
    public String getAllMovies(Model model,
                               @RequestParam (required = false, value = "sortBy") String sortBy,
                               @RequestParam (required = false, value = "current", defaultValue = "true") Boolean isCurrent
    ){

        boolean helper = true;
        String pageTitle = "På bio just nu";
        List<Movie> movieList;
        LocalDate today = LocalDate.now();

        // PÅ BIO JUST NU
        if(isCurrent && sortBy == null){
            movieList = (List<Movie>) movieRepository.getCurrentMovies();
        }
        else if(isCurrent && sortBy.equals("action")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("ACTION");
        }
        else if(isCurrent && sortBy.equals("komedi")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("COMEDY");
        }
        else if(isCurrent && sortBy.equals("scifi")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("SCIFI");
        }
        else if(isCurrent && sortBy.equals("barn")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("CHILDREN");
        }

        // KOMMANDE FILMER
        else if(!isCurrent && sortBy == null){
            movieList = (List<Movie>) movieRepository.getUpcomingMovies();
            helper = false;
            pageTitle = "Kommande filmer";
        }
        else if(!isCurrent && sortBy.equals("action")) {
            movieList = (List<Movie>) movieRepository.getUpcomingMoviesByGenre("ACTION");
            helper = false;
            pageTitle = "Kommande filmer";
        }
        else if(!isCurrent && sortBy.equals("komedi")) {
            movieList = (List<Movie>) movieRepository.getUpcomingMoviesByGenre("COMEDY");
            helper = false;
            pageTitle = "Kommande filmer";
        }
        else if(!isCurrent && sortBy.equals("scifi")) {
            movieList = (List<Movie>) movieRepository.getUpcomingMoviesByGenre("SCIFI");
            helper = false;
            pageTitle = "Kommande filmer";
        }
        else if(!isCurrent && sortBy.equals("barn")) {
            movieList = (List<Movie>) movieRepository.getUpcomingMoviesByGenre("CHILDREN");
            helper = false;
            pageTitle = "Kommande filmer";
        }

        else movieList = movieList = (List<Movie>) movieRepository.findAll();

        model.addAttribute("movieList", movieList);
        model.addAttribute("pageTitle", pageTitle);
        model.addAttribute("helper", helper);
        model.addAttribute("today", today);

        return "movies";
    }

    @GetMapping("/{id}")
    String getmovie(Model model, @PathVariable Long id){
        Movie movie = movieRepository.findById(id).get();
        model.addAttribute("movie",movie);
        return "detailsMovie";
    }

//    @ModelAttribute
//    public void findCurrentCustomer(Model model, Customer currentCustomer) {
//        currentCustomer = customerRepository.findById(1L).get();
//        model.addAttribute("currentCustomer", currentCustomer);
//    }




}
