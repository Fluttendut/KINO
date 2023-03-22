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
public class Row {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "row_id")
  private int rowId;

  private int row_number;

  @ManyToOne
  @JoinColumn(name = "screen_id")
  @ToString.Exclude
  private Screen screen;
  @OneToMany(mappedBy = "row")
  @ToString.Exclude
  private Set<Seat> seats = new HashSet<>();
  /*ArrayList<Seat> seats = new ArrayList<Seat>();*/

}