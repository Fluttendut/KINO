package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@ToString
public class Screening {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="screening_id")
  private int screeningId;
  @NotNull
  private String startTime; /*Originally Timestamp, but JSON can't handle timestamps*/
  @NotNull
  private double ticketPrice;

  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;

  @ManyToOne
  @JoinColumn(name = "auditorium_id")
  private Auditorium auditorium;

  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  @JsonIgnore
  @ToString.Exclude
  private Set<Reservation> reservations = new HashSet<>();
}
