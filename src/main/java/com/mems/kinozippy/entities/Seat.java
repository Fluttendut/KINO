package com.mems.kinozippy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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

  @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
  @JsonIgnore
  @ToString.Exclude
  private Set<ReservedSeat> reservedSeats = new HashSet<>();

}
