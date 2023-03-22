package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatRepository extends JpaRepository<Seat, String>
{
    Optional<Seat> findSeatingBySeatingId(int seatingId);

    Optional<Seat> findSeatingBySeatingIdAndMovieId(int seatingId, int movieId);

}


