package com.certidevs.telefono_movil;

public class TelefonoMovil {

    // atributos
    String fabricante;
    String modelo;
    int numCores;
    int ram;
    boolean encendido;

    // métodos constructores
    public TelefonoMovil() {
    }

    public TelefonoMovil(String manufacturer, String modelo, int numCores, int ram, boolean encendido) {
        // si el nombre del parámetro no coincide con el nombre del atributo entonces no es necesario this. porque ya son distintos
        fabricante = manufacturer;
        // si los nombres coinciden entonces usamos this. para distinguir el atributo de la clase vs parámetro que llega
        this.modelo = modelo;
        this.numCores = numCores;
        this.ram = ram;
        this.encendido = encendido;
    }
    // método encender
    public void encender() {
        if (this.numCores > 0 && this.ram > 0) // Si hay memoria y procesador encendemos el movil
            this.encendido = true;
    }

    public void apagar() {
        // if (encendido) comprueba si es true entonces lo pone a false, pero se puede poner a false igualmente
            encendido = false;
    }

    // método apagar


    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numCores=" + numCores +
                ", ram=" + ram +
                ", encendido=" + encendido +
                '}';
    }
}
