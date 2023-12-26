package com.company.retomejorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void showMenu(){
    System.out.println("Selecciona una opción:");
    System.out.println("1 - Ver todos los empleados"); // Hecho
    System.out.println("2 - Ver un empleado (por DNI)"); // Hecho
    System.out.println("3 - Crear un nuevo empleado"); // hecho
    System.out.println("4 - Modificar un empleado (por DNI)");
    System.out.println("5 - Borrar un empleado (por DNI)");
    System.out.println("6 - Borrar todos los empleados");
    System.out.println("7 - Salir"); // hecho
}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmpleadoCRUDArrayList empleadoRepository = new EmpleadoCRUDArrayList();

        while(true) {
            showMenu();

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Has seleccionado la opción 1 - Ver empleados");
                List<Empleado> empleados = empleadoRepository.getEmpleados();
                if (empleados.isEmpty()){
                    System.out.println("No hay empleados.");
                }else{
                    System.out.println(empleados);
                    System.out.println("El número de empleados es: " + empleados.size());
                }
            } else if (opcion == 2) {
                System.out.println("Has seleccionado la opción 2 - Ver un empleado por dni ");
                System.out.println("Introduce el dni del empleado a consultar");

                String dni = scanner.next();
                Empleado empleado = empleadoRepository.findByDNI(dni);

                if (empleado == null){
                    System.out.println("No existe el empleado con dni: " + dni);
                }else{
                    System.out.println(empleado);
                }

            }else if (opcion == 3) {
                System.out.println("Has seleccionado la opción 3 - Crear un nuevo empleado ");
                System.out.println("Introduce tu dni");
                String dni = scanner.next();

                if(empleadoRepository.findByDNI(dni) != null){
                    System.out.println("El dni está ocupado, por favor utilice otro dni.");
                    continue;
                }

                // TODO - trasladar codigo a clase EmpleadoReader

                System.out.println("Introduce tu nombre");
                String nombre = scanner.next();

                System.out.println("Introduce tu apellido");
                String apellido = scanner.next();

                System.out.println("Introduce tu edad");
                int edad = scanner.nextInt();

                System.out.println("Introduce tu peso (con decimales usando ,)");
                double peso = scanner.nextDouble();

                System.out.println("Introduce si está casado o no (true o false)");
                boolean estadoCivil = scanner.nextBoolean();

                System.out.println("¿Tiene teléfono? (true o false)");
                boolean hasPhone = scanner.nextBoolean();
                List<String> telefonos = new ArrayList<>();
                if (hasPhone) {
                    System.out.println("¿Cuántos teléfonos tiene?");
                    int numPhones = scanner.nextInt();
                    for(int i = 0; i < numPhones; i++){
                        System.out.println("Introduce el teléfono " + (i + 1));
                        String telefono = scanner.next();
                        telefonos.add(telefono);
                    }

                }

                Empleado empleado = new Empleado(dni, nombre, apellido, edad, peso, estadoCivil, telefonos);
                empleadoRepository.save(empleado);

            } else if (opcion == 4) {
                System.out.println("Has seleccionado la opción 4 - Modificar empleado por ID");
                System.out.println("Introduce el dni del empleado a modificar");

                String dni = scanner.next();
                Empleado empleado = empleadoRepository.findByDNI(dni);

                if(empleado == null){ // no existe el empleado a modificar
                    continue;
                }

                System.out.println("Introduce el peso del empleado (peso actual: " + empleado.peso + ")");
                empleado.peso = scanner.nextDouble();

                System.out.println("Introduce el estado Civil del empleado (estado actual: " + empleado.estadoCivil + ")");
                empleado.estadoCivil = scanner.nextBoolean();

            }  else if (opcion == 5) {

                System.out.println("Has seleccionado la opción 5 - Borrar un empleado por ID \n Introduce el dni del empleado");
                empleadoRepository.deleteByDNI(scanner.next());

            } else if (opcion == 6) {
                System.out.println("Has seleccionado la opción 6 - Borrar todos los empleados");
                empleadoRepository.deleteAll();

            }   else if (opcion == 7) {
                System.out.println("Has seleccionado la opción 7 - Salir de la aplicación");

                break;
            } else{
                System.out.println("La opción seleccionada no es una opción válida, por favor introduce una opción");
            }
            System.out.println("\n\n");
        }
        System.out.println("Hasta luego lucas!");


        // Paso final: cerrar el scanner
        scanner.close();

    }
}
