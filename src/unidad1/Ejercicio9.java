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
public class Ejercicio9 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa los lados de un triángulo de la manera A B C:");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double p = (a+b+c)/2;
        double area = Math.pow((p*(p-a)*(p-b)*(p-c)) ,0.5);
        
        System.out.println("El área del triángulo es: "+area);
        
    }
    
}
