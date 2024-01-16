package com.certidevs.telefono_movil;

public class TelefonoMovil {

    private String fabricante;
    private String modello;
    private int numCores;
    private int ram;
    private boolean encemdido;

    public TelefonoMovil() {

    }

    public TelefonoMovil(String fabricante, String modello, int numCores, int ram, boolean encemdido) {
        this.fabricante = fabricante;
        this.modello = modello;
        this.numCores = numCores;
        this.ram = ram;
        this.encemdido = encemdido;
    }

    public void encender() {
        if (this.numCores > 0 && this.ram > 0) {
            this.encemdido = true;
        }
    }

    public void apagar() {
        if (this.encemdido)
            this.encemdido = false;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isEncemdido() {
        return encemdido;
    }

    public void setEncemdido(boolean encemdido) {
        this.encemdido = encemdido;
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modello='" + modello + '\'' +
                ", numCores=" + numCores +
                ", ram=" + ram +
                ", encemdido=" + encemdido +
                '}';
    }
}
