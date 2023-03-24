package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Builder
@ToString
public class Screening {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="screening_id")
  private int screeningId;
  @NotNull
  private Timestamp startTime;
  @NotNull
  private double ticketPrice;
  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;
  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "auditorium_id")
  private Auditorium auditorium;
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<ReservedSeat> reservedSeats = new HashSet<>();
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<Reservation> reservations = new HashSet<>();
}
