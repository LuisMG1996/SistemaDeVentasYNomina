package com.company;

//import java.time.LocalDate;
import java.io.IOException;
import java.util.Stack;

/**
 *
* @author Luis Ricardo Montes Gómez
* @version 0.2
*
*/
public class Cliente extends Usuario{

    public int idCliente;
    public String tipo; //Mayorista o menudista
    public Stack<Compra> compras;
    private int numCuenta;
    //Checar LocalDate
    //public LocalDate antiguedad;

    /*
    * @param
    * */

    public Cliente(int idCliente, String tipo, String nombre,
                   int edad, String direccion) {

        this.idCliente = idCliente;
        this.tipo = tipo;

        this.nombre = nombre;
        this.edad = edad;
        this.Dirección = direccion;
        compras = new Stack<Compra>();
    }
    /**
    *@param productos the array of the names of products who would be add to the shopping cart
    *
    *
    */
    public void realizarCompraManual(String[] productos) throws IOException{

        Compra carrito;

        //----------------
        carrito = new Compra(this);

        for(String producto: productos){
            carrito.añadirAlCarrito(Creator.anOperation(producto));
        }//fin for

        //en caso de lograr añadir todos los articulos al carrito
        compras.push(carrito);
    }//fin realizarCompraManual

    public void realizarCompraPredefinida(String construcción){
        Compra carrito;
        Director director;
        //-------------
        if (permitirCompra()) {
            carrito = new Compra(this);
            if (construcción.equals("Puente")) {

                concreteBuilderPuente concreteBuilderPuente;
                concreteBuilderPuente = new concreteBuilderPuente();
                director = new Director(concreteBuilderPuente);
                director.construct(this);
                carrito = concreteBuilderPuente.getResult();
            }//fin if
            compras.push(carrito);
        }else System.out.println("Favor de pagar ultima compra");
    }//fin realizarCompraPredefinida

    private boolean permitirCompra(){
        Compra last;
        boolean permiso;
        //--------------
        permiso = true;
        if(!compras.empty()) {
            last = compras.peek();

            if (last.status == 0) {
                permiso = false;
            } else permiso = true; //fin if else
        }
        return permiso;
    }//fin permitirCompra

}//fin clase
