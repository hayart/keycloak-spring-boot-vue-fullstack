package com.hayk.fullstack.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="user_profiles")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String keycloakId;


    private String username;


    private String email;


    private String firstName;


    private String lastName;

}