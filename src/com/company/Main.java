package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente(1,"minorista","Luis", 21, "14 oriente");
        cliente.realizarPedidoPredefinida("Puente");
        Compra compra;
        for(int i = 0; i < cliente.compras.size(); i++){
            compra = cliente.compras.pop();
            compra.imprimirCompra();
        }
        interfazLogin inter = new interfazLogin();
        inter.inicia();
    }
}
