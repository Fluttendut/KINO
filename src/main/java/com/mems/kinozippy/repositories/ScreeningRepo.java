package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreeningRepo extends JpaRepository<Screening, Integer> {

  List<Screening> findAllByMovie (Movie movie);

}
