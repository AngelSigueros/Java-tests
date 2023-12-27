package com.company.poo.scanner;

import java.util.Scanner;

public class Main {

    /**
     * Como evitar problemas al leer tecto y otros tipos de datos:
     *
     * scanner.nextLine(); a continuacion de haber leido un dato no String
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto 1 ");
        String variable1 = scanner.nextLine();


        System.out.println("Introduce un numero 2");
        int variable2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce un texto 3");
        String variable3 = scanner.nextLine();


        System.out.println("Introduce un double 4");
        double variable4 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Introduce un texto 5");
        String variable5 = scanner.nextLine();

        System.out.println("Introduce un double 4");
        boolean variable6 = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Introduce un texto 5");
        String variable7 = scanner.nextLine();



        System.out.println("fin");
    }
}
