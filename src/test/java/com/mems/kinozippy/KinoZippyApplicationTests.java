package com.mems.kinozippy;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.repositories.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KinoZippyApplicationTests {

  @Autowired
  MovieRepository movieRepository;

/*  @Test
  void contextLoads() {
  }*/
  @Test
  void test () {
    List<Movie> movies = movieRepository.findAll();
    System.out.println(movies);
  }



}
