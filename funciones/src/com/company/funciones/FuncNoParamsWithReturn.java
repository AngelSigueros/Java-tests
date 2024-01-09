package com.company.funciones;

import java.util.UUID;

public class FuncNoParamsWithReturn {

    public static void main(String[] args) {


        String randomFileName1 = generateRandomName();
        System.out.println(randomFileName1);

        String randomFileName2 = generateRandomName();
        System.out.println(randomFileName2);

        String randomFileName3 = generateRandomName();
        System.out.println(randomFileName3);

    }

    private static String generateRandomName() {
        // Lo importante es la sentencia con return
        return UUID.randomUUID().toString(); // genera un uuid en texto
    }
}
