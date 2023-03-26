package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="reservation_id")
  private int reservationId;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
  @JsonIgnore
  @ToString.Exclude
  private Set<ReservedSeat> reservedSeats = new HashSet<>();

  @ManyToOne
  @JoinColumn(name = "screening_id")
  private Screening screening;
}
