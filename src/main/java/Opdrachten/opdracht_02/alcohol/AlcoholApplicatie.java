package opdracht_02.alcohol;

public class AlcoholApplicatie {

	public static void main(String[] args) {
		AlcoholCheck check = new AlcoholCheck();
		
		System.out.print("Iemand die 15 is, ");
		check.checkLeeftijd(15);
		System.out.print("Iemand die 21 is, ");
		check.checkLeeftijd(21);
		System.out.print("Iemand die 30 is, ");
		check.checkLeeftijd(30);
		System.out.print("Iemand die -10 is, ");
		check.checkLeeftijd(-10);
		System.out.print("Iemand die 2000 is, ");
		check.checkLeeftijd(2000);
		
	}
	
}
