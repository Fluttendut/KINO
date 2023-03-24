package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString /*Remember to add ToString.Exclude to lazy fields, https://www.jpa-buddy.com/blog/lombok-and-jpa-what-may-go-wrong/*/
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="movie_id")
  private int movieId;
  @NotNull
  private String title;
  @NotNull
  private String genre;
  @NotNull
  private String length; /*RUNNING TIME*/ /*Burde nok være impl som integer*/
  private int rating; /*Should have been a double*/
  @NotNull
  private String ageRestriction;

  /*  private String description;*/ /*Bruges ikke*/

  @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<Screening> screenings = new HashSet<>();

}
