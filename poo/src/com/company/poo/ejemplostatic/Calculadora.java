package com.company.poo.ejemplostatic;

public class Calculadora {
    public static final int IVA = 21;

    // 1. atributos

    //2. constructores

    // 3. metodos
    // static indica que el método pertenece a la clase y no a los objetos
    // se puede invocar el método sin crear un objeto
    public static int suma(int num1, int num2){
        return num1 + num2 + IVA;
    }
}
