package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString /*Remember to add ToString.Exclude to lazy fields, https://www.jpa-buddy.com/blog/lombok-and-jpa-what-may-go-wrong/*/
public class Seat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seat_id")
  private int seatId;
  private int seat_number;

  @ManyToOne
  @JoinColumn(name = "row_id")
  @ToString.Exclude
  private Row row;

}
