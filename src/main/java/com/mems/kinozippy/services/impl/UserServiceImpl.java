package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.entities.User;
import com.mems.kinozippy.repositories.UserRepository;
import com.mems.kinozippy.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Optional<User> getUserByUsername(String username) {
    return userRepository.findUserByUsername(username);

  }


}
