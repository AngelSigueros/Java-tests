package app.ejercicio5;

import javax.swing.JOptionPane;


/**
 * 5) Modifica la aplicación anterior, para que nos pida el nombre que queremos
 * introducir (recuerda usar JOptionPane).
 */
public class Ejercicio5Solucion {

    public static void main(String[] args) throws Exception {

        //Nos aparece un cuadro de dialogo
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");

        System.out.println("Bienvenido "+nombre);
    }
}
