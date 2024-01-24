package com.certidevs.interfaces.ejemplo2;

/*
TODO
Crear una clase NotificationServiceSMS
Crear una clase NotificationServiceEmail
Crear un main e invocar e método enviarMensaje
Agregar un nuevo método en la interface y ver qué ocurre

 */
interface NotificationService {

    void enviarMensaje(String mensaje);

    String confirmarEnvioRespuesta(long id);

    boolean confirmarEnvio(long id);
}
