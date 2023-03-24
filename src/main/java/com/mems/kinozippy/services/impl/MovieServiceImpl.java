package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.repositories.MovieRepository;
import com.mems.kinozippy.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

  private final MovieRepository movieRepo;

  public void deleteMovie(Movie movie) {
    movieRepo.delete(movie);
  }

  public Optional<Movie> getMovieByTitle(String title) {
    return movieRepo.findMovieByTitle(title);
  }

  public List<Movie> getAllMovies() {
    return movieRepo.findAll();
  }

  public ResponseEntity<String> createMovie(@RequestBody MovieRequestDTO movieRequestDTO) {
    Movie movie = new Movie();
    movie.setTitle(movieRequestDTO.getTitle());
    movie.setGenre(movieRequestDTO.getGenre());
    movie.setLength(movieRequestDTO.getLength());
    movie.setRating(movieRequestDTO.getRating());
    movie.setAgeRestriction(movieRequestDTO.getAgeRestriction());

    movieRepo.save(movie);

    return ResponseEntity.ok("Movie created");
  }

  public ResponseEntity<String> editMovie(@RequestBody MovieRequestDTO movieRequestDTO) {

    Movie movie = movieRepo.findById(movieRequestDTO.getMovieId()).get();
    movie.setTitle(movieRequestDTO.getTitle());
    movie.setGenre(movieRequestDTO.getGenre());
    movie.setLength(movieRequestDTO.getLength());
    movie.setRating(movieRequestDTO.getRating());
    movie.setAgeRestriction(movieRequestDTO.getAgeRestriction());

    movieRepo.save(movie);


    return ResponseEntity.ok("Movie edited");
  }

}
