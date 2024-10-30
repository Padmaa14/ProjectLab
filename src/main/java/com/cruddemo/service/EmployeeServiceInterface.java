package com.cruddemo.service;

import com.cruddemo.dto.EmployeeDto;
import com.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    public Employee AddEmployee(Employee employee);
    public Employee saveEmployee(EmployeeDto employee);

    public List<Employee> getAllEmployee();

    public Employee updateEmployee(Employee employee);

    public void removeEmployee(Long id);

    public Employee findEmployeeById(Long id);
}
