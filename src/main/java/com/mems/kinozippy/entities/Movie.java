package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString /*Remember to add ToString.Exclude to lazy fields, https://www.jpa-buddy.com/blog/lombok-and-jpa-what-may-go-wrong/*/
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "movie_id")
  private int movieId;
  private String title;
  private String genre;
  private String length; /*RUNNING TIME*/
  private int rating;
  private String ageRestriction;

  /*  private String description;*/

}
