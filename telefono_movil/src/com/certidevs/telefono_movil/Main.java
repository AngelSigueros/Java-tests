package com.certidevs.telefono_movil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TelefonoMovil nokia = null;
        nokia = new TelefonoMovil();

        TelefonoMovil nisu = null;
        nisu = new TelefonoMovil("Nisu", "Model v2", 2, 4, false);

        TelefonoMovil iphone = new TelefonoMovil();
        iphone.setFabricante("Apple");
        iphone.setModello("15 Pro");
        iphone.setNumCores(8);
        iphone.setRam(16);
        iphone.setEncemdido(true);

        nokia.encender();
        nisu.encender();

        System.out.println(nokia);
        System.out.println(nisu);
        System.out.println(iphone);

        nisu.apagar();

        List<String> lista1 = List.of("1", "2", "3", "4", "5", "6");

        for (String item : lista1) {
            if (iphone.getModello().contains(item)) {

            }
        }

        for (int i = 0; i <lista1.size(); i++) {
            if (iphone.getModello().contains(lista1.get(i))){

            }
        }


        System.out.println(nisu);
    }


}
