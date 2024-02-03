package com.webgenerals.sm04.springboot8.jpatest.dao;

import com.webgenerals.sm04.springboot8.jpatest.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findByEmail(String email);
}
