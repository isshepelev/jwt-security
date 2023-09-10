package ru.isshepelev.jwtsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.isshepelev.jwtsecurity.DTO.JwtRequest;
import ru.isshepelev.jwtsecurity.DTO.JwtResponse;
import ru.isshepelev.jwtsecurity.DTO.RegistrationUserDTO;
import ru.isshepelev.jwtsecurity.entity.User;
import ru.isshepelev.jwtsecurity.exceptions.AppError;
import ru.isshepelev.jwtsecurity.service.AuthService;
import ru.isshepelev.jwtsecurity.service.UserService;
import ru.isshepelev.jwtsecurity.utils.JwtTokenUtils;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;


    @PostMapping("/auth")
    public ResponseEntity<?> createToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }


    @PostMapping("/reg")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDTO registrationUserDto) {
        return authService.createNewUser(registrationUserDto);
    }
}
