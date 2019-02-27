package Opdrachten.opdracht_08.strings;

public class StringMethodsApplicatie {

    public static void main(String[] args) {
        String mijnString = "HierZitDeletteraIn";

        System.out.println("Het 6e element van de String is " + mijnString.charAt(5));
        System.out.println("Lengte van mijn string is " + mijnString.length());

        mijnString.replace("a", "x");
        System.out.println("Mijn string is nu aangepast naar: " + mijnString);

        System.out.println(mijnString.toUpperCase());
    }

}
