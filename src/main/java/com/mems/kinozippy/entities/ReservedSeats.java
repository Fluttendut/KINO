package com.mems.kinozippy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservedSeats {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int reservedSeatId;
  private int seatId;
  private int screeningId;
}
