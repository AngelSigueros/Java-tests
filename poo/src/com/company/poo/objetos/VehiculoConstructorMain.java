package com.company.poo.objetos;

import com.company.poo.clases.Vehiculo;

public class VehiculoConstructorMain {

    public static void main(String[] args) {




        Vehiculo volksGolf = new Vehiculo(5,
                    "Volkswagen", "Golf", "rojo",
                        5, 70000);

        Vehiculo fordMondeo = new Vehiculo(5,
                "Ford", "Mondeo", "azul",
                3, 60000);

       if (volksGolf.precio > fordMondeo.precio){
           System.out.println(volksGolf.fabricante + " " + volksGolf.modelo + " es más caro que "
                   + fordMondeo.fabricante + " " + fordMondeo.modelo);
       } else {
           System.out.println(fordMondeo.fabricante + " " + fordMondeo.modelo + " es más caro que "
                   + volksGolf.fabricante + " " + volksGolf.modelo);
       }

        System.out.println("fin");

       // Otro ejmplo utilizando otro constructor

        Vehiculo ferrari = new Vehiculo("Ferrari", "458 Italia", 150000);
        Vehiculo lamborghini = new Vehiculo();

    }
}
