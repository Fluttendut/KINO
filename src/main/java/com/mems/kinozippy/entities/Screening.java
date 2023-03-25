package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Timestamp;
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
  @JsonProperty
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "movie_id")
  private Movie movie;
  @JsonProperty
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "auditorium_id")
  private Auditorium auditorium;
  @JsonIgnore
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<ReservedSeat> reservedSeats/* = new HashSet<>()*/;
  @JsonIgnore
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Set<Reservation> reservations/* = new HashSet<>()*/;
}
