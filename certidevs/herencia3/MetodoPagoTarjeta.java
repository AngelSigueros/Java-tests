package com.certidevs.herencia3;

public class MetodoPagoTarjeta extends MetodoPago {

    private String numTarjeta;
    private String codigoSecuridad;

    public MetodoPagoTarjeta() {
    }

    public MetodoPagoTarjeta(String nombreEmisor, String nombreReceptor, String numFactura, double cantidad, String numTarjeta, String codigoSecuridad) {
        super(nombreEmisor, nombreReceptor, numFactura, cantidad);
        this.numTarjeta = numTarjeta;
        this.codigoSecuridad = codigoSecuridad;
    }

    // metodos override

    @Override // Anotación que comprueba que el método realizarPago existe en la clase superior
    public boolean realizarPago() {
        // return super.realizarPago(); // invoca el método realizarPago de la clase superior

        // Pagando de forma diferente a cómo lo hace el método realizarPago de la clase superior
        System.out.println("Pagando con tarjeta, afanando euros, no se mueva.");
        return true;
    }



    // metodos getter y setter

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getCodigoSecuridad() {
        return codigoSecuridad;
    }

    public void setCodigoSecuridad(String codigoSecuridad) {
        this.codigoSecuridad = codigoSecuridad;
    }
}
