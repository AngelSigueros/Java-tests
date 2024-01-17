package com.certidevs.herencia3;

public class Main2 {

    public static void main(String[] args) {

        String[] nombres = {"nombre1", "nombre2", "nombre3"};
        for (String nombre: nombres)
            System.out.println(nombre);

        // array de MetodosPago [] con 3 métodos pago distintos: 2 paypal 3 tarjeta
        MetodoPagoPaypal paypalRonald = new MetodoPagoPaypal();
        MetodoPagoPaypal paypalJudit = new MetodoPagoPaypal();
        MetodoPagoTarjeta tarjetaAitor = new MetodoPagoTarjeta();
        MetodoPagoTarjeta tarjetaNoemi = new MetodoPagoTarjeta();
        MetodoPagoTarjeta tarjetaSilvia = new MetodoPagoTarjeta();

        // Polimorfismo: se tratan objetos de tipos diferentes como un mismo tipo de objetos MetodoPago
        MetodoPago[] metodosPago = { paypalRonald, paypalJudit, tarjetaAitor, tarjetaNoemi, tarjetaSilvia };

        for (MetodoPago metodo : metodosPago) { // for metodo in metodos:
            metodo.realizarPago();// Pol
        }

        for (int i = 0; i < metodosPago.length; i++) { // range(0, 6, 1)
            metodosPago[i].realizarPago();
        }

    }
}
