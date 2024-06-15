package edu.miu.CS544.project.domain;


import java.time.LocalDate;
import java.time.LocalTime;

public class Session {
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;


    public Session(LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }


}

