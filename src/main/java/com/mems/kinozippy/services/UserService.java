package com.mems.kinozippy.services;

import com.mems.kinozippy.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

  Optional<User> getUserByUsername(String username);


}
