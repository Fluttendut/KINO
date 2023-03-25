package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer>
{

}


