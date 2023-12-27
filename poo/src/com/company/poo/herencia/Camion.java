
package com.company.poo.herencia;

public class Camion extends Vehiculo{

    private Double capacidad;

    public Camion(){}

    public Camion(Double capacidad){
        this.capacidad = capacidad;
    }

    public Camion(Double capacidad, String fabricante, String matricula, Integer numRuedas){
        super(fabricante, matricula, numRuedas);
        this.capacidad = capacidad;

    }



}
