package com.company;


/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */
public class concreteCreatorAsfalto extends Creator {

    public Producto factoryMethod() {
        Producto aConcreteProduct;

        aConcreteProduct = new concreteProductAsfalto();
        return aConcreteProduct;

    }//fin factoryMethod();
}
