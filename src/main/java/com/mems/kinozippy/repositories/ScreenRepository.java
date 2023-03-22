package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Screen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ScreenRepository extends JpaRepository<Screen, String>
{

    Optional<Screen> findScreenByScreenId(int screenId);

}
