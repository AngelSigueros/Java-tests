package com.company.estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {


        int day = 8;

        if(day == 1){
            System.out.println("El día de hoy es lunes");

        } else if(day == 2){
            System.out.println("El día de hoy es martes");
        }

        else if(day == 3){
            System.out.println("El día de hoy es miércoles");
        }

        else if(day == 4){
            System.out.println("El día de hoy es jueves");
        }

        else if(day == 5){
            System.out.println("El día de hoy es viernes");
        }

        else if(day == 6){
            System.out.println("El día de hoy es sabado");
        }

        else if(day == 7){
            System.out.println("El día de hoy es domingo");

        } else { // solo se ejecuta si todos los anteriores son false
            System.out.println("El número no es un día de la semana válido.");
        }

        System.out.println("fin del programa");

    }
}
