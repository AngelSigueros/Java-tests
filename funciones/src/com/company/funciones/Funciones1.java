package com.company.funciones;

public class Funciones1 {

    // metodo main
    public static void main(String[] args) {


         calcularIva(5.5);
        calcularIva(20);
        calcularIva(100);
    }

    // metodo calcularIva
    // void indica que no devuelve nada
    public static void calcularIva(double numero){
        double resultado = numero + numero * 0.21;
        System.out.println("El número " + numero +" con IVA es: " + resultado + " euros (€)");
    }
}
