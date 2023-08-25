
package com.mycompany.temperaturaconverter;

import java.util.Scanner;

/**
 Calculadora de IMC
 Crea una clase "IMCCalculator" que calcule el índice de masa corporal (IMC) de una persona. 
 El usuario debe ingresar su peso y altura, y el programa debe mostrar el IMC.
 */
public class CalculadoraDeIMC {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double altura, imc;
        int peso;
        
        System.out.println("Ingrese el peso: ");
        peso = lector.nextInt();
      
        System.out.println("ingrese la altura: ");
        altura = lector.nextDouble();
        
        imc = peso / Math.pow(altura, 2);
        
        System.out.println("Su IMC es: " + imc);
    }       
}
