package com.company;

import com.company.abstractClasses.Usuario;

//import java.time.LocalDate;
//------------------------------------------------------
//------------------------------------------------------
//Implementar en está clase o en Empleado patron de Composite
//------------------------------------------------------
//------------------------------------------------------
public class Empleado extends Usuario {

    public Departamento nombreDepartamento;
    public Empleado jefe;
    public int salario;
    public int numCuenta;
    public int idEmpleado;
    //public LocalDate contratación;

    public Empleado(Empleado jefe, Departamento departamento, String nombre, int edad, String direccion, int salario, int cuenta, int id){
        setJefe(jefe);
        setNombreDepartamento(departamento);
        setSalario(salario);
        setNumCuenta(cuenta);
        setIdEmpleado(id);
        this.nombre = nombre;
        this.edad = edad;
        this.Dirección = direccion;
    }
    public void setNombreDepartamento(Departamento nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
