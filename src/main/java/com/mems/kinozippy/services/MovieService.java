package com.mems.kinozippy.services;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface MovieService {

  void deleteMovie(Movie movie);

  Optional<Movie> getMovieByTitle(String title);

  List<Movie> getAllMovies();

  ResponseEntity<String> createMovie(@RequestBody MovieRequestDTO movieRequestDTO);

  ResponseEntity<String> editMovie(@RequestBody MovieRequestDTO movieRequestDTO);
}
