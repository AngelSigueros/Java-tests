package com.company.poo.interfaces;

import java.util.List;
import java.util.Scanner;

public class CRMApplicationV2 {

    public static void main(String[] args) {

        // create an instance of the CRM operations class
        OperacionesCRM crm = new OperacionesExcel();

        // create a scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // infinite loop to process user input
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1 - Ver todos los clientes");
            System.out.println("2 - Ver un empleado (por DNI)");
            System.out.println("3 - Salir");

            // read the user input
            int opcion = scanner.nextInt();

            // process the user input
            switch (opcion) {
                case 1:
                    // obtain a list of customers
                    List<Customer> clientes = crm.findAll();
                    // print the customers
                    System.out.println(clientes);
                    break;
                case 2:
                    // prompt the user for an employee DNI
                    System.out.print("DNI del empleado: ");
                    String dni = scanner.next();
                    // obtain the employee
                    Customer empleado = crm.findByDNI(dni);
                    // print the employee
                    System.out.println(empleado);
                    break;
                case 3:
                    // exit the application
                    System.out.println("Gracias por usar nuestro sistema de CRM.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    System.out.flush();
            }
        }
    }
}
