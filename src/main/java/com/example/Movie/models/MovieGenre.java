package com.example.Movie.models;

public enum MovieGenre {
    ACTION ("Action"),
    SCIFI ("Science Fiction"),
    CHILDREN ("Barn & Familj"),
    COMEDY ("Komedi");

    private final String displayGenre;

    MovieGenre(String displayGenre) {
        this.displayGenre = displayGenre;
    }

    public String getDisplayGenre() {
        return displayGenre;
    }
}
