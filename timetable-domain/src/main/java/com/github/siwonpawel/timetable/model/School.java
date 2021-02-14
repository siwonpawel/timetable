package com.github.siwonpawel.timetable.model;

import com.github.siwonpawel.timetable.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class School extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    private String city;
    private String street;
    private String number;
    private String postcode;

    @OneToMany
    private List<SchoolGroup> groups;

    @OneToMany
    private List<Classroom> classrooms;

    @OneToMany
    private List<Teacher> teachers;

    @OneToMany
    private List<Lesson> lessons;
}
