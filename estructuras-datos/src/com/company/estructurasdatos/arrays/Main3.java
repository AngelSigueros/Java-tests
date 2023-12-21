package com.company.estructurasdatos.arrays;

public class Main3 {
    public static void main(String[] args) {

        // 1. variables
        double numero = 5.99;
        int numero2 = 5;
        String nombre = "Prueba";

        // 2. estructuras de datos: arrays

        // 2.1. Ejemplo double
        double[] numeros = new double[4];
        numeros[0] = 5.99;
        numeros[1] = 10.99;
        numeros[2] = 4.99;
        numeros[3] = 467.8;
        // equivalente
        double[] numeros2 = {5.99, 10.99, 4.99, 467.8};

        // 2.2. Ejemplo int
        int[] numeros3 = new int[4];
        numeros3[0] = 5;
        numeros3[1] = 10;
        numeros3[2] = 4;
        numeros3[3] = 467;
        // equivalente
        int[] numeros4 = {5, 10, 4, 467};

        // 2.3. Ejemplo boolean
        boolean[] comprobaciones = new boolean[4];
        comprobaciones[0] = false;
        comprobaciones[1] = true;
        comprobaciones[2] = false;
        comprobaciones[3] = 5 > 10; // false
        boolean[] comprobaciones2 = {false, true, false, 5 > 10};

        // 2.4. Ejemplos String y char
        String[] nombres = new String[3];
        char[] chars = new char[3];


    }
}
