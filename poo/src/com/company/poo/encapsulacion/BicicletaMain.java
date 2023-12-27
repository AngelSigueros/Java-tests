package com.company.poo.encapsulacion;

public class BicicletaMain {

    public static void main(String[] args) {

        Bicicleta ktm = new Bicicleta("KTM", "", true);
        Bicicleta orbea = new Bicicleta("Orbea", "Fibra de carbono", false);
        System.out.println(orbea);

        // Métodos get para obtener datos, recuperar el valor de un atributo;
        System.out.println(orbea.getMaterial());
        System.out.println(orbea.getFabricante());
        System.out.println(orbea.getPatines());

        // Métodos set para cambiar datos
        orbea.setFabricante("Orbea 3000");
        orbea.setMaterial("Madera");
        orbea.setPatines(true);

        System.out.println("========================");
        System.out.println(orbea.getMaterial());
        System.out.println(orbea.getFabricante());
        System.out.println(orbea.getPatines());
        // cambios git
        System.out.println("Cambio para subir a github");
    }
}
