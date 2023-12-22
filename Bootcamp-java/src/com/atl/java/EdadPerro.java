package com.atl.java;

import java.util.Scanner;

public class EdadPerro {
    public static void main(String[] args) {

        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.printf("Ingrese edad de su perro: ");
        int edad = cargaDeDatos.nextInt();
        int edadPerro = edad*7;
        System.out.println("La edad de tu perro es: " + edadPerro);

    }
}