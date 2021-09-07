package com.tutorial.springtutorial.Controller;

import com.tutorial.springtutorial.Model.Employee;
import com.tutorial.springtutorial.Model.WeekTable;
import com.tutorial.springtutorial.Service.EmployeeService;
import com.tutorial.springtutorial.Service.WeekTableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weekTable")
public class WeekTableController {
    private final WeekTableService weekTableService;

    public WeekTableController(WeekTableService weekTableServiceService) {
        this.weekTableService = weekTableServiceService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<WeekTable>> getAllWeekTables () {
        List<WeekTable> weekTables = weekTableService.findAllWeekTables();
        return new ResponseEntity<>(weekTables, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<WeekTable> getWeekTableById (@PathVariable("id") Long id) {
        WeekTable weekTable = weekTableService.findWeekTableById(id);
        return new ResponseEntity<>(weekTable, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<WeekTable> addWeekTable(@RequestBody WeekTable weekTable) {
        WeekTable newWeekTable = weekTableService.addWeekTable(weekTable);
        return new ResponseEntity<>(newWeekTable, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<WeekTable> updateWeekTable(@RequestBody WeekTable weekTable) {
        WeekTable updateWeekTable = weekTableService.updateWeekTable(weekTable);
        return new ResponseEntity<>(updateWeekTable, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteWeekTable(@PathVariable("id") Long id) {
        weekTableService.deleteWeekTable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
