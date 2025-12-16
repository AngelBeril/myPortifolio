package com.employee.college.controller;

import java.net.Inet4Address;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.college.dto.Employee;
import com.employee.college.services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployeeDetails(@RequestBody Employee employeeDto) {
		employeeService.saveEmployeeDetails(employeeDto);
		return employeeDto;
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getEmployeeDetails(){
		List<Employee> employees = employeeService.getEmployeeDetails();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeDetailsByID(@PathVariable Integer id){
		Employee employee = employeeService.getEmployeeDetailsByID(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployeeDetails(@PathVariable Integer id, @RequestBody Employee employeeDto) {
		return employeeService.updateEmployeeDetails(id, employeeDto);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteRecord(@PathVariable Integer id){
		employeeService.deleteRecord(id);
		return new ResponseEntity<String>("Record Deleted Successfully", HttpStatus.ACCEPTED);
	}
}
