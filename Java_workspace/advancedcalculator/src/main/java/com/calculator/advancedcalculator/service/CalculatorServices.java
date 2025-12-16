package com.calculator.advancedcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.advancedcalculator.model.Calculator;
import com.calculator.advancedcalculator.repository.CalculatorRepository;

@Service
public class CalculatorServices {
	
	@Autowired
	CalculatorRepository calculatorRepository;

	public void sum(Calculator calculatorDto) {
		Integer temp = calculatorDto.getInput1() + calculatorDto.getInput2();
		calculatorDto.setOutput(temp);
		calculatorRepository.save(calculatorDto);
	}

}
