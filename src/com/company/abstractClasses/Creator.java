package com.company.abstractClasses;


import com.company.concreteCreatorAsfalto;
import com.company.concreteCreatorViga;

/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */
public abstract class Creator
{

    //
    public abstract Producto factoryMethod();


    // anOperation refers to creating a product
    // a class wants its subclasses
    // to specify the objects it creates.
    public static Producto anOperation(String productType)
    {
        Producto aProduct;
        Creator concreteCreator;
        //---------------

        if (productType.equals("Viga"))
        {
            concreteCreator = new concreteCreatorViga();
            aProduct = concreteCreator.factoryMethod();
            return aProduct;
        }//end if
        else
        if (productType.equals("Asfalto"))
        {
            concreteCreator = new concreteCreatorAsfalto();
            aProduct = concreteCreator.factoryMethod();
            return aProduct;
        }//end if
        else
            return null;
        //end else
        //end else
    }//end anOperation

}//end class Creator
