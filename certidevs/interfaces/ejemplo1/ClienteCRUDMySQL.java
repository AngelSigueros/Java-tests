package com.certidevs.interfaces.ejemplo1;

public class ClienteCRUDMySQL implements ClienteCRUD {
    @Override
    public String buscarPorNif(String nif) {
        return "Cliente de MySQL";
    }

    @Override
    public void guardar(String cliente) {

    }

    @Override
    public void actualizar(String cliente) {

    }

    @Override
    public void borrar(String cliente) {

    }
}
