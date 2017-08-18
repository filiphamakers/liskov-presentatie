package be.vdab.rechthoeken;

public class Vierkant extends Rechthoek{

    public Vierkant(double lengte, double breedte) {
        super(lengte, breedte);
    }
    
    @Override
    public void setLengte(double lengte){
        super.setLengte(lengte);
        super.setBreedte(lengte);
    }
    
    @Override
    public void setBreedte(double breedte){
        super.setBreedte((breedte));
        super.setLengte(breedte);
    }
}
