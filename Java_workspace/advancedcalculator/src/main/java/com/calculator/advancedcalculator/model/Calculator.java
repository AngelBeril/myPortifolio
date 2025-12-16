package com.calculator.advancedcalculator.model;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calculator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer input1;
	private Integer input2;
	private Integer output;
	
	public Integer getInput1() {
		return input1;
	}
	public void setInput1(Integer input1) {
		this.input1 = input1;
	}
	public Integer getInput2() {
		return input2;
	}
	public void setInput2(Integer input2) {
		this.input2 = input2;
	}
	public Integer getOutput() {
		return output;
	}
	public void setOutput(Integer output) {
		this.output = output;
	}
	
	

}
