package app.ejercicio4;

import java.util.Scanner;
/**
 * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos
 * introducir (recuerda usar Scanner).
 */
public class Ejercicio4Solucion {

    public static void main(String[] args) throws Exception {

        //Nos aparece un cuadro de dialogo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();

        System.out.println("Bienvenido "+nombre);
        sc.close();

    }
}
