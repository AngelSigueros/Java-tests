package com.company.funciones;

/**
 * Podemos invocar una función desde otra clase
 */
public class InvocarFunciones {

    public static void main(String[] args) {

        // Podemos invocar una función que está en otro archivo
        Funciones0.imprimirHolaMundo();
        int resultado = Funciones0.suma(1000, 500);
        System.out.println(resultado);

        // El número y tipo de parámetros que enviamos debe coincidir con los que recibe la función
        holaEjemplo("ddff", "dsfdfsgsfd", "sdfsf");

        System.out.println("dsfsdf");

        if(false){
            holaEjemplo("hola", "dsfdfsgsfd", "sdfsf");

        }

    }
    public static void holaEjemplo(String name, String otro, String ddsdsddsd){

        if(true){
            System.out.println("verdadero!!!");
        }
    }
}
