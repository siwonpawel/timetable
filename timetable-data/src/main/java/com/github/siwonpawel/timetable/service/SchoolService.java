package com.github.siwonpawel.timetable.service;

import com.github.siwonpawel.timetable.data.SchoolRepository;
import com.github.siwonpawel.timetable.valueobject.SchoolVO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SchoolService {

    @NonNull
    SchoolRepository schoolRepo;

    public List<SchoolVO> getSchools() {
        return schoolRepo.findAll().stream()
                .map(SchoolVO::convert)
                .collect(Collectors.toList());
    }

}
