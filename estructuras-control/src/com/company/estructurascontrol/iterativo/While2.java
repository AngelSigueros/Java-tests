package com.company.estructurascontrol.iterativo;

public class While2 {

    public static void main(String[] args) {

/*
 1 - Crear la variable boolean para la condición de ejecución del bucle while
 2 - Crear variable contador que será modificado dentro del bucle while
 3 - Crear el bucle while
 4 - Incremento en el contador para que avance y así el bucle while pueda terminar en posteriores iteraciones
 5 - Comprobar el contador, si el contador llega a 10, cambiamos la condición del bucle while
 */

        boolean comprobacion = true;
        System.out.println(comprobacion); // true
        System.out.println(!comprobacion); // false

        int contador = 0;
        while(comprobacion){
            contador++;
            if(contador == 10){
                comprobacion = false;
            }
            System.out.println("Valor del contador " + contador);
        }
    }
}
