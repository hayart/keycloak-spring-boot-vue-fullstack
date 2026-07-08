package com.hayk.fullstack.dto;


public record UserProfileDto(

        String username,

        String email,

        String firstName,

        String lastName

) {}