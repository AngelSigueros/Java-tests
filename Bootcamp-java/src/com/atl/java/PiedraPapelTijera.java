package com.atl.java;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras"
contra la computadora. El programa debe solicitar al usuario que ingrese su elección
(piedra, papel o tijeras) y luego generar una elección aleatoria para la computadora.
Después de eso, el programa debe determinar el ganador según las reglas del juego y
mostrar el resultado.
 */
public class PiedraPapelTijera {

    public static void main(String[] args) {

        ArrayList<String> opcion = new ArrayList<>();
        opcion.add("piedra");
        opcion.add("papel");
        opcion.add("tijera");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Escoje piedra, papel o tijera? ");
        String elegidoUsuario = scanner.nextLine();
        System.out.println(elegidoUsuario);
        String elegidoComputador = opcion.get((int)(Math.random() * 3));
        System.out.println(elegidoComputador);

        if (elegidoUsuario.equals(elegidoComputador)) {
            System.out.println("Empate!");
        } else if (elegidoUsuario.equals("piedra") && elegidoComputador.equals("papel")) {
            System.out.println("Gana compu!");
        } else if (elegidoUsuario.equals("piedra") && elegidoComputador.equals("tijera")) {
            System.out.println("Gana usuario!");
        } else if (elegidoUsuario.equals("papel") && elegidoComputador.equals("tijera")) {
            System.out.println("Gana compu!");
        } else if (elegidoUsuario.equals("papel") && elegidoComputador.equals("piedra")) {
            System.out.println("Gana usuario!");
        } else if (elegidoUsuario.equals("tijera") && elegidoComputador.equals("papel")) {
            System.out.println("Gana usuario!");
        } else if (elegidoUsuario.equals("tijera") && elegidoComputador.equals("piedra")) {
            System.out.println("Gana compu!");
        }

    }


}
