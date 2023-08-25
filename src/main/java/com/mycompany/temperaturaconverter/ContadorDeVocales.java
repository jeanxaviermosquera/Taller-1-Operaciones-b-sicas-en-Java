
package com.mycompany.temperaturaconverter;

import java.util.Scanner;

/**
Contador de Vocales
Crea un programa que cuente la cantidad de vocales en una cadena de texto ingresada por el usuario. 
Utiliza un método para realizar el conteo.
 */
public class ContadorDeVocales {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        String texto;
        int vocales = 0;
        
        System.out.println("Ingrese el texto: ");
        texto = lector.nextLine();
        
        for (int x = 0; x < texto.length(); x++) {
            char letraActual = texto.toLowerCase().charAt(x);
            if (validarSiEsVocal(letraActual)){
                 vocales++;
            }
        }
        System.out.println("Numero de vocales es: "+ vocales);
        
    }
    
    private static boolean validarSiEsVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra));
    }
}
