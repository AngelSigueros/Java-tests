package com.company.funciones;

public class Funciones0 {


    public static void main(String[] args) {

        // OPCION 1: Función no recibe nada (sin parámetros) y que no devuelva nada (void)
        imprimirHolaMundo(); // no devuelve nada porque su tipo de retorno es void
        imprimirHolaMundo(); // no recibe parámetros por eso tiene paréntesis vacíos ()
        // System.out.println(imprimirHolaMundo()); // como no duelve no puedo hacer ninguna operacion con nada

        // OPCION 2: Función no recibe nada (sin parámetros) y que sí devuelve algo (tipo de dato)
        String resultado = obtenerHolaMundo(); // si devuelve - String
        System.out.println(resultado);
        System.out.println(obtenerHolaMundo());

        // OPCION 3: Función Sí recibe algo (un parámetro) y que sí devuelve algo (tipo de dato)
        System.out.println(obtenerSaludo("Alan"));
        String saludo = obtenerSaludo("Laura"); // podemos guardar el resultado en una variable
        System.out.println(saludo);

        // OPCION 4: Función Sí recibe algo (dos parámetros) y que sí devuelve algo (tipo de dato)
        int numero1 = 5;
        int numero2 = 10;
        int resultadoSuma = suma(numero1, numero2);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

    }

    // public static de momento lo ignoramos
    // void significa que este método no devuelve nada
    // holaMundo es el nombre del método (elegido por el programador)
    // OPCION 1: Función no recibe nada (sin parámetros) y que no devuelva nada (void)
    public static void imprimirHolaMundo(){
        // codigo cualquiera
        System.out.println("Hola mundo desde método");
        System.out.println("Hasta luego");
    }

    // podemos devolver cualquier tipo de datos
    // OPCION 2: Función no recibe nada (sin parámetros) y que sí devuelve algo (tipo de dato)
    public static String obtenerHolaMundo(){
        String nombre = "Hola mundo";
        return nombre;
    }

    // OPCION 3: Función Sí recibe algo (un parámetro) y que sí devuelve algo (tipo de dato)

    public static String obtenerSaludo(String name){
        return "Hola querido amigo/a " + name;
    }

    // OPCION 4: Función Sí recibe algo (dos parámetros) y que sí devuelve algo (tipo de dato)
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }


}
