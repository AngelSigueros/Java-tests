package com.company.funciones;

public class FuncionesConArray {

    public static void main(String[] args) {

        double[] cesta1 = {23.41, 19.99, 59.99, 76.0};

        double precioFinal1 = calcularPrecioTotal(cesta1, "Madrid");
        System.out.println("Coste de su pedido en euros(€) " + precioFinal1);
    }

    /**
     * Método que calcula el precio total en base a:
     * 1 - La suma de los precios de la cesta
     * 2 - El envío según la suma de los precios de la cesta
     * 3 - En envío según la ubicación
     * @param cesta
     * @param ubicacion
     * @return precio final
     */
    public static double calcularPrecioTotal(double[] cesta, String ubicacion){

        // 1. Suma total de los precios de la cesta
        double sumaTotal = 0;
        for(int i = 0; i < cesta.length; i++){
            sumaTotal += cesta[i];
        }

        // 2. Obtener el precio de envio en base a precio de productos
        double envioBase;
        if(sumaTotal < 50){
            envioBase = 9.99 ;
        }else if(sumaTotal < 100){
            envioBase = 4.99;
        }else if(sumaTotal < 200){
            envioBase = 1.99;
        }else {
            envioBase = 0;
        }

        // 3. Obtener precio en base a ubicacion (Peninsula, Islas Canarias, Islas Baleares)
        double precioEnvioUbicacion = 0;
        if(ubicacion.equalsIgnoreCase("Canarias")){
            precioEnvioUbicacion += 5;
        } else if(ubicacion.equalsIgnoreCase("Islas Baleares")){
            precioEnvioUbicacion += 2;
        }

        // Se pueden hacer más calculos, por ejemplo: cupón de descuento

        // Recargo o descuento por método de pago: paypal, bitcoin

        // 4. Sumar todos los costes y obtener el precio final
        double precioFinal = sumaTotal + envioBase + precioEnvioUbicacion;
        return precioFinal;

    }



}
