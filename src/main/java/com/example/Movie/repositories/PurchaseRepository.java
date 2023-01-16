package com.example.Movie.repositories;

import com.example.Movie.models.Purchase;
import com.example.movie.models.Purchase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

    @Query(value = "SELECT SUM (MOVIE.PRICE) FROM PURCHASE\n" +
            "JOIN MOVIE\n" +
            "ON MOVIE.ID = PURCHASE.MOVIE_ID", nativeQuery = true)
    Double getSumMovie();

    @Query(value = "SELECT SUM (SNACK.PRICE) FROM PURCHASE\n" +
            "JOIN SNACK\n" +
            "ON SNACK.ID = PURCHASE.SNACK_ID", nativeQuery = true)
    Double getSumSnack();

}
