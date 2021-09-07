package com.tutorial.springtutorial.Service;

import com.tutorial.springtutorial.Exceptions.UserNotFoundException;
import com.tutorial.springtutorial.Model.Employee;
import com.tutorial.springtutorial.Model.WeekTable;
import com.tutorial.springtutorial.Repository.EmployeeRepository;
import com.tutorial.springtutorial.Repository.WeekTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WeekTableService {
    private final WeekTableRepository weekTableRepository;
    @Autowired
    public WeekTableService(WeekTableRepository weektableRepository) {
        this.weekTableRepository = weektableRepository;
    }

    public WeekTable addWeekTable(WeekTable weekTable){
//        weekTable.setWeekTableCode(UUID.randomUUID().toString());
        return weekTableRepository.save(weekTable);
    }

    public List<WeekTable> findAllWeekTables(){
        return weekTableRepository.findAll();
    }
    public WeekTable updateWeekTable(WeekTable weekTable){
        return weekTableRepository.save(weekTable);
    }

    public WeekTable findWeekTableById(Long id){
        return weekTableRepository.findWeekTableById(id).orElseThrow(() -> new UserNotFoundException("User by id "+id +" not found"));
    }
    public void deleteWeekTable(Long id){
        weekTableRepository.deleteWeekTableById(id);

    }
}
