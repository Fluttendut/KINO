package com.mems.kinozippy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Screening {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int screeningId;
  private int movieId;
  private int auditoriumId;
  private Timestamp startTime;
}
