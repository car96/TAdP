/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el valor del radio");
        double radio = sc.nextDouble();
        
        double circ = 2*Math.PI*radio;
        double area = Math.PI*Math.pow(radio, 2.0);
        
        System.out.println("La circunferencia del circulo es: "+circ+
                           "\nY el área: "+area);
    }
    
}
