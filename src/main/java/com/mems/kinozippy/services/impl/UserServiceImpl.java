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
    return userRepository.findById(username);

  }

  @Override
  public Optional<User> getUserByUsernameAndPassword(String username, String password) {
    return userRepository.findUserByUsernameAndPassword(username, password);
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public boolean AuthenticateUser(String username, String password) {
    return getUserByUsernameAndPassword(username, password).isPresent();
  }


}
