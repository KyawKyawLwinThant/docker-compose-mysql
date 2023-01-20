package com.example.mysqldockerboot.dao;

import com.example.mysqldockerboot.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
