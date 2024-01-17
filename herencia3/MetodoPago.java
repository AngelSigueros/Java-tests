package com.certidevs.herencia3;

public class MetodoPago {

    // atributos comunes a todos los pagos
    private String nombreEmisor;
    // protected permite visibilidad en clases hijas
    // y del mismo paquete
    protected String nombreReceptor; // protected
    private String numFactura;
    private double cantidad;

    // métodos constructores

    public MetodoPago() {
    }

    public MetodoPago(String nombreEmisor, String nombreReceptor, String numFactura, double cantidad) {
        this.nombreEmisor = nombreEmisor;
        this.nombreReceptor = nombreReceptor;
        this.numFactura = numFactura;
        this.cantidad = cantidad;
    }

    // métodos propios
    public boolean realizarPago() {
        System.out.println("Realizando pago por defecto (Contra reembolso)");
        return true;
    }

    // getter y setter
    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
