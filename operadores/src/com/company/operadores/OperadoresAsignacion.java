package com.company.operadores;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        // 1. creo una variable con un valor cualquiera
        int numero = 5;
        System.out.println(numero);

        // cambio el valor de la variable por otro cualquiera
        numero = 100; // sobreescribe el valor
        System.out.println(numero);

        // cambio el valor de la variable por otro cualquiera
        numero = 10 + 5;
        System.out.println(numero);

        // cambio el valor de la variable por otro cualquiera
        int numero2 = 20 + 20;
        numero = numero2; // 40
        System.out.println(numero);

        // sumar 20 a variable numero
        // numero = numero + 20; // 60
        numero += 20; // 60
        System.out.println("numero+=20 equivale a " + numero);

        numero -= 40; // 20
        System.out.println("numero-=40 equivale a " + numero);

        int numero3 = 5;
        numero3 *= 5;
        System.out.println(numero3);
    }
}
