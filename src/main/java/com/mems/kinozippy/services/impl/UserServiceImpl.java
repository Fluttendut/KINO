package com.mems.kinozippy.services.impl;

import com.mems.kinozippy.repositories.UserRepo;
import com.mems.kinozippy.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepo userRepo;

  public UserServiceImpl(UserRepo userRepo) {
    this.userRepo = userRepo;
  }
}
