package Voorbeelden.rekenmachine;

public class Calculator {

	private double sum(double number1, double number2) {
		return number1 + number2;
	}
	
	private double remainder(double number1, double number2) {
		return number1 % number2; // % is Java's symbool om de rest-waarde te berekenen
	}
	
	public double performCalculation(double number1, String operation, double number2) {
		if ("+".equals(operation)) {
			return sum(number1, number2);
		} else if ("Rest".equals(operation)){
			return remainder(number1, number2);
		} else {
			return 0;
		}
	}
}
