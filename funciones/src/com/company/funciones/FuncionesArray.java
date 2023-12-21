package com.company.funciones;

import java.util.ArrayList;
import java.util.List;

public class FuncionesArray {


    public static void main(String[] args) {
        /*
          1. Crear funcion
          2. que reciba 4 nombres (parametros)
          3. que retorne un array con esos nombres
         */
        String[] nombres = crearArrayString("Pepe", "Pepa", "Mike", "Ambrosio");

        /*
         * 1. Crear una funcion
         * 2. que reciba un array de nombres
         * 3. y devuelva un arraylist con esos nombres
         */
        List<String> nombres2 = crearArrayListString(nombres);
    }

    public static String[] crearArrayString(String nombre1, String nombre2, String nombre3, String nombre4){

        // Manera 1
//        String[] array = new String[4];
//        array[0] = nombre1;
//        array[1] = nombre2;
//        array[2] = nombre3;
//        array[3] = nombre4;

        // Manera 2
        String[] array = {nombre1, nombre2, nombre3, nombre4};

        return array;

    }

    public static List<String> crearArrayListString(String[] array){
        List<String> arraylist = new ArrayList<>();

        // Manera 1
        for(String nombre : array){
            arraylist.add(nombre);
        }

        // Manera 2
        // Collections.addAll(arraylist, array);


        return arraylist;
    }



}
