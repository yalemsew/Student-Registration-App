package edu.miu.CS544.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Capacity")
    private int capacity;
    @Column(name = "Name")
    private String name;
    @Embedded
    private Audit audit;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private LocationType locationType;

}
