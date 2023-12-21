package com.company.funciones;

public class Sobreescritura {

    /**
     * 1 - Orden secuencial, si hay un salto a un método se ejecuta el método y luego se vuelve a donde se llamó al método
     * 2 - Si la función sobreescribe una variable, la variable mantiene su valor original dentro de la función anterior
     * @param args
     */
    public static void main(String[] args) {

        String titulo = "Los vengadores";
        imprimirTitulo(titulo);


        System.out.println(titulo); // 3 - Los vengadores
    }

    public static void imprimirTitulo(String titulo) {

        System.out.println(titulo); // 1 - Los vengadores
        titulo = "Spiderman";
        System.out.println(titulo); // 2 - Spiderman

    }
}
