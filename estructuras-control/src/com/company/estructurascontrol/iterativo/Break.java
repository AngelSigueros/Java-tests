package com.company.estructurascontrol.iterativo;

/**
 * Palabra reservada que sirve para romper el flujo de ejecución (sale de la estructura de control):
 * for
 * while
 * switch
 */
public class Break {

    public static void main(String[] args) {

        /*
        Supongamos que tenemos una estructura de datos, un array de DNIs,
        iteramos sobre el array para buscar un DNI en concreto.
        Si lo encontramos entonces salimos del bucle, no seguimos iterando.
         */
        for(int i = 0; i < 10; i++){
            System.out.println("Valor de i: " + i);
            if (i == 4){
                break;
            }
        }
        System.out.println("================================");

        int contador = 0;

        while(true){

            contador++;

            if (contador == 20){
                break;
            }
            System.out.println("Valor de contador " + contador);

        }


        System.out.println("fin del programa");


    }
}
