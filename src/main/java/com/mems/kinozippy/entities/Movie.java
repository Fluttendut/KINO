package com.mems.kinozippy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
  private int movieId;
  private String title;
  private String genre;
  private String length;
  private int rating;
  private String ageRestriction;

}
