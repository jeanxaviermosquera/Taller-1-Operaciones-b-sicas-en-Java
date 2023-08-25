
package com.mycompany.temperaturaconverter;

import java.util.Scanner;

/**
Tabla de Multiplicar.
Crea un programa que solicite al usuario un número y genere la tabla de multiplicar correspondiente, 
desde 1 hasta 10.
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        
        Scanner tabla = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = tabla.nextInt();
        
        System.out.println("tabla del:" + numero);
        for(int i = 1; i<=10; i++){
            System.out.println(numero + "*:" + i + "=" + numero*i);   
        }     
    }
}
