package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

//---------------------------------------------------------
//---------------------------------------------------------
//Proxy, comunicación entre aplicación cliente y empresa
//---------------------------------------------------------
//---------------------------------------------------------
/**
 *
 * @author Luis Ricardo Montes Gómez
 * @version 0.2
 *
 */
public class Compra extends ArrayList<Producto> {

    public int idCompra;
    public int subTotal;
    public double total;
    public int status; //0 esperando pago, 1 empacando, 2 enviado, 3 recibido
    public Cliente cliente;

    public Compra(Cliente cliente){
        Random rm;
        rm = new Random();

        idCompra = Math.abs(rm.nextInt(10000));
        subTotal = 0;
        total = 0;
        status = 0;
        this.cliente = cliente;
    }
    public void añadirAlCarrito(Producto producto){
        add(producto);
        subTotal += producto.precio;
        total = subTotal * 1.16;//calculo del IVA
    }

    public void imprimirCompra(){
        System.out.println("ID de compra: " + idCompra);
        for(Producto producto: this){
            System.out.println(producto.nombreProducto + "\t\t$" + producto.precio);
        }
        System.out.println("Subtotal: \t$" + subTotal);
        System.out.println("Total: \t\t$" + total);
    }
}
