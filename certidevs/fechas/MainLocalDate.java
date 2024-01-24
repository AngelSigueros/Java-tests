package com.certidevs.fechas;

import java.time.LocalDate;

public class MainLocalDate {

    public static void main(String[] args) {

        /*
        LocalDate representa una fecha compuesta por año mes y día
        No incluye tiempo (hora, minuto, segundo)
         */

        LocalDate fechaHoy = LocalDate.now(); // now es un método static
        System.out.println(fechaHoy); // YYYY-MM-DD ISO 8601 estándar
        // Estadounidense MM/DD/YYYY
        // Español DD/MM/YYYY

        LocalDate fechaInicio = LocalDate.of(2024, 3, 14);
        LocalDate fechaFin = LocalDate.of(2024, 3, 15);


        System.out.println("getDayOfYear " + fechaInicio.getDayOfYear());
        System.out.println("getDayOfMonth " + fechaInicio.getDayOfMonth());

        boolean isBefore = fechaInicio.isBefore(fechaFin);
        System.out.println(fechaInicio + " isBefore " + fechaFin + " = " + isBefore);

        boolean isAfter = fechaFin.isAfter(fechaInicio);
        System.out.println(isAfter);

        System.out.println(fechaInicio.getMonthValue()); // int con el número del mes 1-12
        System.out.println(fechaInicio.getMonth().getValue()); // int con el número del mes 1-12

        // Operaciones

        // suscripcion mensual
        // 1. Crear fecha inicioSuscripcion con fecha de hoy
        LocalDate inicioSuscripcion = LocalDate.now(); // 23/01/2024
        // 2. Crear fecha finSuscripción con la fecha inicioSuscripcion con 7 días agregados
        LocalDate finSuscripcion = inicioSuscripcion.plusDays(7); // 30/01/2024

        System.out.println(inicioSuscripcion);
        System.out.println(finSuscripcion);

        // suscripcion anual
        System.out.println(inicioSuscripcion.plusYears(1));

    }
}
