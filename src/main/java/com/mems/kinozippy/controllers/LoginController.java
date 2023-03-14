package com.mems.kinozippy.controllers;

import com.mems.kinozippy.dtos.UserDTO;
import com.mems.kinozippy.entities.User;
import com.mems.kinozippy.services.impl.UserServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class LoginController {

  private UserServiceImpl userService;

  public LoginController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @GetMapping("/signin")
  public String login() {
    return "signin";
  }

  /*Metode der kontrollere om brugernavnet findes i databasen og hvorvidt kodeordet passer dertil. Hvis ikke sendes brugeren tilbage til sign-in siden*/
/*  @PostMapping("/signinUser")
  public String loginUser(@ModelAttribute UserDTO userDTO, HttpSession session, RedirectAttributes redirectAttributes) {
    User user;
    try {
      user = userService.AuthenticateUser(userDTO.getUsername(), userDTO.getPassword());
    } catch (Exception e) {
      System.out.println(e.getMessage());
      redirectAttributes.addFlashAttribute("message", "Log ind fejlede. Dit brugernavn eller kodeord er angivet forkert");
      return "redirect:/signin";
    }
    if (user != null) {
      setLoginSessionAttributes(session, user);
      return "redirect:/employee";
    } else {
      redirectAttributes.addFlashAttribute("message", "Log ind fejlede. Dit brugernavn eller kodeord er angivet forkert");
      return "redirect:/signin";
    }
  }*/

  @PostMapping("/signinUser")
  public String loginAttempt(@ModelAttribute UserDTO userDTO, HttpSession session, RedirectAttributes redirectAttributes) {
    Optional<User> user = userService.getUserByUsername(userDTO.getUsername());
    try {
      userService.AuthenticateUser(userDTO.getUsername(), userDTO.getPassword());
    } catch (Exception e) {
      System.out.println(e.getMessage());
      redirectAttributes.addFlashAttribute("message", "Log ind fejlede. Dit brugernavn eller kodeord er angivet forkert");
      return "redirect:/signin";
    }
    if (user.isPresent()) {
      session.setAttribute("session",user);
      /*TODO: Insert html page name - Ella og Batman*/
      return "index";
    } else {
      redirectAttributes.addFlashAttribute("message", "Log ind fejlede. Dit brugernavn eller kodeord er angivet forkert");
      return "redirect:/signin";
    }
  }

  @GetMapping("/signoutUser")
  public String signout(HttpSession session) {
    session.invalidate();
    return"redirect:/signin";
  }

  /*Metode der gemmer username og usertype i en session. Usertype bestemmer hvilke dele af webapplikationen brugeren har adgang til */
  private void setLoginSessionAttributes(HttpSession session, User user) {
    session.setAttribute("username", user.getUsername());
    session.setAttribute("userType", String.valueOf(user.getUserType()));
    session.setMaxInactiveInterval(600); //session slutter efter 10 min, hvis man ikke rør ved noget.
  }
}
