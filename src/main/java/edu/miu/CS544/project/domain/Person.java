package edu.miu.CS544.project.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SecondaryTable(name = "person_account", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(table = "person_account")
    String userName;
    @Column(table = "person_account")
    String password;

    @Enumerated(EnumType.STRING)
    private Roles role;
    private String firstName;
    private String lastName;
    private String email;
    LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    GenderType genderType;
    @Embedded
    private Audit audit;
}

