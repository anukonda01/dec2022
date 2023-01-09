package com.example.dec2022.controller;

import com.example.dec2022.entity.Employee;
import com.example.dec2022.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/byDepartment/{department}")
    public List<Employee> getByDepartment(@PathVariable("department") String department) {
        return employeeService.getByDepartment(department);
    }

    @GetMapping("/byDesignation/{designation}")
    public List<Employee> getByDesignation(@PathVariable("designation") String designation) {
        return employeeService.getByDesignation(designation);
    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee) {
        employeeService.add(employee);
    }

    @DeleteMapping("/delete/{empno}")
    public void delete(@PathVariable("empno") long empno) {
        employeeService.delete(empno);
    }

}
