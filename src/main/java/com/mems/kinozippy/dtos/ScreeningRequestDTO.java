package com.mems.kinozippy.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ScreeningRequestDTO {

  private int screeningId;

  private String startTime;

  private double ticketPrice;
}
