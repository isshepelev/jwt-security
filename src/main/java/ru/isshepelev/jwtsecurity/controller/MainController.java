package ru.isshepelev.jwtsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.isshepelev.jwtsecurity.DTO.RegistrationUserDTO;
import ru.isshepelev.jwtsecurity.exceptions.AppError;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MainController {


    @GetMapping("/unsecured")
    public String unsecuredData(){
        return "unsecured data";
    }
    @GetMapping("/secured")
    public String securedData(){
        return "secured data";
    }

    @GetMapping("/admin")
    public String adminData(){
        return "admin data";
    }
    @GetMapping("/info")
    public String userData(Principal principal){
        return principal.getName();
    }






}
