package com.mems.kinozippy.entities;

import com.mems.kinozippy.enums.UserType;

public class User {
  private String firstName, username, password;

  private UserType userType;

  public User(String firstName, String username, String password, UserType userType) {
    this.firstName = firstName;
    this.username = username;
    this.password = password;
    this.userType = userType;
  }

  public User() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }

  @Override
  public String toString() {
    return "User{" +
        "firstName='" + firstName + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", userType=" + userType +
        '}';
  }
}
