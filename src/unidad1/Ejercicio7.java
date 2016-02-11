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
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el cateto 1 de un triangulo rectangulo: ");
        double cO = sc.nextDouble();
        System.out.println("Ahora ingresa el cateto 2: ");
        double cA = sc.nextDouble();
        
        double hip = Math.pow((Math.pow(cO, 2.0) + Math.pow(cA, 2.0)), 0.5);
        
        System.out.println("La hipotenusa es: "+hip);
    }
    
}
