package com.certidevs.interfaces.ejemplo2;


public class Main {

    // interfaz: spring inyectaría aquí un objeto
    // declaras un atributo

    public static void main(String[] args) {


        NotificationService notificadorEMAIL = new NotificationServiceEmail();
        NotificationService notificadorSMS = new NotificationServiceSMS();

        // La interfaz permite desacoplar la clase UserRegistration del sistema de notificaciones
        // Permite pasar un sistema u otro y en ambos funciona
        UserRegistration userRegistration = new UserRegistration(notificadorEMAIL);
        userRegistration.registrarUsuario("juanito@email.com");



    }
    /*
    Paso 1: class UserRegistration
         atributo NotificationService
         método registrar usuario

    Paso 2: Main crear userRegistration con notificaciones Email
            Main crear userRegistration con notificaciones SMS
     */
}
