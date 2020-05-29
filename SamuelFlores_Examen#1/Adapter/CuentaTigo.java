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
public class CuentaTigo extends AbstractAccount {

    public CuentaTigo(final double balance) {
        super(balance);
        setTigoClaro(false);
    }
}
