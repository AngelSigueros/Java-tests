package com.company.poo.clases;

public class Vehiculo {
    // 1. declarar atributos: estado
    public int ruedas;
    public String fabricante;
    public String modelo;
    public String color;
    public int numPuertas;
    public double precio;


    // 2. método especial: constructores
    // 2.1. constructor VACÍO: permite crear objetos pero están vacíos
    public Vehiculo(){
    }
    // 2.2 constructor CON PARÁMETROS: recibe y asigna los valores de los parámetros
    // pasamos la información de los PARÁMETROS a los ATRIBUTOS
    public Vehiculo(int ruedas,
                    String fabricante,
                    String modelo,
                    String color,
                    int numPuertas,
                    double precio){
        this.ruedas = ruedas;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.numPuertas = numPuertas;
        this.precio = precio;
    }

    // 2.3. Constructor con algunos parámetros (los más frecuentes)
    public Vehiculo(String fabricante, String modelo, double precio){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

    public Vehiculo(String modelo, int numPuertas, double precio) {
        this.modelo = modelo;
        this.numPuertas = numPuertas;
        this.precio = precio;
    }

    // 3.
    // métodos: comportamiento




    @Override
    public String toString() {
        return "Vehiculo{" +
                "ruedas=" + ruedas +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numPuertas=" + numPuertas +
                ", precio=" + precio +
                '}';
    }
}
