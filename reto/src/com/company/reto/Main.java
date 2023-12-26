package com.company.reto;

import com.company.retomejorado.Empleado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 Aplicación Java que permita gestionar objetos referentes a un elemento de la realidad:
 Empleados

 Opciones para resolverlo:
 * Clase java con método main con todas las operaciones en if else if o switch
 * Clase java con método main con todas las operaciones separadas en funciones separadas al main
 * Clase java con método main y utilizando objetos de otras clases para llevar a cabo las funcionalidades
 * Clases java cada una con un método main con una opción diferente del menú

 La aplicación debe permitir realizar las siguientes operaciones:

 1 - Consultar TODOS los clientes existentes: bucle que imprima a través de consola los clientes existentes en un ArrayList
 2 - Crear/Registrar/Insertar un nuevo cliente
 3 - Leer/Ver/Recuperar un cliente concreto utilizando su id
 4 - Modificar/Editar un cliente que ya exista utilizando su id
 5 - Borrar/Eliminar un cliente
 6 - Borrar TODOS los clientes (vaciar la estructura de datos)


 Tener en cuenta:
 * Correcto uso de tipos de datos
 * Uso de POO: crear una clase y objetos
 * Estructuras de datos: ArrayList
 */
public class Main {


    public static void main(String[] args) {

        // 1. Crear el objeto scanner
        Scanner scanner = new Scanner(System.in);
        // empleados
        List<Empleado> empleados = new ArrayList<>();
        // crear datos demo

        empleados.add(new Empleado("111", "Bob Esponja", "FondoBikini", 30, 40.5, false, new ArrayList<>()));

        List<String> phones = new ArrayList<>();
        phones.add("555444333");
        Empleado empleadoDemo = new Empleado("222", "Patricio", "FondoBikini", 50, 30.6, false, phones);
        empleados.add(empleadoDemo);

        while(true) {

            System.out.println("Selecciona una opción:");
            System.out.println("1 - Ver todos los empleados"); // Hecho
            System.out.println("2 - Ver un empleado (por DNI)"); // Hecho
            System.out.println("3 - Crear un nuevo empleado"); // hecho
            System.out.println("4 - Modificar un empleado (por DNI)");
            System.out.println("5 - Borrar un empleado (por DNI)");
            System.out.println("6 - Borrar todos los empleados");
            System.out.println("7 - Salir"); // hecho

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Has seleccionado la opción 1 - Ver empleados");

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

                /*
                    Bucle que itera sobre la lista de empleados, comprobando si el DNI de cada empleado es igual al DNI
                    leído por consola.
                        1 - En caso de que coincida entonces hemos encontrado el empleado, por tanto lo imprimimos
                           por consola.
                        2 - En caso de que no haya ninguno se muestra un texto que diga No existe el empleado para el DNI solicitado
                 */
                boolean exists = false;
                for(Empleado empleado : empleados){
                    if (empleado.dni.equals(dni)){
                        exists = true;
                        System.out.println(empleado);
                        break;
                    }
                }
                if (!exists){
                    System.out.println("No existe el empleado con dni: " + dni);
                }

            }else if (opcion == 3) {
                System.out.println("Has seleccionado la opción 3 - Crear un nuevo empleado ");

                // 2. leer datos de la consola
                System.out.println("Introduce tu dni");
                String dni = scanner.next();

                // comprobar si existe un empleado con ese dni
                // si existe entonces no permitimos crear, volvemos principal
                // si no existe entonces permitimos crear
                boolean dniOcupado = false;
                for(Empleado empleado : empleados){
                    if (empleado.dni.equals(dni)){
                        // ya existe un empleado con este dni, no permitimos crear
                        dniOcupado = true;
                        break;
                    }
                }

                // si dniOcupado es verdadero entonces no continuamos el proceso de creación del empleado
                // si dniOcupado es true entonces pasamos a la siguiente iteración del bucle while
                if(dniOcupado){
                    System.out.println("El dni está ocupado, por favor utilice otro dni.");
                    continue;
                }


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


                // 3. Crear objeto con los datos de la entrada

                Empleado empleado = new Empleado(dni, nombre, apellido, edad, peso, estadoCivil, telefonos);
                System.out.println(empleado);
                empleados.add(empleado);

            } else if (opcion == 4) {
                System.out.println("Has seleccionado la opción 4 - Modificar empleado por ID");

                // 1. Buscar el empleado
                System.out.println("Introduce el dni del empleado a modificar");
                String dni = scanner.next();

                boolean found = false;
                for(Empleado empleado : empleados){
                    if (empleado.dni.equals(dni)){
                        // 2. Pedir nuevos datos y modificar sus atributos con los nuevos valores
                        System.out.println("Introduce el peso del empleado (peso actual: " + empleado.peso + ")");
                        empleado.peso = scanner.nextDouble();
                        System.out.println("Introduce el estado Civil del empleado (estado actual: " + empleado.estadoCivil + ")");
                        empleado.estadoCivil = scanner.nextBoolean();
                        // .... agregar mas atributos que se quieran modificar ....
                        // ....
                        found = true;
                        System.out.println("Empleado modificado correctamente!");
                        break;
                    }
                }
                if(!found)
                    System.out.println("No existe el empleado con dni: " + dni);


            }  else if (opcion == 5) {
                System.out.println("Has seleccionado la opción 5 - Borrar un empleado por ID");

                // 1. Buscar el empleado
                System.out.println("Introduce el dni del empleado");
                String dni = scanner.next();

                // Opcion 1
                boolean exists = false;
//                for(Empleado empleado : empleados){
//                    if (empleado.dni.equals(dni)){
//                        empleados.remove(empleado);
//                        exists = true;
//                        System.out.println("Empleado borrado correctamente!");
//                        break;
//                    }
//                }

                // Opcion 2 Opción más correcta
                Iterator<Empleado> iter = empleados.iterator();
                while (iter.hasNext()) {
                    Empleado empleado = iter.next();
                    if (empleado.dni.equals(dni)){
                        iter.remove();
                        exists = true;
                        System.out.println("Empleado borrado correctamente!");
                        break;
                    }
                }

                // Opcion 3
                // empleados.removeIf((empleado) -> empleado.dni.equals(dni));


                if (!exists){
                    System.out.println("No existe el empleado con dni: " + dni);
                }

                // 2. Borrarlo de la lista
                // empleados.remove()
            } else if (opcion == 6) {
                System.out.println("Has seleccionado la opción 6 - Borrar todos los empleados");
                empleados.clear();

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
