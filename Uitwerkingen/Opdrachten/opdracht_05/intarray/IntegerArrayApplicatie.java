package Opdrachten.opdracht_05.intarray;

import org.apache.commons.lang3.ArrayUtils;

public class IntegerArrayApplicatie {

	public static void main(String[] args) {
		int[] naamGeven = new int[5];

		naamGeven[0] = 1;
		naamGeven[1] = 14;
		naamGeven[2] = 16;
		naamGeven[3] = 31;
		naamGeven[4] = 61;

		System.out.println("Lengte van array is "+naamGeven.length);
		System.out.println("Het 2e element is: " + naamGeven[1]);

		//Onderstaande regel geeft foutmelding
//		System.out.println("Het 100e element is: "+ naamGeven[99]);

		System.out.println("Lengte van array is "+naamGeven.length);
		naamGeven = ArrayUtils.remove(naamGeven, 2);
		System.out.println("Lengte van array is "+naamGeven.length);

		//Dit kan ook niet
//		naamGeven[0] = "Hoi";
	}
	
}
