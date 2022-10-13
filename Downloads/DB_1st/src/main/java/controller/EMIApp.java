package controller;

import model.EMICalculator;

public class EMIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		EMICalculator emiCalculator = new EMICalculator();
		double d = emiCalculator.calculateEMI(5000, "Personal Loan", 5);
		System.out.println(d);
	}

}
