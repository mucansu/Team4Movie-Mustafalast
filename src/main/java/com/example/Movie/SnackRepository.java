package com.example.Movie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SnackRepository {
    private List<Snacks> snacks;

        public SnackRepository(){
            snacks = new ArrayList<>();
            snacks.add(new Snacks("Djungelvrål", 15.99, "djungelvrål.jpg", "Vrålsalta lakritsdjur har varit en av Malacos favorit hos många godisälskare. Passar dig som älskar extra salt salmiak."));
            snacks.add(new Snacks("Popcorn", 29.99, "popcorn.jpg", "Våra popcorn är gjorda på en majssort som kallas för Butterfly. Popcornmajset har fått sitt namn efter hur de ser ut när de är poppade."));
            snacks.add(new Snacks("Chips", 19.99, "chips.jpg", "Saltade Potatischips är släta chips med lätt och härlig sälta som lyfter den goda potatisen till skyarna. De klassiska tunna chipsen är extra krispiga samtidigt som de nästan smälter i munnen."));
        }

    public Snacks getSnack(String product){
        for (Snacks snack : snacks) {
            if (snack.getProduct().equals(product) ) {
                return snack;        }
        }    return null;
    }

        public List<Snacks> getSnacks() {
            return snacks;
        }
    }
