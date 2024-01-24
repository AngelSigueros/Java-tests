package com.certidevs.excepciones2;

// public class IncorrectNameLengthException extends Exception { // checked: obliga a poner throws o capturar
public class IncorrectNameLengthException extends RuntimeException { // unchecked: no obliga

    public IncorrectNameLengthException(String mensaje) {
        super(mensaje); // esto garantiza que aparezca el mensaje cuando se hace print stack trace
    }
}
