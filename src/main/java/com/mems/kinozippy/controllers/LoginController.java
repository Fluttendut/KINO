package com.mems.kinozippy.controllers;

import com.mems.kinozippy.services.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

  private UserServiceImpl userService;

  public LoginController(UserServiceImpl userService) {
    this.userService = userService;
  }
}
