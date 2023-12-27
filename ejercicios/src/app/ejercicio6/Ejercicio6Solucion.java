package app.ejercicio6;
import java.util.Scanner;

/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2).
 *
 * El radio se pedirá por teclado (recuerda pasar de String a double con
 * Double.parseDouble).
 *
 * Usa la constante PI y el método pow de Math.
 */
public class Ejercicio6Solucion {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        double radio = sc.nextDouble();

        // Formula area circulo, usamos algunos de los metodos de Math
        // No hace falta importar Math porque está en el paquete java.lang y ese paquete está importado por defecto
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es " + area);
        sc.close();
    }
}
