package com.hayk.fullstack.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.security.oauth2.jwt.Jwt;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(
        origins="http://localhost:5173"
)
public class UserController {


    @GetMapping("/me")
    public Object currentUser(
            @AuthenticationPrincipal Jwt jwt
    ){

        return jwt.getClaims();

    }

}