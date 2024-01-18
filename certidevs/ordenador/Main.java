package com.certidevs.ordenador;

public class Main {

    public static void main(String[] args) {

        // Opción 1: constructor sin parámetros
        Ordenador asus = new Ordenador();
        asus.setFabricante("ASUS");


        // Opción 2: constructor con parámetros
        Ordenador msi = new Ordenador("MSI", "Modern", 12);

        msi.setFabricante("Dell");
    }
}
