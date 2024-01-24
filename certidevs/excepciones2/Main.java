package com.certidevs.excepciones2;

import java.util.Scanner;

public class Main {

    /*
    CREAR EXCEPCIONES PROPIAS PERSONALIZADAS
     */
//    public static void main(String[] args) throws IncorrectNameLengthException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un nombre de más de 2 letras:");
        String nombre = scanner.nextLine();

        // comprobar con if y si es menor o igual que 2 entonces lanzar una excepción ficticia
        if (nombre.length() <= 2)
            throw new IncorrectNameLengthException("Longitud mínima de nombre incorrecta");
    }
}
