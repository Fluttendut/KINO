package com.mems.kinozippy.entities;

import jakarta.persistence.*;
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
  @Column(name ="reservation_id")
  private int reservationId;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "reserved_seat_id")
  @ToString.Exclude
  private ReservedSeat reservedSeat;
  @ManyToOne
  @JoinColumn(name = "screening_id")
  private Screening screening;
}
