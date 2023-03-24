package com.mems.kinozippy.services;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;

import java.util.List;

public interface ScreeningService {

  List<Screening> getAllScreeningsByMovie(Movie movie);
}
