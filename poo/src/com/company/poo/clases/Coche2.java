package com.company.poo.clases;

public class Coche2 {

   private String fabricante;
   private String modelo;
   private double precio;


    public Coche2() {
    }

    public Coche2(String fabricante) {
        this.fabricante = fabricante;
    }

    public Coche2(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche2{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
