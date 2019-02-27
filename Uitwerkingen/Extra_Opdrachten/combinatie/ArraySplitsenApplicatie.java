package Extra_Opdrachten.combinatie;

import org.apache.commons.lang3.ArrayUtils;

public class ArraySplitsenApplicatie {

    public static void main(String[] args) {

        //Eerste de array van getallen 0 tm 100 maken
        int[] alleGetallen = new int[101];
        for (int i = 0; i < alleGetallen.length; i++) {
            alleGetallen[i] = i;
        }

        //even en oneven array maken
        int[] evenGetallen = {}; //lege array
        int[] onevenGetallen = {}; //lege array

        for (int getal : alleGetallen) {
            if (getal % 2 > 0) { //% staat voor modulo. Je kijkt of als je het getal door 2 deelt of je een restje overhoudt of niet
                //oneven
                onevenGetallen = ArrayUtils.add(onevenGetallen, getal);
            }
            else {
                evenGetallen = ArrayUtils.add(evenGetallen, getal);
            }
        }
    }

}
