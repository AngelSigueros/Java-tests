package com.company.estructurascontrol.condicionales;

public class IfAnidados {

    public static void main(String[] args) {

        // IF ANIDADOS: cuando tenemos un if dentro de otro if

        // caso numero1 = 5
        // caso numero1 = 11
        // caso numero1 = 0

        int numero1 = 0;
        int numero2 = 10;

        if(numero1 > 0){ // falsa
            System.out.println("5 es mayor que 0 verdadero");

            // if anidado
            if(numero1 < 10){
                System.out.println("5 es menor que 10 verdadero");

            }
        }



        System.out.println("fin del programa");
    }
}
