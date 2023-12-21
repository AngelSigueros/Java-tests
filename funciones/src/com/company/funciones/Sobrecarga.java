package com.company.funciones;

/**
 * Clase para demostrar la técnica de sobrecarga de funciones
 *
 * Crear funciones con el mismo nombre pero diferente número/tipo de parámetros
 *
 * Tener múltiples versiones de una misma función pero cada una con diferentes parámetros
 */
public class Sobrecarga {

    public static void main(String[] args) {

        // multiples versiones de una misma funcion: sobrecarga

        String nombre = "";


        imprimirSaludo();
        imprimirSaludo("Juanito");
        imprimirSaludo(13456);
        imprimirSaludo("Juanito", "García");



        imprimirSaludo("sdsd", "dfdf");



    }

    /**
     * Función que imprime un saludo genérico
     */
    public static void imprimirSaludo(){
        System.out.println("Hola buenas!");
    }

    /**
     * Función que imprime un saludo personalizado por nombre
     * @param nombre - El nombre a incluir en el saludo
     */
    public static void imprimirSaludo(String nombre){
        System.out.println("Hola buenas, bienvenido/a " + nombre);
    }


    /**
     * Función que imprime un saludo personalizado por id
     * @param id - El id a incluir en el saludo
     */
    public static void imprimirSaludo(int id){
        System.out.println("Hola buenas, bienvenido/a usuario numero" + id);
    }

    /**
     * Función que imprime un saludo personalizado por nombre y apellido
     * @param nombre - El nombre a incluir en el saludo
     * @param apellido - El apellido a incluir en el saludo
     */
    public static void imprimirSaludo(String nombre, String apellido){
        System.out.println("Hola buenas, bienvenido/a " + nombre + " " + apellido);
    }
}
