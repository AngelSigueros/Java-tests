package com.company.poo.objetos;

import com.company.poo.clases.Coche;
import com.company.poo.clases.TipoCoche;

public class CochesArray {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Fiat", "Bravo", 20000, 120, null, TipoCoche.COMBUSTION);

        String[] extras2 = {"techo solar"};
        Coche coche2 = new Coche("Ford", "Mondeo", 50000, 190, extras2, TipoCoche.HIBRIDO);

        String[] extras3 = {"techo solar", "máquina de helados"};
        Coche coche3 = new Coche("Tesla", "3", 60000, 190, extras3, TipoCoche.ELECTRICO);

        double precioCoches = coche1.precio + coche2.precio + coche3.precio;
        //                  0        1      2
        Coche[] coches = {coche1, coche2, coche3};

        double precioTotal = 0;
        // bucle for normal
        for(int i = 0; i < coches.length; i++){
            precioTotal += coches[i].precio;
        }
        System.out.println("El precio total de los coches es: " + precioTotal);

        double precioTotal2 = 0;
        // Bucle for each, itera para cada coche del array coches. Crea una variable Coche coche que toma un objeto coche diferente en cada iteración
        // itera hasta pasar por todos los coches que haya en el array
        for(Coche coche : coches){
            precioTotal2 += coche.precio;
        }


    }
}
