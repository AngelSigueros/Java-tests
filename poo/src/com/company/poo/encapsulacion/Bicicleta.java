package com.company.poo.encapsulacion;

public class Bicicleta {

    // 1. atributos encapsulados
    private String fabricante;
    private String material;
    private Boolean patines;

    public Bicicleta() {
    }

    public Bicicleta(String fabricante, String material, Boolean patines) {
        this.fabricante = fabricante;
        this.material = material;
        this.patines = patines;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Boolean getPatines() {
        return patines;
    }

    public void setPatines(Boolean patines) {
        this.patines = patines;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "fabricante='" + fabricante + '\'' +
                ", material='" + material + '\'' +
                ", patines=" + patines +
                '}';
    }
}
