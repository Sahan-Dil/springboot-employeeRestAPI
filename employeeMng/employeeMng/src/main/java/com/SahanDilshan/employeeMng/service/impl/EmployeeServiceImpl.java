package com.SahanDilshan.employeeMng.service.impl;

import com.SahanDilshan.employeeMng.entity.employeeEntity;
import com.SahanDilshan.employeeMng.repository.EmployeeRepository;
import com.SahanDilshan.employeeMng.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<employeeEntity> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<employeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public employeeEntity saveEmployee(employeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public employeeEntity updateEmployee(employeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
