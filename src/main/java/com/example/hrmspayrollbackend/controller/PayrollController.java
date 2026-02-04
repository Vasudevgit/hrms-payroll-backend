package com.example.hrmspayrollbackend.controller;
import com.example.hrmspayrollbackend.entity.Payroll;
import com.example.hrmspayrollbackend.model.PayrollRequest;
import com.example.hrmspayrollbackend.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {
    @Autowired
    private PayrollService payrollService;

    @PostMapping
    public Payroll generatePayroll(@RequestBody PayrollRequest request){
        return payrollService.generatePayroll(request);
    }
}
