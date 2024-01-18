package com.certidevs.herencia2;


// Clase base
// nombre
// apellido
public class Usuario {

    private String nombre;
    private String apellido;

    public Usuario () {}

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // métodos get: obtener un valor, no necesita parámetro

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    // métodos set: cambiar un valor

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // toString

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
