package com.company.poo.interfaces;

import java.util.List;

public class OperacionesExcel implements OperacionesCRM{

    @Override
    public List<Customer> findAll() {
        // recupera clientes de un archivo Excel
        System.out.println("Accediendo a clientes de un archivo Excel!!!");

        return null;
    }

    @Override
    public Customer findByDNI(String dni ){
        // recupera clientes de un archivo Excel
        System.out.println("Accediendo a cliente Excel por dni!!!");

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
