package com.mems.kinozippy.restcontrollers;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.repositories.MovieRepository;
import com.mems.kinozippy.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.mems.kinozippy.entities.Movie;

@RestController
@CrossOrigin
public class MovieRestController {

    @Autowired
    MovieRepository movieRepository;

    private MovieService movieService;

    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    /*
    @GetMapping ("/addmovie")
    public List<Movie> addMovies() {
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setGenre("Horror");
        movie.setLength("120");
        movie.setRating(5);
        movie.setAgeRestriction(12);
        movieRepository.save(movie);

        return movieRepository.findAll();
    }

     */

    @PostMapping("/createMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> postMovie(@RequestBody MovieRequestDTO movie) {
        return movieService.createMovie(movie);
    }

}
//Backend er kun til at hente eller opdatere data