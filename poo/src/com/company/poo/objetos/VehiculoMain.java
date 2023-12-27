package com.company.poo.objetos;

import com.company.poo.clases.Vehiculo;

public class VehiculoMain {

    public static void main(String[] args) {

        // Crear objetos de la clase Vehiculo

        int[] numeros = new int[4]; // objeto especial, array

        Vehiculo fordMondeo = new Vehiculo(); // objeto de una clase que hemos creado
        fordMondeo.color = "azul";
        fordMondeo.ruedas = 4;
        fordMondeo.fabricante = "Ford";
        fordMondeo.modelo = "Mondeo";
        fordMondeo.numPuertas = 5;
        fordMondeo.precio = 50000.0;

        Vehiculo volksGolf = new Vehiculo(); // constructor vacío
        volksGolf.color = "negro";
        volksGolf.ruedas = 4;
        volksGolf.fabricante = "Volkswagen";
        volksGolf.modelo = "Golf";
        volksGolf.numPuertas = 5;
        volksGolf.precio = 40000.0;

        Vehiculo toyotaPrius = new Vehiculo();
        toyotaPrius.color = "rojo";
        toyotaPrius.ruedas = 4;
        toyotaPrius.fabricante = "Toyota";
        toyotaPrius.modelo = "Prius";
        toyotaPrius.numPuertas = 3;
        toyotaPrius.precio = 60000.0;

        System.out.println("toyotaPrius color " + toyotaPrius.color);
        System.out.println("volksGolf color " + volksGolf.color);
        System.out.println("fordMondeo color " + fordMondeo.color);


        if (toyotaPrius.numPuertas == volksGolf.numPuertas){
            System.out.println("Ambos tienen el mismo número de puertas");
        }

    }
}
