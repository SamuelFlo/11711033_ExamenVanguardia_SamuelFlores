/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Samuel   
 */
public interface CarroBuilder {

    public abstract void agregarLlantaDeRespuesto(String llantaDeRepuesto);

    public abstract void agregarAleron(String aleron);

    public abstract void agregarlucesDeNeon(String lucesDeNeon);

    public abstract void agregarTurbo(String turbo);

    public abstract void agregarConvertible(String convertible);
    
    public abstract void agregarBlindaje(String blindaje);
    
    public abstract void precio(double precio);
    
    public abstract Carro getCarro();

}
