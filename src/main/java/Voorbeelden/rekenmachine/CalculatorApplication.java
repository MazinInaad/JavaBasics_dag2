package rekenmachine;

import rekenmachine.calculator.ui.CalculatorWindow;

public class CalculatorApplication {

	public static void main(String[] args) {
		System.out.println(new Calculator().performCalculation(5, "-", 6));
		new CalculatorWindow(new Calculator()).start();
	}
	
}
