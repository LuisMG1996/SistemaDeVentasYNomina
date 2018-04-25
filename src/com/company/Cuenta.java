package com.company;

import java.util.ArrayList;

/**
 * Created by luisricardo on 25/04/2018.
 */
public class Cuenta {
    public int numeroCuenta;
    public double saldo;
    public Usuario dueño;
    public static ArrayList<Cuenta> cuentas;

    public Cuenta(double saldo, Usuario dueño){

        this.numeroCuenta = cuentas.size();
        this.saldo = saldo;
        this.dueño = dueño;
        cuentas.add(this);
    }//fin constructor

    public boolean restarSaldo(int cantidad){
        boolean done = false;
        if (saldo >= cantidad){
            saldo = saldo - cantidad;
            done = true;
        }
        return done;
    }//fin restarSaldo

    public boolean abonarSaldo(int cantidad){
        saldo += cantidad;
        return true;
    }//fin abonarSaldo

}
