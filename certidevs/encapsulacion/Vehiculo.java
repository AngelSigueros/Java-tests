package com.certidevs.encapsulacion;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    // atributos
    private String modelo;
    private int velocidad;
    private double peso;



    // constructores
    public Vehiculo() {}

    public Vehiculo(String modelo, int velocidad, double peso) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.peso = peso;
    }
    private List<String> modelosDisponibles = List.of(
            "BMW",
            "Mercedes",
            "Audi"
    );
    // métodos getter y setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) { // Mercedes AMG 63
        // bucle for que itere sobre modelosDisponibles
        if (!estaMotorCorrecto()) // evaluar una condicion antes de proceder
            return; // Si el motor no está correcto hacer return para salir

        for (String modeloDisponible: modelosDisponibles) {
            if (modelo.contains(modeloDisponible)){ // Mercedes AMG 63 contiene la palabra Mercedes
                this.modelo = modelo;
                break;
            }
        }
    }
    /*
    Creamos métodos privados para delegar en ellos cierto comportamiento
    que forma parte de un proceso más proceso más grande
     */
    private boolean estaMotorCorrecto() {
        return true;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {

            if( velocidad >= 0 && velocidad <= 120)
                this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", peso=" + peso +
                '}';
    }
}
