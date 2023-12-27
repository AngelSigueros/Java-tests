package com.company.poo.interfaces;

import java.util.List;

public interface OperacionesCRM {

    // 1 - Ver todos los clientes
    public List<Customer> findAll();

    // 2 - Ver un cliente (por DNI)
    public Customer findByDNI(String dni);

    public Customer findByDNI(Integer dni);

    public Customer findByDNI(String[] dni);

    // 3 - Crear un nuevo cliente

    // 4 - Modificar

    // ....
}
