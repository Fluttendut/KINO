package com.mems.kinozippy.controllers;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    //This will become a List<Movie> I am just testing
    @GetMapping("/moviemanager")
    @ResponseBody
    public String getMovies() {
        //List<Movie> movies = this.movieRepository.findAll();

        return "movies";
    }
}
