package ru.isshepelev.jwtsecurity.DTO;

import lombok.Data;
import ru.isshepelev.jwtsecurity.entity.Role;

import javax.persistence.*;
import java.util.Collection;

@Data
public class RegistrationUserDTO {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
}
