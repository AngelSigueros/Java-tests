package app.ejercicio9;

import java.util.Scanner;

/**
 * Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un
 * carácter (char) y muestre su código en la tabla ASCII.
 */
public class Ejercicio9Solucion {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);

        // Pasamos el caracter a codigo
        int codigo = (int) caracter;

        System.out.println(codigo);
        sc.close();
    }
}
