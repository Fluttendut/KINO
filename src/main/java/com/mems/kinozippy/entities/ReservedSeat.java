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
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "seat_id")
  @ToString.Exclude
  private Seat seat;
  @OneToOne(mappedBy = "reservedSeat", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Reservation reservation;
  @ManyToOne
  @JoinColumn(name = "screening_id")
  @ToString.Exclude
  private Screening screening;
}
