package com.certidevs.excepciones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        double resultado1 = dividir(10, 5);
        int longitud = mostrarLongitud("Que longitud tengo?");
        leerArchivo();
        try {
            lanzarExceptionPersonalizada();
        } catch (MiException e) {
            throw new RuntimeException(e);
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

    public static void lanzarExceptionPersonalizada() throws MiException {
        throw new MiException("Error mio");
    }

    private static class MiException extends Throwable {
        public MiException(String errorMio) {
            System.out.println(errorMio);
        }
    }
}