package com.certidevs.excepciones;

import java.util.NoSuchElementException;

public class Main4 {

    /**
     *
     * UNCHECKED EXCEPTIONS - se lanzan con throw y no es necesario indicar en el método un throws
     * Todas aquellas excepciones que heredan (hijas) de RuntimeException
     */
    public static void main(String[] args) {

        try {
            findProductById(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Id incorrecto");
        }

        try {
            findProductById(10);
        } catch (NoSuchElementException e) {
            System.out.println("Producto no encontrado.");
        }
    }
    // La palabra throw permite lanzar un objeto excepción
    // una excepción es un objeto de una de las clases Exception
    public static Producto findProductById(int id) {
        if(id <= 0) // si el id es 0 o negativo entonces no buscamos el producto
            throw new IllegalArgumentException(); // unchecked no obliga a declararla en la signatura del método

        // .... realizar búsqueda de producto ......

        // simulamos que no hemos encontrado el producto y devolvemos una excepcion
        throw new NoSuchElementException(); // unchecked no obliga a declararla en la signatura del método
    }
}

class Producto {

}