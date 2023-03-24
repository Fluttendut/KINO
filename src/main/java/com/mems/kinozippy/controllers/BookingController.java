package com.mems.kinozippy.controllers;

import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import com.mems.kinozippy.services.impl.ScreeningServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/booking")
@RequiredArgsConstructor

public class BookingController {

  ScreeningServiceImpl screeningService;

  @PostMapping("/screenings")
  public List<Screening> ddScreenings (@RequestBody Movie movie) {
    return screeningService.getAllScreeningsByMovie(movie);
  }
}
