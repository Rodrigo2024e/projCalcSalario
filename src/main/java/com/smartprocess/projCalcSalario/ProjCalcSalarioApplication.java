package com.smartprocess.projCalcSalario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartprocess.projCalcSalario.entities.Employee;
import com.smartprocess.projCalcSalario.services.SalaryService;

@SpringBootApplication
public class ProjCalcSalarioApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjCalcSalarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("\n----------------------------------------------------");
		Employee employee = new Employee("Maria", 4000);
		System.out.println("Nome: " + employee.getName());
		System.out.println("Salário bruto: " + employee.getGlossSalary());
		System.out.println("Salário líquido: " + salaryService.netSalary(employee));
		System.out.println("------------------------------------------------------");
	}

}
