package com.company.funciones;

/**
 * Programa lista de invitados a una boda.
 * Solo puede entrar aquellas personas que estén en la lista
 *
 * Blacklist: personas que no pueden entrar
 */
public class ForIfArrayFunciones {

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
           // esInvitado = persona.equals(invitados[i]);
            esInvitado = esNombreIgual(persona, invitados[i]);
            if(esInvitado){
                imprimirBienvenida(persona);
                break;
            }
        }
        // fuera del bucle for
        if(esInvitado == false){
            System.out.println("Lo sentimos, no estás invitado a este evento.");
        }

        // comprobar funcion
        boolean resultado = esNombreIgual("Alan", "Gonzalo");
    }

    public static void imprimirBienvenida(String persona) {
        System.out.println("Bienvenido/a a la fiesta " + persona);
    }

    public static boolean esNombreIgual(String persona, String invitado){
        boolean resultado = persona.equals(invitado);
        return resultado;
    }


}
