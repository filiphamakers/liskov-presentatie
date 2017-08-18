package be.vdab.rechthoeken;

public class Rechthoek {

    private double lengte, breedte;

    public Rechthoek(double lengte, double breedte) {
        setLengte(lengte);
        setBreedte(breedte);
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getBreedte() {
        return breedte;
    }

}
