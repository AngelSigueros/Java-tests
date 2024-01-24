package com.certidevs.interfaces.ejemplo1;

import com.certidevs.herencia2.Cliente;

public class Main {

    public static void main(String[] args) {

        // EJEMPLO1: CON INTERFACES:
        // Utiliza polimorfimo
        // ClienteCRUD operacionesCRUD = new ClienteCRUDArray();
        // ClienteCRUD prueba = new ClienteCRUD();

        ClienteCRUD operacionesCRUD = new ClienteCRUDMySQL();
        String cliente = operacionesCRUD.buscarPorNif("11122233G");
        System.out.println(cliente);

        // EJEMPLO SIN INTERFACES:
        // Las clases al ser independientes no están obligadas a tener
        // los mismos métodos. No aplica el polimorfismo
        /*
        ClienteCRUDMongo operacionesMongo = new ClienteCRUDMongo();
        Cliente[] clientes = operacionesMongo.buscarTodosClientes();

        ClienteCRUDMariadb operacionesMariadb = new ClienteCRUDMariadb();
        Cliente[] clientes  = operacionesMariadb.findAllCustomers();
        */

    }
}
