package Opdrachten.opdracht_01.gemiddelde;

public class GemiddeldeApplicatie {

	public static void main(String[] args) {
		Rekenmachine rekenmachine = new Rekenmachine();
		double resultaat = rekenmachine.berekenGemiddelde(1.0, 4.5, 6.5);
		System.out.println(resultaat);

		//Hieronder opdracht 7
		int[] getallen = {1, 4, 7, 10, 12, 20};
		resultaat = rekenmachine.berekenGemiddelde(getallen);
		System.out.println(resultaat);
	}

}
