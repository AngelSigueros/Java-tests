package com.company.funciones;

public class FuncionesConIf {

    public static void main(String[] args) {


        double shopcartCustomer1 = 40;
        double shopcartCustomer2 = 90;
        double shopcartCustomer3 = 199;
        double shopcartCustomer4 = 250;

        double precioEnvio1 = calcularEnvioTramos(shopcartCustomer1);
        double precioEnvio2 = calcularEnvioTramos(shopcartCustomer2);
        double precioEnvio3 = calcularEnvioTramos(shopcartCustomer3);
        double precioEnvio4 = calcularEnvioTramos(shopcartCustomer4);

        System.out.println("Precio de envío para cliente 1 con cesta de " + shopcartCustomer1 + " € será: " + precioEnvio1 + " €");
        System.out.println("Precio de envío para cliente 2 con cesta de " + shopcartCustomer2 + " € será: " + precioEnvio2 + " €");
        System.out.println("Precio de envío para cliente 3 con cesta de " + shopcartCustomer3 + " € será: " + precioEnvio3 + " €");
        System.out.println("Precio de envío para cliente 4 con cesta de " + shopcartCustomer4 + " € será: " + precioEnvio4 + " €");

        System.out.println("Envío para cesta 130€ para madrid " + calcularEnvioUbicacion(130, "Madrid"));
        System.out.println("Envío para cesta 130€ para canarias " + calcularEnvioUbicacion(130, "canarias"));
        System.out.println("Envío para cesta 130€ para baleares " + calcularEnvioUbicacion(130, "islas baleares"));

    }


    public static double calcularEnvioUbicacion(double price, String ubicacion){

        // TODO - pendiente comprobar si el precio es 0 no cobrar de envío
        double envioBase;
        if(price < 50){
            envioBase = 9.99 ;
        }else if(price < 100){
            envioBase = 4.99;
        }else if(price < 200){
            envioBase = 1.99;
        }else {
            envioBase = 0;
        }

        // Gastos extra por ubicacion
        // ubicacion es Canarias entonces sumamos 5
        // ubicacion es baleares entonces 2
        if(ubicacion.equalsIgnoreCase("Canarias")){
            envioBase += 5;
        } else if(ubicacion.equalsIgnoreCase("Islas Baleares")){
            envioBase += 2;
        }

        return envioBase;

    }

    public static double calcularEnvioTramos(double price){

        System.out.println("Calculando precio de envío para la cesta con este precio: " + price);


        /**
         * Caso 1:  price < 50 entonces 9.99
         * Caso 2: price >= 50 y price < 100 entonces 4.99
         * Caso 3: price >= 100 y price < 200 entonces 1.99
         * Caso 4: price >= 200 entonces gratis
         */
        if(price < 50){
            return 9.99 ;
        }else if(price < 100){
            return 4.99;
        }else if(price < 200){
            return 1.99;
        }else {
            return 0;
        }

        // No hay cálculo extra

    }

    public static double calcularEnvio(double price){

        System.out.println("Calculando precio de envío para la cesta con este precio: " + price);

        // si el price es menor de 100 entonces el envío será 4.99
        if(price < 100){
            return 4.99 ;
        }else{
            return 0;
        }
        // si el price es mayor o igual de 100 entonces el envío es gratis

    }

    public static double calcularEnvioConOperadorTernario(double price){

        System.out.println("Calculando precio de envío para la cesta con este precio: " + price);

        // El operador ternario utiliza ? para if y : para else
        return price < 100 ? 4.99 : 0;
    }

    public static double calcularEnvioConVariable(double price){

        System.out.println("Calculando precio de envío para la cesta con este precio: " + price);

        // si el price es menor de 100 entonces el envío será 4.99
        // si el price es mayor o igual de 100 entonces el envío es gratis

        double precioEnvio; // declara una variable

        if(price < 100){
            precioEnvio = 4.99;
        }else{
            precioEnvio = 0;
        }
        return precioEnvio;
    }


}
