package com.github.siwonpawel.timetable.valueobject;

import com.github.siwonpawel.timetable.model.Classroom;
import com.github.siwonpawel.timetable.model.School;
import com.github.siwonpawel.timetable.model.SchoolGroup;
import com.github.siwonpawel.timetable.model.Teacher;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class SchoolVO {
    private Long id;
    private String name;
    private String city;
    private String street;
    private String number;
    private String postcode;

    private List<Long> schoolGroupsIds;
    private List<Long> teachersIds;
    private List<Long> classroomsIds;

    public static SchoolVO convert(School s) {
        SchoolVO schoolVO = new SchoolVO();
        BeanUtils.copyProperties(s, schoolVO);

        schoolVO.setClassroomsIds(
                s.getClassrooms().stream()
                        .map(Classroom::getId)
                        .collect(Collectors.toList()));

        schoolVO.setTeachersIds(
                s.getTeachers().stream()
                        .map(Teacher::getId)
                        .collect(Collectors.toList()));

        schoolVO.setSchoolGroupsIds(
                s.getGroups().stream()
                        .map(SchoolGroup::getId)
                        .collect(Collectors.toList()));

        return schoolVO;
    }
}
