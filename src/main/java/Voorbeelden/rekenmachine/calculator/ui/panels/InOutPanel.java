package Voorbeelden.rekenmachine.calculator.ui.panels;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class InOutPanel extends JPanel implements FocusListener {

    private static final long serialVersionUID = 7857305242072212019L;
    private JTextField number1Field = new JTextField();
    private JTextField number2Field = new JTextField();
    private JTextField resultField = new JTextField();
    private JTextField selectedField;

    public InOutPanel() {
        super(new GridLayout(3, 2, 4, 4));
        setBorder(new EmptyBorder(4, 4, 2, 4));
        add(new JLabel("Getal 1:"));
        number1Field.addFocusListener(this);
        add(number1Field);
        add(new JLabel("Getal 2:"));
        number2Field.addFocusListener(this);
        add(number2Field);
        add(new JLabel("Resultaat:"));
        resultField.setEditable(false);
        add(resultField);
    }

    public JTextField getGetal1Field() {
        return number1Field;
    }

    public JTextField getGetal2Field() {
        return number2Field;
    }

    public JTextField getResultaatField() {
        return resultField;
    }

    public JTextField getSelectedField() {
        return selectedField;
    }

    @Override
    public void focusGained(FocusEvent e) {
        selectedField = (JTextField) e.getComponent();
    }

    @Override
    public void focusLost(FocusEvent e) {
    }

}
