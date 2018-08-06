package com.yogesh.client;

import com.yogesh.Calculator;
import com.yogesh.CalculatorService;

public class ClientMain {

	public static void main(String[] args) {
		
		CalculatorService calculatorService = new CalculatorService();
		Calculator calculator = calculatorService.getCalculatorPort();
		System.out.println("Add of 2 & 3= " + calculator.add(2, 3)+
				"\n Sub of 2 & 3= "+ calculator.sub(2, 3));

	}

}
