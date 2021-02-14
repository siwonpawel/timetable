package com.github.siwonpawel.timetable.api;

import com.github.siwonpawel.timetable.service.SchoolService;
import com.github.siwonpawel.timetable.valueobject.SchoolVO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/school")
@RequiredArgsConstructor
public class SchoolController {

    @NonNull
    private final SchoolService schoolService;

    @GetMapping
    public List<SchoolVO> getSchools() {
        return schoolService.getSchools();
    }

}
