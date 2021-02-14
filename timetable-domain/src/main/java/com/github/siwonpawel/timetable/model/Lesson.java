package com.github.siwonpawel.timetable.model;

import com.github.siwonpawel.timetable.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Lesson extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String teacherName;
    private String classroomName;
    private String className;
    private DayOfWeek dayOfWeek;
    private Integer sequence;

    @ManyToMany
    private List<Teacher> teachers;
}

