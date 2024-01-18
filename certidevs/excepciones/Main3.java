package com.certidevs.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edad = 0;

        do {
            System.out.println("Introduce tu edad en número: ");
            try {
                edad = scanner.nextInt(); // 30
                break;
            } catch (InputMismatchException e) { // Captura errores de formato: string, double...
                System.out.println("Formato incorrecto");
            }
            scanner.nextLine(); // Consumir salto de línea al escribir número con nextInt()
        } while (true);

        System.out.println("Tu edad es: " + edad);
    }
}
