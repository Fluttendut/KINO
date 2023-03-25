package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.ReservedSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedSeatRepo extends JpaRepository<ReservedSeat, Integer> {

}
