package edu.miu.CS544.project.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Student")
public class Student extends Person {

    @Column(name = "Entry")
    private String entry;
    @ManyToOne
    @JoinColumn(name = "FacultyAdviserID")
    private Faculty faculty;
    @Column(name = "AlternateID")
    private String alternateID;
    @Column(name = "ApplicantID")
    private String applicantID;
    @Column(name = "StudentID")
    private String studentID;
    @ManyToMany
    @OrderColumn(name = "Sequence")
    @JoinTable(name = "CourseRegistration",
            joinColumns = {
                    @JoinColumn(name = "StudentId") },
            inverseJoinColumns = {
                    @JoinColumn(name = "CourseOffeeringId") })
    private List<CourseOffering> courses = new ArrayList<>();
}
