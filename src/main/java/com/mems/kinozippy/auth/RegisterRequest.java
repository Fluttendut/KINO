package com.mems.kinozippy.auth;

import com.mems.kinozippy.enums.Role;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
  private String username;
  private String password;
  private String firstName;
  private Role role;
}
