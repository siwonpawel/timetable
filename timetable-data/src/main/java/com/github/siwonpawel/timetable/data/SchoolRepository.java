package com.github.siwonpawel.timetable.data;

import com.github.siwonpawel.timetable.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
