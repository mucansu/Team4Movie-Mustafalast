package com.example.Movie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private List<Movie> movies;

    public MovieRepository(){
        movies = new ArrayList<>();
        movies.add(new Movie("Avatar", 150, "Sci-Fi", "Avatar.jpg", "En före detta marinkårssoldat blir förälskad i en blåhyad krigare på en främmande planet. Han ställer sig på hennes folks sida i deras kamp mot människans övergrepp på deras frodiga planet."));
        movies.add(new Movie("Bamse & vulkanön", 109, "Kids", "bamse.jpg", "Just som allt verkar vara lugnt och skönt hemma hos Bamse och hans vänner kommer ett nödanrop från Skalmans gamla forskarkollega, biologen Beanka, som mystiskt verkar ha försvunnit på en forskningsresa."));
        movies.add(new Movie("Black Adam", 159, "Action", "adam.jpg", "Nära 5000 år efter att han tilldelats de forntida gudarnas allsmäktiga krafter - och fängslats lika snabbt - blir Black Adam befriad, redo att släppa lös sin egen form av rättvisa i den moderna världen."));
    }


    public Movie getMovie(String title){
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title) ) {
                return movie;        }
        }    return null;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
