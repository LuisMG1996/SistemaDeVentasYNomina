package com.company;

/**
 * Builder especifica una interface correspondiente a
 * la creacion de las partes de un objeto complejo (producto).
 *
 * @author Luis Montes
 *
 */
public interface Builder
{
    abstract public void buildPartOne();
    abstract public void buildPartTwo();
    abstract public void buildPartThree();
    abstract public void ensambleProduct(Cliente cliente);

}//end interface Builder