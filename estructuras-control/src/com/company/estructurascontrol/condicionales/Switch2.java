package com.company.estructurascontrol.condicionales;

public class Switch2 {

    public static void main(String[] args) {

        int day = 3;
        switch(day){
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            default:
                System.out.println("El número no corresponde a un día de la semana.");
        }
    }
}
