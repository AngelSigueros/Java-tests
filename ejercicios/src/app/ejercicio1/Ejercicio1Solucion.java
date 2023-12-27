package app.ejercicio1;

/**
 * Declara dos variables numéricas (con el valor que desees), muestra por
 * consola la suma, resta, multiplicación, división y módulo (resto de la
 * división)
 */
public class Ejercicio1Solucion {

    public static void main(String[] args) {


        //Declaramos las variables
        int num1=10;
        int num2=5;

        /*Realizamos las operaciones.
         * Tambien lo podemos guardar el resultado en variables. */

        System.out.println("El resultado de la suma es "+(num1+num2));

        System.out.println("El resultado de la resta es "+(num1-num2));

        System.out.println("El resultado de la multiplicación es "+(num1*num2));

        System.out.println("El resultado de la división es "+(num1/num2));

        System.out.println("El resultado del módulo es "+(num1 % num2));

        //Ejemplo precedencia
        int x = 137, y = 6, z = 19, i=1, j=5, k=6;

        j = --k+i;
        System.out.println(j);

        j = k+i--;
        System.out.println(j);
    }
}
