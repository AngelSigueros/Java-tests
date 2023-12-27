package com.company.poo.clases;

import java.util.Arrays;

public class Coche {

    // 1. atributos (estado)
    public String fabricante;
    public String modelo;
    public double precio;
    public int caballos;
    public String[] extras;
    public TipoCoche tipo;
    public int velocidad;

    // 2. constructores
    // Constructor vacío
    public Coche(){
    }

    // Constructor con todos los parámetros


    public Coche(String fabricante, String modelo, double precio, int caballos, String[] extras, TipoCoche tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.caballos = caballos;
        this.extras = extras;
        this.tipo = tipo;
    }

    public Coche(String fabricante, String modelo){

        // this.atributo = parametro;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    // 3. métodos (comportamiento)
    public void acelerar(int cantidad){
        // sumar parametro cantidad al atributo velocidad
        System.out.println("Incrementando la velocidad en " + cantidad + " KM/H.");

        if(cantidad <= 0){ // limite inferior
            this.velocidad = 0;
        } else if (this.velocidad + cantidad > 120){ // limite superior
            this.velocidad = 120;
        } else {
            this.velocidad += cantidad;
        }
    }

    public void frenar(int cantidad){
        System.out.println("Decrementando la velocidad en " + cantidad + " KM/H.");
        this.velocidad -= cantidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", caballos=" + caballos +
                ", extras=" + Arrays.toString(extras) +
                ", tipo=" + tipo +
                ", velocidad=" + velocidad +
                '}';
    }
}
