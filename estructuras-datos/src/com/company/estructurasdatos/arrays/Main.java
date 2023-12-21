package com.company.estructurasdatos.arrays;

public class Main {

    public static void main(String[] args) {



        // variables
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = 10;
        int numero4 = 10;
        int numero5 = 10;
        int resultado = numero1 + numero2 + numero3 + numero4 + numero5;
        // System.out.println(resultado);

        // estructuras de datos: arrays

        int[] numeros = new int[7];

        // la primera posición de los arrays siempre empieza en 0
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 3;
        numeros[3] = 7;
        numeros[4] = 30;
        numeros[5] = 40;
        numeros[6] = 80;

        // System.out.println(numeros[4]);
        // ITERAR SOBRE UN ARRAY.

        // System.out.println(numeros[2]); // 3


        // EJEMPLO 1: IMPRIMIR CADA NÚMERO
        for(int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i]);
        }

        // EJEMPLO 2: CALCULAR LA SUMA DE LOS NÚMEROS


    }
}
