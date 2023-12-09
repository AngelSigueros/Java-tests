package com.javatest;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Lola", "Ruiz", "12345678A");
        Customer customer2 = new Customer("Pere", "Mola", "87654321B");
        Customer customer3 = new Customer("Juan", "Terr", "11223344C");

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        // Comparar dos objetos Customer usando el método equals
        System.out.println("¿Son iguales customer1 y customer2? " + customer1.equals(customer2));
    }

}
