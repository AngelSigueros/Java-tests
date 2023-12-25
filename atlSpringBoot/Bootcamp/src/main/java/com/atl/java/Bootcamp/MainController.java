package com.atl.java.Bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {

    @GetMapping("hacer-algo")
    public String primeraPrueba() {
        return "Hola Mundo";
    }
    @GetMapping("generar-password")
    public String generarPassword () {
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);

        String password = "JDg" + numeroAleatorio;
        return password;
    }
    @GetMapping("generar-password/{texto}")
    public String generarPassword (@PathVariable String texto) {
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);

        //String password = "JDg" + numeroAleatorio;
        String password = texto + numeroAleatorio;
        return password;
    }
}
