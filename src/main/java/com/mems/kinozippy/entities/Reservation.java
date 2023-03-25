package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @JsonIgnore
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "reserved_seat_id")
  @ToString.Exclude
  private ReservedSeat reservedSeat;
  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "screening_id")
  private Screening screening;
}
