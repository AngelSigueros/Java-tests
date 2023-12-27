package com.company.poo.scanner;

import java.util.Scanner;

/**
 * La clase Scanner permite leer datos introducidos a través de la consola
 */
public class ScannerMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // opcion 1 leer los datos de uno en uno
        System.out.println("Introduce un nombre");
        String nombre = scanner.next();

        System.out.println("Introduce un apellido");
        String apellido = scanner.next();

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        System.out.println("Introduce tu salario");
        double salario = scanner.nextDouble();

        System.out.println("¿Tu estado civil es casado?");
        boolean casado = scanner.nextBoolean();



        System.out.println("Hola " + nombre + " " + apellido + " de " + edad + " edad" + " y salario" + salario);

        // opcion 2 leer los datos con un bucle
//        while(scanner.hasNext()){
//            String dato = scanner.next();
//            System.out.println(dato);
//            if(dato.equals("salir"))
//                break;
//        }



        System.out.println("fin del programa");
        scanner.close();
    }
}
