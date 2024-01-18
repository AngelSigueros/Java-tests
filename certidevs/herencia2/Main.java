package com.certidevs.herencia2;

public class Main {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Antonio", "Developer");
        System.out.println(user1);

        // Crear instancia de la subclase
        Empleado empleado1 = new Empleado("Mike", "Developer", "11-11111.1111T");
        System.out.println(empleado1);


        Usuario empleado2 = new Empleado("Emp2", "emp2", "234234324234");
    }
}
