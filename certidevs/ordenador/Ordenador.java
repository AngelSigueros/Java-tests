package com.certidevs.ordenador;

public class Ordenador {

    private String fabricante;
    private String modelo;
    private int ram;

    // constructor sin parámetros
    public Ordenador () {} // is never used indica que nadie está utilizando este constructor

    // constructor con parámetros:
    public Ordenador(String fabricante, String modelo, int ram) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ram = ram;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
