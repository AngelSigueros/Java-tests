package com.certidevs.excepciones;

import java.nio.file.Files;

public class Main2 {

    public static void main(String[] args) {

        // multicatch

        try {
            String nombre = null;
            nombre.split(" "); // NullPointerException
            int resultado = 5 / 0; // ArithmeticException
        } catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e) {
            e.printStackTrace(); // imprime el error por consola
        }
        System.out.println("Continuamos");
    }
}
