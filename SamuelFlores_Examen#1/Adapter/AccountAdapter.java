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
public class AccountAdapter extends AbstractAccount {

    // Adaptee - The class we are adapting from
    private CostoPorLlamadas costoporllamada;

    /**
     *
     * @param offshoreAccount the instance of OffshoreAccount we are going to
     * adapt from.
     */
    public AccountAdapter(final CostoPorLlamadas costoporllamada) {
        super(costoporllamada.getCostoPorLlamadas());
        this.costoporllamada = costoporllamada;
    }

    @Override
    public double getCosto() {
        final double costoLlamadaporM = costoporllamada.getCostoDeLaLlamadaPorM();
        final double cobros = costoporllamada.getCostoPorLlamadas();

        final double costoDeLaLlamada = cobros * costoLlamadaporM;
        return costoDeLaLlamada;
    }
    
}
