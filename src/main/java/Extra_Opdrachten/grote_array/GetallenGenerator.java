package Extra_Opdrachten.grote_array;

import java.util.Random;

public class GetallenGenerator {

	/**
	 * Genereert een array met willekeurige getallen tussen de 0.0 (inclusief) en de 1.0 (exclusief)
	 * 
	 * @param lengte lengte van de te genereren array
	 * @return array met de opgegeven lengte
	 */
	public static double[] maakDoubleArray(int lengte) {
		Random rnd = new Random();
		double[] result = new double[lengte];
		for (int i = 0; i < result.length; i++) {
			result[i] = rnd.nextDouble();
		}
		return result;
	}

	/**
	 * Genereert een array met willekeurige getallen tussen de 0.0 (inclusief) en de max (exclusief)
	 * 
	 * @param max maximale waarde van de te genereren getallen
	 * @param lengte lengte van de te genereren array
	 * @return array met de opgegeven lengte
	 */
	public static double[] maakDoubleArray(int lengte, double max) {
		Random rnd = new Random();
		double[] result = new double[lengte];
		for (int i = 0; i < result.length; i++) {
			result[i] = rnd.nextDouble()*max;
		}
		return result;
	}

	/**
	 * Genereert een array met willekeurige getallen tussen de min (inclusief) en de max (exclusief)
	 * 
	 * @param min minimale waarde van de te genereren getallen
	 * @param max maximale waarde van de te genereren getallen
	 * @param lengte lengte van de te genereren array
	 * @return array met de opgegeven lengte
	 */
	public static double[] maakDoubleArray(int lengte, double min, double max) {
		Random rnd = new Random();
		double[] result = new double[lengte];
		for (int i = 0; i < result.length; i++) {
			result[i] = rnd.nextDouble()*max+min;
		}
		return result;
	}

}
