package com.example.hrmspayrollbackend.repository;

import com.example.hrmspayrollbackend.entity.SalaryStructure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryStructureRepository extends JpaRepository<SalaryStructure, Long> {
    SalaryStructure findByEmployeeId(Long employeeId);
}
