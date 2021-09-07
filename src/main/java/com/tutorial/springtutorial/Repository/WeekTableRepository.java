package com.tutorial.springtutorial.Repository;

import com.tutorial.springtutorial.Model.Employee;
import com.tutorial.springtutorial.Model.WeekTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeekTableRepository extends JpaRepository<WeekTable, Long> {
    void deleteWeekTableById(Long id);

    Optional<WeekTable> findWeekTableById(Long id);
}
