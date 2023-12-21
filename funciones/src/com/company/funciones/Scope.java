package com.company.funciones;

public class Scope {

    public static void main(String[] args) {

        String nombre = "Alan";

        System.out.println(nombre);

        // 1. Enviamos una variable como parametro para que la otra funcion pueda acceder a la misma
        otraFuncion(nombre);

        // 2. Si la variable se crea dentro del if, entonces solo es visible dentro del if
        // por tanto si queremos que sea visible fuera del if entonces la declaramos/inicializamos antes
        String apellido = "";
        if (5 < 10) {
            apellido = "";
        }
        System.out.println(apellido);

    }


    public static void otraFuncion(String nombre){

        System.out.println("Hola mundo");

        System.out.println(nombre);

    }

    public static void otraFuncion2(){
        String nombre = "Otro nombre";
        System.out.println(nombre);
    }
}
