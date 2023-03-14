package com.mems.kinozippy.entities;

import com.mems.kinozippy.enums.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

  @Id
  private String username;
  @Column(name="pw")
  private String password;
  private String firstName;
  private UserType userType;

  public User(String username, String password, String firstName, UserType userType) {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.userType = userType;
  }

  public User() {
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

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", firstName='" + firstName + '\'' +
        ", userType=" + userType +
        '}';
  }
}
