
package com.mycompany.temperaturaconverter;

import java.util.Scanner;


/**
Números Primos
Crea un programa que verifique si un número ingresado por el usuario es primo o no.
* Un número primo es aquel que solo es divisible por 1 y por sí mismo.
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero;
                
        System.out.println("Ingrese un numero: ");
        numero = lector.nextInt(); 
        
        boolean result = esPrimo(numero);
        
        if (result == true) {
            System.out.println("El numero es Primo");
        } else {
            System.out.println("El numero no es Primo");
        }
    }
    
    private static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
