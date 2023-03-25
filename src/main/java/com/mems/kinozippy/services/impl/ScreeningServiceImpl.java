package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import com.mems.kinozippy.repositories.MovieRepository;
import com.mems.kinozippy.repositories.ScreeningRepo;
import com.mems.kinozippy.services.ScreeningService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScreeningServiceImpl implements ScreeningService {

  private final ScreeningRepo screeningRepo;

  @Override
  public List<Screening> getAllScreeningsByMovie(@RequestBody MovieRequestDTO request) {
    return screeningRepo.findAllByMovieMovieId(request.getMovieId());
  }

  @Override
  public List<Screening> getAllScreenigs() {
    return screeningRepo.findAll();
  }
}
