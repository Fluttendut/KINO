package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, String> {

}
