package com.example.Movie.repositories;

import com.example.movie.models.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> findAllByOrderByRelease();

    List<Movie> findAllByOrderByGenre();

    @Query(value = "SELECT * FROM MOVIE WHERE RELEASE <= CURRENT_DATE AND GENRE = ?1", nativeQuery = true)
    List<Movie> getCurrentMoviesByGenre(String genre);

    @Query(value = "SELECT * FROM MOVIE WHERE RELEASE > CURRENT_DATE AND GENRE = ?1", nativeQuery = true)
    List<Movie> getUpcomingMoviesByGenre(String genre);

    @Query(value = "SELECT * FROM MOVIE WHERE RELEASE > CURRENT_DATE", nativeQuery = true)
    List<Movie> getUpcomingMovies();

    @Query(value = "SELECT * FROM MOVIE WHERE RELEASE <= CURRENT_DATE", nativeQuery = true)
    List<Movie> getCurrentMovies();

    //Jdbc kanske
    //Ny class CountMovie. Id och antal.

}
