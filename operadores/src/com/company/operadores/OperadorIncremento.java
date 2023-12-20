package com.company.operadores;

public class OperadorIncremento {

    public static void main(String[] args) {

        int numero = 5;

        // 1. OPERADOR INCREMENTO (++): suma 1 al número sobre el que se aplica
        // numero = numero + 1;
        // numero += 1;
        numero++; // 5 + 1 = 6

        System.out.println(numero);


        // 2. OPERADOR DECREMENTO (--): resta 1 al número sobre el que se aplica

        // numero = numero - 1;
        // numero -= 1;
        numero--; // 6 - 1 = 5

        System.out.println(numero);


        int numero2 = 5;

        numero2++; // 5 + 1 = 6
        System.out.println(numero2);

        ++numero2; // 1 + 6 = 7
        System.out.println(numero2);


        int num1 = 34;
        int num2 = ++num1; // primero incrementa y luego asigna. OK
        System.out.println("num2 " + num2);

        // Cuidado!
        int num3 = 34;
        int num4 = num3++; // primero asigna y luego incrementa. NO OK
        System.out.println(num4);


    }
}
