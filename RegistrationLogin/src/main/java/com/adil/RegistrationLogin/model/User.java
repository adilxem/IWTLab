package com.adil.RegistrationLogin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String email;
    private String phone;
    @Id
    private String username;
    private String password;
    private String confirmPassword;
}
