package com.example.hrmspayrollbackend.controller;

import com.example.hrmspayrollbackend.entity.SalaryStructure;
import com.example.hrmspayrollbackend.model.SalaryStructureRequest;
import com.example.hrmspayrollbackend.service.SalaryStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salary-structure")
public class SalaryStructureController {

    @Autowired
    private SalaryStructureService salaryStructureService;

    @PostMapping
    public SalaryStructure createSalaryStructure(@RequestBody SalaryStructureRequest request){
        return salaryStructureService.createSalaryStructure(request);
    }
}
