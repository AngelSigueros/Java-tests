package com.company.operadores;
/**
 * Clase principal
 */
public class OperadoresAritmeticos {

    /**
     * Método principal, punto de entrada a la aplicación Java
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("hola mundo");

        // Operadores aritméticos
        int numero1 = 5;
        int numero2 = 10;

        // Opción 1: primero declarar la variable y luego inicializarla

        int resultado1; // declarar una variable
        resultado1 = numero1 + numero2; // inicializar una variable // 5 + 10

        // Opción 2: declarar e inicializar a la vez
        int resultado2 = numero1 * numero2; // 10 * 5

        // Cuando utilizamos el operador + en textos se trata del operador concatenación
        System.out.println("5 + 10 es: " + resultado1 + " euros (€)");
        System.out.println("5 * 10 es: " + resultado2 + " dólares ($)");

        // Importante, si se dividen enteros se pierde la parte decimal:
        int resultado3 = 5 / 2; // 2
        System.out.println("5 / 2 es: " + resultado3);

        double resultado4 = 5.0 / 2.0; // 2.5
        System.out.println("5.0 / 2.0 es: " + resultado4);
        System.out.println(resultado4 + " es el resultado de operar 5.0 entre 2.0");

        // operacion resto
        int resultado5 = 5 % 2; // saber si un número es par
        System.out.println(resultado5);

        int resultado6 = 6 % 2;
        System.out.println(resultado6);


    }


}
