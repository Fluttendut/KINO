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
@ToString /*Remember to add ToString.Exclude to lazy fields, https://www.jpa-buddy.com/blog/lombok-and-jpa-what-may-go-wrong/*/


public class Auditorium {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int auditoriumId;
  @Column(unique = true)
  @NotNull
  private int auditoriumNumber;
  @NotNull
  private int seatingCapacity;
  @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<Seat> seats = new HashSet<>();
  @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<Screening> screenings = new HashSet<>();


}
