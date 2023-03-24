package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ReservedSeat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="reserved_seat_id")
  private int reservedSeatId;
  @JsonIgnore
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "seat_id")
  @ToString.Exclude
  private Seat seat;
  @OneToOne(mappedBy = "reservedSeat", cascade = CascadeType.ALL)
  @ToString.Exclude
  private Reservation reservation;
  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "screening_id")
  @ToString.Exclude
  private Screening screening;
}
