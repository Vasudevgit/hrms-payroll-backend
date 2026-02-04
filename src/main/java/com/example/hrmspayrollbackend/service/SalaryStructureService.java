package com.example.hrmspayrollbackend.service;

import com.example.hrmspayrollbackend.entity.SalaryStructure;
import com.example.hrmspayrollbackend.model.SalaryStructureRequest;
import com.example.hrmspayrollbackend.repository.SalaryStructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryStructureService {
    @Autowired
    private SalaryStructureRepository salaryStructureRepository;

    public SalaryStructure createSalaryStructure(SalaryStructureRequest request){
        SalaryStructure salary = new SalaryStructure();

        salary.setEmployeeId(request.getEmployeeId());
        salary.setBasicsalary(request.getBasicsalary());
        salary.setHra(request.getHra());
        salary.setPf(request.getPf());
        salary.setTax(request.getTax());

        return salaryStructureRepository.save(salary);
    }
}
