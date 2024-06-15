package edu.miu.CS544.project.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "AttendanceRecord")
public class AttendanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ScanDateTime")
    private Date scanDateTime;

    @ManyToOne
    @JoinColumn(name = "LocationId")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "StudentId")
    private Student student;
}
