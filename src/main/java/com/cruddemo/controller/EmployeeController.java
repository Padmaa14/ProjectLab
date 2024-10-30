package com.cruddemo.controller;

import com.cruddemo.customException.BusinessException;
import com.cruddemo.customException.ControllerException;
import com.cruddemo.dto.EmployeeDto;
import com.cruddemo.entity.Employee;
import com.cruddemo.service.EmployeeServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceInterface employeeInterface;

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getALLEmployees() {
        List<Employee> employeeList = employeeInterface.getAllEmployee();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        //try {
        Employee employee = employeeInterface.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
        /*} catch (BusinessException e) {
            ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
            return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            ControllerException ce = new ControllerException("604", "Something went wrong" + e.getMessage());
            return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
        }*/
    }

    @PostMapping("/add")
    public ResponseEntity<?> AddEmployee(@Valid @RequestBody Employee employee) {
        try {
            Employee savedEmployee = employeeInterface.AddEmployee(employee);
            return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
        } catch (BusinessException e) {
            ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
            return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            ControllerException ce = new ControllerException("604", "Something went wrong" + e.getMessage());
            return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
        }
    }

    /***
     * using DTO Mapstruct
     */

    @PostMapping("/addDto")
    public ResponseEntity<?> addEmployeeNew(@Valid @RequestBody EmployeeDto employee) {

        Employee employees = employeeInterface.saveEmployee(employee);
        return new ResponseEntity<>(employees, HttpStatus.CREATED);

    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> removeEmployee(@PathVariable Long id) {
        employeeInterface.removeEmployee(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeInterface.updateEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}

