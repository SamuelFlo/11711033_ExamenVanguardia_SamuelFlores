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
public class ContenidoMembresia {
	
	private EstadoMembresia estado = null;
	private Membresias membresia = new Membresias();

	public void setEstado(EstadoMembresia estado) {
		this.estado = estado;
	}

	public void gameAction() {
		estado.action(membresia);
	}
}
