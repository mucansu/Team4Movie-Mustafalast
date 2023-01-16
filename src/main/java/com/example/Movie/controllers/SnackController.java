package com.example.Movie.controllers;


import com.example.movie.models.Snack;
import com.example.movie.repositories.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/snacks")
@Controller
public class SnackController {

    @Autowired
    SnackRepository snackRepository;

    @GetMapping("")
    public String getAllSnacks(Model model){
        List<Snack> snackList= (List<Snack>) snackRepository.findAll();
        model.addAttribute("snackList", snackList);
        return "snacks";
    }

    @GetMapping("/{id}")
    String getSnack(Model model, @PathVariable Long id){
        Snack snack = snackRepository.findById(id).get();
        model.addAttribute("snack",snack);
        return "detailsSnack";
    }


}
