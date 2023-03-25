package com.mems.kinozippy.controllers;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import com.mems.kinozippy.repositories.ScreeningRepo;
import com.mems.kinozippy.services.ScreeningService;
import com.mems.kinozippy.services.impl.MovieServiceImpl;
import com.mems.kinozippy.services.impl.ScreeningServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MovieController {

  private final MovieServiceImpl movieServiceImpl;

  @GetMapping("/movies")
  public List<Movie> getMovies() {
    return movieServiceImpl.getAllMovies();
  }

  @PostMapping("/createMovie")
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<String> postMovie(@RequestBody MovieRequestDTO movie) {
    return movieServiceImpl.createMovie(movie);
  }

  @DeleteMapping("/deleteMovie/{title}")
  public ResponseEntity<Movie> updateCount(@PathVariable String title, @RequestBody Movie movie) {
    Optional<Movie> optMovie = movieServiceImpl.getMovieByTitle(title);
    if (optMovie.isPresent()) {
      movieServiceImpl.deleteMovie(movie);
      return new ResponseEntity<>(movie, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/editMovie")
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<String> postMovieEdit(@RequestBody MovieRequestDTO movie) {
    return movieServiceImpl.editMovie(movie);
  }


}
