package com.company;


import com.company.abstractClasses.Creator;
import com.company.abstractClasses.Producto;

/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */
public class concreteCreatorAsfalto extends Creator {

    public Producto factoryMethod() {

        return new concreteProductAsfalto();

    }//fin factoryMethod();
}
