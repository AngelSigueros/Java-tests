package com.company.funciones;

import java.util.ArrayList;
import java.util.List;

public class FuncionesArrays {

    public static void main(String[] args) {

        // Array normal
        String[] nombres = {"Nombre1", "Nombre2", "Nombre3"};
        imprimirArray(nombres);

        // Array list
        List<Double> numeros = new ArrayList<>();
        numeros.add(5.99);
        numeros.add(10.99);
        numeros.add(1.99);

        imprimirArrayList(numeros);



    }

    public static void imprimirArray(String[] nombres){
        System.out.println(nombres);
    }
    public static void imprimirArrayList(List<Double> numeros){
        System.out.println(numeros);
    }


}
