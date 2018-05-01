package com.company.Interfaces;

import java.awt.*;

/**
 * Created by luisricardo on 01/05/2018.
 */
public class clienteCompra extends Frame implements View {
    Checkbox ckbManual;
    Checkbox ckbPredeterminado;
    Choice chcCategoria;
    List lstProductos;
    List lstProductosSeleccionados;
    Button btnAgregar;
    Button btnEliminar;
    Button btnConfirmar;

    public clienteCompra(){
        Color color;
        /////////////

        setTitle("Ventana de Compra");
        setBounds(100, 100, 400, 400);
        color = new Color(51,153,255);
        setBackground(color);
        setLayout(null);
        constuyeComponentes();
    }
    public void constuyeComponentes() {

        ckbManual = new Checkbox("Compra Manual");
        ckbManual.setBounds(75,50,100,20);
        add(ckbManual);

        ckbPredeterminado = new Checkbox("Compra Predeterminada");
        ckbPredeterminado.setBounds(200,50,100,20);
        add(ckbPredeterminado);

        chcCategoria = new Choice();
        chcCategoria.addItem("Cementos");
        chcCategoria.addItem("Vigas");
        chcCategoria.addItem("Madera");
        chcCategoria.addItem("Varillas");
        chcCategoria.addItem("Revolvedoras");
        chcCategoria.addItem("Vidrio");
        chcCategoria.setBounds(200,90,100,20);
        add(chcCategoria);

        lstProductos = new List(10);
        lstProductos.setBounds(20,150,130,200);
        add(lstProductos);

        lstProductosSeleccionados = new List(10);
        lstProductosSeleccionados.setBounds(250,150,130,200);
        add(lstProductosSeleccionados);

        btnAgregar = new Button("Agregar >>");
        btnAgregar.setBounds(160,190,80,20);
        add(btnAgregar);

        btnEliminar = new Button("<< Eliminar");
        btnEliminar.setBounds(160,240,80,20);
        add(btnEliminar);



    }

    public void inicia(){
        setVisible(true);
    }
}
