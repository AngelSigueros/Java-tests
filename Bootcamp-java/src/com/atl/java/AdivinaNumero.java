package com.atl.java;
/*
Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/
import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) Math.round(Math.random() * 100 + 1);
        System.out.printf("Introduce numero: ");
        int numero = scanner.nextInt();
        if (numero == numeroAleatorio)
            System.out.println("Adivinado!");
        else
            System.out.println("Fallaste! El numero era: " + numeroAleatorio);


    }
}
