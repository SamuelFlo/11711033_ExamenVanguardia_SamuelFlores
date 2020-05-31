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
public class Carro {
    String llantaDeRespuesto;
    String aleron;
    String lucesDeNeon;
    String turbo;
    String convertible;
    String blindaje;
    double precio;

    @Override
    public String toString() {
        return "Carro: \n" + " Llanta de Respuesto: " + llantaDeRespuesto + "\n Aleron: " + aleron + "\n Luces de nen: " + lucesDeNeon + 
                "\n Turbo: " + turbo + "\n Convertible: " + convertible + "\n Blindaje: " + blindaje + "\n Precio: " + precio + '}';
    }
    
    

    
    
    
}
