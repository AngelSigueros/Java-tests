package com.company.estructurasdatos.arrays;

public class Main4 {

    public static void main(String[] args) {

        // 1. Crear un array
        double[] array = {5.99, 4.99, 20.33, 54.78, 112.3}; // length es igual a 5


        // 2. Iterar sobre el array utilizando un bucle for
        // Sumar todos los números del array y guardar el resultado en una variable

        double variable = 0;
        for(int i = 0; i < array.length; i++){
            // variable = variable + array[i];
            variable += array[i];
            System.out.println(variable);
        }
        System.out.println("El resultado final es: " + variable);

        // Concatenar nombres utilizando un bucle
        String[] motes = {"Nombre1", "Nombre2", "Nombre3"}; // motes.length es 3
        // Crear una cadena de texto que contenga todos los nombres que hay en el array
        // separados por un espacio

        String moteFinal = "";

        // motes.length // 7
        // 0 1 2 3 4 5 6
        // length - 1
        // 7 - 1
        // 6
        for(int i = 0; i < motes.length; i++){

            // Opción 1 (fácil). Con espacio al comienzo
//            if(i == 0){ // la primera posición
//                moteFinal += motes[i];
//            }else{
//                moteFinal += " " + motes[i]; // principio
//            }

            // Opción 2 (un poco más difícil). Con espacio al final (al revés al caso anterior)
            if(i == motes.length - 1){ // la ultima posición
                moteFinal += motes[i];
            }else{
                moteFinal += motes[i] + " "; // al final
            }

        }
        System.out.println(moteFinal);


        // 3. Iterar sobre el array utilizando un bucle while




        /*
          contador    array.length
          0             5
          1             5
          2             5
          3             5
          4             5
          5     <        5 NO SE EJECUTA PORQUE 5 NO ES MENOR QUE 5
          5     !=        5 NO SE EJECUTA PORQUE 5 NO ES DISTINTO QUE 5
         */
//        while(contador != array.length){ // 5
        int contador = 0;
        double sumatorio = 0;

        while(contador < array.length){ // 5
            System.out.println(array[contador]);
            sumatorio += array[contador];
            contador++;
        }

        System.out.println("El resultado final es: " + sumatorio);

        // Crear bucle infinito y salir con break

        int contador2 = 0;
        double sumatorio2 = 0;
        double multiplicador = 1; // cuidado no empezar en 0
        while(true){
            System.out.println("Hola desde bucle infinito");

            // Si contador2 llega a la longitud del array entonces romper el bucle
            if(contador2 == array.length) // Si solo hay una línea de código dentro de if entonces podemos no poner llaves { }
                break; // rompe el flujo de ejecución: sale del bucle

            sumatorio2 += array[contador2];
            multiplicador *= array[contador2];

            contador2++;
        }
        // 5.99, 4.99, 20.33, 54.78, 112.3
        System.out.println("El resultado final de sumar todos los numeros es: " + sumatorio2); // 198.39
        System.out.println("El resultado final de multiplicar todos los numeros es: " + multiplicador); // 3738234.4102750025
        System.out.println("El resultado final de multiplicar todos los numeros es: " + (int) multiplicador); // 3738234.4102750025


        // no se ejecuta nunca porque siempre es falso
//        while(!true){ // false
//            System.out.println("dsfdf");
//        }




    }
}
