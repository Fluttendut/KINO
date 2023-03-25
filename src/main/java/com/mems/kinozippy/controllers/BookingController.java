package com.mems.kinozippy.controllers;

import com.mems.kinozippy.auth.AuthenticationRequest;
import com.mems.kinozippy.auth.AuthenticationResponse;
import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Auditorium;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import com.mems.kinozippy.repositories.AuditoriumRepository;
import com.mems.kinozippy.repositories.ScreeningRepo;
import com.mems.kinozippy.services.impl.ScreeningServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BookingController {

  private final ScreeningServiceImpl screeningService;
  private final AuditoriumRepository auditoriumRepository;

  @PostMapping("/dd/screenings")
  public ResponseEntity<List<Screening>> ddScreenings(
      @RequestBody MovieRequestDTO request
  ) {
    return ResponseEntity.ok(screeningService.getAllScreeningsByMovie(request));
  }

  @PostMapping("/auditorium")
  public ResponseEntity<List<Auditorium>> auditorium(
      @RequestBody MovieRequestDTO request) {
    return ResponseEntity.ok(auditoriumRepository.findAll());
  }

}
