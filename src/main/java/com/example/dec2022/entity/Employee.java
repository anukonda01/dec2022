package com.example.dec2022.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private long empno;
    private String empname;
    private String empdesignation;
    private String empdepartment;

    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdesignation() {
        return empdesignation;
    }

    public void setEmpdesignation(String empdesignation) {
        this.empdesignation = empdesignation;
    }

    public String getEmpdepartment() {
        return empdepartment;
    }

    public void setEmpdepartment(String empdepartment) {
        this.empdepartment = empdepartment;
    }
}
