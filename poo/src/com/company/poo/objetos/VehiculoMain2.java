package com.company.poo.objetos;

import com.company.poo.clases.Vehiculo;

public class VehiculoMain2 {

    public static void main(String[] args) {


        // opcion 1: contructor vacío SIN parámetros
        Vehiculo vehiculo1 = new Vehiculo();
        // asignar valores directamente a los atributos del objeto
        vehiculo1.fabricante = "Ford";
        vehiculo1.modelo = "Mondeo";

        // opcion 2: utilizar el constructor con TODOS los parámetros
        Vehiculo vehiculo2 = new Vehiculo(4, "Volks", "Golf", "rojo", 5, 40000);
        // no hace falta asignar valores a los atributos porque ya se han asignado en el constructor

        // opcion 3: utilizar constructor con ALGUNOS parámetros
        Vehiculo vehiculo3 = new Vehiculo("Toyota", "Prius", 30000);

        System.out.println(vehiculo2);



    }

}
