package com.company.poo.objetos;

import com.company.poo.clases.Coche;
import com.company.poo.clases.TipoCoche;

public class CocheMain {

    public static void main(String[] args) {

        String nombre = "";
        Coche coche = new Coche();
        coche.fabricante = "Fiat";
        coche.modelo = "Bravo";

        Coche coche2 = new Coche("Fiat", "Bravo");
        System.out.println(coche2.fabricante);
        System.out.println(coche2.modelo);
        System.out.println(coche2.precio);

        String[] extras = {"aire acondicionado", "wifi", "techo solar"};
        Coche coche3 = new Coche("Fiat", "Bravo", 40000, 140, extras, TipoCoche.COMBUSTION);
        System.out.println(coche3.fabricante);

        // acelerar:

        System.out.println("velocidad " + coche3.velocidad);

        coche3.acelerar(20);

        System.out.println("velocidad " + coche3.velocidad);

        coche3.acelerar(200);
        System.out.println("velocidad " + coche3.velocidad);
        coche3.velocidad = 200;

        coche3.frenar(100);

        System.out.println("velocidad " + coche3.velocidad);

        coche3.acelerar(-100);
        System.out.println("velocidad " + coche3.velocidad);

        System.out.println(coche3);
        coche3.acelerar(100);
        System.out.println(coche3);

        System.out.println(TipoCoche.ELECTRICO.name());
        System.out.println(TipoCoche.ELECTRICO.ordinal());


    }

}
