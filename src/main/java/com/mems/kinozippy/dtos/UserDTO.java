package com.mems.kinozippy.dtos;

import com.mems.kinozippy.enums.UserType;

public class UserDTO {

  private String username;
  private String password;
  private String firstName;
  private UserType userType;

  public UserDTO(String username, String password, String firstName, UserType userType) {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.userType = userType;
  }

  public UserDTO() {
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

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }
}
