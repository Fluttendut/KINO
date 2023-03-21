package com.mems.kinozippy.dtos;

import com.mems.kinozippy.enums.Role;

public class UserDTO {

  private String username;
  private String password;
  private String firstName;
  private Role role;

  public UserDTO(String username, String password, String firstName, Role role) {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.role = role;
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

  public Role getUserType() {
    return role;
  }

  public void setUserType(Role role) {
    this.role = role;
  }
}
