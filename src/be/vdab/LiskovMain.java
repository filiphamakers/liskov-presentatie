package be.vdab;

import be.vdab.rechthoeken.Rechthoek;
import be.vdab.wiskundige.Wiskundige;

public class LiskovMain {

    public static void main(String[] args) {
        Wiskundige descartes = new Wiskundige();
        double oppervlakte = descartes.berekenOppervlakte(new Rechthoek(3, 2));
        System.out.println(
                "Volgens Descartes' berekeningen is de oppervlakte "
                + oppervlakte
                + " vierkante meter");

    }

}
