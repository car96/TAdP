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
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de grados en Celsius: ");
        int gradosC = sc.nextInt();
        double gradosF = 1.8*gradosC + 32;
        
        System.out.println(gradosC+" grados celsius son: "+gradosF+" grados fahrenheit.");
    }
    
}
