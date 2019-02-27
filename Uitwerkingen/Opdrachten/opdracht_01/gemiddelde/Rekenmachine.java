package Opdrachten.opdracht_01.gemiddelde;

public class Rekenmachine {

    public double berekenGemiddelde(double getal1, double getal2, double getal3) {
        double som = getal1 + getal2 + getal3;
        return (som/3);
    }

    //Dit is opdracht 7
//    public double berekenGemiddelde(int[] getallen) {
//        double som = getallen[0] + getallen[1] + getallen[2];
//        return som/3;
//    }

    //Dit is opdracht 9
    public double berekenGemiddelde(int[] getallen) {

        //for-each
        double som = 0;
        for (int getal : getallen){
            som = som + getal;
        }

        //for teller loop
        som = 0;
        for (int i = 0; i < getallen.length ; i++){
            som = som + getallen[i];
        }

        //while loop
        int i = 0;
        som = 0;
        while (i < getallen.length){
            som = som + getallen[i];
            i++;
        }

        return som/getallen.length;
    }

    //extra opdrachten - Grote arrays
    public double berekenGemiddelde(double[] getallen) {
        double som = 0;
        for (double getal : getallen){
            som = som + getal;
        }
        return som/getallen.length;
    }
}
