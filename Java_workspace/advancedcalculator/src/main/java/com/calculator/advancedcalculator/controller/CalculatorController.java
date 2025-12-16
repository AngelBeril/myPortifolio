package com.calculator.advancedcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.advancedcalculator.model.Calculator;
import com.calculator.advancedcalculator.service.CalculatorServices;

@RestController
@RequestMapping("/cal")
public class CalculatorController {

	@Autowired
	CalculatorServices calculatorServices;
	
	@PostMapping("/sav")
	public Calculator saveData(@RequestBody Calculator calculatorDto) {
		calculatorServices.sum(calculatorDto);
		return calculatorDto;
	}
}

// CRUD -> @GetMapping, @Post, @Put, @Patch, @Delete
