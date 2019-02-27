package Voorbeelden.array_met_2_dimensies;

import Voorbeelden.array_met_2_dimensies.ui.TabelVenser;

public class ProductApplicatie {

	public static void main(String[] args) {
		String[][] tabel = new String[10][3];
		tabel[0][0] = "Getal 1";
		tabel[0][1] = "Getal 2";
		tabel[0][2] = "Product";
		for (int i = 1; i < tabel.length; i++) {
			tabel[i][0] = ""+i;
			tabel[i][1] = ""+i;
			tabel[i][2] = ""+(i*i);			
		}
		new TabelVenser().show(tabel);
	}
}
