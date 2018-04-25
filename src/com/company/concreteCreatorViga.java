package com.company;


/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */
public class concreteCreatorViga extends Creator{


    public Producto factoryMethod() {
       return new concreteProductViga();

    }//fin factoryMethod();
}//fin concreteCreatorViga
