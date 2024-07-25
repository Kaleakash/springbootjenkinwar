package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	
	@GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployees() {
		List<Employee> listOfEmp = Arrays.asList(
				new Employee(101, "Ravi", 12000),
				new Employee(102, "Raj", 16000),
				new Employee(103, "Raju", 18000));
		return listOfEmp;
	}
}
