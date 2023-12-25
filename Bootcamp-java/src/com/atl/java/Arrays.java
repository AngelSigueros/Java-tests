package com.atl.java;

import java.util.Scanner;

/*
Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el
usuario agregó 5 números.

 */
public class Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Inreoduce 5 numeros");
        for (int i=0; i<numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] > mayor)
                mayor = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];
        }
        System.out.println(mayor +" "+ menor);

        float media = 0;
        for (int i=0; i<numeros.length; i++) {
            media += numeros[i];
        }
        System.out.println(media/ numeros.length);
    }
}
