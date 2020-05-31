/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Samuel
 */
public class CostoPorLlamadas {

    private double costo;

    private static final double costoDeLaLlamadaPorM = 0.15;

    public CostoPorLlamadas(final double costo) {
        this.costo = costo;
    }

    public double getCostoDeLaLlamadaPorM() {
        return costoDeLaLlamadaPorM;
    }

    public double getCostoPorLlamadas() {
        return costo;
    }

    

    public void cobro(final double cobroporminuto) {
        costo += cobroporminuto;
    }
}
