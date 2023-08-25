
 
package com.mycompany.temperaturaconverter;

import java.util.Scanner;

/**
Crea una clase llamada "DescuentoCalculator" que calcule el precio después de aplicar un descuento a un 
producto. El usuario debe ingresar el precio original y el porcentaje de descuento.
 */
public class DescuentoCalculato {
    
    public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);
        
        double precioOriginal, porcentajeDeDescuento, descuento, total;
        
        System.out.println("Ingrese el precio original: ");
        precioOriginal = lector.nextDouble();
        
        System.out.println("ingrese el porcentaje de descuento: ");
        porcentajeDeDescuento = lector.nextDouble();
        
        descuento = precioOriginal * (porcentajeDeDescuento / 100);
        total = precioOriginal - descuento;
        
        System.out.println("El descuento seria: " + descuento);
        System.out.println("El total del producto seria: " + total);
        
        } 
}
