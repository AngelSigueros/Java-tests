package com.atl.java;
/*
1.Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.

2.Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
Después muestra en consola la concatenación de:
“https://twitter.com/search?q=” + palabra

3.Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono

*/
import java.util.Scanner;
public class Buscador {

    public static void main(String[] args) {

        // 1
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduce pais: ");
        String pais = scanner.nextLine();
        String url = "https://www.google.com/maps/search/";
        System.out.println(url + pais);

        // 2
        scanner = new Scanner(System.in);
        System.out.printf("Introduce Twitero: ");
        String twitero = scanner.nextLine();
        url = "https://twitter.com/search?q=";
        System.out.println(url + twitero);

        // 3
        scanner = new Scanner(System.in);
        System.out.printf("Introduce telefono: ");
        String tlf = scanner.nextLine();
        url = "https://api.whatsapp.com/send?phone=";
        System.out.println(url + tlf);
    }
}
