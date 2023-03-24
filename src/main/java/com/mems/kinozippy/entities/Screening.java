package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Screening {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int screeningId;
  @NotNull
  private Timestamp startTime;
  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;
  @ManyToOne
  @JoinColumn(name = "auditorium_id")
  private Auditorium auditorium;
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<ReservedSeat> reservedSeats = new HashSet<>();
}
