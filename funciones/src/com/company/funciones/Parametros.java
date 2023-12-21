package com.company.funciones;

public class Parametros {

    public static void main(String[] args) {

        // caso 1
        String nombre = "Alan";
        imprimirNombre(nombre);

        // caso 2
        imprimirNombre("Gonzalo");

        // caso 3
        String nombreIngles = "Mike";
        imprimirNombre(nombreIngles);

        // caso 4
        imprimirNombreCompleto("Juan", "Perez");

    }

    public static void imprimirNombre(String name){
        System.out.println("El nombre a imprimir es: " + name);
    }

    public static void imprimirNombreCompleto(String nombre, String apellido){
        System.out.println("Hola " + nombre + " " + apellido);

    }
}
