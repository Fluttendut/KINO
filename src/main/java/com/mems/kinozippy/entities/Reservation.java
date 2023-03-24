package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int reservationId;
  @NotNull
  private int screeningId;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "reserved_seat_id")
  @ToString.Exclude
  private ReservedSeat reservedSeat;
}
