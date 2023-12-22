package com.atl.java;
/*
Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

Los libros de “Elige tu propia aventura” eran historias interactivas, en el que el lector
en un momento podía elegir a qué página ir. El ejercicio consiste en hacer un pequeño
cuento de este estilo. Por ejemplo:

Es una noche estrellada, te encuentras en un bosque misterioso:
1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante
2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora

El usuario escoge “2”:
Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña,
te das cuenta de que hay dos puertas:
1) Entras por la puerta de la izquierda
2) Optas por la puerta de la derecha

El usuario escoge “1”:
Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros
brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala.
Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón
lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura
con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!
 */
import java.util.Scanner;

public class EligeAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println("Se acabo tu historia");
        } else if (opcion == 2) {
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, \n" +
                    "te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros \n" +
                        "brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. \n" +
                        "Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón \n" +
                        "lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura \n" +
                        "con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");

            } else if (opcion == 2) {
                System.out.println("Se acabo tu historia");
            } else {
                System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("Opcion no valida");
        }
    }
}
