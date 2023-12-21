package com.company.estructurascontrol.iterativo;

import java.util.ArrayList;
import java.util.List;

public class ForIfArrayListForEach {

    public static void main(String[] args) {


        // ArrayList
        List<String> invitados = new ArrayList<>();
        invitados.add("Antonio Romero");
        invitados.add("Alberto Fernandez");
        invitados.add("David Gonzalez");
        invitados.add("Miguel Caruli");



        String persona = "Alberto Fernandez"; // persona que acaba de llegar
        boolean esInvitado = false;
        for(String invitado : invitados){
            // comprobar si persona está en array invitados
            esInvitado = persona.equals(invitado);
            if(esInvitado){
                System.out.println("Bienvenido/a! Estás invitado a la boda");
                break;
            }
        }
        // fuera del bucle for
        if(esInvitado == false){
            System.out.println("Lo sentimos, no estás invitado a este evento.");
        }


        // for each


    }
}
