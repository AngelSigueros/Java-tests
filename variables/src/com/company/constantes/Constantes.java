package com.company.constantes;

/**
 * Una constante es una variable pero que no cambia de valor, es decir,
 * no se le puede asignar un nuevo valor.
 *
 * - Favorecen la lectura en operaciones
 * - Pueden ser de cualquier tipo de datos
 * - Se crean poniendo el modificador final delante del tipo.
 */
public class Constantes {

    public static final double IVA = 0.21;
    static final double IRPF = 0.15;
    static final int ENERO = 1;
    static final String LUNES = "Monday";

    static void main(String[] args) {

        double iva = 0.21;
        iva = 0.23;


        int currentMonth = 1;
        if(currentMonth == ENERO) {
            System.out.println("Estamos en enero");
        }


        double precioMesa = 99.99;
        double precioMesaIVA = precioMesa + precioMesa * IVA;

        double precioBotella = 5.99;
        double precioBotellaIVA = precioBotella + precioBotella * IVA;

        calcularIVAProducto(precioBotella);

    }

    static double calcularIVAProducto(double precio){
        double resultado = precio * IVA * IRPF;
        return resultado;
    }
}
