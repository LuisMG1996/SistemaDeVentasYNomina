package com.company;

import java.awt.*;

/**
 * Created by luisricardo on 19/04/2018.
 */
public class interfazLogin extends Frame implements View{

    //TextFields para credenciales

    TextField txtUsuario;
    TextField txtPassword;

    //Labels para credenciales

    Label lblUsuario;
    Label lblPassword;

    Button btnAceptar;


    public interfazLogin ()
    {
        Color color;
        /////////////

        setTitle("INTERFAZ --- VIEW de la Aplicacion");
        setBounds(100, 100, 400, 400);
        color = new Color(51,153,255);
        setBackground(color);
        setLayout(null);
        constuyeComponentes();
    }//end constructor

    public void constuyeComponentes() {

        txtUsuario = new TextField();
        txtPassword = new TextField();

        txtUsuario.setBounds(145,140, 100,20);
        txtPassword.setBounds(145, 180, 100,20);

        add(txtUsuario);
        add(txtPassword);

        lblUsuario = new Label("Usuario");
        lblPassword = new Label("Password");

        lblUsuario.setBounds(145, 120, 100,20);
        lblPassword.setBounds(145,160,100,20);

        add(lblUsuario);
        add(lblPassword);
    }
    public void inicia(){
        setVisible(true);
    }
    /*public void setActionListener(Controller theController) {

    }*/
}
