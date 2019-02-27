package rekenmachine.calculator.ui.panels;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import rekenmachine.Calculator;

public class OperationsPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = -7327723367116566974L;

	private InOutPanel inputOutputPanel;
	private Calculator calculator;

	public OperationsPanel(InOutPanel inputOutputs, Calculator calculator) {
		super(new GridLayout(5, 1, 4, 4));
		setBorder(new EmptyBorder(2, 8, 4, 4));
		inputOutputPanel = inputOutputs;
		this.calculator = calculator;
		addButton("+");
		addButton("-");
		addButton("*");
		addButton("/");
		addButton("Rest");
	}

	private void addButton(String label) {
		JButton button = new JButton(label);
		button.addActionListener(this);
		add(button);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		double leftNumber = convertToDouble(inputOutputPanel.getGetal1Field());
		double rightNumber = convertToDouble(inputOutputPanel.getGetal2Field());
		String operation = event.getActionCommand();
		try {
			double result = calculator.performCalculation(leftNumber, operation, rightNumber);
			inputOutputPanel.getResultaatField().setText(String.format("%.8f", result));
		} catch (Exception exception) {
			inputOutputPanel.getResultaatField().setText("Error");
		}
	}

	private double convertToDouble(JTextField source) {
		try {
			if (source.getText().isEmpty()) {
				source.setText("0");
			}
			return Double.parseDouble(source.getText());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Kan " + source.getText() + " niet veranderen naar getal",
					"Conversiefout", JOptionPane.ERROR_MESSAGE);
		}
		return 0;
	}

}
