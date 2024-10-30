package com.cruddemo.service;

import com.cruddemo.Mapper.EmployeeMapper;
import com.cruddemo.customException.BusinessException;
import com.cruddemo.customException.EmptyInputException;
import com.cruddemo.dto.EmployeeDto;
import com.cruddemo.entity.Employee;
import com.cruddemo.repository.EmployeeJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {
    @Autowired
    EmployeeJPARepo employeeJPARepo; //repository instance

    @Override
    public Employee AddEmployee(Employee employee) {
        try {
            if (employee.getName().isEmpty() || employee.getName().length() == 0) {
                throw new BusinessException("601", "Name is Empty, Please Enter Name.");
            }
            Employee savedEmployee = employeeJPARepo.save(employee);
            return savedEmployee;
        } catch (IllegalArgumentException e) {
            throw new BusinessException("602", "Given Name is null " + e.getMessage());
        } catch (Exception e) {
            throw new BusinessException("603", "Something went wrong Try later " + e.getMessage());
        }

    }

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        //mapping of DTO
        Employee employee2 = EmployeeMapper.INSTANCE.populateEmployee(employeeDto);
        Employee employee = employeeJPARepo.save(employee2);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        try {
            List<Employee> employeeList = employeeJPARepo.findAll();
            if (employeeList.isEmpty()) {
                throw new BusinessException("601", "No Employees in Present");
            }
            return employeeList;
        } catch (Exception e) {
            throw new BusinessException("601", "Employee list is empty" + e.getMessage());
        }
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee savedEmployee = employeeJPARepo.save(employee);
        return savedEmployee;
    }

    @Override
    public void removeEmployee(Long id) {
        try {
            if (id == null) {
                employeeJPARepo.deleteById(id);
            } else {
                throw new EmptyInputException();
            }
        } catch (EmptyInputException e) {

        } catch (Exception e) {
            throw new BusinessException("602", "Id is empty");
        }
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeJPARepo.findById(id).get();
    }
}
