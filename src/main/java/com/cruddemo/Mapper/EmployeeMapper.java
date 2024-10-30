package com.cruddemo.Mapper;


import com.cruddemo.dto.EmployeeDto;
import com.cruddemo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE= Mappers.getMapper(EmployeeMapper.class);
    //@Mapping(target = "creationDate", ignore = true)
    //@Mapping(target = "id", ignore = true)
    Employee populateEmployee(EmployeeDto employeeDto);
}
