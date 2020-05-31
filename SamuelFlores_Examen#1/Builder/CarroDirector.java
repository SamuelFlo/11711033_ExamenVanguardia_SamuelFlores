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
public class CarroDirector {

    public void makeCarro(CarroBuilder carroBuilder) {

        carroBuilder.agregarLlantaDeRespuesto("Llanta donas");
    carroBuilder.agregarAleron("Aleron de aluminio");
        carroBuilder.agregarlucesDeNeon("Si, color morado");
        carroBuilder.agregarTurbo("Turbo electrico");
        carroBuilder.agregarConvertible("Si");
        carroBuilder.agregarBlindaje("Blindaje nivel 7");
        carroBuilder.precio(10500.99);
    }
}
