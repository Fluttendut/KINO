package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Optional<Movie> findMovieByTitle(String title);
}
