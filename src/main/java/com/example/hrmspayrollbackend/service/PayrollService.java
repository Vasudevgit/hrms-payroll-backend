package com.example.hrmspayrollbackend.service;

import com.example.hrmspayrollbackend.entity.Payroll;
import com.example.hrmspayrollbackend.entity.SalaryStructure;
import com.example.hrmspayrollbackend.model.PayrollRequest;
import com.example.hrmspayrollbackend.repository.PayrollRepository;
import com.example.hrmspayrollbackend.repository.SalaryStructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayrollService {
    @Autowired
    private PayrollRepository payrollRepository;

    @Autowired
    private SalaryStructureRepository salaryStructureRepository;

    public Payroll generatePayroll(PayrollRequest request){
        SalaryStructure structure = salaryStructureRepository.findByEmployeeId(request.getEmployeeId());

        if(structure == null){
            return null;
        }

        double grossSalary = structure.getBasicsalary()+structure.getHra()+structure.getAllowance();

        double netSalary = grossSalary - structure.getPf() - structure.getTax();

        Payroll payroll = new Payroll();
        payroll.setEmployeeId(request.getEmployeeId());
        payroll.setMonth(request.getMonth());
        payroll.setYear(request.getYear());
        payroll.setGrossSalary(grossSalary);
        payroll.setNetSalary(netSalary);

        return payrollRepository.save(payroll);
    }

}
