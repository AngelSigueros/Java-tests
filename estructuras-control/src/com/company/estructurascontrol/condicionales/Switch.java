package com.company.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {


        String day = "viernes";

        switch(day){

            case "lunes":
                System.out.println("El día es lunes.");
                System.out.println("El día es lunes.");
                break; // indica que se termina el caso

            case "martes":
                System.out.println("El día es martes.");
                break;

            case "miercoles":
                System.out.println("El día es miercoles.");
                break;

            case "viernes":
                System.out.println("El día es viernes.");
                break;

            default:
                System.out.println("No existe el día de la semana.");
        }


        System.out.println("fin del programa");
    }
}
