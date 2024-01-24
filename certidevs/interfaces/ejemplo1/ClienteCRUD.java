package com.certidevs.interfaces.ejemplo1;

/*
Se utiliza la palabra reservada interface en lugar de class
 */
public interface ClienteCRUD {

    /*
    Contrato de métodos que deben implementar las clases que implementen esta interfaz
    Dice lo que hay que hacer pero será una clase quien lo haga
    Declara métodos y quien implemente la interfaz está obligado a proporcionar el cuerpo de esos métodos
     */
    // recuperar
    String buscarPorNif(String nif);

    // guardar
    void guardar(String cliente);

    // actualizar
    void actualizar(String cliente);

    // borrar
    void borrar(String cliente);
}
