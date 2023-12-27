package com.company.poo.herencia;

/**
 * Clase Base o
 * Clase padre o
 * Super clase
 */
public class Vehiculo {

    private String fabricante;
    private String matricula;
    private Integer numRuedas;

    public Vehiculo(){}

    public Vehiculo(String fabricante, String matricula, Integer numRuedas) {
        this.fabricante = fabricante;
        this.matricula = matricula;
        this.numRuedas = numRuedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(Integer numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", matricula='" + matricula + '\'' +
                ", numRuedas=" + numRuedas +
                '}';
    }
}
