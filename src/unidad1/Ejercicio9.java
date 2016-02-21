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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa los lados de un triángulo de la manera A B C:");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double p = (a+b+c)/2;
        //{System.out.println(p);
        double asd = p*(p-a)*(p-b)*(p-c);
        //System.out.println(asd);
        double area = Math.sqrt(asd);
        
        System.out.println("El área del triángulo es: "+area);
        
    }
    
}
