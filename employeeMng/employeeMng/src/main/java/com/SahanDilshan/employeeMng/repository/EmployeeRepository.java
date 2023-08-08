package com.SahanDilshan.employeeMng.repository;

import com.SahanDilshan.employeeMng.entity.employeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employeeEntity,Long> {
}
