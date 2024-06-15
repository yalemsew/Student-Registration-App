package com.quping.project.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Faculty")
public class Faculty extends Person {
    @Column(name = "Salutation")
    private String salutation;
    @ElementCollection()
    @CollectionTable(name = "FacultyHobby", joinColumns = @JoinColumn(name = "Faculty_id"))
    @Column(name = "hobbies")
    private List<String> facultyHobbies;
}
