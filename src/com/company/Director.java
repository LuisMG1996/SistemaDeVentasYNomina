package com.company;
/**
 * Ordena y dirige (indica) la construccion de los productos
 *
 * @author Luis Montes
 *
 */
public class Director
{
    Builder builder;
    //----------------


    public Director (Builder aBuilder)
    {
        builder = aBuilder;
    }//end constructor

    // algoritmo/secuencia/pasos de construccion
    // se hace una invocación para cada parte (objeto)
    // del producto (objeto complejo)
    public void construct(Cliente client)
    {
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThree();
        builder.ensambleProduct(client);
    }//end construct

}//end class Director
