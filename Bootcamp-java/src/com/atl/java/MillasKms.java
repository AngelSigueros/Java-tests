package com.atl.java;

/*
Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
import java.util.Scanner;
public class MillasKms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Inroduce millas: ");
        double millas = scanner.nextDouble();
        double kms = millas * 1.60934;
        System.out.println(millas + " son " + Math.round(kms) + " Kilometros");
    }
}
