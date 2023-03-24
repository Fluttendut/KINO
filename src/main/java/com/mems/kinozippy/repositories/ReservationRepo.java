package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

}
