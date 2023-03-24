package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import com.mems.kinozippy.repositories.MovieRepository;
import com.mems.kinozippy.repositories.ScreeningRepo;
import com.mems.kinozippy.services.ScreeningService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScreeningServiceImpl implements ScreeningService {

  private final ScreeningRepo screeningRepo;

  @Override
  public List<Screening> getAllScreeningsByMovie(Movie movie) {
    return screeningRepo.findAllByMovie(movie);
  }
}
