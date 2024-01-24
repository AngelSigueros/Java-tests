package com.certidevs.excepciones3;

public class ExcepcionPersonalizada extends RuntimeException {
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}
