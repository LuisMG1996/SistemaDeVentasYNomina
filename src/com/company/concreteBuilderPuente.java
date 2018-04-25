package com.company;


/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */

public class concreteBuilderPuente implements Builder{

    Producto primeraParte;
    Producto segundaParte;
    Producto terceraParte;
    Compra compra;
    Creator creator;
    //-----------

    public void buildPartOne(){ //Materiales metalicos
        primeraParte = Creator.anOperation("Viga");
    }//end buildPartOne


    public void buildPartTwo(){ //Cemento, Grava, etc..
        segundaParte = Creator.anOperation("Asfalto");
    }//end buildPartTwo


    public void buildPartThree(){
        terceraParte = Creator.anOperation("Viga");
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


}//end class ConcreteBuilderBalsa
