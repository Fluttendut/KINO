package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ScreeningRepo extends JpaRepository<Screening, Integer> {

  List<Screening> findAllByMovieMovieId (int movieId);

}
