package edu.miu.CS544.project.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "Room")
    private String room;

    private int capacity;

    private int credits;

    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private CourseOfferingType courseOfferingType;


    @Embedded
    private Audit audit;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;


    private List<Session> generateSessions() {
        List<Session> sessions = new ArrayList<>();
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                sessions.add(new Session(currentDate, LocalTime.of(10, 0), LocalTime.of(12, 30)));
                if (!currentDate.equals(endDate)) {
                    sessions.add(new Session(currentDate, LocalTime.of(13, 30), LocalTime.of(15, 30)));
                }
            }
            currentDate = currentDate.plusDays(1);
        }

        return sessions;
    }
}
