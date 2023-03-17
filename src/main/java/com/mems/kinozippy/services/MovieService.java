package com.mems.kinozippy.services;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public ResponseEntity<String> createMovie (@RequestBody MovieRequestDTO movieRequestDTO) {
            Movie movie = new Movie();
            movie.setTitle(movieRequestDTO.getTitle());
            movie.setGenre(movieRequestDTO.getGenre());
            movie.setLength(movieRequestDTO.getLength());
            movie.setRating(movieRequestDTO.getRating());
            movie.setAgeRestriction(movieRequestDTO.getAgeRestriction());

            movieRepo.save(movie);

            return ResponseEntity.ok("Movie created");
    }

    public ResponseEntity<String> editMovie (@RequestBody MovieRequestDTO movieRequestDTO) {
        Movie movie = new Movie();
        movie.setTitle(movieRequestDTO.getTitle());
        movie.setGenre(movieRequestDTO.getGenre());
        movie.setLength(movieRequestDTO.getLength());
        movie.setRating(movieRequestDTO.getRating());
        movie.setAgeRestriction(movieRequestDTO.getAgeRestriction());

        movieRepo.save(movie);


        return ResponseEntity.ok("Movie edited");
    }

}
