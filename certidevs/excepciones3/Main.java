package com.certidevs.excepciones3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        try {
            double resultado1 = dividir(10, 5);
        } catch (ArithmeticException e) {
            System.out.println("Error de división");
        }
        try {
            int longitud = mostrarLongitud("Hola mundo");
        } catch (NullPointerException e) {
            System.out.println("El string no puede estar vacío");
        }
        leerArchivo();
        try {
            lanzarExcepcionPersonalizada();
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Excepción personalizada");
        }
    }
    public static double dividir(int num1, int num2) {
        if (num2 == 0)
            throw new ArithmeticException("No se puede dividir entre 0.");

        return num1 / num2;
    }
    public static int mostrarLongitud(String texto) {
        if (texto == null)
            throw new NullPointerException("Argumento nulo");

        return texto.length();
    }
    public static void leerArchivo() {
        try {
            Path path = Paths.get("/home/user/documentos/miArchivo.txt");
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) { // checked exception
            e.printStackTrace();
        }
    }
    public static void lanzarExcepcionPersonalizada() {
        if (true)
            throw new ExcepcionPersonalizada("Mensaje");
    }
}
