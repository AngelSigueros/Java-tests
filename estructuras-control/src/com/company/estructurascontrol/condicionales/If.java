package com.company.estructurascontrol.condicionales;

public class If {

    public static void main(String[] args) {

        boolean verdadero = true;
        boolean falso = false;

        // 1. COMPROBAR SI UNA EXPRESIÓN ES VERDADERA

        if(verdadero) {
            System.out.println("Hola gente!");
        }

        boolean resultado = 5 > 10;
        boolean resultado2 = 50 == 50;

        if(resultado){
            System.out.println("Este código no se ejecuta porque la condición es falsa");
        }

        // 2. COMPROBAR SI ES FALSO: se utiliza el símbolo ! delante de la variable que queremos invertir

        if(!resultado){

        }

        boolean resultado3 = 50 != 50; // false
        System.out.println(resultado3);
    }
}
