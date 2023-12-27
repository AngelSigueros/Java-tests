package com.company.poo.objetos;

import com.company.poo.clases.Genero;
import com.company.poo.clases.Persona;

public class PersonaMain {

    private static final int MAYORIA_EDAD = 20;

    public static void main(String[] args) {


        Persona persona1 = new Persona();
        persona1.nombre = "";

        Persona persona2 = new Persona("Persona2", "surname", 40, true, Genero.FEMENINO);
        Persona persona3 = new Persona("Persona3", "surname", 18, false, Genero.MASCULINO);


        if (persona3.edad >= MAYORIA_EDAD){
            System.out.println(persona3.nombre + " es mayor de edad.");
        }else{
            System.out.println(persona3.nombre + " es menor de edad.");
        }

        System.out.println(persona2);

    }
}
