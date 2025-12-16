package com.employee.college.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.college.dto.Employee;
import com.employee.college.repositoryDAO.EmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;

	public void saveEmployeeDetails(Employee employeeDto) {
		BigDecimal incrSalary = BigDecimal.valueOf(25000);
		BigDecimal tempSalary = employeeDto.getSalary().add(incrSalary);
		employeeDto.setSalary(tempSalary);
		employeeDAO.save(employeeDto);
		
	}

	public List<Employee> getEmployeeDetails() {
		return employeeDAO.findAll();
	}

	public Employee getEmployeeDetailsByID(Integer id) {
		Optional<Employee> empOptional = employeeDAO.findById(id);
		return empOptional.get();
	}

	public Employee updateEmployeeDetails(Integer id, Employee employeeDto) {
		Employee existEmployee = employeeDAO.findById(id).orElse(null);
		if(existEmployee != null) {
			existEmployee.setEmployeeID(employeeDto.getEmployeeID());
			existEmployee.setEmployeeName(employeeDto.getEmployeeName());
			existEmployee.setSalary(employeeDto.getSalary());
			return employeeDAO.save(existEmployee);
		}
		
		return null;
		
	}

	public void deleteRecord(Integer id) {
		employeeDAO.deleteById(id);
		
	}

	

}
