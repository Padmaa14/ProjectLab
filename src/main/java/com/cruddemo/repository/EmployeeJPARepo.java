package com.cruddemo.repository;

import com.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJPARepo extends JpaRepository<Employee, Long> {
}
