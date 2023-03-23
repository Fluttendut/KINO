package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ScreenRepository extends JpaRepository<Auditorium, String>
{

    Optional<Auditorium> findScreenByScreenId(int screenId);

}
