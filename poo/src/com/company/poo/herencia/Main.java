package com.company.poo.herencia;

public class Main {

    public static void main(String[] args) {

        // opcion 1 - constructor vacio y métodos setter
        Motocicleta moto = new Motocicleta();
        moto.setBaul(true);
        moto.setAsientoCopiloto(true);
        // atributos heredados:
        moto.setFabricante("Ford");
        moto.setMatricula("5544J");
        moto.setNumRuedas(2);

        // opcion 2 - constructor con parámetros y setter
        Motocicleta moto2 = new Motocicleta(true , true);
        moto2.setFabricante("Ford");
        moto2.setMatricula("5544J");
        moto2.setNumRuedas(2);

        // opcion 3 - constructor con parámetros y setter dentro del contructor
        Motocicleta moto3 = new Motocicleta(true , true, "Ford", "4433L", 2);

        // opcion 4 - constructor con los parametros y super()
        Motocicleta moto4 = new Motocicleta(true , true, "Ford", "4433L", 2);


        System.out.println(moto3);

        Camion camion = new Camion(50000D, "Fab", "2323F", 6);
    }
}
