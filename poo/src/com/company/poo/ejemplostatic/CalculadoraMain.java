package com.company.poo.ejemplostatic;

public class CalculadoraMain {


    public static void main(String[] args) {

        // sin static - sí necesitamos crear un objeto de la clase Calculadora
//        Calculadora calculadora = new Calculadora();
//        int resultado = calculadora.suma(5,5);

        // con static - no necesitamos crear un objeto de la clase Calculadora
        int resultado = Calculadora.suma(5,5);
        System.out.println(resultado);
        System.out.println(Calculadora.IVA);
    }
}
