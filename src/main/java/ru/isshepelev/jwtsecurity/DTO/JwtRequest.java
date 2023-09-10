package ru.isshepelev.jwtsecurity.DTO;

import lombok.Data;

@Data
public class JwtRequest {

    private String username;
    private String password;

}
