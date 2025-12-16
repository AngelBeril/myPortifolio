package com.calculator.advancedcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calculator.advancedcalculator.model.Calculator;

@Repository
public interface CalculatorRepository extends JpaRepository<Calculator, Integer> {

}
