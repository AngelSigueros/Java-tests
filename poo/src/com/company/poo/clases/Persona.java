package com.company.poo.clases;

public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    public boolean casado; // true o false
    public Genero genero; // atributo tipo enumeración


    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, boolean casado, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
