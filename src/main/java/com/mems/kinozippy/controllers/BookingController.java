package com.mems.kinozippy.controllers;

import com.mems.kinozippy.auth.AuthenticationRequest;
import com.mems.kinozippy.auth.AuthenticationResponse;
import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.dtos.ScreeningRequestDTO;
import com.mems.kinozippy.entities.Auditorium;
import com.mems.kinozippy.entities.Movie;
import com.mems.kinozippy.entities.Screening;
import com.mems.kinozippy.repositories.AuditoriumRepository;
import com.mems.kinozippy.repositories.ScreeningRepo;
import com.mems.kinozippy.services.impl.ScreeningServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BookingController {

  private final ScreeningServiceImpl screeningService;
  private final AuditoriumRepository auditoriumRepository;
  private final ScreeningRepo screeningRepo;

  @PostMapping("/dd/screenings")
  public ResponseEntity<List<Screening>> ddScreenings(
      @RequestBody MovieRequestDTO request
  ) {
    return ResponseEntity.ok(screeningService.getAllScreeningsByMovie(request));
  }

  @PostMapping("/screening")
  public ResponseEntity<Screening> screening(
      @RequestBody ScreeningRequestDTO request
  ) {
    Optional<Screening> optScreening = screeningRepo.findById(request.getScreeningId());
    return optScreening.map(screening -> new ResponseEntity<>(screening, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

/*  @GetMapping("/auditorium")
  public ResponseEntity<List<Auditorium>> auditorium() {
    return ResponseEntity.ok(auditoriumRepository.findAll());
  }*/

  @GetMapping("/screenings")
  public ResponseEntity<List<Screening>> screenings() {
    return ResponseEntity.ok(screeningService.getAllScreenigs());
  }



}
