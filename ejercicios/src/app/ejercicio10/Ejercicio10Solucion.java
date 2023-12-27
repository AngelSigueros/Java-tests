package app.ejercicio10;

import javax.swing.JOptionPane;


/**
 * Lee un número por teclado que pida el precio de un producto (puede tener
 * decimales) y calcule el precio final con IVA.
 *
 * El IVA será una constante que vale 0.21
 */
public class Ejercicio10Solucion {

    private static final double IVA = 0.21;

    public static void main(String[] args) throws Exception {

        String texto = JOptionPane.showInputDialog("Introduce el precio de un producto");
        // Pasamos el String a double
        double precio = Double.parseDouble(texto);

        // Obtenemos el precio final (precio+(precio*IVA))
        double precioFinal = precio + (precio * IVA);

        System.out.println(precioFinal);
    }
}
