package com.company.poo.encapsulacion;

public class Smartphone {

    private String fabricante;
    private String modelo;
    private Integer camMP;
    private Integer ram;

    public Smartphone(){}

    public Smartphone(String fabricante, String modelo, Integer camMP, Integer ram) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.camMP = camMP;
        this.ram = ram;
    }


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

    public Integer getCamMP() {
        return camMP;
    }

    public void setCamMP(Integer camMP) {
        this.camMP = camMP;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        if (ram >= 4 && ram <= 16)
            this.ram = ram;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", camMP=" + camMP +
                ", ram=" + ram +
                '}';
    }
}
