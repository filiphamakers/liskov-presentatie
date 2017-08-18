/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.wiskundige;

import be.vdab.rechthoeken.Rechthoek;

/**
 *
 * @author Filip
 */
public class Wiskundige {
    public double berekenOppervlakte(Rechthoek rechthoek){
        return rechthoek.getLengte() * rechthoek.getBreedte();
    }
}
