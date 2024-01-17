package com.certidevs.herencia3;

public class MetodoPagoPaypal extends MetodoPago {

    private String email;
    private String token;


    public MetodoPagoPaypal() {
    }

    public MetodoPagoPaypal(String nombreEmisor, String nombreReceptor, String numFactura, double cantidad, String email, String token) {
        super(nombreEmisor, nombreReceptor, numFactura, cantidad);
        this.email = email;
        this.token = token;
    }

    @Override
    public boolean realizarPago() {
        System.out.println("iniciando conexion paypal");
        System.out.println("transfiriendo dineritos");
        return true;
    }


}
