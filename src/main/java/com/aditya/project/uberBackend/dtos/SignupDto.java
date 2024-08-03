package com.aditya.project.uberBackend.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupDto {
    private String name;
    private String email;
    private String password;
}
