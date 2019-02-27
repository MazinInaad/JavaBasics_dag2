package Opdrachten.opdracht_06.stringarray;

public class StringArrayApplicatie {

	public static void main(String[] args) {
		String[] mijnStringArray = new String[3];
		mijnStringArray[0] = "Dit";
		mijnStringArray[1] = "is";
		mijnStringArray[2] = "sloom";

		System.out.println("Mijn String array heeft lengte " + mijnStringArray.length);
		System.out.println("Het tweede element is: " + mijnStringArray[1]);

		String[] mijnAndereArray = {"Dit", "is", "een", "array", "met", "Strings"};

		System.out.println("Mijn tweede array heeft lengte " + mijnAndereArray.length);
		System.out.println("Het vierde element is: " + mijnAndereArray[3]);
	}

	
}
