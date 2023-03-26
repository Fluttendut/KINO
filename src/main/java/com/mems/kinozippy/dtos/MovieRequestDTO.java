package com.mems.kinozippy.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MovieRequestDTO {

  private int movieId;
  private String title;
  private String genre;
  private String length;
  private int rating;
  private String ageRestriction;

}
