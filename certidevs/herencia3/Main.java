package com.certidevs.herencia3;

public class Main {

    public static void main(String[] args) {

        MetodoPagoTarjeta tarjeta1 = new MetodoPagoTarjeta("Juanito",
                "CertiDevs",
                "FACTURA-001",
                19.99,
                "123456789",
                "111"
        );

        // protected: accesible
        System.out.println(tarjeta1.nombreReceptor);
        // private: no accesible
        // System.out.println(tarjeta1.cantidad);

        // OPCIÓN 1: sin sobre escritura: se ejecuta el de MetodoPago
        // Realizando pago por defecto (Contra reembolso)
        // tarjeta1.realizarPago(); // método heredado

        // OPCIÓN 2: con sobre escritura: se ejecuta el de MetodoPagoTarjeta
        // 1. Busca realizarPago() en la clase Hija, si lo encuentra lo ejecuta, si no lo encuentra busca en la superior
        // 2. Busca realizarPago en la clase superior
        tarjeta1.realizarPago(); // Pagando con tarjeta

        // PAYPAL
        MetodoPagoPaypal paypal = new MetodoPagoPaypal("alan", "carlos", "FACT-002", 32.21, "alan@correo.com", "admin");
        paypal.realizarPago();




    }
}
