package app.ejercicio11;

/**
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class Ejercicio11Solucion {

    public static void main(String[] args) throws Exception {

        int num = 1;

        // Definimos el bucle, incluye el 100
        while (num <= 100) {
            System.out.println(num);
            // Incrementamos num
            num++;
        }

        System.out.println("===========");
        // ahora con un bucle for
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
}
