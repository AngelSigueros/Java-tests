package com.company.reto;

public class CertiDevs {

    public static void main(String[] args) {

        int i = 1;
        int n=20;
        int suma = 0;

        while (i <= n) {
            suma += i;
            i++;
        }
        System.out.println("La suma de los primeros " + n + " números enteros es " + suma);

        System.out.println(factorial(6));
    }

    public static int factorial(int a) {
        int factorial=1;
        for (int i=1; i<=a; i++)
            factorial*= i;
        return factorial;
    }

    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
