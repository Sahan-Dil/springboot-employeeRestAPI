package com.SahanDilshan.employeeMng.service;

import com.SahanDilshan.employeeMng.entity.employeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<employeeEntity> findAllEmployees();
    Optional<employeeEntity> findById(Long id);
    employeeEntity saveEmployee(employeeEntity employeeEntity);
    employeeEntity updateEmployee(employeeEntity employeeEntity);
    void deleteEmployee(Long id);
}
