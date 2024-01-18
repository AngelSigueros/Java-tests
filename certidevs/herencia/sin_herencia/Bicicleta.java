package com.certidevs.herencia.sin_herencia;

public class Bicicleta {

    // Clean code problema: estás duplicando atributos de Vehiculo
    private String fabricante;
    private String modelo;
    private int numRuedas;
    private String materiales;
    private boolean suspensionDelantera;
    private boolean suspensionTrasera;

    // constructores

    public Bicicleta(String fabricante, String modelo, int numRuedas, String materiales, boolean suspensionDelantera, boolean suspensionTrasera) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
        this.materiales = materiales;
        this.suspensionDelantera = suspensionDelantera;
        this.suspensionTrasera = suspensionTrasera;
    }


    // getter y setter


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public boolean isSuspensionDelantera() {
        return suspensionDelantera;
    }

    public void setSuspensionDelantera(boolean suspensionDelantera) {
        this.suspensionDelantera = suspensionDelantera;
    }

    public boolean isSuspensionTrasera() {
        return suspensionTrasera;
    }

    public void setSuspensionTrasera(boolean suspensionTrasera) {
        this.suspensionTrasera = suspensionTrasera;
    }
}
