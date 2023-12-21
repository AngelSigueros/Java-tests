package com.company.estructurasdatos.listas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        nombres.add("Nombre 5");

        System.out.println(nombres);

        List<Double> numeros = new ArrayList<>();
        numeros.add(5.99);
        numeros.add(10.99);
        numeros.add(11.99);
        numeros.add(12.99);

        Double acumulador = 0D;
        for (Double numero : numeros){
            acumulador += numero;
        }
        System.out.println("La suma de los numeros es: " + acumulador);
    }
}
