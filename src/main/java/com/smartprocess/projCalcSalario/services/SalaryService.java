package com.smartprocess.projCalcSalario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartprocess.projCalcSalario.entities.Employee;

@Service
public class SalaryService {

	@Autowired
	private TaxService taxService;
	
	@Autowired
	private PensionService pensionService;
	
	
	public double netSalary(Employee employee) {
		
		return employee.getGlossSalary() - (pensionService.discount(employee.getGlossSalary()) + taxService.tax(employee.getGlossSalary()));
				
	}
	
}
