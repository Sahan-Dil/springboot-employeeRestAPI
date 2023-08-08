package com.SahanDilshan.employeeMng.controller;

import com.SahanDilshan.employeeMng.entity.employeeEntity;
import com.SahanDilshan.employeeMng.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeController {
    private final EmployeeService employeeService;

    public EmployeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<employeeEntity> findAllEmployees(){
        return employeeService.findAllEmployees();
    }
    @GetMapping("/{id}")
    public Optional<employeeEntity> findEmployeeById(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }
    @PostMapping
    public employeeEntity saveEmployee(@RequestBody employeeEntity employeeEntity){
        return employeeService.saveEmployee(employeeEntity);
    }
    @PutMapping
    public employeeEntity updateEmployee(@RequestBody employeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
}
