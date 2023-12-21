package com.company.estructurascontrol.iterativo;

/**
 * Programa lista de invitados a una boda.
 * Solo puede entrar aquellas personas que estén en la lista
 *
 * Blacklist: personas que no pueden entrar
 */
public class ForIfArray {

    public static void main(String[] args) {



        // Array [] unidimensional
        String[] invitados = new String[4];
        invitados[0] = "Antonio Romero";
        invitados[1] = "Alberto Fernandez";
        invitados[2] = "David Gonzalez";
        invitados[3] = "Miguel Caruli";

        String persona = "Miguel Caruli"; // persona que acaba de llegar
        boolean esInvitado = false;
        for(int i = 0; i < invitados.length; i++){
            // comprobar si persona está en array invitados
            esInvitado = persona.equals(invitados[i]);
            if(esInvitado){
                System.out.println("Bienvenido/a! Estás invitado a la boda");
                break;
            }
        }
        // fuera del bucle for
        if(esInvitado == false){
            System.out.println("Lo sentimos, no estás invitado a este evento.");
        }


    }
}
