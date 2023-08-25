
package com.mycompany.temperaturaconverter;

import java.util.Scanner;


/**
Verificador de Números Pares
Crea un programa que solicite al usuario un número y determine si es par o impar. 
Utiliza operadores aritméticos y de comparación.
 */
public class VerificadorDeNúmerosPares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero;
                
        System.out.println("Ingrese un numero: ");
        numero = lector.nextInt(); 
        
        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}
