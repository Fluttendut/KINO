package com.mems.kinozippy.auth;

import com.mems.kinozippy.config.JwtService;
import com.mems.kinozippy.enums.UserType;
import com.mems.kinozippy.repositories.UserRepo;
import com.mems.kinozippy.entities.User;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

  private final UserRepo userRepo;
  private final PasswordEncoder passwordEncoder;

  private final JwtService jwtService;

  private final AuthenticationManager authenticationManager;

  public AuthenticationResponse register (RegisterRequest request) {
    var user = User.builder()
        .username(request.getUsername())
        .password(passwordEncoder.encode(request.getPassword()))
        .firstName(request.getFirstName())
        .userType(request.getUserType())
        .build();
    userRepo.save(user);
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
        .token(jwtToken)
        .build();
  }

  public AuthenticationResponse authenticate (AuthenticationRequest request) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getUsername(),
            request.getPassword()
        )
    );
    var user = userRepo.findById(request.getUsername())
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
        .token(jwtToken)
        .build();
  }

}
