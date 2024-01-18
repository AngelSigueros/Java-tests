package com.certidevs.herencia2;

// Subclase numero seguridad social (nss)
public class Empleado extends Usuario {
    private String nss;

    public Empleado () {}

    public Empleado(String nombre, String apellido, String nss) {
        super(nombre, apellido);
        this.nss = nss;
    }

    public String getNss() {
        // super.getApellido() deja acceder a atributos y métodos public y protected de la clase Superior
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    // Método toString:


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", nss='" + nss + '\'' +
                '}';
    }
}
