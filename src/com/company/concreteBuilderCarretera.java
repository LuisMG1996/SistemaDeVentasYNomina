package com.company;

/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */
public class concreteBuilderCarretera implements Builder{

    Producto primeraParte;
    Producto segundaParte;
    Producto terceraParte;
    Compra compra;
    Creator creator;

    public void buildPartOne(){ //Materiales metalicos
        compra.add(Creator.anOperation("Asfalto"));
    }//end buildPartOne


    public void buildPartTwo(){ //Cemento, Grava, etc..
        compra.add(Creator.anOperation("Asfalto"));
    }//end buildPartTwo


    public void buildPartThree(){
        compra.add(Creator.anOperation("Viga"));
    }//end buildPartThree


    public void ensambleProduct(Cliente cliente)
    {
        compra = new Compra(cliente);
        compra.añadirAlCarrito(primeraParte);
        compra.añadirAlCarrito(segundaParte);
        compra.añadirAlCarrito(terceraParte);
    }//end ensambleProduct


    // se lleva control de quien solicita el objeto
    public Compra getResult()
    {
        return compra;
    }//end getResult
}
