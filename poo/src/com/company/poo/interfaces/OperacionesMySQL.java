package com.company.poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class OperacionesMySQL implements OperacionesCRM{


    @Override
    public List<Customer> findAll() {
        // Conecta Base de datos MySQL y recupera clientes
        System.out.println("Accediendo a clientes de la base de datos MYSQL!!!");
        return new ArrayList<>();

    }

    @Override
    public Customer findByDNI(String dni) {

        // Conecta Base de datos MySQL y recupera un cliente en concreto
        System.out.println("Bus base de datos MYSQL!!!");

        return null;
    }

    @Override
    public Customer findByDNI(Integer dni) {
        return null;
    }

    @Override
    public Customer findByDNI(String[] dni) {
        return null;
    }
}
