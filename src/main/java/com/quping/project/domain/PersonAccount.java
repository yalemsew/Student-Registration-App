package com.quping.project.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PersonAccount")
public class PersonAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String username;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Person person;
}
