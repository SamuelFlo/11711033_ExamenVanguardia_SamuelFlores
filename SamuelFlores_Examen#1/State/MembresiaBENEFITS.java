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
public class MembresiaBENEFITS implements EstadoMembresia {

    @Override
    public void action(Membresias p) {
        p.compraEnVolumen();
        p.descuento();
        p.eventos();
        p.presentacionesGrandes();
        p.productosDeMayoreo();
        p.promociones();
        p.viajes();
        p.visitas();
        
        
    }
}
