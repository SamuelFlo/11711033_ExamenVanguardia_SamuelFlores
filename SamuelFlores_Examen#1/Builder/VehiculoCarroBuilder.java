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
public class VehiculoCarroBuilder implements CarroBuilder {
    private Carro carrito = new Carro();


    @Override
    public void agregarLlantaDeRespuesto(String llantaDeRepuesto) {
        carrito.llantaDeRespuesto = llantaDeRepuesto;
    }

    @Override
    public void agregarAleron(String aleron) {
        carrito.aleron = aleron;
    }
    @Override
    public void agregarlucesDeNeon(String lucesDeNeon) {
        carrito.lucesDeNeon=lucesDeNeon;
    }

    @Override
    public void agregarTurbo(String turbo) {
        carrito.turbo = turbo;
    }

    @Override
    public void agregarConvertible(String convertible) {
        carrito.convertible = convertible;
            
    }

    @Override
    public void agregarBlindaje(String blindaje) {
        carrito.blindaje = blindaje;
    }

    @Override
    public void precio(double precio) {
        carrito.precio = precio;
    }

    @Override
    public Carro getCarro() {
        return carrito;
    }
}
