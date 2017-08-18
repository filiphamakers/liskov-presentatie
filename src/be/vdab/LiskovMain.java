package be.vdab;

import be.vdab.rechthoeken.Rechthoek;
import be.vdab.wiskundige.Wiskundige;

public class LiskovMain {

    public static void main(String[] args) {
        Wiskundige einstein = new Wiskundige();
        double oppervlakte = einstein.berekenOppervlakte(new Rechthoek(3, 2));
        System.out.println(
                "Volgens Einsteins berekeningen is de oppervlakte "
                + oppervlakte
                + " vierkante meter");

    }

}
