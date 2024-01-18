package com.certidevs.encapsulacion;

/*
Clase de constantes y métodos de utilidad
 */
public class Constantes {

    // constante
    public static final double PRECIO_DIESEL = 1.33;
    public static final double IVA = 1.21;
    private static String MENSAJE = "Calculando precio";

    // métodos static
    public static double calcularCombustible(){
        System.out.println(MENSAJE);
        return PRECIO_DIESEL * IVA;
    }

    // Constructor privado para evitar instanciar esta clase
    private Constantes() {}


}
