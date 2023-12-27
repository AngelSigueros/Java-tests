package com.company.poo.herencia;

/**
 * Clase hija o
 * Clase derivada
 * Subclase
 */
public class Motocicleta extends Vehiculo{
    private Boolean baul;
    private Boolean asientoCopiloto;

    public Motocicleta(){}

    public Motocicleta(Boolean baul, Boolean asientoCopiloto) {
        this.baul = baul;
        this.asientoCopiloto = asientoCopiloto;
    }

    // opcion 3
//    public Motocicleta(Boolean baul, Boolean asientoCopiloto, String fabricante, String matricula, Integer numRuedas) {
//        this.baul = baul;
//        this.asientoCopiloto = asientoCopiloto;
//        // atributos de la clase vehiculo
//        setFabricante(fabricante);
//        setMatricula(matricula);
//        setNumRuedas(numRuedas);
//    }

    // opcion 4
    public Motocicleta(Boolean baul, Boolean asientoCopiloto, String fabricante, String matricula, Integer numRuedas) {
        // atributos de la clase Vehiculo
        super(fabricante, matricula, numRuedas);
        // atributos de la propia clase Motocicleta
        this.baul = baul;
        this.asientoCopiloto = asientoCopiloto;


    }

    public Boolean getBaul() {
        return baul;
    }

    public void setBaul(Boolean baul) {
        this.baul = baul;
    }

    public Boolean getAsientoCopiloto() {
        return asientoCopiloto;
    }

    public void setAsientoCopiloto(Boolean asientoCopiloto) {
        this.asientoCopiloto = asientoCopiloto;
    }

    // opcion 1 - getter
//    @Override
//    public String toString() {
//        return "Motocicleta{" +
//                "baul=" + baul +
//                ", asientoCopiloto=" + asientoCopiloto +
//                ", fabricante=" + getFabricante() +
//                ", matricula=" + getMatricula() +
//                ", numRuedas=" + getNumRuedas() +
//                '}';
//    }

    // opcion 2 - super()
    @Override
    public String toString() {
        return "Motocicleta{" +
                "baul=" + baul +
                ", asientoCopiloto=" + asientoCopiloto +
                ", propiedades vehiculo: =" + super.toString() +
                '}';
    }

//        @Override
//    public String toString() {
//        return "Motocicleta{" +
//                "baul=" + baul +
//                ", asientoCopiloto=" + asientoCopiloto +
//                ", fabricante=" + super.getFabricante() +
//                ", matricula=" + super.getMatricula() +
//                ", numRuedas=" + super.getNumRuedas() +
//                '}';
//    }
}
