package com.company.funciones;

public class Funciones2 {

    public static void main(String[] args) {

        holaMundo("Antonio");
        holaMundo("Alberto");
        holaMundo("Juanito");
        holaMundo("Eveready");


    }

    public static String holaMundo(String nombre){
        String texto = "Hola mundo " + nombre;
        System.out.println(texto);
        return texto;
    }

}
