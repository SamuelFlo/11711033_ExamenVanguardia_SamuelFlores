/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Samuel
 */
public class PanFactory {
    public Pan buildBolsaPan(PanType panes){
        if(panes.equals(PanType.CENTENO)){
            return new Centeno();
         
        }else if (panes.equals(PanType.MAIZ)){
            return new Maiz();
        }else if (panes.equals(PanType.TRIGO)){
            return new Trigo();
        }
        return new Pan(panes);
    }
}
