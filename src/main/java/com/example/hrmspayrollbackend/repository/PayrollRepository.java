package com.example.hrmspayrollbackend.repository;

import com.example.hrmspayrollbackend.entity.Payroll;
import com.example.hrmspayrollbackend.entity.SalaryStructure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {
    SalaryStructure findEmployeeById(Long employeeId);
}
