package com.company.poo.string;


/**
 * Métodos de la clase String
 *
 * Operaciones sobre textos
 */
public class StringMain {

    public static void main(String[] args) {

        String mensaje = "Hola mundo";

        // convertir texto a mayúsculas
        System.out.println(mensaje.toUpperCase());

        // convertir texto a minúsculas
        System.out.println(mensaje.toLowerCase());

        // obtener longitud de un string
        System.out.println(mensaje.length());

        // comprobar si un String está vacío
        System.out.println(mensaje.isEmpty());

        String espacios = "  ";
        // comprueba si el string tiene longitud 0
        System.out.println(espacios.isEmpty()); // false
        // comprueba si el string está en blanco, los espacios no cuentan no cuentan como caracteres
        System.out.println(espacios.isBlank()); // true

        // comprar si un texto es igual a otro
        System.out.println(mensaje.equals("hola mundo")); // false
        System.out.println(mensaje.equalsIgnoreCase("hola mundo")); // true

        // comprobar si un texto empieza por o termina por
        System.out.println(mensaje.startsWith("Hola")); // true
        System.out.println(mensaje.startsWith("mundo")); // false
        System.out.println(mensaje.endsWith("Hola")); // false
        System.out.println(mensaje.endsWith("mundo")); // true

        // comprobar si un texto contiene otro texto
        System.out.println(mensaje.contains("ola mun")); // true
        System.out.println(mensaje.contains("Hola mundo")); // true

        // charAt permite acceder a una caracter del String en base a su índice (posición empezando en 0)
        // Hola mundo
        char caracter = mensaje.charAt(5);
        System.out.println(caracter);
        System.out.println(mensaje.charAt(9));
        System.out.println(mensaje.charAt(mensaje.length() - 1));

        // concatenar texto
        System.out.println(mensaje.concat(" y adiós!"));
        System.out.println(mensaje + " y adiós!");

        // encontrar el índice (posición empezando en 0) de un determinado caracter
        int index = mensaje.indexOf('m');
        System.out.println(index);

        // reemplazar un texto por otro
        String texto = "Soy Juan bienvenidos a la casa de Juan.";
        texto = texto.replaceAll("Juan", "Alberto");
        System.out.println(texto);

        // separar un texto en textos más pequeños
        String frase = "Rodolfito Cadorna Gandolfi Adalberto";
        String[] palabras = frase.split(" ");
        for(String palabra : palabras){
            System.out.println(palabra);
        }
    }
}
