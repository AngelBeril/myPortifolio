package com.calculator.advancedcalculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.calculator.advancedcalculator.model.Calculator;
import com.calculator.advancedcalculator.repository.CalculatorRepository;

@ExtendWith(MockitoExtension.class)
public class CalculatorServicesTest {
	
	@InjectMocks
	CalculatorServices calculatorServices;
	
	@Mock
	CalculatorRepository calculatorRepository;
	
	@Test
	public void sumTest() {
		Calculator calculator = new Calculator();
		calculator.setInput1(10);
		calculator.setInput2(20);
		
		System.out.println("I am sumTest method");
		when(calculatorRepository.save(calculator)).thenReturn(calculator);
		calculatorServices.sum(calculator);
		System.out.println(calculator.getOutput());
		assertNotNull(calculator.getOutput());
		assertEquals(30, calculator.getOutput());
		assertNotEquals(10, calculator.getOutput());
		assertTrue(calculator.getOutput() == 30);
		assertFalse(calculator.getOutput() == 40);
	}

}

//@Before -> init(), @BeforeAll, @BeforeEach
//@After -> destroy(), etc, @AfterAll, @AfterEach
