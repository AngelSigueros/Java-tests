package com.certidevs.excepciones;

public class Main1 {

    public static void main(String[] args) {


        try {
            int resultado = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("División incorrecta");
        }
//        try {
//            int resultado = 5 / 0;
//        } catch (IndexOutOfBoundsException e) { // Excepción diferente, no la captura
//            System.out.println("División incorrecta");
//        }
        try {
            int resultado = 5 / 0;
        } catch (Exception e) { // Polimorfismo
            System.out.println("División incorrecta");
        }

        System.out.println("Continuamos");
    }
}
