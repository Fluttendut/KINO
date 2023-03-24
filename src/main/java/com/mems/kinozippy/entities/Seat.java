package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
  @Column(name ="seat_id")
  private int seatId;
  @NotNull
  private int seatNumber;
  @NotNull
  private int rowNumber;
  @ManyToOne
  @JoinColumn(name = "auditorium_id")
  private Auditorium auditorium;
  @OneToOne(mappedBy = "seat", cascade = CascadeType.ALL)
  @ToString.Exclude
  private ReservedSeat reservedSeat;

}
