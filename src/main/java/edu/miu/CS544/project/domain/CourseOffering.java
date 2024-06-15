package edu.miu.CS544.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CourseOffering")
public class CourseOffering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "CourseID")
    private Course course;
    private int capacity;
    private int credits;
    @Enumerated(EnumType.STRING)
    private CourseOfferingType courseOfferingType;
    @Column(name = "Room")
    private String room;
    @Embedded
    private Audit audit;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

}
