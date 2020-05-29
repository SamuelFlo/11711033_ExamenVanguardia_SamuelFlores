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
public class AbstractAccount implements Cuenta {

    private double costo;
    private boolean costoTigoClaro;

    public AbstractAccount(final double size) {
        this.costo = size;
    }

    @Override
    public double getCosto() { 
        return costo;
    }

    @Override
    public boolean isTigoClaro() {
        return costoTigoClaro; 
    }
    public void setTigoClaro(boolean esTigoClaro){
        costoTigoClaro = esTigoClaro;
    }

    @Override
    public void cobro(double cobroporm) {
        costo+=cobroporm;
    }

    @Override
    public String toString() {
        return "AbstractAccount{" + "costo=" + costo + ", costoTigoClaro=" + costoTigoClaro + '}';
    }
    
    
}
