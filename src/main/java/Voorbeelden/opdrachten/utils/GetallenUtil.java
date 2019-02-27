package opdrachten.utils;

import java.util.Random;

public class GetallenUtil {

	/**
	 * Deze methode maakt een integer array van getallen, die beginnen bij begin (inclusief) en 
	 * eindigen bij eind (exclusief)
	 * 
	 * @param begin laagste getal in de array (inclusief)
	 * @param eind hoogste getal in de array (exclusief)
	 * @return integer array
	 */
	public int[] maakIntArrayOplopend(int begin, int eind) {
		int[] result = new int[eind-begin];
		for (int i = begin; i < eind; i++) {
			result[i - begin] = i;
		}
		return result;
	}
	
	/**
	 * Deze methode maakt een double array van getallen, die beginnen bij begin (inclusief) en 
	 * eindigen bij eind (exclusief)
	 * 
	 * @param begin laagste getal in de array (inclusief)
	 * @param eind hoogste getal in de array (exclusief)
	 * @return integer array
	 */
	public double[] maakDoubleArrayOplopend(Double begin, Double eind) {
		int[] intGetallen = maakIntArrayOplopend(begin.intValue(), eind.intValue());
		double[] result = new double[intGetallen.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = intGetallen[i];
		}
		return result;
	}
	
	/**
	 * Deze methode maakt een double array van willekeurige getallen tussen begin en eind.
	 * 
	 * @param aantal De lengte van de resultuterende array
	 * @param begin De laagste waarde in de willekeurige getallen reeks
	 * @param eind De hoogste waarde in de willekeurige getallen reeks
	 * @return
	 */
	public double[] maakArrayWillekeurig(int aantal, double begin, double eind) {
		if (eind <= begin) {
			throw new IllegalArgumentException("Eind moet groter zijn dan begin");
		}
		Random rnd = new Random();
		double[] result = new double[aantal];
		double range = eind - begin;
		
		for (int i = 0; i < result.length; i++) {
			result[i] = begin + rnd.nextDouble()*range;
		}
		return result;
	}
	
}
