package com.atl.java;
/*
Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
import java.util.Scanner;
public class CalcPropinas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce total de cuenta: ");
        double total = scanner.nextDouble();
        System.out.println("Introduce porcentaje de propina: ");
        double propina = scanner.nextDouble();
        double monto = total * (propina/100);
        System.out.println("Propina: " + monto + " Cuenta: " + total + " Total: " + (total + monto));
    }
}
