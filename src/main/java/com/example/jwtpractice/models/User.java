package com.example.jwtpractice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@
public class User {

    @Id
    private long id;
    private String username;
    private String password;
}