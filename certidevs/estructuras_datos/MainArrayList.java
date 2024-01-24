package com.certidevs.estructuras_datos;

import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {


        // No recomendable
        ArrayList cosas = new ArrayList();
        cosas.add("producto1");
        cosas.add("producto2");
        cosas.add(50.4);
        cosas.add(true);

        // Recomendable
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Hola");
        frases.add("Adios");
        frases.add("Parce");
        frases.add("Silvia");
        boolean adiosIsContained = frases.contains("Adios");
        System.out.println(adiosIsContained);
        System.out.println(frases.size()); // tamaño del arrayList

        // Los tipos primitivos no son válidos, hay usar sus clases envoltorio:
        // Double, Float, Integer, Character, Boolean
        ArrayList<Double> precios = new ArrayList<>();
        int numero = 4;
        precios.add((double) numero);
        precios.add(5.99);
        precios.add(7.99);
        precios.add(8.99);

        ArrayList<Character> abecedario = new ArrayList<>();
        abecedario.add('a');
        abecedario.add('b');
        abecedario.add('c');
        System.out.println(abecedario.size());
        System.out.println(abecedario.getFirst());

        ArrayList<Producto> productos = new ArrayList<>();
        Producto tvSamsung = new Producto("televisor", 500.0);
        productos.add(tvSamsung);
        productos.add(new Producto("silla", 400.0));
        productos.add(new Producto("ordenador", 700.0));




    }
}
