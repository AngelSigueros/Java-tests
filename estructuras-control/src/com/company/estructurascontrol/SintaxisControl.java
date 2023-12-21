package com.company.estructurascontrol;

public class SintaxisControl {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {


        // if
        int edad1 = 19; // sentencia de creación de variable
        if (edad1 >= 18) {
            System.out.println("Mayor de edad");
        }

        // if else
        int edad2 = 17;
        if (edad2 >= 18) {
            System.out.println("Mayor de edad");

        } else {
            System.out.println("Menor de edad");
        }

        // if anidados
        if (edad2 > 50 && edad2 < 80) {
            System.out.println("Entre 51 y 79 años");
        } else if(edad2 >= 18 && edad2 <= 50) {
            System.out.println("Entre 18 y 50 años");
        }else{
            System.out.println("Menor de edad");
        }

        // operador ternario
        System.out.println(edad2 >= 18 ? "Mayor de edad": "Menor de edad");
        System.out.println(esMayorEdad(18) ? "Mayor de edad": "Menor de edad");


        //switch
        String accion1 = "despedirse";
        switch (accion1) {
            case "saludar":
                System.out.println("Hey there! I am using Java.");
                break;
            case "despedirse":
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Please select an action.");
                break;
        }

        //for
        String[] nombres = new String[]{"Caruli", "Gandolfi", "Cuchufo"};
        for (int i = 0; i < args.length; i++) {
            System.out.println(nombres[i]);
        }

        //for with break
        for (int i = 0; i < args.length; i++) {
            if (nombres[i].equals("Gandolfi")) {
                System.out.println(nombres[i]);
                break;
            }
        }

        //for with continue
        for (int i = 0; i < args.length; i++) {
            if (nombres[i].equals("Gandolfi")) {
                continue;
            }else{
                System.out.println(nombres[i]);
            }
        }

        //foreach
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //while
        int count = 0;
        while(count < 10){
            count++;
        }
        System.out.println(count);

        //do-while
        int count2 = 0;
        do {
            count2++;
        } while (count2 < 10);
        System.out.println(count2);

    }

    private static boolean esMayorEdad(int edad) {
        return edad >= 18 ? true: false;
    }
}
