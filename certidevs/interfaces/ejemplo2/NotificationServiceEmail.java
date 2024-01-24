package com.certidevs.interfaces.ejemplo2;

public class NotificationServiceEmail implements NotificationService {
    @Override
    public void enviarMensaje(String mensaje) {

        System.out.println("enviando mensaje email ");
    }

    @Override
    public String confirmarEnvioRespuesta(long id) {
        return null;
    }

    @Override
    public boolean confirmarEnvio(long id) {
        return false;
    }
}
