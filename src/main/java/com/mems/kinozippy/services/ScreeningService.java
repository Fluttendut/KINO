package com.mems.kinozippy.services;

import com.mems.kinozippy.dtos.MovieRequestDTO;
import com.mems.kinozippy.entities.Screening;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ScreeningService {

  List<Screening> getAllScreeningsByMovie(@RequestBody MovieRequestDTO movieRequestDTO);

  List<Screening> getAllScreenigs();
}
