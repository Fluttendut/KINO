package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.entities.User;
import com.mems.kinozippy.repositories.UserRepo;
import com.mems.kinozippy.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepo userRepo;

  public UserServiceImpl(UserRepo userRepo) {
    this.userRepo = userRepo;
  }

  @Override
  public Optional<User> getUserByUsername(String username) {
    return userRepo.findById(username);

  }

  @Override
  public Optional<User> getUserByUsernameAndPassword(String username, String password) {
    return userRepo.findUserByUsernameAndPassword(username, password);
  }

  @Override
  public List<User> getAllUsers() {
    return userRepo.findAll();
  }

  @Override
  public boolean AuthenticateUser(String username, String password) {
    return getUserByUsernameAndPassword(username, password).isPresent();
  }


}
