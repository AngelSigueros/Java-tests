package com.company.retomejorado;

import java.util.List;

public class Empleado {

    // 1. atributos
    public String dni;
    public String nombre;
    public String apellido;
    public Integer edad;
    public Double peso;
    public Boolean estadoCivil;
    public List<String> telefonos;

    // 2. constructores
    public Empleado(){}

    public Empleado(String dni, String nombre, String apellido, Integer edad, Double peso, Boolean estadoCivil, List<String> telefonos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estadoCivil = estadoCivil;
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", estadoCivil=" + estadoCivil +
                ", telefonos=" + telefonos +
                '}';
    }
}
