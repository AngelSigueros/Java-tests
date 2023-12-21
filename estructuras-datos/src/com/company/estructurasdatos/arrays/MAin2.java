package com.company.estructurasdatos.arrays;

public class MAin2 {

    public static void main(String[] args) {

        String[] nombres = new String[5];

        nombres[0] = "Laura";
        nombres[1] = "David";
        nombres[2] = "Gonzalo";
        nombres[3] = "Rafa";
        nombres[4] = "Germán";
                                // 0            1           2           3               4
        String[] apellidos = {"Apellido1", "Apellido2", "Apellido3", "Apellido4", "Apellido5"};

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + " " + apellidos[i]);
        }
    }
}
