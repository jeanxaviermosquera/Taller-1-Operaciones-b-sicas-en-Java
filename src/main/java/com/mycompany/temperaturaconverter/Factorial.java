
package com.mycompany.temperaturaconverter;

import java.util.Scanner;


/**
Calculadora de Factorial
Crea un programa que calcule el factorial de un número ingresado por el usuario.
* El factorial de un número es el producto de todos los enteros positivos menores o iguales a ese número.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero;
        long factorial=1;
                
        System.out.println("Ingrese un numero: ");
        numero = lector.nextInt(); 
        
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
