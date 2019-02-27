package Extra_Opdrachten.grote_array;

import Opdrachten.opdracht_01.gemiddelde.Rekenmachine;

public class GroteArrayApplicatie {

    public static void main(String[] args) {

        Rekenmachine rekenmachine = new Rekenmachine();


        double[] eersteArray = GetallenGenerator.maakDoubleArray(25);
        double resultaat = rekenmachine.berekenGemiddelde(eersteArray);
        System.out.println(resultaat);


        double[] tweedeArray = GetallenGenerator.maakDoubleArray(25, 100);
        resultaat = rekenmachine.berekenGemiddelde(tweedeArray);
        System.out.println(resultaat);

        double[] derdeArray = GetallenGenerator.maakDoubleArray(25, -100, 100);
        resultaat = rekenmachine.berekenGemiddelde(derdeArray);
        System.out.println(resultaat);
    }
}
