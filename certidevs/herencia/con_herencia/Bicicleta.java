package com.certidevs.herencia.con_herencia;

// Heredar de la clase Vehiculo
public class Bicicleta extends Vehiculo {

    // AUTOMATICAMENTE HEREDA fabricante, modelo, numRuedas
    private String materiales;
    private boolean suspensionDelantera;
    private boolean suspensionTrasera;

    // CONSTRUCTORES

    // constructor vacío
    public Bicicleta() {
    }

    // constructor con todos los parámetros: 3 vehiculo + 3 bicicleta = 6


    public Bicicleta(String fabricante, String modelo, int numRuedas, String materiales, boolean suspensionDelantera, boolean suspensionTrasera) {
        super(fabricante, modelo, numRuedas); // 3 parámetros para el constructor Vehiculo con parámetros
        System.out.println("Bicicleta constructor 6 params");
        // super palabra reservada para acceder a elementos de la clase superior

        // 3 parámetros para Bicicleta
        this.materiales = materiales;
        this.suspensionDelantera = suspensionDelantera;
        this.suspensionTrasera = suspensionTrasera;
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
