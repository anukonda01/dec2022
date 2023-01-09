package com.example.dec2022.repository;

import com.example.dec2022.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {
    List<Employee> findAllByEmpdepartment(String department);

    List<Employee> findAllByEmpdesignation(String designation);
}
