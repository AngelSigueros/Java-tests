package com.certidevs.telefono_movil;

import com.certidevs.usuario.Usuario;

public class Main {

    public static void main(String[] args) {

        // Crear objeto constructor vacío

        TelefonoMovil iphone = new TelefonoMovil();
        System.out.println(iphone);
        iphone.fabricante = "Apple";
        System.out.println(iphone);
        iphone.modelo = "iPhone 15";
        System.out.println(iphone);


        // Crear objeto constructor con parámetros
        TelefonoMovil onePlus = new TelefonoMovil("OnePlus", "13T", 7, 7, false);
        TelefonoMovil oppo = new TelefonoMovil("Oppo", "B12", 6, 12, true);

        System.out.println(onePlus);
        onePlus.encender();
        System.out.println(onePlus);
        onePlus.apagar();
        System.out.println(onePlus);


        boolean esTelefono = onePlus instanceof TelefonoMovil; // true
        System.out.println(esTelefono);
    }
}
