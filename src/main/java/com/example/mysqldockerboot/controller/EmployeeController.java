package com.example.mysqldockerboot.controller;

import com.example.mysqldockerboot.dao.EmployeeDao;
import com.example.mysqldockerboot.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/creation")
    public String init() {
        List<Employee> list =
                List.of(
                        new Employee("John", "Doe", "john@gmail.com"),
                        new Employee("John", "William", "william@gmial.com"),
                        new Employee("Thomas", "Hardy", "hardy@gmail.com"),
                        new Employee("Charles", "Dicken", "charles@gmail.com")
                );
        list.forEach(employeeDao::save);
        return "success";
    }

    @GetMapping("/employees")
    public Iterable<Employee> listEmployees() {
        return employeeDao.findAll();
    }

}
