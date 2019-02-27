package Voorbeelden.array_met_2_dimensies.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TabelVenser {

	private JFrame frame;
	private JLabel label;
	
	public TabelVenser() {
		label = new JLabel();
		frame = new JFrame("Tabel voorbeeld");
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setBorder(new EmptyBorder(10, 10, 10, 10));
		frame.add(label, BorderLayout.CENTER);
	}
	
	public void setTable(String[][] tabel) {
		String text = "<html><body><table border=\"1\">";
		for (int row = 0; row < tabel.length; row++) {
			text = text + "<tr>";
			for (int col = 0; col < tabel[row].length; col++) {
				text = text + "<td>"+tabel[row][col]+"</td>";
			}
			text = text + "</tr>";
		}
		text = text + "</table></body></html>";
		label.setText(text);
	}

	public void show(String[][] tabel) {
		setTable(tabel);
		show();
	}

	public void show() {
		frame.pack();
		frame.setVisible(true);
	}
}
