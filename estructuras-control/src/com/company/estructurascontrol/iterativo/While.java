package com.company.estructurascontrol.iterativo;

/**
 * Tipo de bucle indeterminado
 */
public class While {

    public static void main(String[] args) {

        int numero = 10;

        while(numero < 100){
            System.out.println("valor de numero: " + numero);
            numero++;
        }
        System.out.println("================================================");
        System.out.println("valor de numero: " + numero);

        System.out.println("fin");
    }
}
