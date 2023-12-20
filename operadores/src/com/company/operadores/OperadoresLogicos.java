package com.company.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 10;

        // 1. Mayor que
        boolean resultado1 = numero1 > numero2; // false
        // mayor o igual que
        boolean resultado2 = numero1 >= numero2; // true
        System.out.println(resultado1);
        System.out.println(resultado2);

        // 2. Menor que
        boolean resultado3 = numero1 < numero2; // false
        // Menor o igual que
        boolean resultado4 = numero1 <= numero2; // true

        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println("resultado1: " + resultado1 + ", resultado2: " + resultado2);

        boolean resultado5 = 5 >= 5.0;
        System.out.println(resultado5);

        // 3. == igualdad
        boolean resultado6 = 5 == 5.0;
        System.out.println("5 == 5.0 " + resultado6);

        boolean resultado7 = 5 == 10;
        System.out.println("5 == 10 " + resultado7);

        // 4. != distinto
        boolean resultado8 = 5 != 10;
        System.out.println("5 != 10 " + resultado8); // verdadero

        boolean resultado9 = 5 != 5;
        System.out.println("5 != 5 " + resultado9); // falso

        // 5. Múltiples condiciones:
        // && conjunción "y" (AND)
        // obliga a que todas las condiciones sean true para que el resultado final sea true

        boolean resultado10 = 5 < 10 && 10 < 20; // true y true = true
        System.out.println("5 < 10 && 10 < 20 " + resultado10);

        boolean resultado11 = 10 < 10 && 10 < 20; // false y true = false
        System.out.println("10 < 10 && 10 < 20 " + resultado11);

        boolean resultado12 = 10 < 20 && 50 <= 100 && 10 < 10; // true && true && false = false
        System.out.println("10 < 20 && 50 <= 100 && 10 < 10 " + resultado12);


        // 6. || conjunción "o" (OR)
        // con que una de las condiciones sea true entonces el resultado final es true
        boolean resultado13 = 5 < 10 || 20 < 20; // true o false = true
        System.out.println(" 5 < 10 || 20 < 20 " + resultado13);

        boolean resultado14 = 5 < 5 || 50 <= 100 || 10 < 10; // false || true || false = true
        System.out.println(resultado14);

        // 7. Combinar && (AND) y || (OR)
        boolean resultado15 = 5 < 5 || 50 <= 100 && 10 < 10;
        // de izq a der
        // 1. false || true && false
        // 2. true && false
        // 3. false
        System.out.println(resultado15);

        boolean resultado16 = 5 < 5 || (50 <= 100 && 10 < 10);
        // 1. false || (true && false)
        // 2. false || false
        // 3. false
        System.out.println(resultado16);







    }
}
