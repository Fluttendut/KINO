package com.mems.kinozippy.restcontrollers;

import com.mems.kinozippy.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.mems.kinozippy.entities.Movie;

@RestController
@CrossOrigin
public class MovieRestController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

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

    @PostMapping("/createmovie")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie postMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

}
//Backend er kun til at hente eller opdatere data