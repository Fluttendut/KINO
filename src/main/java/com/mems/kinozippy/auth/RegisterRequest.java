package com.mems.kinozippy.auth;

import com.mems.kinozippy.enums.Role;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
  private int userId;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private Role role;
}
