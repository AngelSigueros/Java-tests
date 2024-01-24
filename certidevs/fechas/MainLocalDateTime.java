package com.certidevs.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class MainLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime fechaHoy = LocalDateTime.now();
        System.out.println(fechaHoy);

        LocalDateTime fechaEvent = LocalDateTime.of(2024, 4, 20, 12, 30);
        System.out.println(fechaEvent);

        LocalDate fecha = LocalDate.now();
        LocalTime tiempo = LocalTime.now();

        LocalDateTime fechaConTiempo = LocalDateTime.of(fecha, tiempo);

        String fechaTexto = "2024-0420T12:30";

        LocalDateTime fechaConvertida = null;
        try {
            fechaConvertida = LocalDateTime.parse(fechaTexto);
        } catch (DateTimeParseException e) { // unchecked, no es obligatorio capturar
            System.out.println("Error de formato de fecha");
        }
        System.out.println(fechaConvertida);

    }
}
