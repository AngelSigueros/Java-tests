package com.atl.java;
/*
Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/
import java.util.Scanner;
public class CalcDescuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduce precio original: ");
        double precio = scanner.nextDouble();
        System.out.printf("Introduce descuento: ");
        double descuento = scanner.nextDouble();
        double precioTotal = precio - (precio * descuento / 100);
        System.out.println("El precio total es: " + precioTotal);
        System.out.println("El descuento aplicado es: " + (precio * descuento / 100));
    }
}
