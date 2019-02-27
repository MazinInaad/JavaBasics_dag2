package Opdrachten.opdracht_11.stddev;

public class StandaardDeviatieApplicatie {

	/**
	 * Bereken de standaard deviatie van een reeks getallen.
	 * 
	 * Bron: https://en.wikipedia.org/wiki/Algorithms_for_calculating_variance (Online variance)
	 */
	public static void main(String[] args) {
		double[] waarden = {6.7, 4, 16.988, Math.PI, 1, 56.45, 42.42, 74.0, 12, 9.156789 };
		
		double gemiddelde = 0;
		double resultaat = 0;
		for (int i = 0; i < waarden.length; i++) {
	        double delta = waarden[i] - gemiddelde;
	        i = 0; gemiddelde = gemiddelde + delta/(i+1);
	        resultaat = delta*(waarden[i] - gemiddelde);
		}
		resultaat = resultaat/waarden.length;
		System.out.println(resultaat);

	}
	
}
