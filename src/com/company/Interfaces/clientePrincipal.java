package com.company.Interfaces;
import com.company.Cliente;

import java.awt.*;

/**
 * Created by luisricardo on 26/04/2018.
 */
public class clientePrincipal extends Frame{

    Label nombreEmpresa;
    Label nombreUsuario;

    Button comprar;
    Button misCompras;
    Button misDatos;


    public clientePrincipal(Cliente cliente){
        Color color;
        /////////////

        setTitle("Menú Principal");
        setBounds(100, 100, 500, 400);
        color = new Color(51,153,255);
        setBackground(color);
        setLayout(null);
        constuyeComponentes(cliente);
    }
    public void constuyeComponentes(Cliente cliente) {

        nombreEmpresa = new Label("Materiales de Construcción Ramírez SC");
        nombreEmpresa.setBounds(15, 50, 500    , 20);
        Font font = new Font("Times New Roman", Font.BOLD, 25 );
        nombreEmpresa.setFont(font);
        add(nombreEmpresa);

        nombreUsuario = new Label("Usuario " + cliente.nombre);
        nombreUsuario.setBounds(400,370,100,20);
        font = new Font("Times New Roman", Font.BOLD, 10 );
        nombreUsuario.setFont(font);
        add(nombreUsuario);

        comprar = new Button("Comprar");
        comprar.setBounds(30,150,80,80);
        add(comprar);

        misCompras = new Button("Mis Compras");
        misCompras.setBounds(200,150,80,80);
        add(misCompras);

        misDatos= new Button("Mis Datos");
        misDatos.setBounds(380,150,80,80);
        add(misDatos);
    }

    public void inicia(){
        setVisible(true);
    }
}
