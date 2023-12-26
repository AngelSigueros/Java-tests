package com.company.retomejorado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoCRUDArrayList {

    // atributos
    private List<Empleado> empleados = new ArrayList<>();

    // constructores
    public EmpleadoCRUDArrayList() { // datos demo
        // telefonos
        List<String> phones = new ArrayList<>();
        phones.add("555444333");

        // empleados
        empleados.add(new Empleado("111", "Bob Esponja", "FondoBikini", 30, 40.5, false, new ArrayList<>()));
        Empleado empleadoDemo = new Empleado("222", "Patricio", "FondoBikini", 50, 30.6, false, phones);
        empleados.add(empleadoDemo);
    }
    // metodos

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empleado findByDNI(String dni) {
        for(Empleado empleado : empleados)
            if (empleado.dni.equals(dni))
                return empleado;

        return null;
    }

    public void save(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void deleteByDNI(String dni){
        Iterator<Empleado> iter = empleados.iterator();
        while (iter.hasNext()) {
            Empleado empleado = iter.next();
            if (empleado.dni.equals(dni)){
                iter.remove();
                return;
            }
        }
    }
    public void deleteAll(){
        empleados.clear();
    }
}
