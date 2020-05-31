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
public class Pan {
    PanType panes;
    public Pan(){}

    public Pan(PanType pansito) {
        this.panes = pansito;
    }

    public PanType getPanes() {
        return panes;
    }

    public void setPanes(PanType panes) {
        this.panes = panes;
    }
    

    
}
