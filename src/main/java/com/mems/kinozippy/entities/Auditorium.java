package com.mems.kinozippy.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString /*Remember to add ToString.Exclude to lazy fields, https://www.jpa-buddy.com/blog/lombok-and-jpa-what-may-go-wrong/*/


public class Auditorium {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "auditorium_id")
  private int auditoriumId;
  private int auditoriumNumber;
  private int seatingCapacity;


}
