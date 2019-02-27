package rekenmachine.calculator.ui.panels;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ButtonPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 8161528001427036782L;
	private InOutPanel inputOutputPanel;
	
	public ButtonPanel(InOutPanel inputOutputs) {
		super(new GridLayout(4, 3, 4, 4));
		setBorder(new EmptyBorder(2, 4, 4, 8));
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		for (int i = 9; i > 0 ; i--) {
			addButton(""+i);
		}
		addButton(".");
		addButton("0");
		inputOutputPanel = inputOutputs;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String currentText = inputOutputPanel.getSelectedField().getText();
		inputOutputPanel.getSelectedField().setText(currentText + event.getActionCommand());
	}

	private void addButton(String label) {
		JButton button = new JButton(label);
		button.addActionListener(this);
		add(button);
	}
	
}
