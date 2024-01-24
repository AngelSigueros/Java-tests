package com.certidevs.interfaces.ejemplo2;

public class UserRegistration {
    // atributos
    NotificationService notificador;

    public UserRegistration(NotificationService notificador) {
        this.notificador = notificador;
    }

    public void registrarUsuario(String email) {
        // registrar el usuario...... en array o base de datos
        // ......
        // enviar notificacion de confirmar cuenta
        notificador.enviarMensaje("Confirme su cuenta asociada al email " + email);
    }

    // metodos getter y setter
}
