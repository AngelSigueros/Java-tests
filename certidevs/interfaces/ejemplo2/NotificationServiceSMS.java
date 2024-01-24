package com.certidevs.interfaces.ejemplo2;

public class NotificationServiceSMS implements NotificationService {
    @Override
    public void enviarMensaje(String mensaje) {
        // Simular que enviamos un SMS
        System.out.println("enviando mensaje sms: " + mensaje);
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
