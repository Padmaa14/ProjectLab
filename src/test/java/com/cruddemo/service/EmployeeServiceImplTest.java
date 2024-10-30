package com.cruddemo.service;

import com.cruddemo.entity.Employee;
import com.cruddemo.repository.EmployeeJPARepo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.bson.assertions.Assertions.assertNotNull;
import static org.mockito.Mockito.when;


@SpringBootTest
public class EmployeeServiceImplTest {
    @InjectMocks
    EmployeeServiceImpl employeeServiceimpl;
    @Mock
    EmployeeJPARepo employeeJPARepoMock;


    @Test
    public void getEmployeeIdTest() {
        when(employeeJPARepoMock.findById(1L)).thenReturn(testDbStub());
        Employee empstub = employeeServiceimpl.findEmployeeById(1L);

        assertNotNull(empstub);
        Assert.assertEquals(empstub.getName(), "Padma");

    }

    @Test
    public void addEmployeeTest() {

    }

    @Test
    public void invalidParamsInAddEmployeeTest() {

    }

    @Test
    public void removeEmployeeTest() {

    }

    @Test
    public void getAllEmloyeeTest() {

    }

    @Test
    public void updateEmployeeTest() {

    }

    private Optional<Employee> testDbStub() {
        Employee employeeStub = Employee.builder().id(1L).designation("HR").name("Padma").salary(22550.00).build();

        return Optional.ofNullable(employeeStub);
    }

}
