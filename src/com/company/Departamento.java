package com.company;


/**
 * Created by luisricardo on 18/04/2018.
 * @author luisricardo
 * @version 0.2
 */
import java.util.Set;

//---------------------------------------------------------
//---------------------------------------------------------
//Implementar en está clase o en Empleado patron Composite
//---------------------------------------------------------
//---------------------------------------------------------

public class Departamento {

    public String nombreDepartamento;
    public Empleado jefeDepartamento;
    protected Set<Empleado> empleados;

    public Departamento(String nombreDepartamento, Empleado jefe){
        this.nombreDepartamento = nombreDepartamento;
        jefeDepartamento = jefe;

    }

    public void contratatarEmpleado(String nombre, int edad, String direccion, int salario, int cuenta, int id){
        Empleado nuevoEmpleado = new Empleado(jefeDepartamento, this, nombre, edad,
                                                direccion,salario, cuenta, id);
        empleados.add(nuevoEmpleado);
    }
    public void despedirEmpleado(Empleado empleadoDespedido){
        for (Empleado empleado: empleados){
            if(empleado.idEmpleado == empleadoDespedido.idEmpleado){
                empleados.remove(empleado);
                return;
            }
        }
        System.out.println("Empleado no encontrado");
    }


}
