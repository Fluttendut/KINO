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
  @Column(name = "reservation_id")
  private int reservationId;

  /*private int userId;*/ /*Bruges ikke, User ID er username*/

  private String username;

  private int screeningId;

  private int reservedSeatId;
}
