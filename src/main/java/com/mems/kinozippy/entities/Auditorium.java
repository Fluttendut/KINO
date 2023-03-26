package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
@JsonSerialize

public class Auditorium {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "auditorium_id")
  private int auditoriumId;
  @Column(unique = true)
  @NotNull
  private int auditoriumNumber;
  @NotNull
  private int numberOfRows;
  @NotNull
  private int seatingCapacity;

  @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
  @JsonIgnore
  @ToString.Exclude
  private Set<Seat> seats = new HashSet<>();

  @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
  @JsonIgnore
  @ToString.Exclude
  private Set<Screening> screenings = new HashSet<>();


}
