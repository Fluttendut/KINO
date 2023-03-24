package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.entities.User;
import com.mems.kinozippy.repositories.UserRepository;
import com.mems.kinozippy.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public Optional<User> getUserByUsername(String username) {
    return userRepository.findUserByUsername(username);

  }


}
