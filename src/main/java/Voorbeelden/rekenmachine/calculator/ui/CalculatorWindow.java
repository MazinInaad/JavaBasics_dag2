package rekenmachine.calculator.ui;


import java.awt.BorderLayout;
import javax.swing.JFrame;

import rekenmachine.Calculator;
import rekenmachine.calculator.ui.panels.ButtonPanel;
import rekenmachine.calculator.ui.panels.InOutPanel;
import rekenmachine.calculator.ui.panels.OperationsPanel;

/**
 * This class shows a simple calculator window with the following features:
 * - 2 input fields
 * - 1 output field
 * - panel with digits and a dot
 * - panel with operations
 * 
 * The actual calculation is delegated to a calculator object, which must be provided in the constructor.
 * 
 * @author BABEEK
 *
 */
public class CalculatorWindow {

	private JFrame frame;
	private ButtonPanel buttons;
	private InOutPanel inputOutputs;
	private OperationsPanel operations;

	/**
	 * Construct a new graphical window with the given calculator.
	 * 
	 * @param calculator, which performs the actual calculations
	 */
	public CalculatorWindow(Calculator calculator) {
		frame = new JFrame();
		inputOutputs = new InOutPanel();
		buttons = new ButtonPanel(inputOutputs);
		operations = new OperationsPanel(inputOutputs, calculator);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(inputOutputs, BorderLayout.NORTH);
		frame.add(buttons, BorderLayout.CENTER);
		frame.add(operations, BorderLayout.EAST);
	}

	/**
	 * Show the window and start the calculator user interface
	 */
	public void start() {
		frame.setVisible(true);
		frame.pack();
	}

}
