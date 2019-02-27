package Opdrachten.opdracht_04.deur;


import java.awt.*;

/**
 * De deur is je eerste ingang in de wereld van Java.
 *
 * @author babeek en kjongman
 */
public class Deur { // Dit is het begin van een class

    /*
     * Variabelen slaan waarden op in het geheugen
     */
    private int hoogte;
    private int breedte;
    private boolean deurIsOpen;
    private String type;
    private double openingshoek;
    private Color kleur;

    /**
     * Voorbeeld van een methode JavaDoc
     * <p>
     * De constructor bouwt een nieuw object op van het type Deur. De deur
     * begint gesloten. De hoogte en breedte krijgen bij het maken van het
     * object een waarde en kunnen daarna niet meer veranderen.
     *
     * @param deurType Beschrijving van het deurtype
     * @param hoogte   hoogte van de deur
     * @param breedte  breedte van de deur
     */
    public Deur(String deurType, int nieuweHoogte, int nieuweBreedte) {
        hoogte = nieuweHoogte;
        breedte = nieuweBreedte;
        deurIsOpen = false;
        openingshoek = 0.0;
        type = deurType;
        kleur = Color.WHITE;
    }

    /**
     * Zogenaamde getters halen waarden uit het geheugen en maken die
     * beschikbaar aan het publiek. Hieronder staan een aantal voorbeelden voor
     * de verschillende variabelen van de Deur. Door het aanroepen van deze
     * methodes krijg je dus de waardes van jouw deur.
     *
     * @return
     */
    public int getHoogte() {
        return hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public double getOpeningshoek() {
        return openingshoek;
    }

    public boolean isOpen() {
        return deurIsOpen;
    }

    public Color getKleur() {
        return kleur;
    }

    public String getType() {
        return type;
    }

    /**
     * Deze methode voert een echte "actie" uit: hij opent deze deur. Waar getters
     * een waarde geven aan het publiek, doet deze methode dat niet. Deze
     * methode zet de verschillende variabelen direct. Vergelijk het eens met de
     * volgende methode.
     */
    public void open() {
        deurIsOpen = true;
        openingshoek = 90;
    }

    /**
     * Een voorbeeld van hoe deze deur weer te sluiten is. Deze methode zet zelf
     * niet de variabelen, maar maakt gebruik van een andere methode om het werk
     * te doen.
     */
    public void sluit() {
        openMetHoek(0.0);
    }

    /**
     * Net als bij de constructor heeft deze methode argumenten. Deze voert meer
     * uit dan alleen open en sluiten, de deur kan namelijk ook gedeeltelijk
     * open zijn. Deze helpt daarbij.
     * <p>
     * NB: Deze methode wordt later uitgebreid met een controle van de status op
     * basis van de hoek. Het is nu dus mogelijk om de deur dicht te doen met
     * een bepaalde hoek.
     *
     * @param hoek       hoek waaronder deze deur gezet wordt. 0 is gesloten en 90 is
     *                   volledige open.
     * @param deurIsOpen de nieuwe status van deze deur.
     */
    public void openMetHoek(double hoek) {

        if (hoek > 90 || hoek < 0){
            System.out.println("Je kan de deur niet open zetten op "+ hoek +" graden. Dus ik doe niets");
        } else if (hoek == 0) {
            deurIsOpen = false;
            openingshoek = hoek;
        }
        else if (hoek > 0){
            deurIsOpen = true;
            openingshoek = hoek;
        }

        //optie 2
        if (hoek < 0) {
            System.out.println("Mag niet");
        }
        else if (hoek ==0) {
            deurIsOpen = false;
            openingshoek = hoek;
        }
        else if (hoek < 90) {
            deurIsOpen = true;
            openingshoek = hoek;
        }
        else {
            System.out.println("Mag niet");
        }
    }

    /**
     * Waar getters enkele waarden beschikbaar stelden aan het publiek, berekent
     * de volgende methode een waarde en geeft hij deze aan het publiek. De naam
     * van de methode is belangrijk in deze, omdat deze vertelt welke waarde hij
     * berekent. Door een beschrijvende naam te gebruiken, hoeven anderen niet
     * zo snel het commentaar te lezen, en is het gemakkelijker om de juiste
     * methode in een lijst te vinden.
     *
     * @return de oppervlakte van deze deur
     */
    public int oppervlakte() {
        return hoogte * breedte;
    }

    /**
     * Deze methode combineert argumenten, aanroepen van andere methode,
     * variabelen, en return waarden in 1 geheel. Dit is een voorbeeld hoe alle
     * losse elementen samenkomen tot 1 geheel.
     *
     * @param dikte     dikte van deze deur
     * @param dichtheid de dichtheid van het materiaal van deze deur
     * @return het gewicht van deze deur.
     */
    public double gewicht(int dikte, double dichtheid) {
        int volume = oppervlakte() * dikte;
        // het volume is een tijdelijke variabele die alleen in deze methode
        // bestaat
        return volume * dichtheid;
    }

    /**
     * Met deze methode is het mogelijk om de kleur van deze deur te veranderen.
     *
     * @param Nieuwe kleur van deze deur
     */
    public void beschilder(Color kleur) {
        this.kleur = kleur;
    }

}
