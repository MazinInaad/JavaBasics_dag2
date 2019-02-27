package Opdrachten.opdracht_02.alcohol;

public class AlcoholCheck {

	public void checkLeeftijd(int leeftijd) {
		if (leeftijd < 0 || leeftijd > 130) {
			System.out.println("Ongeldige leeftijd");
		}
		else if (leeftijd >= 18) {
			System.out.println("mag drinken");
		}
		else {
			System.out.println("mag niet drinken");
		}
	}
}
