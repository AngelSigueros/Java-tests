package com.certidevs.encapsulacion;

public class Main {

    /*
    Objetivo comprobar el método setModelo de
    objeto vehículo
     */
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();
        v1.setModelo("BMW Serie 4"); // sí lo asigna
        v1.setModelo("Fiat Panda"); // no lo asigna
        v1.setModelo("Mercedes Clase A"); // sí lo asigna
        v1.setModelo("Volkswagen Polo"); // no lo asigna
        System.out.println(v1);
        // 'estaMotorCorrecto()' has private access
        // v1.estaMotorCorrecto();

    }
}
