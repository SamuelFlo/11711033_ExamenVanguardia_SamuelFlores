/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Samuel
 */
public class MembresiaNormal implements EstadoMembresia {
    @Override
    public void action(Membresias p) {
        p.comprar();
    }
}
