package com.quping.project.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int credits;
    @Column(name = "CourseDescription")
    private String courseDescription;
    @Column(name = "CourseCode")
    private String courseCode;
    @Column(name = "CourseName")
    private String courseName;
    private String department;
    @Embedded
    private Audit audit;

    @OneToMany
    @JoinTable(
            name = "CoursePrerequisite",
            joinColumns = @JoinColumn(name = "CourseId"),
            inverseJoinColumns = @JoinColumn(name = "PrerequisiteId")
    )
    private List<Course> courses = new ArrayList<>();

}
