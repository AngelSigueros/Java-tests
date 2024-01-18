package com.certidevs.encapsulacion;

public class ConstantesMain {
    public static void main(String[] args) {

        // Uso de la clase Constantes static:

        System.out.println(Constantes.PRECIO_DIESEL);
        System.out.println(Constantes.calcularCombustible());
        System.out.println(Constantes.IVA);
        // Constantes.IVA = 1.23; // no se puede cambiar constante

        // Intentar crear un objeto:
        // como el constructor es private no se puede instanciar
        // Constantes constantes = new Constantes();

    }
}
