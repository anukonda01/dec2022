package com.example.dec2022.service;

import com.example.dec2022.entity.Employee;
import com.example.dec2022.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> getByDepartment(String departmentName) {
        return employeeRepository.findAllByEmpdepartment(departmentName);
    }

    public List<Employee> getByDesignation(String designation) {
        return employeeRepository.findAllByEmpdesignation(designation);
    }

    public void add(Employee employee) {
         employeeRepository.save(employee);
    }

    public void delete(long empno) {
        employeeRepository.deleteById(empno);
    }
}
