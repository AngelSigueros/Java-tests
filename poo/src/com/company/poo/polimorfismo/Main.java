package com.company.poo.polimorfismo;

import com.company.poo.herencia.Camion;
import com.company.poo.herencia.Motocicleta;
import com.company.poo.herencia.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // opcion 1 sin polimorfismo
        Motocicleta moto = new Motocicleta();
        Camion camion = new Camion();

        // opcion 2 con polimorfismo - variables
        Vehiculo moto2 = new Motocicleta();
        Vehiculo camion2 = new Camion();

        moto2.getFabricante();

        camion.getFabricante();

        // polimorfismo - lista
        // gracias a la herencia tenemos dos tipos diferentes (Motocicleta, Camion) en una misma lista
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(moto2);
        vehiculos.add(camion2);


    }
}
