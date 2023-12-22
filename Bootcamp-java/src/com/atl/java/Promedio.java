package com.atl.java;
/*
Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
*/

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce primer numero: ");
        int primerNum = scanner.nextInt();
        System.out.println("Introduce segundo numero: ");
        int segundoNum = scanner.nextInt();
        System.out.println("Introduce tercer numero: ");
        int tercerNum = scanner.nextInt();

        if (primerNum > segundoNum && primerNum > tercerNum) {
            System.out.println("el mayor es: " + primerNum);
        } else if (segundoNum > primerNum && segundoNum > tercerNum) {
            System.out.println("el mayor es: " + segundoNum);
        } else {
            System.out.println("el mayor es: " + tercerNum);
        }

        if (primerNum < segundoNum && primerNum < tercerNum) {
            System.out.println("el menor es: " + primerNum);
        } else if (segundoNum < primerNum && segundoNum < tercerNum) {
            System.out.println("el menor es: " + segundoNum);
        } else {
            System.out.println("el menor es: " + tercerNum);
        }

        int promedio = (primerNum + segundoNum + tercerNum) / 3;
        System.out.println("El promedio es: " + promedio);

        // Muestra los números del 1 al 100 utilizando un bucle while
        int i = 1;
        while (i<101) {
            System.out.println(i);
            i++;
        }
    }
}
