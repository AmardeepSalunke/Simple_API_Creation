package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entities.Employee;
import com.practice.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("Test_api")
	public String test() {
		return " Test Completed";
	}
	
	
	@PostMapping("singUp")
	public String createEmployee(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		return "Employee Created ..";
	}

}
