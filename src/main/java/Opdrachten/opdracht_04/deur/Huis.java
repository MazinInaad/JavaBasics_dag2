package Opdrachten.opdracht_04.deur;

public class Huis {

	private static void toonDeurStatus(Deur deur) {
		String resultaat = "De " + deur.getType() + " is nu ";
		if (deur.isOpen()) {
			resultaat = resultaat + "open";
		} else {
			resultaat = resultaat + "gesloten";
		}
		resultaat = resultaat + " onder een hoek van " + deur.getOpeningshoek();
		System.out.println(resultaat);
	}

	public static void main(String[] args) {
		Deur voordeur = new Deur("Voordeur", 200, 85);
		System.out.println("De voordeur is nu " + voordeur.isOpen());
//		voordeur.openMetHoek(45);
		toonDeurStatus(voordeur);
//		voordeur.openMetHoek(125);
		toonDeurStatus(voordeur);

		Deur garagedeur = new Deur("Garagedeur", 250, 350);
//		garagedeur.openMetHoek(89);
		toonDeurStatus(garagedeur);
//		garagedeur.openMetHoek(0);
		toonDeurStatus(garagedeur);

		Deur achterdeur = new Deur("Achterdeur", 200, 85);
//		achterdeur.openMetHoek(-10);
		toonDeurStatus(achterdeur);
//		achterdeur.openMetHoek(1);
		toonDeurStatus(achterdeur);

		Deur dakraam = new Deur("Dakraam", 40, 60);
		dakraam.open();
		toonDeurStatus(dakraam);
		dakraam.sluit();
		toonDeurStatus(dakraam);

	}

}
