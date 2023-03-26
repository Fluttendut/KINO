package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservedSeat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="reserved_seat_id")
  private int reservedSeatId;

  @ManyToOne
  @JoinColumn(name = "seat_id")
  @ToString.Exclude
  private Seat seat;

  @ManyToOne
  @JoinColumn(name = "reservation_id")
  @ToString.Exclude
  private Reservation reservation;
}
