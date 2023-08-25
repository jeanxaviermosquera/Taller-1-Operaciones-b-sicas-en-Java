/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperaturaconverter;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TemperaturaConverter {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        
        double fahrenheit, celsius;
        
        System.out.println("Ingrese los grados Celsius a convertir: ");
        celsius = lector.nextDouble();
        
        fahrenheit = 9/5.0 * celsius + 32;
        
        System.out.println(celsius + " Grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit");
        
        System.out.println("Ingrese los  Fahrenheit a convertir: ");
         fahrenheit = lector.nextDouble();
        
        celsius = (fahrenheit - 32) * 5/9.0;
        
        System.out.println( fahrenheit + " Grados  Fahrenheit equivalen a " + celsius + " grados Celsius");
        
    }
}
