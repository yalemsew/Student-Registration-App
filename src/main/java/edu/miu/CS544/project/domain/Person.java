package edu.miu.CS544.project.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date birthdate;

    @Column(name = "EmailAddress")

    private String emailAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "GenderType")
    private GenderType genderType;
    private String firstName;
    private String lastName;
    @Embedded
    private Audit audit;

}
