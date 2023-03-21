package com.mems.kinozippy.restcontrollers;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.repositories.MovieRepository;
import com.mems.kinozippy.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class MovieRestController
{

    @Autowired
    MovieRepository movieRepository;

    private final MovieService movieService;

    public MovieRestController(MovieService movieService)
    {
        this.movieService = movieService;
    }



    @GetMapping("/movies")
    public List<Movie> getMovies()
    {

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
    public ResponseEntity<String> postMovie(@RequestBody MovieRequestDTO movie)
    {
        return movieService.createMovie(movie);
    }

    @DeleteMapping("/deleteMovie/{title}")
    public ResponseEntity<Movie> updateCount(@PathVariable String title, @RequestBody Movie movie)
    {
        Optional<Movie> optMovie = movieRepository.findMovieByTitle(title);
        if (optMovie.isPresent())
        {
            movieRepository.delete(movie);
            return new ResponseEntity<>(movie, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/editMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> postMovieEdit(@RequestBody MovieRequestDTO movie)
    {
        return movieService.editMovie(movie);
    }


}
